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

package ims.spinalinjuries.forms.respiratorytreatment;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.spinalinjuries.domain.RespiratoryTreatment.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.spinalinjuries.domain.RespiratoryTreatment domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void onansContraIndCheckValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ansContraIndCheck().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindansContraIndCheckLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNoUnknown)
		{
			ims.core.vo.lookups.YesNoUnknown instance = (ims.core.vo.lookups.YesNoUnknown)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindansContraIndCheckLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ansContraIndCheck().addOption(instance);
		}
	}
	protected final void bindansContraIndCheckLookup()
	{
		this.form.ansContraIndCheck().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ansContraIndCheck().addOption(lookupCollection.get(x));
		}
	}
	protected final void defaultansContraIndCheckLookupValue()
	{
		this.form.ansContraIndCheck().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected final void onansOnCallValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ansOnCall().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindansOnCallLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNoUnknown)
		{
			ims.core.vo.lookups.YesNoUnknown instance = (ims.core.vo.lookups.YesNoUnknown)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindansOnCallLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ansOnCall().addOption(instance);
		}
	}
	protected final void bindansOnCallLookup()
	{
		this.form.ansOnCall().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ansOnCall().addOption(lookupCollection.get(x));
		}
	}
	protected final void defaultansOnCallLookupValue()
	{
		this.form.ansOnCall().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected final void bindgrdTreatmentColSelectedLookup()
	{
		this.form.grdTreatment().answerBoxColumnClear(1);
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdTreatment().answerBoxColumnNewOption(1, lookupCollection.get(x));
		}
	}
	protected final void oncmbAssistedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbAssisted().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.spinalinjuries.vo.lookups.AssistedCough existingInstance = (ims.spinalinjuries.vo.lookups.AssistedCough)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbAssistedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.spinalinjuries.vo.lookups.AssistedCough)
		{
			ims.spinalinjuries.vo.lookups.AssistedCough instance = (ims.spinalinjuries.vo.lookups.AssistedCough)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbAssistedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.spinalinjuries.vo.lookups.AssistedCough existingInstance = (ims.spinalinjuries.vo.lookups.AssistedCough)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbAssisted().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbAssistedLookup()
	{
		this.form.cmbAssisted().clear();
		ims.spinalinjuries.vo.lookups.AssistedCoughCollection lookupCollection = ims.spinalinjuries.vo.lookups.LookupHelper.getAssistedCough(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbAssisted().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbAssistedLookupValue(int id)
	{
		ims.spinalinjuries.vo.lookups.AssistedCough instance = ims.spinalinjuries.vo.lookups.LookupHelper.getAssistedCoughInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbAssisted().setValue(instance);
	}
	protected final void defaultcmbAssistedLookupValue()
	{
		this.form.cmbAssisted().setValue((ims.spinalinjuries.vo.lookups.AssistedCough)domain.getLookupService().getDefaultInstance(ims.spinalinjuries.vo.lookups.AssistedCough.class, engine.getFormName().getID(), ims.spinalinjuries.vo.lookups.AssistedCough.TYPE_ID));
	}
	protected final void oncmbPosturalValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbPostural().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.spinalinjuries.vo.lookups.PosturalDrainage existingInstance = (ims.spinalinjuries.vo.lookups.PosturalDrainage)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPosturalLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.spinalinjuries.vo.lookups.PosturalDrainage)
		{
			ims.spinalinjuries.vo.lookups.PosturalDrainage instance = (ims.spinalinjuries.vo.lookups.PosturalDrainage)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPosturalLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.spinalinjuries.vo.lookups.PosturalDrainage existingInstance = (ims.spinalinjuries.vo.lookups.PosturalDrainage)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbPostural().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPosturalLookup()
	{
		this.form.cmbPostural().clear();
		ims.spinalinjuries.vo.lookups.PosturalDrainageCollection lookupCollection = ims.spinalinjuries.vo.lookups.LookupHelper.getPosturalDrainage(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbPostural().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPosturalLookupValue(int id)
	{
		ims.spinalinjuries.vo.lookups.PosturalDrainage instance = ims.spinalinjuries.vo.lookups.LookupHelper.getPosturalDrainageInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbPostural().setValue(instance);
	}
	protected final void defaultcmbPosturalLookupValue()
	{
		this.form.cmbPostural().setValue((ims.spinalinjuries.vo.lookups.PosturalDrainage)domain.getLookupService().getDefaultInstance(ims.spinalinjuries.vo.lookups.PosturalDrainage.class, engine.getFormName().getID(), ims.spinalinjuries.vo.lookups.PosturalDrainage.TYPE_ID));
	}
	protected void clearScreen()
	{
		this.form.ansContraIndCheck().setValue(null);
		this.form.dtimAuthoring().setValue(null);
		this.form.qmbAuthoringCP().setValue(null);
		this.form.txtIPPB().setValue("");
		this.form.txtCoughAssist().setValue("");
		this.form.ansOnCall().setValue(null);
		this.form.txtAnalysis().setValue("");
		this.form.cmbAssisted().setValue(null);
		this.form.cmbPostural().setValue(null);
	}
	protected void populateScreenFromData(ims.core.vo.RespiratoryTreatmentVo value)
	{
		clearScreen();
		if(value == null)
			return;

		this.form.ansContraIndCheck().setValue(value.getContraindicationCheckedIsNotNull() ? value.getContraindicationChecked() : null);
		this.form.dtimAuthoring().setValue(value.getAuthoringDateTimeIsNotNull() ? value.getAuthoringDateTime() : null);
		this.form.qmbAuthoringCP().setValue(value.getAuthoringCPIsNotNull() ? value.getAuthoringCP() : null);
		this.form.txtIPPB().setValue(value.getIPPBIsNotNull() ? value.getIPPB(): null);
		this.form.txtCoughAssist().setValue(value.getCoughAssistIsNotNull() ? value.getCoughAssist(): null);
		this.form.ansOnCall().setValue(value.getReferOnCallPhysioIsNotNull() ? value.getReferOnCallPhysio() : null);
		this.form.txtAnalysis().setValue(value.getTreatmentAnalysisIsNotNull() ? value.getTreatmentAnalysis(): null);
		this.form.cmbAssisted().setValue(value.getAssistedCoughIsNotNull() ? value.getAssistedCough() : null);
		this.form.cmbPostural().setValue(value.getPosturalDrainageIsNotNull() ? value.getPosturalDrainage() : null);
	}
	protected ims.core.vo.RespiratoryTreatmentVo populateDataFromScreen(ims.core.vo.RespiratoryTreatmentVo value)
	{
		if(value == null)
			value = new ims.core.vo.RespiratoryTreatmentVo();

		value.setContraindicationChecked(this.form.ansContraIndCheck().getValue());
		value.setAuthoringDateTime(this.form.dtimAuthoring().getValue());
		value.setAuthoringCP(this.form.qmbAuthoringCP().getValue());
		value.setIPPB(this.form.txtIPPB().getValue());
		value.setCoughAssist(this.form.txtCoughAssist().getValue());
		value.setReferOnCallPhysio(this.form.ansOnCall().getValue());
		value.setTreatmentAnalysis(this.form.txtAnalysis().getValue());
		value.setAssistedCough(this.form.cmbAssisted().getValue());
		value.setPosturalDrainage(this.form.cmbPostural().getValue());

		return value;
	}
	protected ims.core.vo.RespiratoryTreatmentVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.core.vo.RespiratoryTreatmentVo());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.spinalinjuries.domain.RespiratoryTreatment domain;
}
