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

package ims.spinalinjuries.forms.nurassessmentpersonaldetails;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.spinalinjuries.domain.NurAssessmentPersonalDetails.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.spinalinjuries.domain.NurAssessmentPersonalDetails domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbOccupationValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbOccupation().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Occupation existingInstance = (ims.core.vo.lookups.Occupation)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbOccupationLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.Occupation)
		{
			ims.core.vo.lookups.Occupation instance = (ims.core.vo.lookups.Occupation)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbOccupationLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Occupation existingInstance = (ims.core.vo.lookups.Occupation)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbOccupation().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbOccupationLookup()
	{
		this.form.cmbOccupation().clear();
		ims.core.vo.lookups.OccupationCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getOccupation(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbOccupation().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbOccupationLookupValue(int id)
	{
		ims.core.vo.lookups.Occupation instance = ims.core.vo.lookups.LookupHelper.getOccupationInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbOccupation().setValue(instance);
	}
	protected final void defaultcmbOccupationLookupValue()
	{
		this.form.cmbOccupation().setValue((ims.core.vo.lookups.Occupation)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.Occupation.class, engine.getFormName().getID(), ims.core.vo.lookups.Occupation.TYPE_ID));
	}
	protected final void onansNightSedationValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ansNightSedation().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindansNightSedationLookup();
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
					bindansNightSedationLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ansNightSedation().addOption(instance);
		}
	}
	protected final void bindansNightSedationLookup()
	{
		this.form.ansNightSedation().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ansNightSedation().addOption(lookupCollection.get(x));
		}
	}
	protected final void defaultansNightSedationLookupValue()
	{
		this.form.ansNightSedation().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected void clearScreen()
	{
		this.form.chkSectionComplete().setValue(false);
		this.form.txtDyingAnxiety().setValue("");
		this.form.txtSexuality().setValue("");
		this.form.txtOtherOccupation().setValue("");
		this.form.cmbOccupation().setValue(null);
		this.form.txtInterestsHobbies().setValue("");
		this.form.txtNotes().setValue("");
		this.form.intSleepPattern().setValue(null);
		this.form.ansNightSedation().setValue(null);
		this.form.chkNotAppropriate().setValue(false);
		this.form.chkCopy().setValue(false);
	}
	protected void populateScreenFromData(ims.spinalinjuries.vo.NurAssessmentPersonalDetailsVo value)
	{
		clearScreen();
		if(value == null)
			return;

		if(value.getIsCompleteIsNotNull())
			this.form.chkSectionComplete().setValue(value.getIsComplete().booleanValue());
		this.form.txtDyingAnxiety().setValue(value.getAnxietyDyingIsNotNull() ? value.getAnxietyDying(): null);
		this.form.txtSexuality().setValue(value.getSexualityIsNotNull() ? value.getSexuality(): null);
		this.form.txtOtherOccupation().setValue(value.getOccupationOtherIsNotNull() ? value.getOccupationOther(): null);
		this.form.cmbOccupation().setValue(value.getOccupationIsNotNull() ? value.getOccupation() : null);
		this.form.txtInterestsHobbies().setValue(value.getSportsInterestsHobbiesIsNotNull() ? value.getSportsInterestsHobbies(): null);
		this.form.txtNotes().setValue(value.getNotesIsNotNull() ? value.getNotes(): null);
		this.form.intSleepPattern().setValue(value.getUsualSleepPatternIsNotNull() ? value.getUsualSleepPattern() : null);
		this.form.ansNightSedation().setValue(value.getTakesNightSedationIsNotNull() ? value.getTakesNightSedation() : null);
		if(value.getNotAppropriateToAskIsNotNull())
			this.form.chkNotAppropriate().setValue(value.getNotAppropriateToAsk().booleanValue());
		if(value.getCopyIsNotNull())
			this.form.chkCopy().setValue(value.getCopy().booleanValue());
	}
	protected ims.spinalinjuries.vo.NurAssessmentPersonalDetailsVo populateDataFromScreen(ims.spinalinjuries.vo.NurAssessmentPersonalDetailsVo value)
	{
		if(value == null)
			value = new ims.spinalinjuries.vo.NurAssessmentPersonalDetailsVo();

		value.setIsComplete(new Boolean(this.form.chkSectionComplete().getValue()));
		value.setAnxietyDying(this.form.txtDyingAnxiety().getValue());
		value.setSexuality(this.form.txtSexuality().getValue());
		value.setOccupationOther(this.form.txtOtherOccupation().getValue());
		value.setOccupation(this.form.cmbOccupation().getValue());
		value.setSportsInterestsHobbies(this.form.txtInterestsHobbies().getValue());
		value.setNotes(this.form.txtNotes().getValue());
		value.setUsualSleepPattern(this.form.intSleepPattern().getValue());
		value.setTakesNightSedation(this.form.ansNightSedation().getValue());
		value.setNotAppropriateToAsk(new Boolean(this.form.chkNotAppropriate().getValue()));
		value.setCopy(new Boolean(this.form.chkCopy().getValue()));

		return value;
	}
	protected ims.spinalinjuries.vo.NurAssessmentPersonalDetailsVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.spinalinjuries.vo.NurAssessmentPersonalDetailsVo());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.spinalinjuries.domain.NurAssessmentPersonalDetails domain;
}
