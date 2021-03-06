// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.newelectivelisttcieroddialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		RefMan = new RefManContext(context);
		Core = new CoreContext(context);
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientElectiveListIsNotNull()
		{
			return !cx_RefManPatientElectiveList.getValueIsNull(context);
		}
		public ims.RefMan.vo.PatientElectiveListDetailsToSaveVo getPatientElectiveList()
		{
			return (ims.RefMan.vo.PatientElectiveListDetailsToSaveVo)cx_RefManPatientElectiveList.getValue(context);
		}
		public void setPatientElectiveList(ims.RefMan.vo.PatientElectiveListDetailsToSaveVo value)
		{
			cx_RefManPatientElectiveList.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPatientElectiveList = new ims.framework.ContextVariable("RefMan.PatientElectiveList", "_cv_RefMan.PatientElectiveList");
		public boolean getPatientElectiveListNotesIsNotNull()
		{
			return !cx_RefManPatientElectiveListNotes.getValueIsNull(context);
		}
		public ims.RefMan.vo.PatientElectiveListNotesVo getPatientElectiveListNotes()
		{
			return (ims.RefMan.vo.PatientElectiveListNotesVo)cx_RefManPatientElectiveListNotes.getValue(context);
		}
		public void setPatientElectiveListNotes(ims.RefMan.vo.PatientElectiveListNotesVo value)
		{
			cx_RefManPatientElectiveListNotes.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPatientElectiveListNotes = new ims.framework.ContextVariable("RefMan.PatientElectiveListNotes", "_cv_RefMan.PatientElectiveListNotes");
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
		public boolean getTCIOutcomeForPatientElectiveListIsNotNull()
		{
			return !cx_RefManTCIOutcomeForPatientElectiveList.getValueIsNull(context);
		}
		public ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo getTCIOutcomeForPatientElectiveList()
		{
			return (ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo)cx_RefManTCIOutcomeForPatientElectiveList.getValue(context);
		}
		public void setTCIOutcomeForPatientElectiveList(ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo value)
		{
			cx_RefManTCIOutcomeForPatientElectiveList.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManTCIOutcomeForPatientElectiveList = new ims.framework.ContextVariable("RefMan.TCIOutcomeForPatientElectiveList", "_cv_RefMan.TCIOutcomeForPatientElectiveList");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

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
		public boolean getRieMessageIsNotNull()
		{
			return !cx_CoreRieMessage.getValueIsNull(context);
		}
		public String getRieMessage()
		{
			return (String)cx_CoreRieMessage.getValue(context);
		}
		public void setRieMessage(String value)
		{
			cx_CoreRieMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreRieMessage = new ims.framework.ContextVariable("Core.RieMessage", "_cv_Core.RieMessage");

		private ims.framework.Context context;
	}

	public RefManContext RefMan;
	public CoreContext Core;
}
