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

package ims.emergency.forms.interventionsdiagnosisinvestigationscc;

import java.io.Serializable;
import ims.framework.Context;
import ims.framework.FormName;
import ims.framework.FormAccessLogic;

public class BaseAccessLogic extends FormAccessLogic implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final void setContext(Context context, FormName formName)
	{
		form = new CurrentForm(new GlobalContext(context), new CurrentForms());
		engine = new CurrentEngine(formName);
	}
	public boolean isAccessible()
	{

		return true;
	}
	public boolean isReadOnly()
	{
		return false;
	}

	public CurrentEngine engine;
	public CurrentForm form;

	public final static class CurrentForm implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentForm(GlobalContext globalcontext, CurrentForms forms)
		{
			this.globalcontext = globalcontext;
			this.forms = forms;
		}
		public final GlobalContext getGlobalContext()
		{
			return globalcontext;
		}
		public final CurrentForms getForms()
		{
			return forms;
		}
		private GlobalContext globalcontext;
		private CurrentForms forms;
	}
	public final static class CurrentEngine implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentEngine(FormName formName)
		{
			this.formName = formName;
		}
		public final FormName getFormName()
		{
			return formName;
		}
		private FormName formName;
	}
	public static final class CurrentForms implements Serializable
	{
		private static final long serialVersionUID = 1L;

		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			protected LocalFormName(int value)
			{
				super(value);
			}
		}

		private CurrentForms()
		{
			Core = new CoreForms();
			Clinical = new ClinicalForms();
			Emergency = new EmergencyForms();
		}
		public final class CoreForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private CoreForms()
			{
				RieConfirmationDialog = new LocalFormName(102370);
			}
			public final FormName RieConfirmationDialog;
		}
		public final class ClinicalForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private ClinicalForms()
			{
				DiagnosisDialog = new LocalFormName(123146);
				CodedDiagnosisForAttendanceDialog = new LocalFormName(123322);
			}
			public final FormName DiagnosisDialog;
			public final FormName CodedDiagnosisForAttendanceDialog;
		}
		public final class EmergencyForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private EmergencyForms()
			{
				InterventionsTreatments = new LocalFormName(129194);
				InvestigationAttendenceDetailDialog = new LocalFormName(129195);
				NotKnownDetails = new LocalFormName(129227);
				AttendanceClinicalNoteDialog = new LocalFormName(129190);
				EmergencyAttendanceDetailsCc = new LocalFormName(129177);
				InterventionsDiagnosisInvestigationsCc = new LocalFormName(129196);
				ViewInvestigationInterventionNotesDialog = new LocalFormName(129243);
			}
			public final FormName InterventionsTreatments;
			public final FormName InvestigationAttendenceDetailDialog;
			public final FormName NotKnownDetails;
			public final FormName AttendanceClinicalNoteDialog;
			public final FormName EmergencyAttendanceDetailsCc;
			public final FormName InterventionsDiagnosisInvestigationsCc;
			public final FormName ViewInvestigationInterventionNotesDialog;
		}

		public CoreForms Core;
		public ClinicalForms Clinical;
		public EmergencyForms Emergency;
	}
}
