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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.80 build 4050.19540)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.admin.domain.OrganisationAndLocation;
import ims.admin.domain.impl.OrganisationAndLocationImpl;
import ims.core.admin.pas.domain.objects.InpatientEpisode;
import ims.core.domain.ADT;
import ims.core.domain.AdtTransferDialog;
import ims.core.domain.base.impl.BaseInpatientTransferDialogImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.domain.InpatientEpisodeVoAssembler;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.lookups.LocationType;
import ims.domain.DomainFactory;
import ims.framework.utils.DateTime;

import java.util.List;

public class InpatientTransferDialogImpl extends BaseInpatientTransferDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.LocationLiteVo getParentHospital(ims.core.resource.place.vo.LocationRefVo ward)
	{
		AdtTransferDialog impl = (AdtTransferDialog) getDomainImpl(AdtTransferDialogImpl.class);
		return impl.getParentHospital(ward);
	}

	public ims.core.vo.LocationLiteVoCollection listHospitals()
	{
		DomainFactory factory = getDomainFactory();
		String hql = " from Location loc where loc.type = :locType and loc.isActive = :isActive order by upper(loc.name) asc"; //WDEV-11959
		List l = factory.find(hql, new String[]{"locType","isActive"}, new Object[]{getDomLookup(LocationType.HOSP), Boolean.TRUE});
		return LocationLiteVoAssembler.createLocationLiteVoCollectionFromLocation(l);
	}

	public ims.core.vo.LocationLiteVoCollection listWardsForHospital(ims.core.resource.place.vo.LocationRefVo hospital)
	{
		OrganisationAndLocation orgAdmin = (OrganisationAndLocation)getDomainImpl(OrganisationAndLocationImpl.class);
		return orgAdmin.listActiveWardsForHospitalByNameLite(hospital, null);
	}

	public void transferInpatient(ims.core.patient.vo.PatientRefVo patient, ims.core.resource.place.vo.LocationRefVo toWard, ims.core.resource.people.vo.MedicRefVo consultant, ims.core.resource.place.vo.LocationRefVo fromWard, DateTime transferDateTime) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException
	{
		ADT adt = (ADT)getDomainImpl(ADTImpl.class);
		adt.transferPatient(patient, consultant, toWard, null, fromWard, transferDateTime, new DateTime(),null);	
	}

	//wdev-11913
	public InpatientEpisodeVo getInpatientEpisode(PatientRefVo patrefVo) 
	{
		if(patrefVo == null)
			return null;
		
		DomainFactory factory = getDomainFactory();
		return InpatientEpisodeVoAssembler.create(getInpatientEpis(factory,patrefVo));
	}
	private InpatientEpisode getInpatientEpis(DomainFactory factory,PatientRefVo patrefVo)
	{
		ims.core.patient.domain.objects.Patient domPatient = (ims.core.patient.domain.objects.Patient)factory.getDomainObject(ims.core.patient.domain.objects.Patient.class, patrefVo.getID_Patient().intValue());
		
		String hql = "from InpatientEpisode ip where ip.pasEvent.patient.id = :pat";
		List<?> l = factory.find(hql, new String[] {"pat"}, new Object[] {domPatient.getId()});		
		if (l != null && l.size() > 0)
		{
			return (InpatientEpisode)l.get(0);
		}
		return null;
	}
	//---------------
}