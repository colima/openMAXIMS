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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.assessment.forms.graphicassessmentinstantiation;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Clinical = new ClinicalContext(context);
		Core = new CoreContext(context);
		Assessment = new AssessmentContext(context);
	}
	public final class ClinicalContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ClinicalContext(ims.framework.Context context)
		{
			this.context = context;

			PatientAssessment = new PatientAssessmentContext(context);
		}
		public final class PatientAssessmentContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private PatientAssessmentContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getEditComponentIsNotNull()
			{
				return !cx_ClinicalPatientAssessmentEditComponent.getValueIsNull(context);
			}
			public Boolean getEditComponent()
			{
				return (Boolean)cx_ClinicalPatientAssessmentEditComponent.getValue(context);
			}
		public void setEditComponent(Boolean value)
		{
				cx_ClinicalPatientAssessmentEditComponent.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_ClinicalPatientAssessmentEditComponent = new ims.framework.ContextVariable("Clinical.PatientAssessment.EditComponent", "_cv_Clinical.PatientAssessment.EditComponent");
			public boolean getEditedComponentIsNotNull()
			{
				return !cx_ClinicalPatientAssessmentEditedComponent.getValueIsNull(context);
			}
			public ims.assessment.configuration.vo.UserDefinedObjectComponentRefVo getEditedComponent()
			{
				return (ims.assessment.configuration.vo.UserDefinedObjectComponentRefVo)cx_ClinicalPatientAssessmentEditedComponent.getValue(context);
			}
		public void setEditedComponent(ims.assessment.configuration.vo.UserDefinedObjectComponentRefVo value)
		{
				cx_ClinicalPatientAssessmentEditedComponent.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_ClinicalPatientAssessmentEditedComponent = new ims.framework.ContextVariable("Clinical.PatientAssessment.EditedComponent", "_cv_Clinical.PatientAssessment.EditedComponent");
			public boolean getSelectedAssessmentIsNotNull()
			{
				return !cx_ClinicalPatientAssessmentSelectedAssessment.getValueIsNull(context);
			}
			public ims.assessment.instantiation.vo.PatientAssessmentRefVo getSelectedAssessment()
			{
				return (ims.assessment.instantiation.vo.PatientAssessmentRefVo)cx_ClinicalPatientAssessmentSelectedAssessment.getValue(context);
			}
		public void setSelectedAssessment(ims.assessment.instantiation.vo.PatientAssessmentRefVo value)
		{
				cx_ClinicalPatientAssessmentSelectedAssessment.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_ClinicalPatientAssessmentSelectedAssessment = new ims.framework.ContextVariable("Clinical.PatientAssessment.SelectedAssessment", "_cv_Clinical.PatientAssessment.SelectedAssessment");
			private ims.framework.Context context;
		}

		public boolean getReturnToFormNameIsNotNull()
		{
			return !cx_ClinicalReturnToFormName.getValueIsNull(context);
		}
		public ims.framework.FormName getReturnToFormName()
		{
			return (ims.framework.FormName)cx_ClinicalReturnToFormName.getValue(context);
		}
		public void setReturnToFormName(ims.framework.FormName value)
		{
			cx_ClinicalReturnToFormName.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalReturnToFormName = new ims.framework.ContextVariable("Clinical.ReturnToFormName", "_cv_Clinical.ReturnToFormName");

		public PatientAssessmentContext PatientAssessment;
		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientGraphicAssessmentFindingIsNotNull()
		{
			return !cx_CorePatientGraphicAssessmentFinding.getValueIsNull(context);
		}
		public ims.assessment.vo.PatientGraphicAssessmentFindingVo getPatientGraphicAssessmentFinding()
		{
			return (ims.assessment.vo.PatientGraphicAssessmentFindingVo)cx_CorePatientGraphicAssessmentFinding.getValue(context);
		}
		public void setPatientGraphicAssessmentFinding(ims.assessment.vo.PatientGraphicAssessmentFindingVo value)
		{
			cx_CorePatientGraphicAssessmentFinding.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientGraphicAssessmentFinding = new ims.framework.ContextVariable("Core.PatientGraphicAssessmentFinding", "_cv_Core.PatientGraphicAssessmentFinding");
		public boolean getPatientAssessmentFullIsNotNull()
		{
			return !cx_CorePatientAssessmentFull.getValueIsNull(context);
		}
		public ims.assessment.vo.PatientAssessmentVo getPatientAssessmentFull()
		{
			return (ims.assessment.vo.PatientAssessmentVo)cx_CorePatientAssessmentFull.getValue(context);
		}
		public void setPatientAssessmentFull(ims.assessment.vo.PatientAssessmentVo value)
		{
			cx_CorePatientAssessmentFull.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientAssessmentFull = new ims.framework.ContextVariable("Core.PatientAssessmentFull", "_cv_Core.PatientAssessmentFull");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}
	public final class AssessmentContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private AssessmentContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientUserDefinedObjectIsNotNull()
		{
			return !cx_AssessmentPatientUserDefinedObject.getValueIsNull(context);
		}
		public ims.assessment.vo.PatientUserDefinedObjectVo getPatientUserDefinedObject()
		{
			return (ims.assessment.vo.PatientUserDefinedObjectVo)cx_AssessmentPatientUserDefinedObject.getValue(context);
		}
		public void setPatientUserDefinedObject(ims.assessment.vo.PatientUserDefinedObjectVo value)
		{
			cx_AssessmentPatientUserDefinedObject.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_AssessmentPatientUserDefinedObject = new ims.framework.ContextVariable("Assessment.PatientUserDefinedObject", "_cv_Assessment.PatientUserDefinedObject");

		private ims.framework.Context context;
	}

	public ClinicalContext Clinical;
	public CoreContext Core;
	public AssessmentContext Assessment;
}