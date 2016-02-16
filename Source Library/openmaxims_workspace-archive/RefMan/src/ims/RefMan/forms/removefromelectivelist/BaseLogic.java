// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.removefromelectivelist;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.RefMan.domain.RemoveFromElectiveList.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.RefMan.domain.RemoveFromElectiveList domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbRemovalOtherReasonValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbRemovalOtherReason().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.RemovalOtherReason existingInstance = (ims.RefMan.vo.lookups.RemovalOtherReason)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbRemovalOtherReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.RemovalOtherReason)
		{
			ims.RefMan.vo.lookups.RemovalOtherReason instance = (ims.RefMan.vo.lookups.RemovalOtherReason)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbRemovalOtherReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.RemovalOtherReason existingInstance = (ims.RefMan.vo.lookups.RemovalOtherReason)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbRemovalOtherReason().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbRemovalOtherReasonLookup()
	{
		this.form.cmbRemovalOtherReason().clear();
		ims.RefMan.vo.lookups.RemovalOtherReasonCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getRemovalOtherReason(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbRemovalOtherReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbRemovalOtherReasonLookupValue(int id)
	{
		ims.RefMan.vo.lookups.RemovalOtherReason instance = ims.RefMan.vo.lookups.LookupHelper.getRemovalOtherReasonInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbRemovalOtherReason().setValue(instance);
	}
	protected final void defaultcmbRemovalOtherReasonLookupValue()
	{
		this.form.cmbRemovalOtherReason().setValue((ims.RefMan.vo.lookups.RemovalOtherReason)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.RemovalOtherReason.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.RemovalOtherReason.TYPE_ID));
	}
	protected final void oncmbRemovalReasonValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbRemovalReason().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ElectiveListStatusReason existingInstance = (ims.RefMan.vo.lookups.ElectiveListStatusReason)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbRemovalReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.RefMan.vo.lookups.ElectiveListStatusReason)
		{
			ims.RefMan.vo.lookups.ElectiveListStatusReason instance = (ims.RefMan.vo.lookups.ElectiveListStatusReason)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbRemovalReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.RefMan.vo.lookups.ElectiveListStatusReason existingInstance = (ims.RefMan.vo.lookups.ElectiveListStatusReason)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbRemovalReason().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbRemovalReasonLookup()
	{
		this.form.cmbRemovalReason().clear();
		ims.RefMan.vo.lookups.ElectiveListStatusReasonCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getElectiveListStatusReason(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbRemovalReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbRemovalReasonLookupValue(int id)
	{
		ims.RefMan.vo.lookups.ElectiveListStatusReason instance = ims.RefMan.vo.lookups.LookupHelper.getElectiveListStatusReasonInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbRemovalReason().setValue(instance);
	}
	protected final void defaultcmbRemovalReasonLookupValue()
	{
		this.form.cmbRemovalReason().setValue((ims.RefMan.vo.lookups.ElectiveListStatusReason)domain.getLookupService().getDefaultInstance(ims.RefMan.vo.lookups.ElectiveListStatusReason.class, engine.getFormName().getID(), ims.RefMan.vo.lookups.ElectiveListStatusReason.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.RefMan.domain.RemoveFromElectiveList domain;
}