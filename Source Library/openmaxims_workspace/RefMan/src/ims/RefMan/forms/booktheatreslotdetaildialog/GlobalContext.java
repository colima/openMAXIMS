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

package ims.RefMan.forms.booktheatreslotdetaildialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Scheduling = new SchedulingContext(context);
		Core = new CoreContext(context);
		RefMan = new RefManContext(context);
	}
	public final class SchedulingContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private SchedulingContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getSch_BookingTheatreIsNotNull()
		{
			return !cx_SchedulingSch_BookingTheatre.getValueIsNull(context);
		}
		public ims.scheduling.vo.Sch_BookingTheatreVo getSch_BookingTheatre()
		{
			return (ims.scheduling.vo.Sch_BookingTheatreVo)cx_SchedulingSch_BookingTheatre.getValue(context);
		}
		public void setSch_BookingTheatre(ims.scheduling.vo.Sch_BookingTheatreVo value)
		{
			cx_SchedulingSch_BookingTheatre.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingSch_BookingTheatre = new ims.framework.ContextVariable("Scheduling.Sch_BookingTheatre", "_cv_Scheduling.Sch_BookingTheatre");
		public boolean getBookTheatreSlotDialogDataIsNotNull()
		{
			return !cx_SchedulingBookTheatreSlotDialogData.getValueIsNull(context);
		}
		public ims.scheduling.vo.BookTheatreSlotDialogVo getBookTheatreSlotDialogData()
		{
			return (ims.scheduling.vo.BookTheatreSlotDialogVo)cx_SchedulingBookTheatreSlotDialogData.getValue(context);
		}
		public void setBookTheatreSlotDialogData(ims.scheduling.vo.BookTheatreSlotDialogVo value)
		{
			cx_SchedulingBookTheatreSlotDialogData.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookTheatreSlotDialogData = new ims.framework.ContextVariable("Scheduling.BookTheatreSlotDialogData", "_cv_Scheduling.BookTheatreSlotDialogData");
		public boolean getAppointmentIdsIsNotNull()
		{
			return !cx_SchedulingAppointmentIds.getValueIsNull(context);
		}
		public java.util.ArrayList getAppointmentIds()
		{
			return (java.util.ArrayList)cx_SchedulingAppointmentIds.getValue(context);
		}
		public void setAppointmentIds(java.util.ArrayList value)
		{
			cx_SchedulingAppointmentIds.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingAppointmentIds = new ims.framework.ContextVariable("Scheduling.AppointmentIds", "_cv_Scheduling.AppointmentIds");
		public boolean getPendingEmergencyTheatreIsNotNull()
		{
			return !cx_SchedulingPendingEmergencyTheatre.getValueIsNull(context);
		}
		public ims.scheduling.vo.PendingEmergencyTheatreRefVo getPendingEmergencyTheatre()
		{
			return (ims.scheduling.vo.PendingEmergencyTheatreRefVo)cx_SchedulingPendingEmergencyTheatre.getValue(context);
		}
		public void setPendingEmergencyTheatre(ims.scheduling.vo.PendingEmergencyTheatreRefVo value)
		{
			cx_SchedulingPendingEmergencyTheatre.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingPendingEmergencyTheatre = new ims.framework.ContextVariable("Scheduling.PendingEmergencyTheatre", "_cv_Scheduling.PendingEmergencyTheatre");
		public boolean getTheatreProcedureIsNotNull()
		{
			return !cx_SchedulingTheatreProcedure.getValueIsNull(context);
		}
		public ims.core.vo.ProcedureLiteVo getTheatreProcedure()
		{
			return (ims.core.vo.ProcedureLiteVo)cx_SchedulingTheatreProcedure.getValue(context);
		}
		public void setTheatreProcedure(ims.core.vo.ProcedureLiteVo value)
		{
			cx_SchedulingTheatreProcedure.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreProcedure = new ims.framework.ContextVariable("Scheduling.TheatreProcedure", "_cv_Scheduling.TheatreProcedure");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");
		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}
		public void setCurrentCareContext(ims.core.vo.CareContextShortVo value)
		{
			cx_CoreCurrentCareContext.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");

		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCatsReferralIsNotNull()
		{
			return !cx_RefManCatsReferral.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralRefVo getCatsReferral()
		{
			return (ims.RefMan.vo.CatsReferralRefVo)cx_RefManCatsReferral.getValue(context);
		}
		public void setCatsReferral(ims.RefMan.vo.CatsReferralRefVo value)
		{
			cx_RefManCatsReferral.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");
		public boolean getSelectedPatientElectiveListIsNotNull()
		{
			return !cx_RefManSelectedPatientElectiveList.getValueIsNull(context);
		}
		public ims.RefMan.vo.PatientElectiveListVo getSelectedPatientElectiveList()
		{
			return (ims.RefMan.vo.PatientElectiveListVo)cx_RefManSelectedPatientElectiveList.getValue(context);
		}
		public void setSelectedPatientElectiveList(ims.RefMan.vo.PatientElectiveListVo value)
		{
			cx_RefManSelectedPatientElectiveList.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSelectedPatientElectiveList = new ims.framework.ContextVariable("RefMan.SelectedPatientElectiveList", "_cv_RefMan.SelectedPatientElectiveList");
		public boolean getSelectedWaitingListConfigIsNotNull()
		{
			return !cx_RefManSelectedWaitingListConfig.getValueIsNull(context);
		}
		public ims.admin.vo.ElectiveListConfigurationVo getSelectedWaitingListConfig()
		{
			return (ims.admin.vo.ElectiveListConfigurationVo)cx_RefManSelectedWaitingListConfig.getValue(context);
		}
		public void setSelectedWaitingListConfig(ims.admin.vo.ElectiveListConfigurationVo value)
		{
			cx_RefManSelectedWaitingListConfig.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSelectedWaitingListConfig = new ims.framework.ContextVariable("RefMan.SelectedWaitingListConfig", "_cv_RefMan.SelectedWaitingListConfig");
		public boolean getPatientElectiveListRefIsNotNull()
		{
			return !cx_RefManPatientElectiveListRef.getValueIsNull(context);
		}
		public ims.RefMan.vo.PatientElectiveListRefVo getPatientElectiveListRef()
		{
			return (ims.RefMan.vo.PatientElectiveListRefVo)cx_RefManPatientElectiveListRef.getValue(context);
		}
		public void setPatientElectiveListRef(ims.RefMan.vo.PatientElectiveListRefVo value)
		{
			cx_RefManPatientElectiveListRef.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPatientElectiveListRef = new ims.framework.ContextVariable("RefMan.PatientElectiveListRef", "_cv_RefMan.PatientElectiveListRef");
		public boolean getReferralERODIsNotNull()
		{
			return !cx_RefManReferralEROD.getValueIsNull(context);
		}
		public ims.RefMan.vo.ReferralERODVo getReferralEROD()
		{
			return (ims.RefMan.vo.ReferralERODVo)cx_RefManReferralEROD.getValue(context);
		}
		public void setReferralEROD(ims.RefMan.vo.ReferralERODVo value)
		{
			cx_RefManReferralEROD.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReferralEROD = new ims.framework.ContextVariable("RefMan.ReferralEROD", "_cv_RefMan.ReferralEROD");
		public boolean getPELProcedureDetailsForBookingIsNotNull()
		{
			return !cx_RefManPELProcedureDetailsForBooking.getValueIsNull(context);
		}
		public String getPELProcedureDetailsForBooking()
		{
			return (String)cx_RefManPELProcedureDetailsForBooking.getValue(context);
		}
		public void setPELProcedureDetailsForBooking(String value)
		{
			cx_RefManPELProcedureDetailsForBooking.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPELProcedureDetailsForBooking = new ims.framework.ContextVariable("RefMan.PELProcedureDetailsForBooking", "_cv_RefMan.PELProcedureDetailsForBooking");
		public boolean getReason28DayRuleBreachIsNotNull()
		{
			return !cx_RefManReason28DayRuleBreach.getValueIsNull(context);
		}
		public ims.RefMan.vo.Reason28DayRuleBreachVo getReason28DayRuleBreach()
		{
			return (ims.RefMan.vo.Reason28DayRuleBreachVo)cx_RefManReason28DayRuleBreach.getValue(context);
		}
		public void setReason28DayRuleBreach(ims.RefMan.vo.Reason28DayRuleBreachVo value)
		{
			cx_RefManReason28DayRuleBreach.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReason28DayRuleBreach = new ims.framework.ContextVariable("RefMan.Reason28DayRuleBreach", "_cv_RefMan.Reason28DayRuleBreach");
		public boolean getReasonRTTWeekWaitBreachIsNotNull()
		{
			return !cx_RefManReasonRTTWeekWaitBreach.getValueIsNull(context);
		}
		public ims.RefMan.vo.ReasonRTTWeekWaitBreachVo getReasonRTTWeekWaitBreach()
		{
			return (ims.RefMan.vo.ReasonRTTWeekWaitBreachVo)cx_RefManReasonRTTWeekWaitBreach.getValue(context);
		}
		public void setReasonRTTWeekWaitBreach(ims.RefMan.vo.ReasonRTTWeekWaitBreachVo value)
		{
			cx_RefManReasonRTTWeekWaitBreach.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReasonRTTWeekWaitBreach = new ims.framework.ContextVariable("RefMan.ReasonRTTWeekWaitBreach", "_cv_RefMan.ReasonRTTWeekWaitBreach");

		private ims.framework.Context context;
	}

	public SchedulingContext Scheduling;
	public CoreContext Core;
	public RefManContext RefMan;
}
