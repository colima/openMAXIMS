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

package ims.core.forms.pdsdemographics;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.PDSDemographics.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.core.domain.PDSDemographics domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbEligibilitySVUHValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbEligibilitySVUH().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Eligibility existingInstance = (ims.core.vo.lookups.Eligibility)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbEligibilitySVUHLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.Eligibility)
		{
			ims.core.vo.lookups.Eligibility instance = (ims.core.vo.lookups.Eligibility)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbEligibilitySVUHLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Eligibility existingInstance = (ims.core.vo.lookups.Eligibility)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbEligibilitySVUH().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbEligibilitySVUHLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEligibilitySVUH().clear();
		ims.core.vo.lookups.EligibilityCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getEligibility(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbEligibilitySVUH().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbEligibilitySVUHLookupValue(int id)
	{
		ims.core.vo.lookups.Eligibility instance = ims.core.vo.lookups.LookupHelper.getEligibilityInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbEligibilitySVUH().setValue(instance);
	}
	protected final void defaultcmbEligibilitySVUHLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEligibilitySVUH().setValue((ims.core.vo.lookups.Eligibility)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.Eligibility.class, engine.getFormName().getID(), ims.core.vo.lookups.Eligibility.TYPE_ID));
	}
	protected final void oncmbProvedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbProved().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbProvedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNo)
		{
			ims.core.vo.lookups.YesNo instance = (ims.core.vo.lookups.YesNo)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbProvedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNo existingInstance = (ims.core.vo.lookups.YesNo)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbProved().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbProvedLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbProved().clear();
		ims.core.vo.lookups.YesNoCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNo(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbProved().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbProvedLookupValue(int id)
	{
		ims.core.vo.lookups.YesNo instance = ims.core.vo.lookups.LookupHelper.getYesNoInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbProved().setValue(instance);
	}
	protected final void defaultcmbProvedLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbProved().setValue((ims.core.vo.lookups.YesNo)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNo.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNo.TYPE_ID));
	}
	protected final void oncmbEligibilityValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbEligibility().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PersonHealthActCategory existingInstance = (ims.core.vo.lookups.PersonHealthActCategory)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbEligibilityLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PersonHealthActCategory)
		{
			ims.core.vo.lookups.PersonHealthActCategory instance = (ims.core.vo.lookups.PersonHealthActCategory)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbEligibilityLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PersonHealthActCategory existingInstance = (ims.core.vo.lookups.PersonHealthActCategory)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbEligibility().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbEligibilityLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEligibility().clear();
		ims.core.vo.lookups.PersonHealthActCategoryCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPersonHealthActCategory(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbEligibility().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbEligibilityLookupValue(int id)
	{
		ims.core.vo.lookups.PersonHealthActCategory instance = ims.core.vo.lookups.LookupHelper.getPersonHealthActCategoryInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbEligibility().setValue(instance);
	}
	protected final void defaultcmbEligibilityLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEligibility().setValue((ims.core.vo.lookups.PersonHealthActCategory)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PersonHealthActCategory.class, engine.getFormName().getID(), ims.core.vo.lookups.PersonHealthActCategory.TYPE_ID));
	}
	protected final void oncmbPublicCareNeedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbPublicCareNeed().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PublicCareNeed existingInstance = (ims.core.vo.lookups.PublicCareNeed)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPublicCareNeedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PublicCareNeed)
		{
			ims.core.vo.lookups.PublicCareNeed instance = (ims.core.vo.lookups.PublicCareNeed)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPublicCareNeedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PublicCareNeed existingInstance = (ims.core.vo.lookups.PublicCareNeed)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbPublicCareNeed().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPublicCareNeedLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbPublicCareNeed().clear();
		ims.core.vo.lookups.PublicCareNeedCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPublicCareNeed(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbPublicCareNeed().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPublicCareNeedLookupValue(int id)
	{
		ims.core.vo.lookups.PublicCareNeed instance = ims.core.vo.lookups.LookupHelper.getPublicCareNeedInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbPublicCareNeed().setValue(instance);
	}
	protected final void defaultcmbPublicCareNeedLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbPublicCareNeed().setValue((ims.core.vo.lookups.PublicCareNeed)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PublicCareNeed.class, engine.getFormName().getID(), ims.core.vo.lookups.PublicCareNeed.TYPE_ID));
	}
	protected final void oncmbPatientCategoryValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbPatientCategory().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatientStatus existingInstance = (ims.core.vo.lookups.PatientStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPatientCategoryLookup();
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
					bindcmbPatientCategoryLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PatientStatus existingInstance = (ims.core.vo.lookups.PatientStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbPatientCategory().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPatientCategoryLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbPatientCategory().clear();
		ims.core.vo.lookups.PatientStatusCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPatientStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbPatientCategory().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPatientCategoryLookupValue(int id)
	{
		ims.core.vo.lookups.PatientStatus instance = ims.core.vo.lookups.LookupHelper.getPatientStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbPatientCategory().setValue(instance);
	}
	protected final void defaultcmbPatientCategoryLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbPatientCategory().setValue((ims.core.vo.lookups.PatientStatus)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PatientStatus.class, engine.getFormName().getID(), ims.core.vo.lookups.PatientStatus.TYPE_ID));
	}
	protected final void oncmbPolicyTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbPolicyType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PrivateInsurancePolicyType existingInstance = (ims.core.vo.lookups.PrivateInsurancePolicyType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPolicyTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PrivateInsurancePolicyType)
		{
			ims.core.vo.lookups.PrivateInsurancePolicyType instance = (ims.core.vo.lookups.PrivateInsurancePolicyType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPolicyTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PrivateInsurancePolicyType existingInstance = (ims.core.vo.lookups.PrivateInsurancePolicyType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbPolicyType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPolicyTypeLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbPolicyType().clear();
		ims.core.vo.lookups.PrivateInsurancePolicyTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPrivateInsurancePolicyType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbPolicyType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPolicyTypeLookupValue(int id)
	{
		ims.core.vo.lookups.PrivateInsurancePolicyType instance = ims.core.vo.lookups.LookupHelper.getPrivateInsurancePolicyTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbPolicyType().setValue(instance);
	}
	protected final void defaultcmbPolicyTypeLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbPolicyType().setValue((ims.core.vo.lookups.PrivateInsurancePolicyType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PrivateInsurancePolicyType.class, engine.getFormName().getID(), ims.core.vo.lookups.PrivateInsurancePolicyType.TYPE_ID));
	}
	protected final void oncmbEhicInstitutionValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbEhicInstitution().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Institution existingInstance = (ims.core.vo.lookups.Institution)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbEhicInstitutionLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.Institution)
		{
			ims.core.vo.lookups.Institution instance = (ims.core.vo.lookups.Institution)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbEhicInstitutionLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Institution existingInstance = (ims.core.vo.lookups.Institution)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbEhicInstitution().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbEhicInstitutionLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEhicInstitution().clear();
		ims.core.vo.lookups.InstitutionCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getInstitution(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbEhicInstitution().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbEhicInstitutionLookupValue(int id)
	{
		ims.core.vo.lookups.Institution instance = ims.core.vo.lookups.LookupHelper.getInstitutionInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbEhicInstitution().setValue(instance);
	}
	protected final void defaultcmbEhicInstitutionLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEhicInstitution().setValue((ims.core.vo.lookups.Institution)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.Institution.class, engine.getFormName().getID(), ims.core.vo.lookups.Institution.TYPE_ID));
	}
	protected final void oncmbEhicCountryValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabOtherDetails().cmbEhicCountry().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Country existingInstance = (ims.core.vo.lookups.Country)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbEhicCountryLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.Country)
		{
			ims.core.vo.lookups.Country instance = (ims.core.vo.lookups.Country)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbEhicCountryLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.Country existingInstance = (ims.core.vo.lookups.Country)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabOtherDetails().cmbEhicCountry().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbEhicCountryLookup()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEhicCountry().clear();
		ims.core.vo.lookups.CountryCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getCountry(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabOtherDetails().cmbEhicCountry().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbEhicCountryLookupValue(int id)
	{
		ims.core.vo.lookups.Country instance = ims.core.vo.lookups.LookupHelper.getCountryInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabOtherDetails().cmbEhicCountry().setValue(instance);
	}
	protected final void defaultcmbEhicCountryLookupValue()
	{
		this.form.lyrDetails().tabOtherDetails().cmbEhicCountry().setValue((ims.core.vo.lookups.Country)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.Country.class, engine.getFormName().getID(), ims.core.vo.lookups.Country.TYPE_ID));
	}
	protected final void oncmbPreferredLanguageValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabPreferences().cmbPreferredLanguage().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSPreferredCommunicationLanguage existingInstance = (ims.core.vo.lookups.PDSPreferredCommunicationLanguage)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPreferredLanguageLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PDSPreferredCommunicationLanguage)
		{
			ims.core.vo.lookups.PDSPreferredCommunicationLanguage instance = (ims.core.vo.lookups.PDSPreferredCommunicationLanguage)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPreferredLanguageLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSPreferredCommunicationLanguage existingInstance = (ims.core.vo.lookups.PDSPreferredCommunicationLanguage)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabPreferences().cmbPreferredLanguage().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPreferredLanguageLookup()
	{
		this.form.lyrDetails().tabPreferences().cmbPreferredLanguage().clear();
		ims.core.vo.lookups.PDSPreferredCommunicationLanguageCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPDSPreferredCommunicationLanguage(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabPreferences().cmbPreferredLanguage().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPreferredLanguageLookupValue(int id)
	{
		ims.core.vo.lookups.PDSPreferredCommunicationLanguage instance = ims.core.vo.lookups.LookupHelper.getPDSPreferredCommunicationLanguageInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabPreferences().cmbPreferredLanguage().setValue(instance);
	}
	protected final void defaultcmbPreferredLanguageLookupValue()
	{
		this.form.lyrDetails().tabPreferences().cmbPreferredLanguage().setValue((ims.core.vo.lookups.PDSPreferredCommunicationLanguage)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PDSPreferredCommunicationLanguage.class, engine.getFormName().getID(), ims.core.vo.lookups.PDSPreferredCommunicationLanguage.TYPE_ID));
	}
	protected final void oncmbConsentValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabPreferences().cmbConsent().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSConsent existingInstance = (ims.core.vo.lookups.PDSConsent)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbConsentLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PDSConsent)
		{
			ims.core.vo.lookups.PDSConsent instance = (ims.core.vo.lookups.PDSConsent)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbConsentLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSConsent existingInstance = (ims.core.vo.lookups.PDSConsent)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabPreferences().cmbConsent().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbConsentLookup()
	{
		this.form.lyrDetails().tabPreferences().cmbConsent().clear();
		ims.core.vo.lookups.PDSConsentCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPDSConsent(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabPreferences().cmbConsent().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbConsentLookupValue(int id)
	{
		ims.core.vo.lookups.PDSConsent instance = ims.core.vo.lookups.LookupHelper.getPDSConsentInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabPreferences().cmbConsent().setValue(instance);
	}
	protected final void defaultcmbConsentLookupValue()
	{
		this.form.lyrDetails().tabPreferences().cmbConsent().setValue((ims.core.vo.lookups.PDSConsent)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PDSConsent.class, engine.getFormName().getID(), ims.core.vo.lookups.PDSConsent.TYPE_ID));
	}
	protected final void oncmbPreferredWrittenCommMethodValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabPreferences().cmbPreferredWrittenCommMethod().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PreferredWrittenCommunication existingInstance = (ims.core.vo.lookups.PreferredWrittenCommunication)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPreferredWrittenCommMethodLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PreferredWrittenCommunication)
		{
			ims.core.vo.lookups.PreferredWrittenCommunication instance = (ims.core.vo.lookups.PreferredWrittenCommunication)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPreferredWrittenCommMethodLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PreferredWrittenCommunication existingInstance = (ims.core.vo.lookups.PreferredWrittenCommunication)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabPreferences().cmbPreferredWrittenCommMethod().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPreferredWrittenCommMethodLookup()
	{
		this.form.lyrDetails().tabPreferences().cmbPreferredWrittenCommMethod().clear();
		ims.core.vo.lookups.PreferredWrittenCommunicationCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPreferredWrittenCommunication(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabPreferences().cmbPreferredWrittenCommMethod().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPreferredWrittenCommMethodLookupValue(int id)
	{
		ims.core.vo.lookups.PreferredWrittenCommunication instance = ims.core.vo.lookups.LookupHelper.getPreferredWrittenCommunicationInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabPreferences().cmbPreferredWrittenCommMethod().setValue(instance);
	}
	protected final void defaultcmbPreferredWrittenCommMethodLookupValue()
	{
		this.form.lyrDetails().tabPreferences().cmbPreferredWrittenCommMethod().setValue((ims.core.vo.lookups.PreferredWrittenCommunication)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PreferredWrittenCommunication.class, engine.getFormName().getID(), ims.core.vo.lookups.PreferredWrittenCommunication.TYPE_ID));
	}
	protected final void oncmbPrefferedContactMethodValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.lyrDetails().tabPreferences().cmbPrefferedContactMethod().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSContactMethod existingInstance = (ims.core.vo.lookups.PDSContactMethod)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPrefferedContactMethodLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PDSContactMethod)
		{
			ims.core.vo.lookups.PDSContactMethod instance = (ims.core.vo.lookups.PDSContactMethod)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPrefferedContactMethodLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PDSContactMethod existingInstance = (ims.core.vo.lookups.PDSContactMethod)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.lyrDetails().tabPreferences().cmbPrefferedContactMethod().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPrefferedContactMethodLookup()
	{
		this.form.lyrDetails().tabPreferences().cmbPrefferedContactMethod().clear();
		ims.core.vo.lookups.PDSContactMethodCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPDSContactMethod(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyrDetails().tabPreferences().cmbPrefferedContactMethod().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPrefferedContactMethodLookupValue(int id)
	{
		ims.core.vo.lookups.PDSContactMethod instance = ims.core.vo.lookups.LookupHelper.getPDSContactMethodInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.lyrDetails().tabPreferences().cmbPrefferedContactMethod().setValue(instance);
	}
	protected final void defaultcmbPrefferedContactMethodLookupValue()
	{
		this.form.lyrDetails().tabPreferences().cmbPrefferedContactMethod().setValue((ims.core.vo.lookups.PDSContactMethod)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PDSContactMethod.class, engine.getFormName().getID(), ims.core.vo.lookups.PDSContactMethod.TYPE_ID));
	}
	protected void clearScreen()
	{
	}
	protected void populateScreenFromData(ims.core.vo.Patient value)
	{
		clearScreen();
		if(value == null)
			return;

	}
	protected ims.core.vo.Patient populateDataFromScreen(ims.core.vo.Patient value)
	{
		if(value == null)
			value = new ims.core.vo.Patient();


		return value;
	}
	protected ims.core.vo.Patient populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.core.vo.Patient());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.PDSDemographics domain;
}