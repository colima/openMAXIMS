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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 5354.19352)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.admin.forms.themecontrolstest;

import ims.admin.forms.themecontrolstest.GenForm.lyrMainLayer.tabGridContainer.grdGridRow;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.FormMode;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	
	private static final int COL_SURNAME		= 0;
	private static final int COL_FORENAME		= 1;
	private static final int COL_DOB			= 2;
	private static final int COL_ADDRESS		= 3;

	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Event handlers
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	
	@Override
	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		
		form.setMode(FormMode.VIEW);
	}

	
	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}


	@Override
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
	}
	
	
	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}
	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.VIEW);
	}

	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events for controls state for page headers
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onChkLayerVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkPage1VisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkPage2VisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkPage3VisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkPage4VisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkPage5VisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events to control state for page 'Combos' controls
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onChkAnswerBoxVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkAnswerBoxEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkChecklistEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkChecklistVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkComboBoxEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkComboBoxVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkQueryComboEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkQueryComboVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkTextboxEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkTextboxVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}


	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events to control state for page 'Date Time' controls
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onChkDateEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkDateVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkDateTimeEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkDateTimeVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkPartialDateEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkPartialDateVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkTimeEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkTimeVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	

	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events to control state for page 'Decimals Integers' controls
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	protected void onChkDecimalEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkDecimalVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkDecimalRangeEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkDecimalRangeVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkIntBoxEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkIntBoxVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkintRangeEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkintRangeVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events to control state for page 'Grid' controls
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onChkGridReadOnlyValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	@Override
	protected void onChkGridEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkGridVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events to control state for page 'Dynamic Grid' controls
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onChkDynamicGridReadOnlyValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkDynamicGridEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkDynamicGridValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}


	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events to control state for page 'Tree' controls
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onChkTreeSelectableValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkTreeEnabledValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}
	
	@Override
	protected void onChkTreeVisibleValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
	}

	

	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events of controls from form
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	protected void onRecbrRecordBrowserValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Record browser value changed.");
	}

	@Override
	protected void onAnsAnswerBoxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Answer box value changed.");
	}

	@Override
	protected void onChklistCheckListValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Checklist value changed.");
	}

	@Override
	protected void onCmbComboBoxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Combo box value changed.");
	}
	
	@Override
	protected void onQmbQueryComboBoxTextSubmited(String value) throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Query combo text submited.");
	}
	
	@Override
	protected void onQmbQueryComboBoxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Query combo value changed.");
	}

	@Override
	protected void onTxtTextboxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Text box value changed.");
	}


	@Override
	protected void onDteDateValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Date value changed.");
	}
	
	@Override
	protected void onDtimDateTimeValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Date time value changed.");
	}

	@Override
	protected void onPdtPartialDateValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Partial date value changed.");
	}

	@Override
	protected void onTimTimeValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Time value changed.");
	}
	

	@Override
	protected void onDecDecimalBoxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Decimal value changed.");
	}
	
	@Override
	protected void onDrbDecimalRangeBoxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Decimal range value changed.");
	}
	
	@Override
	protected void onIntIntBoxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Int value changed.");
	}
	
	@Override
	protected void onIrbIntRangeBoxValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Int range value changed.");
	}
	

	@Override
	protected void onGrdGridSelectionChanged()
	{
		form.lblEventValue().setValue("Grid selection changed.");
	}
	

	@Override
	protected void onDyngrdDynGridRowSelectionChanged(ims.framework.controls.DynamicGridRow row)
	{
		form.lblEventValue().setValue("Dynamic Grid selection changed.");
	}

	@Override
	protected void onTreTreeTreeViewSelectionChanged(ims.framework.controls.TreeNode node) throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("Tree selection changed.");
	}

	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Events to provide data for screen
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("-");
		form.lyrMain().tabGrid().grdGrid().getRows().clear();
	}

	@Override
	protected void onImbFindClick() throws ims.framework.exceptions.PresentationLogicException
	{
		populateDemoValuesToGrid();
	}

	
	@Override
	protected void onImbDynamicClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("-");
		form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getRows().clear();
	}
	
	@Override
	protected void onImbDynamicFindClick() throws ims.framework.exceptions.PresentationLogicException
	{
		populateDemoValuesToDynamicGrid();
	}


	@Override
	protected void onBtnPopulateTreeClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.lblEventValue().setValue("-");
		populateDemoValuesToTree();
	}


	@Override
	protected void onRadioButtonGroupExpandTreeValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		// TODO Add your code here.
	}


	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Form presentation functions
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	private void initialize()
	{
		form.chkLayerVisible().setValue(true);

		form.ctn1().chkPage1Visible().setValue(true);
		form.ctn1().chkPage2Visible().setValue(true);
		form.ctn1().chkPage3Visible().setValue(true);
		form.ctn1().chkPage4Visible().setValue(true);
		form.ctn1().chkPage5Visible().setValue(true);
		
		form.lyrMain().tabCombosLists().chkAnswerBoxEnabled().setValue(true);
		form.lyrMain().tabCombosLists().chkAnswerBoxVisible().setValue(true);
		form.lyrMain().tabCombosLists().chkChecklistEnabled().setValue(true);
		form.lyrMain().tabCombosLists().chkChecklistVisible().setValue(true);
		form.lyrMain().tabCombosLists().chkComboBoxEnabled().setValue(true);
		form.lyrMain().tabCombosLists().chkComboBoxVisible().setValue(true);
		form.lyrMain().tabCombosLists().chkQueryComboEnabled().setValue(true);
		form.lyrMain().tabCombosLists().chkQueryComboVisible().setValue(true);
		form.lyrMain().tabCombosLists().chkTextboxEnabled().setValue(true);
		form.lyrMain().tabCombosLists().chkTextboxVisible().setValue(true);
		
		form.lyrMain().tabDateTime().chkDateEnabled().setValue(true);
		form.lyrMain().tabDateTime().chkDateVisible().setValue(true);
		form.lyrMain().tabDateTime().chkDateTimeEnabled().setValue(true);
		form.lyrMain().tabDateTime().chkDateTimeVisible().setValue(true);
		form.lyrMain().tabDateTime().chkPartialDateEnabled().setValue(true);
		form.lyrMain().tabDateTime().chkPartialDateVisible().setValue(true);
		form.lyrMain().tabDateTime().chkTimeEnabled().setValue(true);
		form.lyrMain().tabDateTime().chkTimeVisible().setValue(true);
		
		form.lyrMain().tabDecimalsIntegers().chkDecimalEnabled().setValue(true);
		form.lyrMain().tabDecimalsIntegers().chkDecimalVisible().setValue(true);
		form.lyrMain().tabDecimalsIntegers().chkDecimalRangeEnabled().setValue(true);
		form.lyrMain().tabDecimalsIntegers().chkDecimalRangeVisible().setValue(true);
		form.lyrMain().tabDecimalsIntegers().chkIntBoxEnabled().setValue(true);
		form.lyrMain().tabDecimalsIntegers().chkIntBoxVisible().setValue(true);
		form.lyrMain().tabDecimalsIntegers().chkintRangeEnabled().setValue(true);
		form.lyrMain().tabDecimalsIntegers().chkintRangeVisible().setValue(true);
		
		form.lyrMain().tabGrid().chkGridEnabled().setValue(true);
		form.lyrMain().tabGrid().chkGridVisible().setValue(true);
		form.lyrMain().tabGrid().chkGridReadOnly().setValue(true);
		
		form.lyrMain().tabDynamicGrid().chkDynamicGridEnabled().setValue(true);
		form.lyrMain().tabDynamicGrid().chkDynamicGrid().setValue(true);
		form.lyrMain().tabDynamicGrid().chkDynamicGridReadOnly().setValue(true);
		
		form.lyrMain().tabTree().chkTreeEnabled().setValue(true);
		form.lyrMain().tabTree().chkTreeVisible().setValue(true);
		form.lyrMain().tabTree().chkTreeSelectable().setValue(true);
		
		initializeDynamicGrid();
	}


	private void updateControlsState()
	{
		form.lyrMain().tabCombosLists().setHeaderVisible(form.ctn1().chkPage1Visible().getValue());
		form.lyrMain().tabDateTime().setHeaderVisible(form.ctn1().chkPage2Visible().getValue());
		form.lyrMain().tabDecimalsIntegers().setHeaderVisible(form.ctn1().chkPage3Visible().getValue());
		form.lyrMain().tabGrid().setHeaderVisible(form.ctn1().chkPage4Visible().getValue());
		form.lyrMain().tabDynamicGrid().setHeaderVisible(form.ctn1().chkPage5Visible().getValue());
		
		// Combos tab
		form.lyrMain().tabCombosLists().ansAnswerBox().setEnabled(form.lyrMain().tabCombosLists().chkAnswerBoxEnabled().getValue());
		form.lyrMain().tabCombosLists().ansAnswerBox().setVisible(form.lyrMain().tabCombosLists().chkAnswerBoxVisible().getValue());
		
		form.lyrMain().tabCombosLists().chklistCheckList().setEnabled(form.lyrMain().tabCombosLists().chkChecklistEnabled().getValue());
		form.lyrMain().tabCombosLists().chklistCheckList().setVisible(form.lyrMain().tabCombosLists().chkChecklistVisible().getValue());

		form.lyrMain().tabCombosLists().cmbComboBox().setEnabled(form.lyrMain().tabCombosLists().chkComboBoxEnabled().getValue());
		form.lyrMain().tabCombosLists().cmbComboBox().setVisible(form.lyrMain().tabCombosLists().chkComboBoxVisible().getValue());
		
		form.lyrMain().tabCombosLists().qmbQueryComboBox().setEnabled(form.lyrMain().tabCombosLists().chkQueryComboEnabled().getValue());
		form.lyrMain().tabCombosLists().qmbQueryComboBox().setVisible(form.lyrMain().tabCombosLists().chkQueryComboVisible().getValue());
		
		form.lyrMain().tabCombosLists().txtTextbox().setEnabled(form.lyrMain().tabCombosLists().chkTextboxEnabled().getValue());
		form.lyrMain().tabCombosLists().txtTextbox().setVisible(form.lyrMain().tabCombosLists().chkTextboxVisible().getValue());
		
		// Date Time tab
		form.lyrMain().tabDateTime().dteDate().setEnabled(form.lyrMain().tabDateTime().chkDateEnabled().getValue());
		form.lyrMain().tabDateTime().dteDate().setVisible(form.lyrMain().tabDateTime().chkDateVisible().getValue());
		
		form.lyrMain().tabDateTime().dtimDateTime().setEnabled(form.lyrMain().tabDateTime().chkDateTimeEnabled().getValue());
		form.lyrMain().tabDateTime().dtimDateTime().setVisible(form.lyrMain().tabDateTime().chkDateTimeVisible().getValue());
		
		form.lyrMain().tabDateTime().pdtPartialDate().setEnabled(form.lyrMain().tabDateTime().chkPartialDateEnabled().getValue());
		form.lyrMain().tabDateTime().pdtPartialDate().setVisible(form.lyrMain().tabDateTime().chkPartialDateVisible().getValue());
		
		form.lyrMain().tabDateTime().timTime().setEnabled(form.lyrMain().tabDateTime().chkTimeEnabled().getValue());
		form.lyrMain().tabDateTime().timTime().setVisible(form.lyrMain().tabDateTime().chkTimeVisible().getValue());
		
		// Decimal Integers tab
		form.lyrMain().tabDecimalsIntegers().decDecimalBox().setEnabled(form.lyrMain().tabDecimalsIntegers().chkDecimalEnabled().getValue());
		form.lyrMain().tabDecimalsIntegers().decDecimalBox().setVisible(form.lyrMain().tabDecimalsIntegers().chkDecimalVisible().getValue());
		
		form.lyrMain().tabDecimalsIntegers().drbDecimalRangeBox().setEnabled(form.lyrMain().tabDecimalsIntegers().chkDecimalRangeEnabled().getValue());
		form.lyrMain().tabDecimalsIntegers().drbDecimalRangeBox().setVisible(form.lyrMain().tabDecimalsIntegers().chkDecimalRangeVisible().getValue());
		
		form.lyrMain().tabDecimalsIntegers().intIntBox().setEnabled(form.lyrMain().tabDecimalsIntegers().chkIntBoxEnabled().getValue());
		form.lyrMain().tabDecimalsIntegers().intIntBox().setVisible(form.lyrMain().tabDecimalsIntegers().chkIntBoxVisible().getValue());
		
		form.lyrMain().tabDecimalsIntegers().irbIntRangeBox().setEnabled(form.lyrMain().tabDecimalsIntegers().chkintRangeEnabled().getValue());
		form.lyrMain().tabDecimalsIntegers().irbIntRangeBox().setVisible(form.lyrMain().tabDecimalsIntegers().chkintRangeVisible().getValue());
		
		// Grid tab
		form.lyrMain().tabGrid().grdGrid().setReadOnly(form.lyrMain().tabGrid().chkGridReadOnly().getValue());
		form.lyrMain().tabGrid().grdGrid().setEnabled(form.lyrMain().tabGrid().chkGridEnabled().getValue());
		form.lyrMain().tabGrid().grdGrid().setVisible(form.lyrMain().tabGrid().chkGridVisible().getValue());
		
		// Dynamic grid tab
		form.lyrMain().tabDynamicGrid().dyngrdDynGrid().setReadOnly(form.lyrMain().tabDynamicGrid().chkDynamicGridReadOnly().getValue());
		form.lyrMain().tabDynamicGrid().dyngrdDynGrid().setEnabled(form.lyrMain().tabDynamicGrid().chkDynamicGridEnabled().getValue());
		form.lyrMain().tabDynamicGrid().dyngrdDynGrid().setVisible(form.lyrMain().tabDynamicGrid().chkDynamicGrid().getValue());
		
		// Tree tab
		form.lyrMain().tabTree().treTree().setUnselectable(!form.lyrMain().tabTree().chkTreeSelectable().getValue());
		form.lyrMain().tabTree().treTree().setEnabled(form.lyrMain().tabTree().chkTreeEnabled().getValue());
		form.lyrMain().tabTree().treTree().setVisible(form.lyrMain().tabTree().chkTreeVisible().getValue());
	}


	private void initializeDynamicGrid()
	{
		form.lyrMain().tabDynamicGrid().dyngrdDynGrid().clear();
		
		DynamicGridColumn column1 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().newColumn("Surname", COL_SURNAME);
		column1.setWidth(100);
		DynamicGridColumn column2 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().newColumn("Forename", COL_FORENAME);
		column2.setWidth(100);
		DynamicGridColumn column3 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().newColumn("D O B", COL_DOB);
		column3.setWidth(100);
		DynamicGridColumn column4 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().newColumn("Address", COL_ADDRESS);
		column4.setWidth(200);
	}

	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//	Populating function
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------

	private void populateDemoValuesToGrid()
	{
		form.lyrMain().tabGrid().grdGrid().getRows().clear();

		grdGridRow entry1 = form.lyrMain().tabGrid().grdGrid().getRows().newRow();
		entry1.setColSurname("Wayne");
		entry1.setColForename("Bruce");
		entry1.setColDob("06//10//1981");
		entry1.setColAddress("Wayne Manor, Gotham");
		
		grdGridRow entry2 = form.lyrMain().tabGrid().grdGrid().getRows().newRow();
		entry2.setColSurname("Kent");
		entry2.setColForename("Clark");
		entry2.setColDob("06//10//1981");
		entry2.setColAddress("Metropolis");

		grdGridRow entry3 = form.lyrMain().tabGrid().grdGrid().getRows().newRow();
		entry3.setColSurname("West");
		entry3.setColForename("Wally");
		entry3.setColDob("06//10//1981");
		entry3.setColAddress("Central City");

		grdGridRow entry4 = form.lyrMain().tabGrid().grdGrid().getRows().newRow();
		entry4.setColSurname("Queen");
		entry4.setColForename("Oliver");
		entry4.setColDob("06//10//1981");
		entry4.setColAddress("Central City");
	}

	private void populateDemoValuesToDynamicGrid()
	{
		form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getRows().clear();
		
		DynamicGridRow row1 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getRows().newRow();
		{
			DynamicGridCell cellSurname = row1.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_SURNAME), DynamicCellType.STRING);
			cellSurname.setValue("Wayne");
			DynamicGridCell cellForename = row1.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_FORENAME), DynamicCellType.STRING);
			cellForename.setValue("Bruce");
			DynamicGridCell cellDOB = row1.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_DOB), DynamicCellType.STRING);
			cellDOB.setValue("06//10//1981");
			DynamicGridCell cellAddress = row1.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_ADDRESS), DynamicCellType.STRING);
			cellAddress.setValue("Wayne Manor, Gotham");
		}

		DynamicGridRow row2 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getRows().newRow();
		{
			DynamicGridCell cellSurname = row2.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_SURNAME), DynamicCellType.STRING);
			cellSurname.setValue("Kent");
			DynamicGridCell cellForename = row2.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_FORENAME), DynamicCellType.STRING);
			cellForename.setValue("Clark");
			DynamicGridCell cellDOB = row2.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_DOB), DynamicCellType.STRING);
			cellDOB.setValue("06//10//1981");
			DynamicGridCell cellAddress = row2.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_ADDRESS), DynamicCellType.STRING);
			cellAddress.setValue("Metropolis");
		}
		
		DynamicGridRow row3 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getRows().newRow();
		{
			DynamicGridCell cellSurname = row3.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_SURNAME), DynamicCellType.STRING);
			cellSurname.setValue("West");
			DynamicGridCell cellForename = row3.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_FORENAME), DynamicCellType.STRING);
			cellForename.setValue("Wally");
			DynamicGridCell cellDOB = row3.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_DOB), DynamicCellType.STRING);
			cellDOB.setValue("06//10//1981");
			DynamicGridCell cellAddress = row3.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_ADDRESS), DynamicCellType.STRING);
			cellAddress.setValue("Central City");
		}
		
		DynamicGridRow row4 = form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getRows().newRow();
		{
			DynamicGridCell cellSurname = row4.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_SURNAME), DynamicCellType.STRING);
			cellSurname.setValue("Queen");
			DynamicGridCell cellForename = row4.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_FORENAME), DynamicCellType.STRING);
			cellForename.setValue("Oliver");
			DynamicGridCell cellDOB = row4.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_DOB), DynamicCellType.STRING);
			cellDOB.setValue("06//10//1981");
			DynamicGridCell cellAddress = row4.getCells().newCell(form.lyrMain().tabDynamicGrid().dyngrdDynGrid().getColumns().getByIdentifier(COL_ADDRESS), DynamicCellType.STRING);
			cellAddress.setValue("Central City");
		}
	}


	
	private void populateDemoValuesToTree()
	{
		form.lyrMain().tabTree().treTree().clear();
		
		for (int i = 0; i < 5; i++)
		{
			form.lyrMain().tabTree().treTree().getNodes().add(i, "Node" + (i + 1));
		}
	}
}
