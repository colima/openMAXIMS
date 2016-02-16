//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Charlotte Murphy using IMS Development Environment (version 1.40 build 2182.17476)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.therapies.domain.impl;

import java.util.ArrayList;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.vo.HcpCollection;
import ims.core.vo.HcpFilter;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.SortOrder;
import ims.therapies.treatment.domain.objects.SplintDetails;
import ims.therapies.vo.SplintDetailsVo;
import ims.therapies.vo.SplintDetailsVoCollection;
import ims.therapies.vo.domain.SplintDetailsVoAssembler;

public class SplintsImpl extends DomainImpl implements ims.therapies.domain.Splints, ims.domain.impl.Transactional
{
	/**
	* saves Splint Details
	*/
	public SplintDetailsVo saveSplintDetails(ims.therapies.vo.SplintDetailsVo voSplintDetails) throws ims.domain.exceptions.StaleObjectException
	{
		if(!voSplintDetails.isValidated())
			throw new DomainRuntimeException("These Splint Details have not been validated");
	
		DomainFactory factory = getDomainFactory();
		SplintDetails doSplintDetails = SplintDetailsVoAssembler.extractSplintDetails(factory, voSplintDetails);
		factory.save(doSplintDetails);
		return SplintDetailsVoAssembler.create(doSplintDetails);
	}

	public SplintDetailsVoCollection listSplintDetails(CareContextRefVo voCareContextRef)
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer();
		String query = "from SplintDetails sd ";
		ArrayList markers= new ArrayList();
		ArrayList values = new ArrayList();
		String andStr = " ";

		if(voCareContextRef != null)
		{
			hql.append(andStr + " sd.clinicalContact.careContext.id = :cc");
			markers.add("cc");
			values.add(voCareContextRef.getID_CareContext());
		}
		
		if (markers.size() > 0) query += " where ";
		query += hql.toString();	
		
		java.util.List splintList = factory.find(query,markers,values);
		SplintDetailsVoCollection voSplintDetailsColl = SplintDetailsVoAssembler.createSplintDetailsVoCollectionFromSplintDetails(splintList);
		if(voSplintDetailsColl.size()>0)
			return voSplintDetailsColl.sort(SortOrder.DESCENDING);
		else
			return null;
	}

	public HcpCollection listHCPs(HcpFilter voHcpFilter)
	{
		HcpAdmin hcpAdminImpl = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return hcpAdminImpl.listHCPs(voHcpFilter);
	}
}