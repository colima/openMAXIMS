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
// This code was generated by Gabriel Maxim using IMS Development Environment (version 1.80 build 5465.13953)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.

package ims.core.forms.homeleavedetailsdialog;

import ims.core.admin.pas.vo.InpatientEpisodeRefVo;
import ims.core.vo.HomeLeaveVo;
import ims.framework.enumerations.DialogResult;
import ims.framework.utils.DateTime;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	private void open()
	{
		InpatientEpisodeRefVo inpatRef = form.getGlobalContext().Core.getSelectedBedSpaceStateIsNotNull() ? (InpatientEpisodeRefVo) form.getGlobalContext().Core.getSelectedBedSpaceState().getInpatientEpisode() : (InpatientEpisodeRefVo) form.getGlobalContext().Core.getSelectedWaitingAreaPatient();
		HomeLeaveVo vo = domain.getCurrentHomeLeave(inpatRef);
		form.getLocalContext().setCurrentHomeLeave(vo);
		populateScreenFromData(vo);
		
	}
	private void populateScreenFromData(HomeLeaveVo vo)
	{
		if (vo == null)
			return;
		form.dteHomeLeave().setValue(vo.getDateOnHomeLeave());
		form.timHomeLeave().setValue(vo.getTimeOnHomeLeave());
		form.dteHlReturn().setValue(vo.getExpectedDateOfReturn());
		form.timHlReturn().setValue(vo.getExpectedTimeOfReturn());		
	}
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		HomeLeaveVo voToSave = populateDataFromScreen(form.getLocalContext().getCurrentHomeLeave());

		String [] errors = voToSave.validate(getUiErrors());

		if (errors != null)
		{
			engine.showErrors(errors);
			return;
		}
		form.getGlobalContext().Core.setHomeLeaveDetails(voToSave);
		engine.close(DialogResult.OK);
	}
	private String[] getUiErrors()
	{
		ArrayList<String> errors = new ArrayList<String>();
		
		if (form.dteHomeLeave().getValue() == null || form.timHomeLeave().getValue() == null)
		{
			if (form.dteHomeLeave().getValue() == null)
				errors.add("Date on Home Leave is mandatory.");
			if (form.timHomeLeave().getValue() == null)
				errors.add("Time on Home Leave is mandatory.");		
		}		

		if (form.dteHomeLeave().getValue() != null && form.dteHlReturn().getValue() != null)
		{
			if (form.dteHlReturn().getValue().isLessThan(form.dteHomeLeave().getValue()))
			{
				errors.add("The Expected Date of Return cannot be earlier than the Date on Home Leave.");					
			}
			else if (form.dteHomeLeave().getValue() .equals(form.dteHlReturn().getValue()))
			{
				if (form.timHomeLeave().getValue() != null && form.timHlReturn().getValue() != null)
				{
					if ( form.timHlReturn().getValue().isLessThan(form.timHomeLeave().getValue()))
					{
						errors.add("The Expected Date/Time of Return cannot be earlier than the Date/Time on Home Leave.");							
					}
				}
			}
		}

		DateTime admissionDate = form.getGlobalContext().Core.getSelectedBedSpaceStateIsNotNull() && form.getGlobalContext().Core.getSelectedBedSpaceState().getInpatientEpisodeIsNotNull() ?  form.getGlobalContext().Core.getSelectedBedSpaceState().getInpatientEpisode().getAdmissionDateTime() : (form.getGlobalContext().Core.getSelectedWaitingAreaPatientIsNotNull() ? form.getGlobalContext().Core.getSelectedWaitingAreaPatient().getAdmissionDateTime() : null); 
		if (admissionDate != null)	
		{
			if (form.dteHomeLeave().getValue() != null)
			{	
				if (form.dteHomeLeave().getValue().isLessThan(admissionDate.getDate()))
				{
					errors.add("Date on Home Leave cannot be earlier than Admission Date.");

				}
				if (form.dteHomeLeave().getValue().equals(admissionDate.getDate()))
				{
					if (form.timHomeLeave().getValue() != null && form.timHomeLeave().getValue().isLessThan(admissionDate.getTime()))
					{	
						errors.add("Time on Home Leave cannot be earlier than Admission Date.");							
					}
				}
			}
			if (form.dteHlReturn().getValue() != null)
			{		
				if (form.dteHlReturn().getValue().isLessThan(admissionDate.getDate()))
				{
					errors.add("Expected Date of Return cannot be earlier than Admission Date.");						
				}
				if (form.dteHlReturn().getValue().equals(admissionDate.getDate()))
				{
					if (form.dteHlReturn().getValue()!= null && form.timHlReturn().getValue().isLessThan(admissionDate.getTime()))
					{	
						errors.add("Expected Time of Return cannot be earlier than Admission Date.");							
					}
				}
			}
		}
		if (errors.size() == 0)
			return null;

		return errors.toArray(new String[errors.size()]);		
	}
	private HomeLeaveVo populateDataFromScreen(HomeLeaveVo currentHomeLeave)
	{
		if (currentHomeLeave == null)
			return null;
		HomeLeaveVo currentHomeLeaveToUpdate = (HomeLeaveVo) currentHomeLeave.clone();
		currentHomeLeaveToUpdate.setDateOnHomeLeave(form.dteHomeLeave().getValue());
		currentHomeLeaveToUpdate.setTimeOnHomeLeave(form.timHomeLeave().getValue());
		currentHomeLeaveToUpdate.setExpectedDateOfReturn(form.dteHlReturn().getValue());
		currentHomeLeaveToUpdate.setExpectedTimeOfReturn(form.timHlReturn().getValue());
		
		return currentHomeLeaveToUpdate;
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
}
