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

package ims.clinicaladmin.forms.invasivedeviceconfig;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.clinicaladmin.domain.InvasiveDeviceConfig.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.clinicaladmin.domain.InvasiveDeviceConfig domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void clearContextInformation()
	{
		engine.clearPatientContextInformation();
	}
	protected final void bindgrdTypecolDurationUnitLookup()
	{
		this.form.ctnDetails().grdType().colDurationUnitComboBox().clear();
		ims.core.vo.lookups.TimeUnitsSecondsToMonthsCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonths(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().grdType().colDurationUnitComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void oncmbDurationUnitValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbDurationUnit().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDurationUnitLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.TimeUnitsSecondsToMonths)
		{
			ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDurationUnitLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.TimeUnitsSecondsToMonths existingInstance = (ims.core.vo.lookups.TimeUnitsSecondsToMonths)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbDurationUnit().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDurationUnitLookup()
	{
		this.form.ctnDetails().cmbDurationUnit().clear();
		ims.core.vo.lookups.TimeUnitsSecondsToMonthsCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonths(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbDurationUnit().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDurationUnitLookupValue(int id)
	{
		ims.core.vo.lookups.TimeUnitsSecondsToMonths instance = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonthsInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbDurationUnit().setValue(instance);
	}
	protected final void defaultcmbDurationUnitLookupValue()
	{
		this.form.ctnDetails().cmbDurationUnit().setValue((ims.core.vo.lookups.TimeUnitsSecondsToMonths)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.TimeUnitsSecondsToMonths.class, engine.getFormName().getID(), ims.core.vo.lookups.TimeUnitsSecondsToMonths.TYPE_ID));
	}
	protected final void bindgrdListcolDurationUnitLookup()
	{
		this.form.grdList().colDurationUnitComboBox().clear();
		ims.core.vo.lookups.TimeUnitsSecondsToMonthsCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getTimeUnitsSecondsToMonths(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdList().colDurationUnitComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.clinicaladmin.domain.InvasiveDeviceConfig domain;
}