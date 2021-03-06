//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.62 build 3040.26452)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.pci.domain.impl;

import ims.core.vo.DEDLiteVoCollection;
import ims.core.vo.LocSiteLiteVo;
import ims.core.vo.LocSiteLiteVoCollection;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.core.vo.OrgLiteVo;
import ims.core.vo.OrgLiteVoCollection;
import ims.core.vo.domain.DEDLiteVoAssembler;
import ims.core.vo.domain.LocSiteLiteVoAssembler;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.domain.OrgLiteVoAssembler;
import ims.core.vo.lookups.LocationType;
import ims.core.vo.lookups.OrganisationType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.ntpf.vo.lookups.County;
import ims.pci.domain.base.impl.BaseClientAddressImpl;

import java.util.ArrayList;

public class ClientAddressImpl extends BaseClientAddressImpl
{

	private static final long serialVersionUID = 1L;

	public LocationLiteVoCollection listPHNDistricts(LocationLiteVo sector)
	{
		if (sector == null)
			return null;

		DomainFactory factory = getDomainFactory();

		// WDEV-12550 - Added query condition to list back only active districts
		String query = "select loc from Location as lsec left join lsec.locations as loc where (lsec.name = :SECNAME and loc.type.id = :VALUE and loc.isActive = 1) order by loc.name asc";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();

		markers.add("SECNAME");
		values.add(sector.getName());

		markers.add("VALUE");
		values.add(new Integer(LocationType.PHN_DISTRICT.getID()));

		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(factory.find(query, markers, values));
	}

	public LocationLiteVoCollection listSectors(LocSiteLiteVo cca)
	{
		if (cca == null)
			return null;

		DomainFactory factory = getDomainFactory();

		// WDEV-12550 - Added query condition to list back only active sectors
		String query = "select loc from LocSite as ls left join ls.locations as loc where (ls.name = :CCANAME and loc.type.id = :VALUE and loc.isActive = 1) order by loc.name asc";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();

		markers.add("CCANAME");
		values.add(cca.getName());

		markers.add("VALUE");
		values.add(new Integer(LocationType.SECTOR.getID()));

		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(factory.find(query, markers, values));
	}

	public OrgLiteVoCollection listLHOs()
	{
		StringBuffer hql = new StringBuffer();
		hql.append(" from Organisation o");
		hql.append(" where");
		hql.append(" o.type.id = :lho and o.isActive = 1 order by o.name asc");

		return OrgLiteVoAssembler.createOrgLiteVoCollectionFromOrganisation(getDomainFactory().find(hql.toString(), new String[] { "lho" }, new Object[] { OrganisationType.LHO.getID() }));
	}

	public LocSiteLiteVoCollection listCCAs(OrgLiteVo lho)
	{
		if (!lho.getID_OrganisationIsNotNull())
			return null;

		// WDEV-12550 - Added condition and parameters to filter only locations records of type CCA 
		StringBuffer hql = new StringBuffer();
		hql.append(" from LocSite as ls");
		hql.append(" where");
		hql.append(" ls.isActive =:active");
		hql.append(" and ls.isRIE is null");
		hql.append(" and ls.isVirtual =:virtual");
		hql.append(" and ls.type.id = :CCA");
		hql.append(" and ls.parentOrganisation.id =:lhoId order by ls.name asc");

		return LocSiteLiteVoAssembler.createLocSiteLiteVoCollectionFromLocSite(getDomainFactory().find(hql.toString(), new String[] { "active", "virtual", "CCA", "lhoId" }, new Object[] { Boolean.TRUE, Boolean.FALSE, LocationType.CCA.getID(), lho.getID_Organisation() }));
	}

	public DEDLiteVoCollection listDEDs(String ded, County county)
	{
		if (ded == null || (ded != null && ded.trim().length() == 0))
			throw new DomainRuntimeException("String for search is null.");

		String DEDLite = ded != null ? ded.toUpperCase() + "%" : "%%";
		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();
		StringBuffer hql = new StringBuffer();

		// WDEV-12656 - Updated query to list only active DED
		hql.append(" from DED ded");
		hql.append(" where ded.upperName like :dedName and ded.isActive = 1");
		markers.add("dedName");
		values.add(DEDLite);

		if (county != null)
		{
			if (markers.size() > 0)
				hql.append(" and ");

			hql.append(" ded.county.id = :county");
			markers.add("county");
			values.add(county.getID());
		}

		return DEDLiteVoAssembler.createDEDLiteVoCollectionFromDED(getDomainFactory().find(hql.toString(), markers, values));
	}
}
