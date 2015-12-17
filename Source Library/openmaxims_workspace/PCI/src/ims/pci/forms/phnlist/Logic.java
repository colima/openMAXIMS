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
//This code was generated by George Cristian Josan using IMS Development Environment (version 1.62 build 3040.26452)
//Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.pci.forms.phnlist;

import java.util.ArrayList;
import java.util.Comparator;

import ims.core.vo.LocSiteLiteVo;
import ims.core.vo.LocSiteLiteVoCollection;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.LocationLiteVoCollection;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.Alignment;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.enumerations.SortMode;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.FormOpenException;
import ims.framework.utils.Date;
import ims.pci.vo.ClientPHNListVo;
import ims.pci.vo.ClientPHNListVoCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;


	//-------------------------------------------------------------------------------------------------------------------
	// REGION - Auxiliary classes (comparators for custom sort order)
	//-------------------------------------------------------------------------------------------------------------------

	/**
	 * WDEV-12521
	 * Custom comparator used for sorting by "Age"
	 */
	private class AgeComparator implements Comparator<ClientPHNListVo>
	{
		private int sortOrder;

		public AgeComparator(SortOrder order)
		{
			if (SortOrder.ASCENDING.equals(order))
				sortOrder = 1;
			else
				sortOrder = -1;
		}

		/**
		 * Implementation for compare method
		 */
		public int compare(ClientPHNListVo object1, ClientPHNListVo object2)
		{
			// Calculate client age
			Integer age1 = object1.calculateAge();
			Integer age2 = object2.calculateAge();
			
			// If neither object has age then take no action
			if (age1 == null && age2 == null)
				return 0;
			
			// Consider null values to be last, regardless of the sort order
			if (age1 == null && age2 != null)
				return 1;
			
			if (age1 != null && age2 == null)
				return -1;
			
			// Return default comparison for Integer
			return age1.compareTo(age2) * sortOrder;
		}

	}

	/**
	 * WDEV-12521
	 * Custom comparator used for sorting by "DOB"
	 */
	private class DOBComparator implements Comparator<ClientPHNListVo>
	{
		private int sortOrder;

		public DOBComparator(SortOrder order)
		{
			if (SortOrder.ASCENDING.equals(order))
				sortOrder = 1;
			else
				sortOrder = -1;
		}

		/**
		 * Implementation for compare method
		 */
		public int compare(ClientPHNListVo object1, ClientPHNListVo object2)
		{
			// Get client Date of Birth
			Date dob1 = object1.getDob().toDate();
			Date dob2 = object2.getDob().toDate();
			
			// If neither object has DOB take no action
			if (dob1 == null && dob2 == null)
				return 0;
			
			// Consider null values to be last, regardless of the sort order
			if (dob1 == null && dob2 != null)
				return 1;
			
			if (dob1 != null && dob2 == null)
				return -1;
			
			// Return default comparison for date
			return dob1.compareTo(dob2) * sortOrder;
		}

	}

	/**
	 * WDEV-12521
	 * Custom comparator used for sorting by "Date Registered"
	 */
	private class DateRegisteredComparator implements Comparator<ClientPHNListVo>
	{
		private int sortOrder;

		public DateRegisteredComparator(SortOrder order)
		{
			if (SortOrder.ASCENDING.equals(order))
				sortOrder = 1;
			else
				sortOrder = -1;
		}

		/**
		 * Implementation for compare method
		 */
		public int compare(ClientPHNListVo object1, ClientPHNListVo object2)
		{
			// Get date registered for objects
			Date registeredDate1 = object1.getCommunityCareIsNotNull() && object1.getCommunityCare().getGPRegistrationDateIsNotNull() ? object1.getCommunityCare().getGPRegistrationDate() : null;
			Date registeredDate2 = object2.getCommunityCareIsNotNull() && object2.getCommunityCare().getGPRegistrationDateIsNotNull() ? object2.getCommunityCare().getGPRegistrationDate() : null;

			// If neither object has registered date then take no action
			if (registeredDate1 == null && registeredDate2 == null)
				return 0;
			
			// Consider null values to be last, regardless of the sort order
			if (registeredDate1 == null && registeredDate2 != null)
				return 1;
			
			if (registeredDate1 != null && registeredDate2 == null)
				return -1;

			// Return default comparison result for Date
			return registeredDate1.compareTo(registeredDate2) * sortOrder;
		}
	}

	
	//-------------------------------------------------------------------------------------------------------------------
	// DYNAMIC GRID - SET COLUMNS
	//-------------------------------------------------------------------------------------------------------------------
	private static Integer COL_CLIENT_ID		= Integer.valueOf(1);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	private static Integer COL_SURNAME			= Integer.valueOf(2);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	private static Integer COL_FORENAME			= Integer.valueOf(3);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	private static Integer COL_ADDRESS			= Integer.valueOf(4);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	private static Integer COL_SEX				= Integer.valueOf(5);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	private static Integer COL_AGE				= Integer.valueOf(6);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	private static Integer COL_DOB				= Integer.valueOf(7);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	private static Integer COL_DATE_REGISTRED	= Integer.valueOf(8);		// WDEV-12521 - Changed the type to Integer for comparison reasons
	
	//-------------------------------------------------------------------------------------------------------------------
	// REGION - FORM EVENT HANDLERS
	//-------------------------------------------------------------------------------------------------------------------
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}

	@Override
	protected void onCmbCCAValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		LocSiteLiteVo value = form.cmbCCA().getValue();
		selectCCA(value);
	}

	@Override
	protected void onCmbSectorValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		selectSector(form.cmbSector().getValue());
	}

	@Override
	protected void onImbSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		try
		{
			String[] errors = validateUIRules();

			if (errors != null && errors.length != 0)
			{
				engine.showErrors(errors);
				return;
			}

			// WDEV - 12527 - Display a message when no results were found
			ClientPHNListVoCollection searchResults = domain.searchPatients(form.cmbDistrict().getValue(), form.dteStartDob().getValue(), form.dteEndDOB().getValue());
						
			if (searchResults == null || searchResults.size() == 0)
			{
				engine.showMessage("No results found to match search criteria");
			}
			
			setDynamicGridClients(searchResults);
			updateControlsState();
		}
		catch (DomainRuntimeException e)
		{
			engine.showMessage("Please select a district to search upon");
			updateControlsState();
			return;
		}
	}

	@Override
	protected void onImbClearClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearInstanceControls();
		open();
	}

	@Override
	/**
	 * WDEV-12521
	 * Event handler for dynamic grid header column click - used for custom sorting on "Age", "DOB" and "Date Registered" columns
	 */
	protected void onDyngrdPatientListColumnHeaderClicked(DynamicGridColumn column)
	{
		if (COL_AGE.equals(column.getIdentifier()))
		{
			// Sort dynamic grid by "Age" column
			sortPatientListByAge(form.getLocalContext().getAgeSortOrder());
			
			// Change sort order for "Age" column
			if (SortOrder.ASCENDING.equals(form.getLocalContext().getAgeSortOrder()))
				form.getLocalContext().setAgeSortOrder(SortOrder.DESCENDING);
			else
				form.getLocalContext().setAgeSortOrder(SortOrder.ASCENDING);
			
			// Reset sort order for the rest of the custom sort order columns
			form.getLocalContext().setDOBSortOrder(SortOrder.ASCENDING);
			form.getLocalContext().setDateRegistreSortOrder(SortOrder.ASCENDING);
		}
		else if (COL_DOB.equals(column.getIdentifier()))
		{
			sortPatientListByDOB(form.getLocalContext().getDOBSortOrder());
			
			// Change sort order for "DOB" column
			if (SortOrder.ASCENDING.equals(form.getLocalContext().getDOBSortOrder()))
				form.getLocalContext().setDOBSortOrder(SortOrder.DESCENDING);
			else
				form.getLocalContext().setDOBSortOrder(SortOrder.ASCENDING);
			
			// Reset sort order for the rest of the custom sort order columns
			form.getLocalContext().setAgeSortOrder(SortOrder.ASCENDING);
			form.getLocalContext().setDateRegistreSortOrder(SortOrder.ASCENDING);
		}
		else if (COL_DATE_REGISTRED.equals(column.getIdentifier()))
		{
			sortPatientListByDateRegistred(form.getLocalContext().getDateRegistreSortOrder());
			
			// Change sort order for "Date Registered" column
			if (SortOrder.ASCENDING.equals(form.getLocalContext().getDateRegistreSortOrder()))
				form.getLocalContext().setDateRegistreSortOrder(SortOrder.DESCENDING);
			else
				form.getLocalContext().setDateRegistreSortOrder(SortOrder.ASCENDING);
			
			// Reset sort order for the rest of the custom sort order columns
			form.getLocalContext().setAgeSortOrder(SortOrder.ASCENDING);
			form.getLocalContext().setDOBSortOrder(SortOrder.ASCENDING);
		}
		else
		{
			form.getLocalContext().setAgeSortOrder(SortOrder.ASCENDING);
			form.getLocalContext().setDOBSortOrder(SortOrder.ASCENDING);
			form.getLocalContext().setDateRegistreSortOrder(SortOrder.ASCENDING);
		}
	}

	//-------------------------------------------------------------------------------------------------------------------
	// REGION - FORM LOGIC FUNCTION
	//-------------------------------------------------------------------------------------------------------------------
	@Override
	public void initialize() throws FormOpenException
	{
		super.initialize();
		
		// WDEV-12521
		// Initialize local context sort order
		form.getLocalContext().setAgeSortOrder(SortOrder.ASCENDING);
		form.getLocalContext().setDateRegistreSortOrder(SortOrder.ASCENDING);
		form.getLocalContext().setDOBSortOrder(SortOrder.ASCENDING);

		initializeDynamicGrid();

		form.cmbSector().setEnabled(false);
		form.cmbDistrict().setEnabled(false);
	}

	public void open() throws ims.framework.exceptions.PresentationLogicException
	{
		listCCA(domain.listCCA());

		updateControlsState();
	}

	private void initializeDynamicGrid()
	{
		// Initialize dynamic grid
		DynamicGridColumn column;

		column = form.dyngrdPatientList().getColumns().newColumn("Client ID", COL_CLIENT_ID);
		column.setSortMode(SortMode.AUTOMATIC);
		column.setWidth(70);
		column.setCanGrow(false);

		column = form.dyngrdPatientList().getColumns().newColumn("Surname", COL_SURNAME);
		column.setSortMode(SortMode.AUTOMATIC);
		column.setWidth(150);
		column.setCanGrow(true);

		column = form.dyngrdPatientList().getColumns().newColumn("Forename", COL_FORENAME);
		column.setSortMode(SortMode.AUTOMATIC);
		column.setWidth(150);
		column.setCanGrow(true);

		column = form.dyngrdPatientList().getColumns().newColumn("Address", COL_ADDRESS);
		column.setSortMode(SortMode.AUTOMATIC);
		column.setWidth(150);
		column.setCanGrow(true);

		column = form.dyngrdPatientList().getColumns().newColumn("Sex", COL_SEX);
		column.setSortMode(SortMode.AUTOMATIC);
		column.setAlignment(Alignment.CENTER);
		column.setWidth(50);
		column.setCanGrow(false);

		// WDEV-12521 - Changed Sort Mode value to SortMode.MANUAL
		column = form.dyngrdPatientList().getColumns().newColumn("Age", COL_AGE);
		column.setSortMode(SortMode.MANUAL);
		column.setAlignment(Alignment.CENTER);
		column.setWidth(50);
		column.setCanGrow(false);

		// WDEV-12521 - Changed Sort Mode value to SortMode.MANUAL
		column = form.dyngrdPatientList().getColumns().newColumn("DOB", COL_DOB);
		column.setSortMode(SortMode.MANUAL);
		column.setAlignment(Alignment.CENTER);
		column.setWidth(70);
		column.setCanGrow(false);

		// WDEV-12521 - Changed Sort Mode value to SortMode.MANUAL
		column = form.dyngrdPatientList().getColumns().newColumn("Date Registered", COL_DATE_REGISTRED);
		column.setSortMode(SortMode.MANUAL);
		column.setAlignment(Alignment.CENTER);
		column.setWidth(100);
		column.setCanGrow(false);
	}

	public void newInstance() throws ims.framework.exceptions.PresentationLogicException
	{}

	public void updateInstance()
	{}

	public boolean save() throws ims.framework.exceptions.PresentationLogicException
	{
		return false;
	}

	public void clearInstanceControls()
	{
		form.cmbCCA().clear();
		form.cmbSector().clear();
		form.cmbDistrict().clear();
		
		// WDEV - 12527 - Clear date controls
		form.dteStartDob().setValue(null);
		form.dteEndDOB().setValue(null);

		form.dyngrdPatientList().getRows().clear();
	}

	public void updateControlsState()
	{
		if (form.cmbCCA().getValue() == null)
		{
			form.cmbSector().clear();
			form.cmbSector().setEnabled(false);
		}

		if (form.cmbSector().getValue() == null)
		{
			form.cmbDistrict().clear();
			form.cmbDistrict().setEnabled(false);
		}
	}

	@Override
	public String[] validateUIRules()
	{
		ArrayList<String> listOfErrors = new ArrayList<String>();

		if (form.dteStartDob().getValue() != null && form.dteEndDOB().getValue() != null)
		{
			if (form.dteStartDob().getValue().isGreaterThan(form.dteEndDOB().getValue()))
			{
				listOfErrors.add("'From' date can not be set after 'To' date.");//WDEV-14275
			}
		}

		int errorCount = listOfErrors.size();
		if (errorCount == 0)
			return null;

		String[] result = new String[errorCount];
		for (int x = 0; x < errorCount; x++)
			result[x] = (String) listOfErrors.get(x);

		return result;
	}

	//-------------------------------------------------------------------------------------------------------------------
	// REGION - COMBOBOX ALGORITHM FUNTIONS
	//-------------------------------------------------------------------------------------------------------------------
	private void listCCA(LocSiteLiteVoCollection listCCA)
	{
		// Clear current records
		form.cmbCCA().clear();

		if (listCCA == null)
			return;

		// Iterate CCA colection
		for (int i = 0; i < listCCA.size(); i++)
		{
			LocSiteLiteVo valueCCA = listCCA.get(i);

			// Add non nulls values to combo-box
			if (valueCCA != null)
			{
				form.cmbCCA().newRow(valueCCA, valueCCA.getName());
			}
		}
	}

	private void selectCCA(LocSiteLiteVo value)
	{
		if (value != null)
			listSector(domain.listSector(value));

		updateControlsState();
	}

	private void listSector(LocationLiteVoCollection listSector)
	{
		// Clear and enable sector combobox
		form.cmbSector().clear();
		form.cmbSector().setEnabled(true);

		if (listSector == null)
			return;

		// Iterate sector collection
		for (int i = 0; i < listSector.size(); i++)
		{
			// Add non null values to the combobox
			LocationLiteVo valueDistrict = listSector.get(i);
			if (valueDistrict != null)
			{
				form.cmbSector().newRow(valueDistrict, valueDistrict.getName());
			}
		}
	}

	private void selectSector(LocationLiteVo value)
	{
		if (value != null)
			listDistrict(domain.listDistrict(value));

		updateControlsState();
	}

	private void listDistrict(LocationLiteVoCollection listDistrict)
	{
		// Clear and enable district combobox
		form.cmbDistrict().clear();
		form.cmbDistrict().setEnabled(true);

		if (listDistrict == null)
			return;

		// Iterate district collection
		for (int i = 0; i < listDistrict.size(); i++)
		{
			// Add non null values to the combobox
			if (listDistrict.get(i) != null)
			{
				form.cmbDistrict().newRow(listDistrict.get(i), listDistrict.get(i).getName());
			}
		}
	}

	//-------------------------------------------------------------------------------------------------------------------
	// REGION - DYNAMIC GRID LIST
	//-------------------------------------------------------------------------------------------------------------------
	private void setDynamicGridClients(ClientPHNListVoCollection clientPHNListVoCollection)
	{
		form.dyngrdPatientList().getRows().clear();

		if (clientPHNListVoCollection == null)
			return;

		for (int i = 0; i < clientPHNListVoCollection.size(); i++)
		{
			if (clientPHNListVoCollection.get(i) != null)
			{
				setDynamicGridClientRow(form.dyngrdPatientList().getRows().newRow(), clientPHNListVoCollection.get(i));
			}
		}
	}
	
	/**
	 * WDEV-12521
	 * Function used retrieve a collection with the values from Client grid
	 */
	private ClientPHNListVoCollection getDynamicGridClient()
	{
		// Create collection of clients
		ClientPHNListVoCollection clients = new ClientPHNListVoCollection();
		
		// Iterate dynamic grid rows & add to collection the ClientPHNList values
		for (int i = 0; i < form.dyngrdPatientList().getRows().size(); i++)
		{
			Object rowValue = form.dyngrdPatientList().getRows().get(i).getValue();
			
			if (rowValue instanceof ClientPHNListVo)
				clients.add((ClientPHNListVo) rowValue);
		}
		
		return clients;
	}


	private void setDynamicGridClientRow(DynamicGridRow row, ClientPHNListVo client)
	{
		if (row == null)
			throw new CodingRuntimeException("Major Logical Error - Can not set a null row to a value");

		if (client == null)
			return;

		// Column and cell identifier
		DynamicGridColumn column;
		DynamicGridCell cell;

		// First cell - Client Identifier
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_CLIENT_ID);
		cell = row.getCells().newCell(column, DynamicCellType.STRING);
		cell.setValue(client.getClientID() == null ? null : client.getClientID().getValue());
		cell.setIdentifier(client.getClientID());

		// Second cell - Client Surname
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_SURNAME);
		cell = row.getCells().newCell(column, DynamicCellType.STRING);
		cell.setValue(client.getName() == null ? null : client.getName().getSurname());

		// Third cell - Client Forename
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_FORENAME);
		cell = row.getCells().newCell(column, DynamicCellType.STRING);
		cell.setValue(client.getName() == null ? null : client.getName().getForename());

		// Fourth cell - Client Address
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_ADDRESS);
		cell = row.getCells().newCell(column, DynamicCellType.WRAPTEXT);
		cell.setValue(client.getAddress() == null ? null : client.getAddress().toDisplayString());
		cell.setIdentifier(client.getAddress());

		// Fifth cell - Client Gender
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_SEX);
		cell = row.getCells().newCell(column, DynamicCellType.STRING);
		cell.setValue(client.getSex() == null ? null : client.getSex().getText());
		cell.setIdentifier(client.getSex());

		// Sixth cell - Client Age
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_AGE);
		cell = row.getCells().newCell(column, DynamicCellType.INT);
		cell.setValue(client.calculateAge());						// WDEV - 12527 - Calculate DOB

		// Seventh cell - Client DOB
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_DOB);
		cell = row.getCells().newCell(column, DynamicCellType.PARTIALDATE);
		cell.setValue(client.getDob());

		// Eight cell - Client Date of Registration
		column = form.dyngrdPatientList().getColumns().getByIdentifier(COL_DATE_REGISTRED);
		cell = row.getCells().newCell(column, DynamicCellType.STRING);
		cell.setValue(client.getCommunityCare() == null ? null : client.getCommunityCare().getGPRegistrationDate() == null ? null : client.getCommunityCare().getGPRegistrationDate().toString());
		
		// Set value to row - WDEV-12521
		row.setValue(client);
	}


	//-------------------------------------------------------------------------------------------------------------------
	// REGION - Dynamic Grid custom sort for 
	//-------------------------------------------------------------------------------------------------------------------

	/**
	 * WDEV-12521
	 * Function used to custom sort the dynamic grid by "Age" column
	 */
	private void sortPatientListByAge(SortOrder sortOrder)
	{
		// Get values from dynamic grid
		ClientPHNListVoCollection clients = getDynamicGridClient();
		
		// Sort by DOB
		clients.sort(new AgeComparator(sortOrder));
		
		// Populate dynamic grid with sorted collection
		setDynamicGridClients(clients);
	}

	/**
	 * WDEV-12521
	 * Function used to custom sort the dynamic grid by "DOB" column
	 */
	private void sortPatientListByDOB(SortOrder sortOrder)
	{
		// Get values from dynamic grid
		ClientPHNListVoCollection clients = getDynamicGridClient();
		
		// Sort by DOB
		clients.sort(new DOBComparator(sortOrder));
		
		// Populate dynamic grid with sorted collection
		setDynamicGridClients(clients);
	}

	/**
	 * WDEV-12521
	 * Function used to custom sort the dynamic grid by "Date Registered" column
	 */
	private void sortPatientListByDateRegistred(SortOrder sortOrder)
	{
		// Get values from dynamic grid
		ClientPHNListVoCollection clients = getDynamicGridClient();

		// Sort by Date Registered
		clients.sort(new DateRegisteredComparator(sortOrder));
		
		// Populate dynamic grid with sorted collection
		setDynamicGridClients(clients);
	}



}