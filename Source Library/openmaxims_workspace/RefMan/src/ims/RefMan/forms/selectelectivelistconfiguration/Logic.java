// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4972.23166)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.selectelectivelistconfiguration;

import ims.admin.vo.ElectiveListConfigurationVo;
import ims.admin.vo.ElectiveListConsultationConfigurationVoCollection;
import ims.RefMan.forms.selectelectivelistconfiguration.GenForm.grdCurrentPatientElectiveListRow;
import ims.RefMan.forms.selectelectivelistconfiguration.GenForm.grdElectiveListRow;
import ims.RefMan.vo.ElectiveListConfigurationLiteVo;
import ims.RefMan.vo.ElectiveListConfigurationLiteVoCollection;
import ims.RefMan.vo.PatientElectiveListLiteVo;
import ims.RefMan.vo.PatientElectiveListLiteVoCollection;
import ims.RefMan.vo.PatientElectiveListVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.ProcedureLiteVo;
import ims.core.vo.ServiceLiteVo;
import ims.core.vo.lookups.WaitingListStatus;
import ims.emergency.vo.lookups.ElectiveListReason;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.scheduling.vo.SessionTheatreVo;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		ServiceLiteVo serviceLite=null;
		ProcedureLiteVo procedureLite=null;
		String listIdHcp=null;
		LocationLiteVo locationLite =null;
		
		
		if (args!=null && args.length>0 && args[0]!=null &&  args[0] instanceof SessionTheatreVo)
		{
			SessionTheatreVo sessionTheatre = (SessionTheatreVo)args[0];
			if (sessionTheatre!=null && sessionTheatre.getService()!=null)
			{
				serviceLite=domain.getServiceLite(sessionTheatre.getService());
				form.getLocalContext().setCurrentService(serviceLite);
			}
			
			locationLite = sessionTheatre.getSchLocation();
		}
		
		if (args!=null && args.length>1 && args[1]!=null &&  args[1] instanceof ProcedureLiteVo)
		{
			procedureLite=(ProcedureLiteVo) args[1];
		}
		
		if (args!=null && args.length>2 && args[2]!=null &&  args[2] instanceof String)
		{
			listIdHcp=(String) args[2];
		}
		
		//WDEV-18396
		if (args!=null && args.length>3 && args[3]!=null &&  args[3] instanceof ElectiveListReason)
		{
			form.getLocalContext().setElectiveReason( (ElectiveListReason) args[3]);
		}
		
		if (args!=null && args.length>4 && args[4]!=null &&  args[4] instanceof Boolean)
		{
			form.getLocalContext().setPatientElectiveListFound((Boolean) args[4]);
		}
		
		
		populateCurentElectiveListConfig(serviceLite, procedureLite, listIdHcp);
		populateElectiveListConfigGrid(serviceLite,locationLite,listIdHcp);
		
		if (form.grdCurrentPatientElectiveList().getRows().size()==0 && form.grdElectiveList().getRows().size()==0)
		{
			engine.showMessage("Please Configure an Elective List !");
		}

		form.grdElectiveList().setReadOnly(!ElectiveListReason.DIAGNOSTIC.equals(form.getLocalContext().getElectiveReason()) && Boolean.TRUE.equals(form.getLocalContext().getPatientElectiveListFound()));
		form.btnOK().setEnabled(false);
	}
	
	private void populateCurentElectiveListConfig(ServiceLiteVo serviceLite, ProcedureLiteVo procedureLite, String listIdHcp)
	{
		//populate with ELE with same service,procedure,listowners
		form.grdCurrentPatientElectiveList().getRows().clear(); //WDEV-18396
		
		PatientElectiveListLiteVoCollection patientElectiveListVoCollection = domain.listPatientElectiveList(form.getGlobalContext().Core.getPatientShort(),serviceLite, procedureLite, listIdHcp, form.getGlobalContext().RefMan.getCatsReferral()); //WDEV-18397
		
		if (patientElectiveListVoCollection!=null && patientElectiveListVoCollection.size()>0)
		{
			addRowsToCurrentpatientElectiveList(patientElectiveListVoCollection);
		}
		else 
		{
			//WDEV-18396
			patientElectiveListVoCollection = domain.listOtherPatientElectiveListsByServiceAndListOwners( form.getGlobalContext().RefMan.getCatsReferral(),serviceLite, listIdHcp); //WDEV-18396
			addRowsToCurrentpatientElectiveList(patientElectiveListVoCollection);
			
			if (form.grdCurrentPatientElectiveList().getRows()!=null && form.grdCurrentPatientElectiveList().getRows().size()>0)
			{
				form.grdCurrentPatientElectiveList().getRows().get(0).setcolSelect(true);
			}
			
			patientElectiveListVoCollection = domain.listOtherPatientElectiveLists(form.getGlobalContext().Core.getPatientShort(), serviceLite, serviceLite!=null ? serviceLite.getSpecialty() : null, listIdHcp, form.getGlobalContext().RefMan.getCatsReferral()); //WDEV-18397
			addRowsToCurrentpatientElectiveList(patientElectiveListVoCollection);	
		}
		
	}
	
	private void addRowsToCurrentpatientElectiveList(PatientElectiveListLiteVoCollection patientElectiveListVoCollection)
	{	
		if (patientElectiveListVoCollection==null || patientElectiveListVoCollection.size()==0)
			return;
		
		for (int i=0; i<patientElectiveListVoCollection.size();i++)
		{
			addRowToCurrentPatientElectiveGrid(patientElectiveListVoCollection.get(i));
		}
	}

	private void addRowToCurrentPatientElectiveGrid(PatientElectiveListLiteVo patientElectiveList)
	{
		if (patientElectiveList==null)
			return;
		
		grdCurrentPatientElectiveListRow row = form.grdCurrentPatientElectiveList().getRows().newRow();
		
		row.setColName(patientElectiveList.getElectiveList().getWaitingListName());
		row.setTooltipForColName(patientElectiveList.getElectiveList().getWaitingListName());
		
		row.setcolDateOnList(patientElectiveList.getDateOnList()!=null ? patientElectiveList.getDateOnList().toString() : null);
		row.setTooltipForcolDateOnList(patientElectiveList.getDateOnList()!=null ? patientElectiveList.getDateOnList().toString() : null);
		
		row.setcolService(patientElectiveList.getElectiveList().getService().getServiceName());
		row.setTooltipForcolService(patientElectiveList.getElectiveList().getService().getServiceName());
	
		String valueCons = getHCPToDisplay(patientElectiveList.getElectiveList().getHCPs());
		row.setcolConsultant(valueCons);
		row.setTooltipForcolConsultant(valueCons);
		
		row.setcolSelectReadOnly(WaitingListStatus.REMOVED.equals(patientElectiveList.getElectiveListStatus().getElectiveListStatus()));
		
		//WDEV-18397
		
		row.setcolProcedure(patientElectiveList.getPrimaryProcedure()!=null ? patientElectiveList.getPrimaryProcedure().getProcedureName() : null);
		row.setTooltipForcolProcedure(patientElectiveList.getPrimaryProcedure()!=null ? patientElectiveList.getPrimaryProcedure().getProcedureName() : null);
		
		row.setcolProcDetails(patientElectiveList.getProcedureDescription());
		row.setTooltipForcolProcDetails(patientElectiveList.getProcedureDescription());
		
		row.setcolStatus(patientElectiveList.getElectiveListStatus().getElectiveListStatus().toString());
		row.setTooltipForcolStatus(patientElectiveList.getElectiveListStatus().getElectiveListStatus().toString());
		
		//WDEV-18396
		row.setcolReason(patientElectiveList.getElectiveListReason().toString());
		row.setTooltipForcolReason(patientElectiveList.getElectiveListReason().toString());
		
		row.setReadOnly(!(patientElectiveList.getElectiveListReason().equals(form.getLocalContext().getElectiveReason())));
		
		row.setValue(patientElectiveList);
		
		
	}

	private String getHCPToDisplay(ElectiveListConsultationConfigurationVoCollection consultants)
	{
		if (consultants==null || consultants.size()==0)
			return null;
		
		StringBuffer txtColCons=new StringBuffer();
		
		for (int i=0;i<consultants.size();i++)
		{
			txtColCons.append(consultants.get(i).getHCP().getName());
			if (i < consultants.size()-1)
			{
				txtColCons.append(", ");
			}
		}
		
		return txtColCons.toString();
	}
	
	private void populateElectiveListConfigGrid(ServiceLiteVo serviceLite, LocationLiteVo locationLite, String listIdHcp)
	{
		
		ElectiveListConfigurationLiteVoCollection collElectiveListConfiguration=null;
		
		collElectiveListConfiguration = domain.listElectiveListConfiguration(serviceLite,locationLite , listIdHcp, null);
		
		if (collElectiveListConfiguration!=null && collElectiveListConfiguration.size()>0)
		{
			addRowsToGrdElectiveListConfig(collElectiveListConfiguration);
		}
		else
		{
			collElectiveListConfiguration = domain.listOtherElectiveListConfiguration(serviceLite,serviceLite!=null ? serviceLite.getSpecialty() : null,listIdHcp, null);
			addRowsToGrdElectiveListConfig(collElectiveListConfiguration);
		}
		
		
		
	}
	private void addRowsToGrdElectiveListConfig(ElectiveListConfigurationLiteVoCollection collElectiveListConfiguration)
	{
		form.grdElectiveList().getRows().clear();
		
		if (collElectiveListConfiguration==null || collElectiveListConfiguration.size()==0)
			return;
		
		for (int i=0;i<collElectiveListConfiguration.size();i++)
		{
			addRowToGrdElectiveListConfig(collElectiveListConfiguration.get(i));
			
		}
	}

	private void addRowToGrdElectiveListConfig(ElectiveListConfigurationLiteVo electiveListConfiguration)
	{
		if (electiveListConfiguration==null)
			return;
		
		grdElectiveListRow row = form.grdElectiveList().getRows().newRow();
		
		row.setColName(electiveListConfiguration.getWaitingListName());
		
		row.setColName(electiveListConfiguration.getWaitingListName());
		row.setTooltipForColName(electiveListConfiguration.getWaitingListName());
		
		row.setcolStartDate(electiveListConfiguration.getStartDate()!=null ? electiveListConfiguration.getStartDate().toString() : null);
		row.setTooltipForcolStartDate(electiveListConfiguration.getStartDate()!=null ? electiveListConfiguration.getStartDate().toString() : null);
		row.setcolEndDate(electiveListConfiguration.getEndDate()!=null ? electiveListConfiguration.getEndDate().toString() : null);
		row.setTooltipForcolEndDate(electiveListConfiguration.getEndDate()!=null ? electiveListConfiguration.getEndDate().toString() : null);
		row.setcolService(electiveListConfiguration.getService().getServiceName());
		row.setTooltipForcolService(electiveListConfiguration.getService().getServiceName());
		row.setcolCode(electiveListConfiguration.getWaitingListCode());
		row.setTooltipForcolCode(electiveListConfiguration.getWaitingListCode());
		
		row.setValue(electiveListConfiguration);
	}

	@Override
	protected void onBtnOKClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().RefMan.setSelectedWaitingListConfig(getSelectedWaitingList());
		form.getGlobalContext().RefMan.setSelectedPatientElectiveList(getCurrentPatientElectiveList());
		engine.close(DialogResult.OK);
	}
	
	private PatientElectiveListVo getCurrentPatientElectiveList()
	{
		for (int i=0;i<form.grdCurrentPatientElectiveList().getRows().size();i++)
		{
			if (form.grdCurrentPatientElectiveList().getRows().get(i).getcolSelect())
				return domain.getPatientElectiveList(form.grdCurrentPatientElectiveList().getRows().get(i).getValue());
			
			form.grdCurrentPatientElectiveList().getRows().get(i).setcolSelect(false);
		}
		
		return null;
	}

	private ElectiveListConfigurationVo getSelectedWaitingList()
	{
		for (int i=0;i<form.grdElectiveList().getRows().size();i++)
		{
			if (form.grdElectiveList().getRows().get(i).getcolSelect())
				return domain.getElectiveListConfiguration(form.grdElectiveList().getRows().get(i).getValue());
			
			form.grdElectiveList().getRows().get(i).setcolSelect(false);
		}
		
		return null;
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	@Override
	protected void onGrdElectiveListGridCheckBoxClicked(int column, GenForm.grdElectiveListRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
	{
		clearCurrentPatientElectiveListGridColSelect();
		for (int i=0;i<form.grdElectiveList().getRows().size();i++)
		{
			if (row.getValue().equals(form.grdElectiveList().getRows().get(i).getValue()))
				continue;
			
			form.grdElectiveList().getRows().get(i).setcolSelect(false);
		}
		
		form.btnOK().setEnabled(isChecked);
	}

	private void clearCurrentPatientElectiveListGridColSelect()
	{
		for (int i=0;i<form.grdCurrentPatientElectiveList().getRows().size();i++)
		{
			form.grdCurrentPatientElectiveList().getRows().get(i).setcolSelect(false);
		}
	}

	@Override
	protected void onGrdCurrentPatientElectiveListGridCheckBoxClicked(int column, grdCurrentPatientElectiveListRow row, boolean isChecked) throws PresentationLogicException
	{
		clearElectiveListGridColSelect();
		for (int i=0;i<form.grdCurrentPatientElectiveList().getRows().size();i++)
		{
			if (row.getValue().equals(form.grdCurrentPatientElectiveList().getRows().get(i).getValue()))
				continue;
			
			form.grdCurrentPatientElectiveList().getRows().get(i).setcolSelect(false);
		}
		
		form.btnOK().setEnabled(isChecked);
	}

	private void clearElectiveListGridColSelect()
	{
		for (int i=0;i<form.grdElectiveList().getRows().size();i++)
		{
			form.grdElectiveList().getRows().get(i).setcolSelect(false);
		}
	}
}