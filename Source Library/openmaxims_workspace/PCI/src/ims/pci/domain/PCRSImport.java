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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.pci.domain;

// Generated from form domain impl
public interface PCRSImport extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* getClientInfo
	*/
	public ims.pci.vo.ClientPCRSImportVo getClientInfo(String clientId);

	// Generated from form domain interface definition
	public void updateClientGmsId(ims.pci.vo.ClientPCRSImportVo clientInfo) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* getGpContract
	*/
	public ims.pci.vo.GpContractRefVo getGpContract(String contractId);

	// Generated from form domain interface definition
	/**
	* insertPaymentRecord
	*/
	public void insertPaymentRecord(ims.pci.vo.GmsPaymentsVo gmsPayment) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* getClient
	*/
	public ims.core.vo.PatientPcrsVo getClient(String clientId);

	// Generated from form domain interface definition
	/**
	* getPaymentType
	*/
	public ims.pci.vo.lookups.GMSPaymentType getPaymentType(String type);

	// Generated from form domain interface definition
	/**
	* insertPaymentCollection -- batch inserts
	*/
	public void insertPaymentCollection(ims.pci.vo.GmsPaymentsVoCollection coll) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* returns the number of records for month/year in the DB
	*/
	public Integer checkYearMonthRecords(Integer monthYear);

	// Generated from form domain interface definition
	/**
	* getGmsId
	*/
	public String getGmsId(Integer id) throws ims.domain.exceptions.DomainInterfaceException;
}
