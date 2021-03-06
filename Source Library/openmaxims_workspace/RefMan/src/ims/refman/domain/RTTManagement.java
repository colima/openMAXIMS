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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain;

// Generated from form domain impl
public interface RTTManagement extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Lists the referrals for the patient
	*/
	public ims.core.vo.ReferralLiteVoCollection listReferralWithPathways(ims.core.patient.vo.PatientRefVo patient);

	// Generated from form domain interface definition
	/**
	* gets the RTT management details for a Cats Referral
	*/
	public ims.RefMan.vo.CATSReferralRTTManagementVo getReferralDetails(ims.core.vo.ReferralLiteVo referral);

	// Generated from form domain interface definition
	public void updateReferralDate(ims.framework.utils.Date newDate, ims.RefMan.vo.CatsReferralRefVo catsReferral) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void undoRTTEvent(ims.RefMan.vo.RTTManagementGridValueVo event) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* gets the patient Journey
	*/
	public ims.pathways.vo.PatientJourneyInterfaceVo getPatientJourney(ims.pathways.vo.PatientPathwayJourneyRefVo profile, ims.pathways.configuration.vo.PathwayRefVo pathway);

	// Generated from form domain interface definition
	public Integer getCurrentPauseDetails(ims.core.admin.vo.ReferralRefVo ref);

	// Generated from form domain interface definition
	/**
	* gets an event description from the ClockImpact
	*/
	public String getEventDescription(ims.pathways.vo.PathwaysRTTClockImpactRefVo impactRef);

	// Generated from form domain interface definition
	/**
	* Method which will update the target status from in-scope to not-in-scope
	*/
	public void removeTargetFromScope(ims.pathways.vo.PatientJourneyTargetRefVo target, ims.pathways.vo.PatientPathwayJourneyRefVo journey) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Assembles Vo
	*/
	public ims.pathways.vo.PatientPathwaysAwaitingValidationWorklistVo getPatientPathwaysAwaitingValidationWorklistVo(ims.pathways.vo.PatientPathwayJourneyRefVo patientJourneyRefVo);

	// Generated from form domain interface definition
	/**
	* Save Vo
	*/
	public void savePatientPathwaysAwaitingValidationWorklistVo(ims.pathways.vo.PatientPathwaysAwaitingValidationWorklistVo patientPathwaysAwaitingValidationWorklistVo) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void markReferralAsNotSubjectToRTT(ims.RefMan.vo.CatsReferralRefVo referral, Boolean markAllClocksAsRIE) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.AppointmentOutcomeDetailsVoCollection listAppointmentOutcomeDetails(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public Boolean isClockImpactValidForAppointment(ims.pathways.vo.PathwaysRTTClockImpactRefVo clockImpact);

	// Generated from form domain interface definition
	public ims.core.vo.CareContextShortVo getCareContextShortVo(ims.RefMan.vo.CatsReferralRefVo referral);

	// Generated from form domain interface definition
	public void updateRTTStatusAndClockWithNewDate(ims.framework.utils.DateTime newDateTime, ims.RefMan.vo.RTTManagementGridValueVo rowValue) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;
}
