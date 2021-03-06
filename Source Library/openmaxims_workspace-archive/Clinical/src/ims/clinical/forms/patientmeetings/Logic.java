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
// This code was generated by Dara Hickey using IMS Development Environment (version 1.51 build 2469.26857)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.clinical.forms.patientmeetings;

import java.util.ArrayList;

import ims.clinical.forms.patientmeetings.GenForm.grdListRow;
import ims.clinical.vo.PatientMeetingInviteeVo;
import ims.clinical.vo.PatientMeetingInviteeVoCollection;
import ims.clinical.vo.PatientMeetingLiteVo;
import ims.clinical.vo.PatientMeetingLiteVoCollection;
import ims.clinical.vo.PatientMeetingVo;
import ims.clinical.vo.lookups.AttendanceStatus;
import ims.clinical.vo.lookups.AttendanceStatusCollection;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.ClinicalTeamMemberVoCollection;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.lookups.HcpDisType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.Control;
import ims.framework.FormName;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.controls.DynamicGridRowCollection;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;
import ims.vo.ValueObject;

public class Logic extends BaseLogic
{
	private static final long	serialVersionUID	= 1L;

	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}

	protected void onGrdDetailsSelectionChanged() throws PresentationLogicException
	{
		selectionChanged();
		form.ctnDetails().setCollapsed(false);
	}

	public void initialize()
	{
		form.ctnDetails().customControlAuthoringHcp().setHcpType(HcpDisType.MEDICAL);
	}

	private void selectionChanged()
	{
		form.getLocalContext().setSelectedInstance(domain.getPatientMeeting(form.grdList().getValue()));
		populateInstanceControls(form.getLocalContext().getSelectedInstance());
		updateControlsState();
	}

	private void populateInstanceControls(PatientMeetingVo voPatientMeeting)
	{
		if (voPatientMeeting == null)
			return;

		form.ctnDetails().cmbStatus().setValue(voPatientMeeting.getStatus());
		form.ctnDetails().customControlAuthoringHcp().setValue(voPatientMeeting.getAuthoringInformation());
		form.ctnDetails().dteNextMeeting().setValue(voPatientMeeting.getNextMeetingDate().getDate());
		form.ctnDetails().dtimMeeting().setValue(voPatientMeeting.getMeetingDateTime());
		form.ctnDetails().txtNotes().setValue(voPatientMeeting.getMeetingNotes());

		displayInvitees(voPatientMeeting.getAttendees());
	}

	private PatientMeetingInviteeVoCollection populateInviteeInstanceData()
	{
		PatientMeetingInviteeVoCollection voCollMeetingInvitees = new PatientMeetingInviteeVoCollection();

		DynamicGridRowCollection rows = form.ctnDetails().dyngrdInvitees().getRows();
		for (int i = 0; i < rows.size(); i++)
		{
			DynamicGridRow row = rows.get(i);
			ValueObject vo = (ValueObject) row.getValue();

			PatientMeetingInviteeVo voMeetingInvitee = null;
			if (vo instanceof PatientMeetingInviteeVo)
				voMeetingInvitee = (PatientMeetingInviteeVo) (row.getValue() != null ? row.getValue() : new PatientMeetingInviteeVo());
			else
			{
				if (row.getCells().get(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(INVITEE_COLUMN)) != null)
				{
					voMeetingInvitee = new PatientMeetingInviteeVo();
					DynamicGridCell inviteeCell = row.getCells().get(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(INVITEE_COLUMN));
					if (inviteeCell.getValue() instanceof HcpLiteVo)
						voMeetingInvitee.setHcp((HcpLiteVo) inviteeCell.getValue());
					else
						voMeetingInvitee.setFamilyMember((String) inviteeCell.getValue());
				}
				else
					throw new CodingRuntimeException("GetValue for row did not return HCP in column or the expected PatientMeetingInvitee vo");
			}

			if (form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(STATUS_COLUMN) != null && row.getCells().get(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(STATUS_COLUMN)) != null)
				voMeetingInvitee.setStatus((AttendanceStatus) row.getCells().get(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(STATUS_COLUMN)).getValue());

			if (row.getCells().size() != 0 && form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(NOTE_COLUMN) != null && row.getCells().get(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(NOTE_COLUMN)).getValue() != null)
				voMeetingInvitee.setNote((String) row.getCells().get(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(NOTE_COLUMN)).getValue());

			voCollMeetingInvitees.add(voMeetingInvitee);
		}

		return voCollMeetingInvitees;
	}

	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException
	{
		if (sender.equals(form.ctnDetails().dyngrdInvitees()))
		{
			form.getContextMenus().getGoalPlanningMeetingInviteesREMOVEItem().setVisible(false);
			switch (menuItemID)
			{
				case GenForm.ContextMenus.GoalPlanningMeetingInvitees.ADDMEMBEROFCLINICALTEAM :
					engine.open(form.getForms().Clinical.TeamMemberSelection);
				break;
				case GenForm.ContextMenus.GoalPlanningMeetingInvitees.ADDHCP :
					addHcpQueryComboRowTodyngrdInvitees();
				break;
				case GenForm.ContextMenus.GoalPlanningMeetingInvitees.ADDFAMILYMEMBER :
					addFamilyMemberRowTodyngrdInvitee();
				break;
				case GenForm.ContextMenus.GoalPlanningMeetingInvitees.REMOVE :
					form.ctnDetails().dyngrdInvitees().getRows().remove(form.ctnDetails().dyngrdInvitees().getSelectedRow());
				break;
			}
		}
		else
		{
			switch (menuItemID)
			{
				case GenForm.ContextMenus.GenericGrid.Add :
					newInstance();
				break;
				case GenForm.ContextMenus.GenericGrid.Update :
					updateInstance();
				break;
			}
		}
	}

	private void addFamilyMemberRowTodyngrdInvitee()
	{
		DynamicGridRow row = form.ctnDetails().dyngrdInvitees().getRows().newRow();
		DynamicGridCell cellInvitee = row.getCells().newCell(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(INVITEE_COLUMN), DynamicCellType.STRING);
		cellInvitee.setWidth(100);
		cellInvitee.setTooltip("Please enter a Family Member Name");
		cellInvitee.setReadOnly(false);
		cellInvitee.setStringMaxLength(55);

		DynamicGridCell cellNote = row.getCells().newCell(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(NOTE_COLUMN), DynamicCellType.STRING);
		cellNote.setStringMaxLength(255);

		adStatusAndNoteCells(row);
	}

	private void addHcpQueryComboRowTodyngrdInvitees()
	{
		DynamicGridRow row = form.ctnDetails().dyngrdInvitees().getRows().newRow();
		DynamicGridCell cellInvitee = row.getCells().newCell(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(INVITEE_COLUMN), DynamicCellType.QUERYCOMBOBOX);
		cellInvitee.setWidth(100);
		cellInvitee.setAutoPostBack(true);
		cellInvitee.setReadOnly(false);
		cellInvitee.setTooltip("Please search for a Hcp");
		cellInvitee.setStringMaxLength(55);

		DynamicGridCell cellNote = row.getCells().newCell(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(NOTE_COLUMN), DynamicCellType.STRING);
		cellNote.setStringMaxLength(255);

		adStatusAndNoteCells(row);
	}

	private void adStatusAndNoteCells(DynamicGridRow row)
	{
		DynamicGridCell cellStatus = row.getCells().newCell(getColByIdentifier(STATUS_COLUMN), DynamicCellType.ENUMERATION);
		cellStatus.setReadOnly(false);
		cellStatus.setWidth(100);
		cellStatus.setTooltip("Please select a status");

		AttendanceStatusCollection collAttendStatus = ims.clinical.vo.lookups.LookupHelper.getAttendanceStatus(domain.getLookupService());
		for (int k = 0; k < collAttendStatus.size(); k++)
			cellStatus.getItems().newItem(collAttendStatus.get(k));

		DynamicGridCell cellNote = row.getCells().newCell(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(NOTE_COLUMN), DynamicCellType.STRING);
		cellNote.setWidth(-1);
		cellNote.setReadOnly(false);
		cellNote.setTooltip("Please add a note");
		cellNote.setStringMaxLength(255);

	}

	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		newInstance();
	}

	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		updateInstance();
	}

	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (save())
			open();
	}

	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}

	protected void onFormModeChanged()
	{
		updateControlsState();
	}

	public void open() throws ims.framework.exceptions.PresentationLogicException
	{
		clear();
		form.ctnDetails().setCollapsed(true);
		initialiseInviteesGrid();
		lisPatientMeetings(domain.lisPatientMeetingsForCareContext(form.getGlobalContext().Core.getCurrentCareContext()));
		form.setMode(FormMode.VIEW);
	}

	public void clear()
	{
		form.grdList().getRows().clear();
		clearInstanceControls();
	}

	private void lisPatientMeetings(PatientMeetingLiteVoCollection voColPatientMeetings)
	{
		if (voColPatientMeetings == null)
			return;

		voColPatientMeetings.sort();

		PatientMeetingLiteVo voPatientMeeting = null;
		for (int i = 0; i < voColPatientMeetings.size(); i++)
		{
			voPatientMeeting = voColPatientMeetings.get(i);
			grdListRow row = form.grdList().getRows().newRow();
			if (voPatientMeeting.getMeetingDateTimeIsNotNull())
				row.setColDateTime(voPatientMeeting.getMeetingDateTime().toString());
			if (voPatientMeeting.getStatusIsNotNull())
				row.setColStatus(voPatientMeeting.getStatus().toString());
			if (voPatientMeeting.getMeetingNotesIsNotNull())
				row.setColNotes(voPatientMeeting.getMeetingNotes());
			if (voPatientMeeting.getMeetingNotesIsNotNull())
				row.setColNotesButton(voPatientMeeting.getMeetingNotes());
			row.setValue(voPatientMeeting);
		}
	}

	public void clearInstanceControls()
	{
		form.getLocalContext().setSelectedInstance(null);
		form.ctnDetails().cmbStatus().setValue(null);
		form.ctnDetails().customControlAuthoringHcp().setValue(null);
		form.ctnDetails().dteNextMeeting().setValue(null);
		form.ctnDetails().dtimMeeting().setValue(null);
		form.ctnDetails().txtNotes().setValue("");
		form.ctnDetails().dyngrdInvitees().getRows().clear();
	}

	public boolean save() throws ims.framework.exceptions.PresentationLogicException
	{
		PatientMeetingVo voPatientMeeting = form.getLocalContext().getSelectedInstance();
		if (voPatientMeeting == null)
			voPatientMeeting = new PatientMeetingVo();

		populateInstanceData(voPatientMeeting);
		String[] arrErrors = voPatientMeeting.validate(validateUIRules(voPatientMeeting));
		if (arrErrors != null)
		{
			engine.showErrors(arrErrors);
			return false;
		}

		try
		{
			domain.savePatientMeetingVo(voPatientMeeting);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}

		return true;
	}

	private void populateInstanceData(PatientMeetingVo voPatientMeeting)
	{
		voPatientMeeting.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());
		voPatientMeeting.setClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact() != null ? form.getGlobalContext().Core.getCurrentClinicalContact() : null);
		voPatientMeeting.setStatus(form.ctnDetails().cmbStatus().getValue());
		voPatientMeeting.setAuthoringInformation(form.ctnDetails().customControlAuthoringHcp().getValue());
		voPatientMeeting.setNextMeetingDate(new DateTime(form.ctnDetails().dteNextMeeting().getValue()));
		voPatientMeeting.setMeetingDateTime(form.ctnDetails().dtimMeeting().getValue());
		voPatientMeeting.setMeetingNotes(form.ctnDetails().txtNotes().getValue());
		voPatientMeeting.setAttendees(populateInviteeInstanceData());
	}

	public void newInstance() throws ims.framework.exceptions.PresentationLogicException
	{
		if (allowNew())
		{
			clearInstanceControls();
			form.ctnDetails().setCollapsed(false);
			preSetHcpDetails();
			form.grdList().setValue(null);
			form.setMode(FormMode.EDIT);
			form.ctnDetails().setcustomControlAuthoringHcpEnabled(true);
			form.ctnDetails().customControlAuthoringHcp().setIsRequiredPropertyToControls(Boolean.TRUE);
		}
	}

	private void preSetHcpDetails()
	{
		form.ctnDetails().customControlAuthoringHcp().initializeComponent();
	}

	public boolean allowNew()
	{
		return super.allowNew();
	}

	public void updateInstance()
	{
		if (allowUpdate())
		{
			form.setMode(FormMode.EDIT);
			form.ctnDetails().setCollapsed(false);
		}

	}

	public void updateControlsState()
	{

		boolean bView = form.getMode().equals(FormMode.VIEW);

		if (bView)
		{
			form.btnUpdate().setEnabled(false);
			form.btnUpdate().setVisible(true);
			form.ctnDetails().dyngrdInvitees().setSelectable(false);

			if (form.grdList().getValue() != null)
				form.btnUpdate().setEnabled(true);
		}
		else
		{
			form.ctnDetails().dyngrdInvitees().setReadOnly(false);
		}

		setGridSelectable(!bView);
		form.ctnDetails().dyngrdInvitees().setSelectable(!bView);

		form.getContextMenus().getGenericGridAddItem().setVisible(bView);
		form.getContextMenus().getGenericGridUpdateItem().setVisible(bView && form.grdList().getSelectedRow() != null);

		form.getContextMenus().getGoalPlanningMeetingInviteesADDFAMILYMEMBERItem().setVisible(!bView);
		form.getContextMenus().getGoalPlanningMeetingInviteesADDHCPItem().setVisible(!bView);

		HcpLiteVo voHcpUser = (HcpLiteVo) domain.getHcpLiteUser();
		// wdev-4474
		if (form.getGlobalContext().Core.getCurrentCareContextIsNotNull() && form.getGlobalContext().Core.getCurrentCareContext().getEpisodeOfCareIsNotNull() && form.getGlobalContext().Core.getCurrentCareContext().getEpisodeOfCare().getResponsibleHCPIsNotNull())
			form.getContextMenus().getGoalPlanningMeetingInviteesADDMEMBEROFCLINICALTEAMItem().setVisible(!bView && voHcpUser != null && voHcpUser.getID_Hcp().equals(form.getGlobalContext().Core.getCurrentCareContext().getEpisodeOfCare().getResponsibleHCP().getIHcpId()));
		else
			form.getContextMenus().getGoalPlanningMeetingInviteesADDMEMBEROFCLINICALTEAMItem().setVisible(false);

		form.getContextMenus().getGoalPlanningMeetingInviteesREMOVEItem().setVisible(false);
	}

	private void setGridSelectable(boolean boolSelectable)
	{
		for (int i = 0; i < form.ctnDetails().dyngrdInvitees().getRows().size(); i++)
			form.ctnDetails().dyngrdInvitees().getRows().get(i).setSelectable(boolSelectable);
	}

	public String[] validateUIRules(PatientMeetingVo voPatientMeeting)
	{
		ArrayList errors = new ArrayList();

		if (form.ctnDetails().customControlAuthoringHcp().getValue() != null)
		{
			if (form.ctnDetails().customControlAuthoringHcp().getValue().getAuthoringHcp() == null)
			{
				errors.add("An Authoring Hcp must be supplied");
			}
		}
		if (voPatientMeeting.getAttendeesIsNotNull())
		{
			PatientMeetingInviteeVoCollection collPatientMeetingInviteeVo = voPatientMeeting.getAttendees();
			for (int i = 0; i < collPatientMeetingInviteeVo.size(); i++)
			{
				if (collPatientMeetingInviteeVo.get(i).getFamilyMember() == null && collPatientMeetingInviteeVo.get(i).getHcp() == null)
					errors.add("Please select an Invitee.");
			}
		}
		//--------------------------------------------------
		if(voPatientMeeting.getMeetingDateTime() == null)
		{
			errors.add("Meeting Date/Time is mandatory.");
		}
		//---------------------------------------------------		
		String[] arrErrors = null;
		if (errors.size() > 0)
		{
			arrErrors = new String[errors.size()];
			for (int i = 0; i < errors.size(); i++)
				arrErrors[i] = (String) errors.get(i);
		}

		return arrErrors;
	}

	private void displayInvitees(PatientMeetingInviteeVoCollection voCollInvitees)
	{
		form.ctnDetails().dyngrdInvitees().getRows().clear();
		if (voCollInvitees != null)
		{
			// GenForm.ctnDetailsContainer.grdInviteesRow rowInvitee;
			for (int x = 0; x < voCollInvitees.size(); x++)
			{
				if (voCollInvitees.get(x) != null)
				{
					DynamicGridRow row = form.ctnDetails().dyngrdInvitees().getRows().newRow();
					if (voCollInvitees.get(x).getHcpIsNotNull())
					{
						DynamicGridCell cellInvitee = row.getCells().newCell(getColByIdentifier(INVITEE_COLUMN), DynamicCellType.QUERYCOMBOBOX);
						cellInvitee.setTypedText(voCollInvitees.get(x).getHcp().getMos().getName().toString());
						cellInvitee.setValue(voCollInvitees.get(x).getHcp());
						cellInvitee.setReadOnly(true);
						cellInvitee.setIdentifier(HcpLiteVo.class);
						cellInvitee.setStringMaxLength(55);
					}
					else if (voCollInvitees.get(x).getFamilyMemberIsNotNull())
					{
						DynamicGridCell cellInvitee = row.getCells().newCell(getColByIdentifier(INVITEE_COLUMN), DynamicCellType.STRING);
						cellInvitee.setTypedText(voCollInvitees.get(x).getFamilyMember());
						cellInvitee.setValue(voCollInvitees.get(x).getFamilyMember());
						cellInvitee.setReadOnly(true);
						cellInvitee.setIdentifier(DynamicCellType.STRING);
						cellInvitee.setStringMaxLength(55);
					}

					DynamicGridCell cellStatus = row.getCells().newCell(getColByIdentifier(STATUS_COLUMN), DynamicCellType.ENUMERATION);
					cellStatus.setReadOnly(false);
					cellStatus.setWidth(100);

					//if (voCollInvitees.get(x).getStatusIsNotNull())
					//{
						AttendanceStatusCollection collAttendStatus = ims.clinical.vo.lookups.LookupHelper.getAttendanceStatus(domain.getLookupService());
						for (int k = 0; k < collAttendStatus.size(); k++)
							cellStatus.getItems().newItem(collAttendStatus.get(k));

						//if (!collAttendStatus.contains(voCollInvitees.get(x).getStatus()))
						//	cellStatus.getItems().newItem(voCollInvitees.get(x).getStatus());
					//}

					cellStatus.setValue(voCollInvitees.get(x).getStatus());

					DynamicGridCell cellNote = row.getCells().newCell(getColByIdentifier(NOTE_COLUMN), DynamicCellType.STRING);
					if (voCollInvitees.get(x).getNoteIsNotNull())
					{
						cellNote.setTypedText(voCollInvitees.get(x).getNote());
						cellNote.setValue(voCollInvitees.get(x).getNote());
					}
					cellNote.setReadOnly(false);
					cellNote.setStringMaxLength(255);

					row.setValue(voCollInvitees.get(x));
				}
			}
		}

	}

	private DynamicGridColumn getColByIdentifier(Object indentifier)
	{
		return form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(indentifier);
	}

	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		if (formName.equals(form.getForms().Clinical.TeamMemberSelection) && (result.equals(DialogResult.OK) || result.equals(DialogResult.YES)))
		{
			ClinicalTeamMemberVoCollection voClinicalTeamMemberColl = form.getGlobalContext().Clinical.getTeamMemberSelection();
			if (voClinicalTeamMemberColl == null || voClinicalTeamMemberColl.size() == 0)
				return;

			for (int x = 0; x < voClinicalTeamMemberColl.size(); x++)
			{
				if (voClinicalTeamMemberColl.get(x) != null)
				{
					DynamicGridRow row = form.ctnDetails().dyngrdInvitees().getRows().newRow();

					row.setValue(voClinicalTeamMemberColl.get(x).getHCP());

					if (voClinicalTeamMemberColl.get(x).getHCPIsNotNull())
					{
						DynamicGridCell cellInvitee = row.getCells().newCell(getColByIdentifier(INVITEE_COLUMN), DynamicCellType.QUERYCOMBOBOX);
						cellInvitee.setWidth(100);
						cellInvitee.getItems().newItem(voClinicalTeamMemberColl.get(x).getHCP());
						cellInvitee.setTypedText(voClinicalTeamMemberColl.get(x).getHCP().toString());
						cellInvitee.setValue(voClinicalTeamMemberColl.get(x).getHCP());
						cellInvitee.setReadOnly(true);
						cellInvitee.setIdentifier(HcpLiteVo.class);
						cellInvitee.setStringMaxLength(55);
					}

					// Show a Label cell
					DynamicGridCell cellStatus = row.getCells().newCell(getColByIdentifier(STATUS_COLUMN), DynamicCellType.ENUMERATION);
					cellStatus.setReadOnly(false);
					cellStatus.setWidth(100);
					cellStatus.setTooltip("Please select a status");

					AttendanceStatusCollection collAttendStatus = ims.clinical.vo.lookups.LookupHelper.getAttendanceStatus(domain.getLookupService());
					for (int k = 0; k < collAttendStatus.size(); k++)
						cellStatus.getItems().newItem(collAttendStatus.get(k));

					DynamicGridCell cellNote = row.getCells().newCell(form.ctnDetails().dyngrdInvitees().getColumns().getByIdentifier(NOTE_COLUMN), DynamicCellType.STRING);
					cellNote.setWidth(-1);
					cellNote.setReadOnly(false);
					cellNote.setTooltip("Please add a note");
					cellNote.setStringMaxLength(255);

					row.setValue(voClinicalTeamMemberColl.get(x).getHCP());
				}
			}
		}
	}

	private void initialiseInviteesGrid()
	{
		form.ctnDetails().dyngrdInvitees().getColumns().clear();

		DynamicGridColumn col1 = form.ctnDetails().dyngrdInvitees().getColumns().newColumn(" Invitees ", INVITEE_COLUMN);
		col1.setWidth(120);

		DynamicGridColumn col2 = form.ctnDetails().dyngrdInvitees().getColumns().newColumn(" Status ", STATUS_COLUMN);
		col2.setWidth(120);

		DynamicGridColumn col3 = form.ctnDetails().dyngrdInvitees().getColumns().newColumn(" Note ", NOTE_COLUMN);
		col3.setWidth(-1);
	}

	protected void onGrdListGridButtonClicked(int column, grdListRow row) throws PresentationLogicException
	{
	}

	protected void onDyngrdInviteesCellTextSubmited(DynamicGridCell cell)
	{
		cell.getItems().clear();
		if (cell.getTypedText() == null || cell.getTypedText().equals(""))
		{
			engine.showMessage("Please enter at least one character to search on.");
			return;
		}

		HcpLiteVoCollection collHcps = domain.listHcpLiteVoByName(cell.getTypedText());
		if (collHcps != null && collHcps.size() > 0)
		{
			for (int i = 0; i < collHcps.size(); i++)
			{
				cell.getItems().newItem(collHcps.get(i));
			}
			if (collHcps.size() == 1)
			{
				cell.setValue(collHcps.get(0));
			}
			else if (collHcps.size() > 1)
				cell.showOpened();
		}
		else
			engine.showMessage("No matching records found");

	}

	protected void onDyngrdInviteesRowSelectionChanged(DynamicGridRow row)
	{
		form.getContextMenus().getGoalPlanningMeetingInviteesREMOVEItem().setVisible(form.getMode().equals(FormMode.EDIT) && form.ctnDetails().dyngrdInvitees().getSelectedRow() != null);
	}

	private static final Integer	INVITEE_COLUMN	= new Integer(0);
	private static final Integer	STATUS_COLUMN	= new Integer(1);
	private static final Integer	NOTE_COLUMN		= new Integer(2);

	@Override
	protected void onDteNextMeetingValueChanged() throws PresentationLogicException {
		if(form.getMode().equals(FormMode.EDIT)){
			PartialDate dob = form.getGlobalContext().Core.getPatientShort().getDob();	
			
			Date dteNextMeeting = form.ctnDetails().dteNextMeeting().getValue();
			if(dob==null ||  dteNextMeeting==null)
				return;
			if(dteNextMeeting.isLessThan(dob)){
				engine.showMessage("Date of Next Meeting cannot be before Date of Birth.");
				form.ctnDetails().dteNextMeeting().setValue(null);
			}
		}
	}

	@Override
	protected void onDtimMeetingValueChanged() throws PresentationLogicException {
		if(form.getMode().equals(FormMode.EDIT)){
			PartialDate dob = form.getGlobalContext().Core.getPatientShort().getDob();	
			
			DateTime dteMeeting = form.ctnDetails().dtimMeeting().getValue();
			if(dob==null ||  dteMeeting==null || dteMeeting.getDate()==null)
				return;
			if(dteMeeting.getDate().isLessThan(dob)){
				engine.showMessage("Date of Meeting cannot be before Date of Birth.");
				form.ctnDetails().dtimMeeting().setValue(null);
			}
		}
	}

}
