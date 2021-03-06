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

package ims.RefMan.forms.referraldetailscomponent;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.ReferralDetailsComponent.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.RefMan.domain.ReferralDetailsComponent domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void setMode(ims.framework.enumerations.FormMode mode)
	{
		form.setMode(mode);
	}
	public ims.framework.enumerations.FormMode getMode()
	{
		return form.getMode();
	}
	protected final void oncmbLanguageValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbLanguage().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Language existingInstance = (ims.core.vo.lookups.Language)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbLanguageLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.Language)
		{
			ims.core.vo.lookups.Language instance = (ims.core.vo.lookups.Language)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbLanguageLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Language existingInstance = (ims.core.vo.lookups.Language)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbLanguage().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbLanguageLookup()
	{
		this.form.cmbLanguage().clear();
		ims.core.vo.lookups.LanguageCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getLanguage(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbLanguage().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbLanguageLookupValue(int id)
	{
		ims.core.vo.lookups.Language instance = ims.core.vo.lookups.LookupHelper.getLanguageInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbLanguage().setValue(instance);
	}
	protected final void defaultcmbLanguageLookupValue()
	{
		this.form.cmbLanguage().setValue((ims.core.vo.lookups.Language)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.Language.class, engine.getFormName().getID(), ims.core.vo.lookups.Language.TYPE_ID));
	}
	protected final void oncmbTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.ApptTransportType existingInstance = (ims.scheduling.vo.lookups.ApptTransportType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.ApptTransportType)
		{
			ims.scheduling.vo.lookups.ApptTransportType instance = (ims.scheduling.vo.lookups.ApptTransportType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.ApptTransportType existingInstance = (ims.scheduling.vo.lookups.ApptTransportType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbTypeLookup()
	{
		this.form.cmbType().clear();
		ims.scheduling.vo.lookups.ApptTransportTypeCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getApptTransportType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbTypeLookupValue(int id)
	{
		ims.scheduling.vo.lookups.ApptTransportType instance = ims.scheduling.vo.lookups.LookupHelper.getApptTransportTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbType().setValue(instance);
	}
	protected final void defaultcmbTypeLookupValue()
	{
		this.form.cmbType().setValue((ims.scheduling.vo.lookups.ApptTransportType)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.ApptTransportType.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.ApptTransportType.TYPE_ID));
	}
	protected final void bindgrdContactcolTypeLookup()
	{
		this.form.grdContact().colTypeComboBox().clear();
		ims.core.vo.lookups.ChannelTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getChannelType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdContact().colTypeComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void oncmbCategoryValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbCategory().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatientStatus existingInstance = (ims.core.vo.lookups.PatientStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCategoryLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PatientStatus)
		{
			ims.core.vo.lookups.PatientStatus instance = (ims.core.vo.lookups.PatientStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCategoryLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatientStatus existingInstance = (ims.core.vo.lookups.PatientStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbCategory().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCategoryLookup()
	{
		this.form.cmbCategory().clear();
		ims.core.vo.lookups.PatientStatusCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPatientStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbCategory().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCategoryLookupValue(int id)
	{
		ims.core.vo.lookups.PatientStatus instance = ims.core.vo.lookups.LookupHelper.getPatientStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbCategory().setValue(instance);
	}
	protected final void defaultcmbCategoryLookupValue()
	{
		this.form.cmbCategory().setValue((ims.core.vo.lookups.PatientStatus)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PatientStatus.class, engine.getFormName().getID(), ims.core.vo.lookups.PatientStatus.TYPE_ID));
	}
	protected final void oncmbCancerTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbCancerType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.CancerType existingInstance = (ims.RefMan.vo.lookups.CancerType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCancerTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.CancerType)
		{
			ims.RefMan.vo.lookups.CancerType instance = (ims.RefMan.vo.lookups.CancerType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCancerTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.CancerType existingInstance = (ims.RefMan.vo.lookups.CancerType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbCancerType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCancerTypeLookup()
	{
		this.form.cmbCancerType().clear();
		ims.RefMan.vo.lookups.CancerTypeCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getCancerType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbCancerType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCancerTypeLookupValue(int id)
	{
		ims.RefMan.vo.lookups.CancerType instance = ims.RefMan.vo.lookups.LookupHelper.getCancerTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbCancerType().setValue(instance);
	}
	protected final void defaultcmbCancerTypeLookupValue()
	{
		this.form.cmbCancerType().setValue((ims.RefMan.vo.lookups.CancerType)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.CancerType.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.CancerType.TYPE_ID));
	}
	protected final void oncmbSORValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbSOR().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSORLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SourceOfReferral)
		{
			ims.core.vo.lookups.SourceOfReferral instance = (ims.core.vo.lookups.SourceOfReferral)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSORLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbSOR().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSORLookup()
	{
		this.form.cmbSOR().clear();
		ims.core.vo.lookups.SourceOfReferralCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceOfReferral(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbSOR().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSORLookupValue(int id)
	{
		ims.core.vo.lookups.SourceOfReferral instance = ims.core.vo.lookups.LookupHelper.getSourceOfReferralInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbSOR().setValue(instance);
	}
	protected final void defaultcmbSORLookupValue()
	{
		this.form.cmbSOR().setValue((ims.core.vo.lookups.SourceOfReferral)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SourceOfReferral.class, engine.getFormName().getID(), ims.core.vo.lookups.SourceOfReferral.TYPE_ID));
	}
	protected final void oncmbInitiatedFromValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbInitiatedFrom().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralInitiatedFrom existingInstance = (ims.RefMan.vo.lookups.ReferralInitiatedFrom)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbInitiatedFromLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ReferralInitiatedFrom)
		{
			ims.RefMan.vo.lookups.ReferralInitiatedFrom instance = (ims.RefMan.vo.lookups.ReferralInitiatedFrom)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbInitiatedFromLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ReferralInitiatedFrom existingInstance = (ims.RefMan.vo.lookups.ReferralInitiatedFrom)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbInitiatedFrom().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbInitiatedFromLookup()
	{
		this.form.cmbInitiatedFrom().clear();
		ims.RefMan.vo.lookups.ReferralInitiatedFromCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReferralInitiatedFrom(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbInitiatedFrom().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbInitiatedFromLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ReferralInitiatedFrom instance = ims.RefMan.vo.lookups.LookupHelper.getReferralInitiatedFromInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbInitiatedFrom().setValue(instance);
	}
	protected final void defaultcmbInitiatedFromLookupValue()
	{
		this.form.cmbInitiatedFrom().setValue((ims.RefMan.vo.lookups.ReferralInitiatedFrom)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ReferralInitiatedFrom.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ReferralInitiatedFrom.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.ReferralDetailsComponent domain;
}
