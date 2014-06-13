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

package ims.clinical.forms.patientdiagnosischecklist;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.clinical.domain.PatientDiagnosisChecklist.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.clinical.domain.PatientDiagnosisChecklist domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void bindgrdChecklistColSelectLookup()
	{
		this.form.grdChecklist().answerBoxColumnClear(1);
		ims.clinical.vo.lookups.PresentAbsentUnknownCollection lookupCollection = ims.clinical.vo.lookups.LookupHelper.getPresentAbsentUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdChecklist().answerBoxColumnNewOption(1, lookupCollection.get(x));
		}
	}
	protected final void bindgrdChecklistColSourceLookup()
	{
		this.form.grdChecklist().ColSourceComboBox().clear();
		ims.core.vo.lookups.SourceofInformationCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceofInformation(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdChecklist().ColSourceComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.clinical.domain.PatientDiagnosisChecklist domain;
}