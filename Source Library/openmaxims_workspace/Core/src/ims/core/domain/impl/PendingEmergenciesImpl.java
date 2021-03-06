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
// This code was generated by Gabriel Maxim using IMS Development Environment (version 1.80 build 5465.13953)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.core.domain.PendingEmergencyWorklist;
import ims.core.domain.base.impl.BasePendingEmergenciesImpl;
import ims.core.vo.CatsReferralPendingEmergencyNonEDAdmissionListVo;
import ims.core.vo.LocationLiteVo;
import ims.domain.DomainFactory;
import ims.framework.interfaces.ILocation;

public class PendingEmergenciesImpl extends BasePendingEmergenciesImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.LocationLiteVoCollection listHospitals()
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.listHospitals();
	}

	public ims.core.vo.LocationLiteVoCollection listWardsForHospital(ims.core.resource.place.vo.LocationRefVo hospital, String name)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.listWardsForHospital(hospital, name);
	}

	public ims.core.vo.ServiceLiteVoCollection listServices(String name)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.listServices(name);
	}

	public ims.core.vo.MemberOfStaffLiteVoCollection listAcceptingConsultants(String name)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.listAcceptingConsultants(name);
	}

	public ims.core.vo.CatsReferralPendingEmergencyNonEDAdmissionListVoCollection search(ims.core.vo.PendingEmergencyAdmissionWorklistSearchCriteriaVo searchCriteria)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.search(searchCriteria);
	}

	public ims.core.vo.PatientShort getPatient(ims.core.patient.vo.PatientRefVo patient)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.getPatient(patient);
	}

	public ims.core.vo.CatsReferralRepatriationRequestVo getPendingEmergency(ims.RefMan.vo.CatsReferralRefVo casReferral)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.getPendingEmergency(casReferral);
	}

	public Boolean cancelPendingEmergencyAdmission(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.cancelPendingEmergencyAdmission(catsReferral);
	}
	public CatsReferralRefVo getCatsReferral(CatsReferralPendingEmergencyNonEDAdmissionListVo voRecord)
	{
		if (voRecord == null)
			return null;
		DomainFactory factory = getDomainFactory();
		
		CatsReferral catsDO = (CatsReferral) factory.getDomainObject(CatsReferral.class, voRecord.getID_CatsReferral());
		
		return catsDO != null ? new CatsReferralRefVo(catsDO.getId(), catsDO.getVersion()) : null;
	}
	//WDEV-22710
	public LocationLiteVo getCurrentHospital(ILocation iLocation)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.getCurrentHospital(iLocation);
	}
	
	public LocationLiteVo getCurrentWard(ILocation iLoc)
	{
		PendingEmergencyWorklist impl = (PendingEmergencyWorklist) getDomainImpl(PendingEmergencyWorklistImpl.class);
		return impl.getCurrentWard(iLoc);
	}
	//WDEV-22710  - end
}
