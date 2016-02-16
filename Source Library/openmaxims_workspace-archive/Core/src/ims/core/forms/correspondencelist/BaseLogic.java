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

package ims.core.forms.correspondencelist;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.CorrespondenceList.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.core.domain.CorrespondenceList domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbCorrespondanceTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbCorrespondanceType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.ClinicalCorrespondenceType existingInstance = (ims.clinical.vo.lookups.ClinicalCorrespondenceType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCorrespondanceTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.ClinicalCorrespondenceType)
		{
			ims.clinical.vo.lookups.ClinicalCorrespondenceType instance = (ims.clinical.vo.lookups.ClinicalCorrespondenceType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCorrespondanceTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.ClinicalCorrespondenceType existingInstance = (ims.clinical.vo.lookups.ClinicalCorrespondenceType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbCorrespondanceType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCorrespondanceTypeLookup()
	{
		this.form.cmbCorrespondanceType().clear();
		ims.clinical.vo.lookups.ClinicalCorrespondenceTypeCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getClinicalCorrespondenceType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbCorrespondanceType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCorrespondanceTypeLookupValue(int id)
	{
		ims.clinical.vo.lookups.ClinicalCorrespondenceType instance = ims.clinical.vo.lookups.LookupHelper.getClinicalCorrespondenceTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbCorrespondanceType().setValue(instance);
	}
	protected final void defaultcmbCorrespondanceTypeLookupValue()
	{
		this.form.cmbCorrespondanceType().setValue((ims.clinical.vo.lookups.ClinicalCorrespondenceType)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.ClinicalCorrespondenceType.class, engine.getFormName().getID(), ims.clinical.vo.lookups.ClinicalCorrespondenceType.TYPE_ID));
	}
	protected final void oncmbStatusValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbStatus().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.CorrespondenceStatus existingInstance = (ims.clinical.vo.lookups.CorrespondenceStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbStatusLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.clinical.vo.lookups.CorrespondenceStatus)
		{
			ims.clinical.vo.lookups.CorrespondenceStatus instance = (ims.clinical.vo.lookups.CorrespondenceStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbStatusLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.clinical.vo.lookups.CorrespondenceStatus existingInstance = (ims.clinical.vo.lookups.CorrespondenceStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbStatus().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbStatusLookup()
	{
		this.form.cmbStatus().clear();
		ims.clinical.vo.lookups.CorrespondenceStatusCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getCorrespondenceStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbStatusLookupValue(int id)
	{
		ims.clinical.vo.lookups.CorrespondenceStatus instance = ims.clinical.vo.lookups.LookupHelper.getCorrespondenceStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbStatus().setValue(instance);
	}
	protected final void defaultcmbStatusLookupValue()
	{
		this.form.cmbStatus().setValue((ims.clinical.vo.lookups.CorrespondenceStatus)domain.getLookupService().getDefaultInstance(ims.clinical.vo.lookups.CorrespondenceStatus.class, engine.getFormName().getID(), ims.clinical.vo.lookups.CorrespondenceStatus.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.CorrespondenceList domain;
}