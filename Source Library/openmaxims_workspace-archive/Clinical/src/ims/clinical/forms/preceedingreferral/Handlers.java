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

package ims.clinical.forms.preceedingreferral;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbReasonLookup();
	abstract protected void defaultcmbReasonLookupValue();
	abstract protected void bindcmbSpecialtyFuncCodeLookup();
	abstract protected void defaultcmbSpecialtyFuncCodeLookupValue();
	abstract protected void bindcmbPriortyLookup();
	abstract protected void defaultcmbPriortyLookupValue();
	abstract protected void bindcmbSourceReferralLookup();
	abstract protected void defaultcmbSourceReferralLookupValue();
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnOKClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbReasonValueSet(Object value);
	abstract protected void onQmbReferredToTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSpecialtyFuncCodeValueSet(Object value);
	abstract protected void onQmbReferredByValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onQmbReferredByTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPriortyValueSet(Object value);
	abstract protected void onQmbRefOrganisationTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbSourceReferralValueSet(Object value);
	abstract protected void onCmbSourceReferralValueChanged() throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen(args);
			}
		});
		this.form.btnOK().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnOKClick();
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.cmbReason().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbReasonValueSet(value);
			}
		});
		this.form.qmbReferredTo().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbReferredToTextSubmited(value);
			}
		});
		this.form.cmbSpecialtyFuncCode().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSpecialtyFuncCodeValueSet(value);
			}
		});
		this.form.qmbReferredBy().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbReferredByValueChanged();
			}
		});
		this.form.qmbReferredBy().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbReferredByTextSubmited(value);
			}
		});
		this.form.cmbPriorty().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPriortyValueSet(value);
			}
		});
		this.form.qmbRefOrganisation().setSearchEvent(new ComboBoxSearch()
		{
			private static final long serialVersionUID = 1L;
			public void handle(String value) throws ims.framework.exceptions.PresentationLogicException
			{
				onQmbRefOrganisationTextSubmited(value);
			}
		});
		this.form.cmbSourceReferral().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbSourceReferralValueSet(value);
			}
		});
		this.form.cmbSourceReferral().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbSourceReferralValueChanged();
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbReasonLookup();
		bindcmbSpecialtyFuncCodeLookup();
		bindcmbPriortyLookup();
		bindcmbSourceReferralLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbReasonLookup();
		bindcmbSpecialtyFuncCodeLookup();
		bindcmbPriortyLookup();
		bindcmbSourceReferralLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbReasonLookupValue();
		defaultcmbSpecialtyFuncCodeLookupValue();
		defaultcmbPriortyLookupValue();
		defaultcmbSourceReferralLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
