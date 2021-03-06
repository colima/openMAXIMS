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
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.clinical.domain.impl;

import ims.clinical.domain.base.impl.BaseRemoveIntraOpCaseTimesDialogImpl;
import ims.clinical.helper.TheatreCaseTimeHelper;
import ims.domain.DomainFactory;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;
import ims.scheduling.domain.objects.Booking_Appointment;
import ims.scheduling.vo.Appointment_StatusVo;
import ims.scheduling.vo.BookingAppointmentTheatreVo;
import ims.scheduling.vo.Booking_AppointmentRefVo;
import ims.scheduling.vo.domain.BookingAppointmentTheatreVoAssembler;
import ims.scheduling.vo.lookups.Status_Reason;

public class RemoveIntraOpCaseTimesDialogImpl extends BaseRemoveIntraOpCaseTimesDialogImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* Using the constants from TheatreCaseTimesHelper we can determine which records to delete
	*/
	public void removeTimes(Integer[] items, ims.scheduling.vo.Booking_AppointmentRefVo appointment) throws StaleObjectException
	{
		DomainFactory factory = getDomainFactory();
		
		try
		{			
			for(Integer recordType : items)
			{
				switch (recordType)
				{
					case TheatreCaseTimeHelper.SAFETY_BRIEF:
						factory.delete(" from PeriOpSafetyBriefTime sb where sb.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break; 
					case TheatreCaseTimeHelper.PATIENT_SENT:
						factory.delete(" from PeriOpPatientSentTime st where st.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.PATIENT_ARRIVED:
						factory.delete(" from PeriOpPatientArrivedTime pa where pa.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						updateApptStatus(factory, appointment, Status_Reason.BOOKED);
						break;
					case TheatreCaseTimeHelper.ANAES_SIGN_IN:
						factory.delete(" from PeriOpAnaesthticSignInTim si where si.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.ANAES_RFS:
						factory.delete(" from PeriOpReadyForSurgeryTime rfs where rfs.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.TIMEOUT_COMPLTED:
						factory.delete(" from PeriOpTimeOutComplete toc where toc.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.SURGERY_START:
						factory.delete(" from PeriOpSurgeryStartTime sst where sst.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.SURGERY_STOP:
						factory.delete(" from PeriOpSurgeryStopTime ssp where ssp.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.INTO_RECOVERY:
						factory.delete(" from PeriOpTimeIntoRecovery ti where ti.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.PATIENT_LEFT:
						factory.delete(" from PeriOpPatientLeftTheatre pl where pl.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.READY_FOR_DISCHARGE:
						factory.delete(" from PeriOpReadyForDischargeTi rfd where rfd.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					case TheatreCaseTimeHelper.TIME_OUT_RECOVERY:
						factory.delete(" from PeriOpTimeOutOfRecoveryTi tor where tor.theatreAppointment.id = " + appointment.getID_Booking_Appointment());
						break;
					default:
						throw new CodingRuntimeException("index not availabe in constants");
				}
			}
		}
		catch(ForeignKeyViolationException ex)
		{
			throw new CodingRuntimeException("Unexpected Error");
		}
	}
	
	private void updateApptStatus(DomainFactory factory,  Booking_AppointmentRefVo theatreAppointment, Status_Reason status) throws StaleObjectException
	{
		BookingAppointmentTheatreVo appointment = BookingAppointmentTheatreVoAssembler.create((Booking_Appointment) getDomainFactory().getDomainObject(theatreAppointment));
		
		appointment.getApptStatusHistory().add(appointment.getCurrentStatusRecord());
		Appointment_StatusVo voApptStat = new Appointment_StatusVo();
		voApptStat.setStatus(status);
		voApptStat.setStatusChangeDateTime(new DateTime());
		appointment.setCurrentStatusRecord(voApptStat);
		appointment.setApptStatus(status);
		
		factory.save(BookingAppointmentTheatreVoAssembler.extractBooking_Appointment(getDomainFactory(), appointment));
	}
}
