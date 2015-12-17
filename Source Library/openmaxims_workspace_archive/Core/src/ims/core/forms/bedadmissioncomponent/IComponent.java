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

package ims.core.forms.bedadmissioncomponent;

import ims.framework.enumerations.FormMode;

public interface IComponent
{
	public void setMode(FormMode mode);
	public FormMode getMode();
	public void initialise();

	/**
	* saveAdmission
	*/
	public Boolean saveAdmission();

	/**
	* getInWaitingIsVisible - used to change text on admit button on bedinfodialog
	*/
	public Boolean getInWaitingIsVisible();

	/**
	* allocateBed
	*/
	public Boolean allocateBed();

	/**
	* getIsRecordSelected
	*/
	public Boolean getIsRecordSelected();

	public Boolean checkForPatientAlreadyAdmited();

	/**
	* returnFromLeave
	*/
	public Boolean returnFromLeave();

	/**
	* getIsReturnFromLeaveVisible
	*/
	public Boolean getIsReturnFromLeaveVisible();

	public Boolean saveElectiveListAdmission(Boolean cancelOtherPatientElectiveList);

	public Boolean hasPatientElectiveListToCancel();

	public Boolean isOnTCITab();

	public Boolean isOnEmergency();

	public Boolean saveElectiveListEmergencyAdmission();
}