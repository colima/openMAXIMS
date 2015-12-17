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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.60 build 2874.17009)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.pathways.forms.createnewpathway;

import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.Specialty;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.pathways.forms.createnewpathway.GenForm.grdPathwayRow;
import ims.pathways.vo.PathwayLiteVo;
import ims.pathways.vo.PathwayLiteVoCollection;
import ims.pathways.vo.PatientJourneyShortVo;
import ims.pathways.vo.PatientPathwayJourneyRefVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onBtnCancelClick() throws PresentationLogicException 
	{
		engine.close(DialogResult.CANCEL);
	}

	@Override
	protected void onBtnSaveClick() throws PresentationLogicException 
	{
		if (save())
			engine.close(DialogResult.OK);		
	}

	private boolean save()
	{
		PatientPathwayJourneyRefVo currentJourney = form.getGlobalContext().Pathways.getSelectedPatientPathwayJourney();
		
		if (form.grdPathway().getSelectedRow() == null ||
				currentJourney == null)
					return false;
		
		
		
		try
		{
			domain.updatePatientJourney(form.getLocalContext().getfullPatientJourneyVo(), form.grdPathway().getSelectedRow().getValue(), engine.getLoggedInUser());
		}
		catch (DomainInterfaceException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(e.getMessage());
			return false;
		}
		
		form.getGlobalContext().Pathways.setSelectedPatientPathwayJourney(currentJourney);
		
		return true;
	}

	@Override
	protected void onCmbSpecialtyValueChanged()
			throws PresentationLogicException 
	{
		listPathways(form.cmbSpecialty().getValue());
		updateControlState();
	}

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		super.bindcmbSpecialtyLookup();
		PatientPathwayJourneyRefVo patientJourneySelectedPathwayProfile = form.getGlobalContext().Pathways.getSelectedPatientPathwayJourney();
		PatientJourneyShortVo currentJourney = domain.getPatientJourneyShort(patientJourneySelectedPathwayProfile);
		form.getLocalContext().setfullPatientJourneyVo(domain.getPatientJourney(currentJourney));
		form.grdPathway().getRows().clear();
		form.cmbSpecialty().setValue(form.getLocalContext().getfullPatientJourneyVo().getPathway().getSpecialty());
		onCmbSpecialtyValueChanged();
		updateControlState();
	}

	private void listPathways(Specialty value)
	{
		PathwayLiteVoCollection voColl = domain.listPathway(null, value, null, PreActiveActiveInactiveStatus.ACTIVE);
		populatePathwayGrid(voColl);
	}

	private void populatePathwayGrid(PathwayLiteVoCollection voColl) 
	{
		PatientPathwayJourneyRefVo patientJourneySelectedPathwayProfile = form.getGlobalContext().Pathways.getSelectedPatientPathwayJourney();
		
		if (patientJourneySelectedPathwayProfile == null)
			return;
		
		PatientJourneyShortVo currentJourney = domain.getPatientJourneyShort(patientJourneySelectedPathwayProfile);
		PathwayLiteVo currentPathway = currentJourney.getPathway();
		
		form.grdPathway().getRows().clear();
		for (int i = 0; i < voColl.size(); i++) 
		{
			//Add only record != current Pathway
			if (!voColl.get(i).getID_Pathway().equals(
					currentPathway.getID_Pathway()))
			{
				grdPathwayRow row = form.grdPathway().getRows().newRow();
				row.setColPathway(voColl.get(i).getName());
				row.setValue(voColl.get(i));
				if (voColl.get(i).getIsDefault())
				{
					row.setBackColor(Color.Bisque);
				}
			}
		}
	}


	protected void onGrdPathwaySelectionChanged()throws PresentationLogicException 
	{
		updateControlState();
	}

	private void updateControlState() 
	{
		form.btnSave().setEnabled(form.grdPathway().getValue() != null);		
	}
}