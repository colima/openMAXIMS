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
public interface Maintenance extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.core.vo.ServiceShortVoCollection listActiveService();

	// Generated from form domain interface definition
	/**
	* listProfileLiteByService
	*/
	public ims.scheduling.vo.ProfileLiteVoCollection listProfileLiteByService(ims.core.clinical.vo.ServiceRefVo service);

	// Generated from form domain interface definition
	/**
	* listSessionSlots
	*/
	public ims.scheduling.vo.SessionSlotVoCollection listSessionSlots(ims.core.clinical.vo.ServiceRefVo service, ims.scheduling.vo.Sch_ProfileRefVo profile, ims.framework.utils.Date dateFrom, ims.framework.utils.Date dateTo, Integer slotType);

	// Generated from form domain interface definition
	/**
	* retrieve the patient for this appt through the parent Sch_Booking
	*/
	public ims.core.vo.PatientShort getBookingPatient(ims.scheduling.vo.Booking_AppointmentVo appointment);

	// Generated from form domain interface definition
	public void cancelSlot(ims.scheduling.vo.Session_SlotRefVo sessionSlot) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void cancelAppt(ims.scheduling.vo.Booking_AppointmentVo appt) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* saveSlot
	*/
	public void saveSlot(ims.scheduling.vo.SessionSlotVo slot) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Lists all slot polls that have not yet completed i.e. either the respond slots has not taken place, or an acknowledgement was not received from Choose and Bookl
	*/
	public ims.chooseandbook.vo.ActionRequestVoCollection listSlotPolls(ims.framework.utils.Date dateFrom, ims.framework.utils.Date dateTo);

	// Generated from form domain interface definition
	/**
	* The purpose of this action is to allow the user to re-send the list of available slots
	* to choose and book. The code will check the current status.  If it was previously sent, but no ack received,
	* it will terminate that convers, and update the flag
	*/
	public void resubmitSlotPoll(ims.choose_book.vo.ActionRequestRefVo request) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void resubmitPdsRequest(ims.choose_book.vo.PdsRequestRefVoCollection request) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.chooseandbook.vo.PdsRequestVoCollection listPdsRequests(ims.framework.utils.Date dateFrom, ims.framework.utils.Date dateTo, Boolean failedRequestsOnly, String nhsn, ims.framework.utils.Date dateUpdatedFrom, ims.framework.utils.Date dateUpdatedTo);

	// Generated from form domain interface definition
	/**
	* Confirms the appointment by saving slot, appt and placing PDS and SDS requests where appropriate
	*/
	public void confirmAppt(ims.scheduling.vo.SessionSlotVo slot) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* listSdsRequest
	*/
	public ims.chooseandbook.vo.SdsRequestLiteVoCollection listSdsRequest(ims.framework.utils.Date dateFrom, ims.framework.utils.Date dteTo, ims.framework.utils.Date dateUpdatedFrom, ims.framework.utils.Date dateUpdatedTo);

	// Generated from form domain interface definition
	public void resubmitSdsRequest(ims.choose_book.vo.SdsRequestRefVoCollection request) throws ims.domain.exceptions.StaleObjectException;
}
