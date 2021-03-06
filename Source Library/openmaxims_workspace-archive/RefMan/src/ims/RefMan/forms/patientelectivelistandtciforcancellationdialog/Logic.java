// This code was generated by Bogdan Tofei using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.patientelectivelistandtciforcancellationdialog;

import ims.RefMan.forms.patientelectivelistandtciforcancellationdialog.GenForm.grdElectiveListRow;
import ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;

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
		form.setMode(FormMode.EDIT);

		populateScreenFromData(form.getGlobalContext().RefMan.getPatientElectiveListsForCancellationDialog());
	}

	private void populateScreenFromData(PatientElectiveListBedAdmissionVoCollection electiveLists)
	{
		form.grdElectiveList().getRows().clear();

		if (electiveLists == null)
			return;

		for (int i = 0; i < electiveLists.size(); i++)
		{
			grdElectiveListRow newRow = form.grdElectiveList().getRows().newRow();

			newRow.setColName(electiveLists.get(i).getElectiveList() != null ? electiveLists.get(i).getElectiveList().getWaitingListName() : "");
			newRow.setProcedure(electiveLists.get(i) != null ? electiveLists.get(i).getPrimaryProcedureIsNotNull() ? electiveLists.get(i).getPrimaryProcedure().getProcedureName() : "" : "");
			newRow.setColStatus(electiveLists.get(i).getElectiveListStatus() != null && electiveLists.get(i).getElectiveListStatus().getElectiveListStatus() != null ? electiveLists.get(i).getElectiveListStatus().getElectiveListStatus().getText() : "");
			newRow.setColDateOnList(electiveLists.get(i).getDateOnList() != null ? electiveLists.get(i).getDateOnList().toString() : "");

			if (electiveLists.get(i).getTCIDetails() != null)
			{
				newRow.setColTciDate(electiveLists.get(i).getTCIDetails() != null && electiveLists.get(i).getTCIDetails().getTCIDateIsNotNull() ? electiveLists.get(i).getTCIDetails().getTCIDate().toString() : "");
				newRow.setColTciTime(electiveLists.get(i).getTCIDetails() != null && electiveLists.get(i).getTCIDetails().getTCITimeIsNotNull() ? electiveLists.get(i).getTCIDetails().getTCITime().toString() : "");
			}

			newRow.setColSelect(Boolean.TRUE);
			newRow.setValue(electiveLists.get(i));
		}
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}

	@Override
	protected void onBtnOKClick() throws ims.framework.exceptions.PresentationLogicException
	{
		populateDataFromScreen();
		engine.close(DialogResult.OK);
	}

	private void populateDataFromScreen()
	{
		form.getGlobalContext().RefMan.getPatientElectiveListsForCancellationDialog().clear();

		for (int i = 0; i < form.grdElectiveList().getRows().size(); i++)
		{
			if (form.grdElectiveList().getRows().get(i) == null)
				continue;

			if (Boolean.TRUE.equals(form.grdElectiveList().getRows().get(i).getColSelect()))
				form.getGlobalContext().RefMan.getPatientElectiveListsForCancellationDialog().add(form.grdElectiveList().getRows().get(i).getValue());
		}
	}
}
