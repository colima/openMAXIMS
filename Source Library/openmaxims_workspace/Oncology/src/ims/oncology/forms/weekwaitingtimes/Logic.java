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
// This code was generated by Andreea Tugui using IMS Development Environment (version 1.70 build 3399.19536)
// Copyright (C) 1995-2009 IMS MAXIMS plc. All rights reserved.

package ims.oncology.forms.weekwaitingtimes;

import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.PresentationLogicException;




public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onBtnOKClick() throws ims.framework.exceptions.PresentationLogicException
	{
		try 
		{
			// wdev-7488
			if (form.dteFrom().getValue() == null || form.dteTo().getValue() == null)
			{
				engine.showMessage("Both From and To date values are mandatory");
				return;
			}
			
			if (form.dteFrom().getValue().getDate().after(form.dteTo().getValue().getDate()))
			{
				engine.showMessage("From Date must be before To Date ");
				return;
			}
			
			String returnVal[] = domain.generateTwoWeekWaitReport(form.dteFrom().getValue(), form.dteTo().getValue());
			engine.showErrors("Process Complete", returnVal);
		}
		catch (StaleObjectException e) 
		{
			engine.showMessage("Data has been changed, please re-submit request");
			return;
		}
		catch (DomainInterfaceException e) 
		{
			engine.showMessage(e.getMessage());
			
		}
	}

	public void clearInstanceControls() {
		// TODO Auto-generated method stub
		
	}

	public void newInstance() throws PresentationLogicException {
		// TODO Auto-generated method stub
		
	}

	public boolean save() throws PresentationLogicException {
		// TODO Auto-generated method stub
		return false;
	}

	public void updateControlsState() {
		// TODO Auto-generated method stub
		
	}

	public void updateInstance() {
		// TODO Auto-generated method stub
		
	}

	public void open() throws PresentationLogicException {
		// TODO Auto-generated method stub
		
	}
}
