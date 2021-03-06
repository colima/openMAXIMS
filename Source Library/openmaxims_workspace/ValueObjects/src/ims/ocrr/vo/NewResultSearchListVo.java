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

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.OrderInvestigation business object (ID: 1070100002).
 */
public class NewResultSearchListVo extends ims.ocrr.orderingresults.vo.OrderInvestigationRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public NewResultSearchListVo()
	{
	}
	public NewResultSearchListVo(Integer id, int version)
	{
		super(id, version);
	}
	public NewResultSearchListVo(ims.ocrr.vo.beans.NewResultSearchListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.repdatetime = bean.getRepDateTime() == null ? null : bean.getRepDateTime().buildDateTime();
		this.reptimesupplied = bean.getRepTimeSupplied();
		this.allocateddateforreview = bean.getAllocatedDateForReview() == null ? null : bean.getAllocatedDateForReview().buildDateTime();
		this.patientsurname = bean.getPatientSurname();
		this.patientforename = bean.getPatientForename();
		this.patientidentifier = bean.getPatientIdentifier();
		this.investigationname = bean.getInvestigationName();
		this.category = bean.getCategory() == null ? null : ims.ocrr.vo.lookups.Category.buildLookup(bean.getCategory());
		this.resultstatus = bean.getResultStatus() == null ? null : ims.ocrr.vo.lookups.ResultStatus.buildLookup(bean.getResultStatus());
		this.abnormalresult = bean.getAbnormalResult();
		this.ordinvresultstatus = bean.getOrdInvResultStatus() == null ? null : ims.ocrr.vo.lookups.OrderInvStatus.buildLookup(bean.getOrdInvResultStatus());
		this.discipline = bean.getDiscipline();
		this.locationname = bean.getLocationName();
		this.clinicianname = bean.getClinicianName();
		this.investigationeventtype = bean.getInvestigationEventType() == null ? null : ims.ocrr.vo.lookups.InvEventType.buildLookup(bean.getInvestigationEventType());
		this.orderdetails = bean.getOrderDetails() == null ? null : new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(new Integer(bean.getOrderDetails().getId()), bean.getOrderDetails().getVersion());
		this.service = bean.getService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getService().getId()), bean.getService().getVersion());
		this.securitylevel = bean.getSecurityLevel() == null ? null : bean.getSecurityLevel().buildVo();
		this.ordinvresultstatusreason = bean.getOrdInvResultStatusReason();
		this.allocatedforreviewsurname = bean.getAllocatedForReviewSurname();
		this.allocatedforreviewforename = bean.getAllocatedForReviewForename();
		this.ordinvstatuschangedatetime = bean.getOrdInvStatusChangeDateTime() == null ? null : bean.getOrdInvStatusChangeDateTime().buildDateTime();
		this.colfilldatetimesupplied = bean.getColFillDateTimeSupplied();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		if(bean.getSpecimen() != null)
		{
			this.specimen = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection();
			for(int specimen_i = 0; specimen_i < bean.getSpecimen().length; specimen_i++)
			{
				this.specimen.add(new ims.ocrr.orderingresults.vo.OrderSpecimenRefVo(new Integer(bean.getSpecimen()[specimen_i].getId()), bean.getSpecimen()[specimen_i].getVersion()));
			}
		}
		this.hospitalnumber = bean.getHospitalNumber();
		this.nhsnumber = bean.getNHSNumber();
		this.resultsortdate = bean.getResultSortDate() == null ? null : bean.getResultSortDate().buildDateTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.NewResultSearchListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.repdatetime = bean.getRepDateTime() == null ? null : bean.getRepDateTime().buildDateTime();
		this.reptimesupplied = bean.getRepTimeSupplied();
		this.allocateddateforreview = bean.getAllocatedDateForReview() == null ? null : bean.getAllocatedDateForReview().buildDateTime();
		this.patientsurname = bean.getPatientSurname();
		this.patientforename = bean.getPatientForename();
		this.patientidentifier = bean.getPatientIdentifier();
		this.investigationname = bean.getInvestigationName();
		this.category = bean.getCategory() == null ? null : ims.ocrr.vo.lookups.Category.buildLookup(bean.getCategory());
		this.resultstatus = bean.getResultStatus() == null ? null : ims.ocrr.vo.lookups.ResultStatus.buildLookup(bean.getResultStatus());
		this.abnormalresult = bean.getAbnormalResult();
		this.ordinvresultstatus = bean.getOrdInvResultStatus() == null ? null : ims.ocrr.vo.lookups.OrderInvStatus.buildLookup(bean.getOrdInvResultStatus());
		this.discipline = bean.getDiscipline();
		this.locationname = bean.getLocationName();
		this.clinicianname = bean.getClinicianName();
		this.investigationeventtype = bean.getInvestigationEventType() == null ? null : ims.ocrr.vo.lookups.InvEventType.buildLookup(bean.getInvestigationEventType());
		this.orderdetails = bean.getOrderDetails() == null ? null : new ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo(new Integer(bean.getOrderDetails().getId()), bean.getOrderDetails().getVersion());
		this.service = bean.getService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getService().getId()), bean.getService().getVersion());
		this.securitylevel = bean.getSecurityLevel() == null ? null : bean.getSecurityLevel().buildVo(map);
		this.ordinvresultstatusreason = bean.getOrdInvResultStatusReason();
		this.allocatedforreviewsurname = bean.getAllocatedForReviewSurname();
		this.allocatedforreviewforename = bean.getAllocatedForReviewForename();
		this.ordinvstatuschangedatetime = bean.getOrdInvStatusChangeDateTime() == null ? null : bean.getOrdInvStatusChangeDateTime().buildDateTime();
		this.colfilldatetimesupplied = bean.getColFillDateTimeSupplied();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		if(bean.getSpecimen() != null)
		{
			this.specimen = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection();
			for(int specimen_i = 0; specimen_i < bean.getSpecimen().length; specimen_i++)
			{
				this.specimen.add(new ims.ocrr.orderingresults.vo.OrderSpecimenRefVo(new Integer(bean.getSpecimen()[specimen_i].getId()), bean.getSpecimen()[specimen_i].getVersion()));
			}
		}
		this.hospitalnumber = bean.getHospitalNumber();
		this.nhsnumber = bean.getNHSNumber();
		this.resultsortdate = bean.getResultSortDate() == null ? null : bean.getResultSortDate().buildDateTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.NewResultSearchListVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.NewResultSearchListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.NewResultSearchListVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("REPDATETIME"))
			return getRepDateTime();
		if(fieldName.equals("REPTIMESUPPLIED"))
			return getRepTimeSupplied();
		if(fieldName.equals("ALLOCATEDDATEFORREVIEW"))
			return getAllocatedDateForReview();
		if(fieldName.equals("PATIENTSURNAME"))
			return getPatientSurname();
		if(fieldName.equals("PATIENTFORENAME"))
			return getPatientForename();
		if(fieldName.equals("PATIENTIDENTIFIER"))
			return getPatientIdentifier();
		if(fieldName.equals("INVESTIGATIONNAME"))
			return getInvestigationName();
		if(fieldName.equals("CATEGORY"))
			return getCategory();
		if(fieldName.equals("RESULTSTATUS"))
			return getResultStatus();
		if(fieldName.equals("ABNORMALRESULT"))
			return getAbnormalResult();
		if(fieldName.equals("ORDINVRESULTSTATUS"))
			return getOrdInvResultStatus();
		if(fieldName.equals("DISCIPLINE"))
			return getDiscipline();
		if(fieldName.equals("LOCATIONNAME"))
			return getLocationName();
		if(fieldName.equals("CLINICIANNAME"))
			return getClinicianName();
		if(fieldName.equals("INVESTIGATIONEVENTTYPE"))
			return getInvestigationEventType();
		if(fieldName.equals("ORDERDETAILS"))
			return getOrderDetails();
		if(fieldName.equals("SERVICE"))
			return getService();
		if(fieldName.equals("SECURITYLEVEL"))
			return getSecurityLevel();
		if(fieldName.equals("ORDINVRESULTSTATUSREASON"))
			return getOrdInvResultStatusReason();
		if(fieldName.equals("ALLOCATEDFORREVIEWSURNAME"))
			return getAllocatedForReviewSurname();
		if(fieldName.equals("ALLOCATEDFORREVIEWFORENAME"))
			return getAllocatedForReviewForename();
		if(fieldName.equals("ORDINVSTATUSCHANGEDATETIME"))
			return getOrdInvStatusChangeDateTime();
		if(fieldName.equals("COLFILLDATETIMESUPPLIED"))
			return getColFillDateTimeSupplied();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("SPECIMEN"))
			return getSpecimen();
		if(fieldName.equals("HOSPITALNUMBER"))
			return getHospitalNumber();
		if(fieldName.equals("NHSNUMBER"))
			return getNHSNumber();
		if(fieldName.equals("RESULTSORTDATE"))
			return getResultSortDate();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getRepDateTimeIsNotNull()
	{
		return this.repdatetime != null;
	}
	public ims.framework.utils.DateTime getRepDateTime()
	{
		return this.repdatetime;
	}
	public void setRepDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.repdatetime = value;
	}
	public boolean getRepTimeSuppliedIsNotNull()
	{
		return this.reptimesupplied != null;
	}
	public Boolean getRepTimeSupplied()
	{
		return this.reptimesupplied;
	}
	public void setRepTimeSupplied(Boolean value)
	{
		this.isValidated = false;
		this.reptimesupplied = value;
	}
	public boolean getAllocatedDateForReviewIsNotNull()
	{
		return this.allocateddateforreview != null;
	}
	public ims.framework.utils.DateTime getAllocatedDateForReview()
	{
		return this.allocateddateforreview;
	}
	public void setAllocatedDateForReview(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.allocateddateforreview = value;
	}
	public boolean getPatientSurnameIsNotNull()
	{
		return this.patientsurname != null;
	}
	public String getPatientSurname()
	{
		return this.patientsurname;
	}
	public static int getPatientSurnameMaxLength()
	{
		return 255;
	}
	public void setPatientSurname(String value)
	{
		this.isValidated = false;
		this.patientsurname = value;
	}
	public boolean getPatientForenameIsNotNull()
	{
		return this.patientforename != null;
	}
	public String getPatientForename()
	{
		return this.patientforename;
	}
	public static int getPatientForenameMaxLength()
	{
		return 255;
	}
	public void setPatientForename(String value)
	{
		this.isValidated = false;
		this.patientforename = value;
	}
	public boolean getPatientIdentifierIsNotNull()
	{
		return this.patientidentifier != null;
	}
	public String getPatientIdentifier()
	{
		return this.patientidentifier;
	}
	public static int getPatientIdentifierMaxLength()
	{
		return 255;
	}
	public void setPatientIdentifier(String value)
	{
		this.isValidated = false;
		this.patientidentifier = value;
	}
	public boolean getInvestigationNameIsNotNull()
	{
		return this.investigationname != null;
	}
	public String getInvestigationName()
	{
		return this.investigationname;
	}
	public static int getInvestigationNameMaxLength()
	{
		return 255;
	}
	public void setInvestigationName(String value)
	{
		this.isValidated = false;
		this.investigationname = value;
	}
	public boolean getCategoryIsNotNull()
	{
		return this.category != null;
	}
	public ims.ocrr.vo.lookups.Category getCategory()
	{
		return this.category;
	}
	public void setCategory(ims.ocrr.vo.lookups.Category value)
	{
		this.isValidated = false;
		this.category = value;
	}
	public boolean getResultStatusIsNotNull()
	{
		return this.resultstatus != null;
	}
	public ims.ocrr.vo.lookups.ResultStatus getResultStatus()
	{
		return this.resultstatus;
	}
	public void setResultStatus(ims.ocrr.vo.lookups.ResultStatus value)
	{
		this.isValidated = false;
		this.resultstatus = value;
	}
	public boolean getAbnormalResultIsNotNull()
	{
		return this.abnormalresult != null;
	}
	public Boolean getAbnormalResult()
	{
		return this.abnormalresult;
	}
	public void setAbnormalResult(Boolean value)
	{
		this.isValidated = false;
		this.abnormalresult = value;
	}
	public boolean getOrdInvResultStatusIsNotNull()
	{
		return this.ordinvresultstatus != null;
	}
	public ims.ocrr.vo.lookups.OrderInvStatus getOrdInvResultStatus()
	{
		return this.ordinvresultstatus;
	}
	public void setOrdInvResultStatus(ims.ocrr.vo.lookups.OrderInvStatus value)
	{
		this.isValidated = false;
		this.ordinvresultstatus = value;
	}
	public boolean getDisciplineIsNotNull()
	{
		return this.discipline != null;
	}
	public String getDiscipline()
	{
		return this.discipline;
	}
	public static int getDisciplineMaxLength()
	{
		return 255;
	}
	public void setDiscipline(String value)
	{
		this.isValidated = false;
		this.discipline = value;
	}
	public boolean getLocationNameIsNotNull()
	{
		return this.locationname != null;
	}
	public String getLocationName()
	{
		return this.locationname;
	}
	public static int getLocationNameMaxLength()
	{
		return 255;
	}
	public void setLocationName(String value)
	{
		this.isValidated = false;
		this.locationname = value;
	}
	public boolean getClinicianNameIsNotNull()
	{
		return this.clinicianname != null;
	}
	public String getClinicianName()
	{
		return this.clinicianname;
	}
	public static int getClinicianNameMaxLength()
	{
		return 255;
	}
	public void setClinicianName(String value)
	{
		this.isValidated = false;
		this.clinicianname = value;
	}
	public boolean getInvestigationEventTypeIsNotNull()
	{
		return this.investigationeventtype != null;
	}
	public ims.ocrr.vo.lookups.InvEventType getInvestigationEventType()
	{
		return this.investigationeventtype;
	}
	public void setInvestigationEventType(ims.ocrr.vo.lookups.InvEventType value)
	{
		this.isValidated = false;
		this.investigationeventtype = value;
	}
	public boolean getOrderDetailsIsNotNull()
	{
		return this.orderdetails != null;
	}
	public ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo getOrderDetails()
	{
		return this.orderdetails;
	}
	public void setOrderDetails(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo value)
	{
		this.isValidated = false;
		this.orderdetails = value;
	}
	public boolean getServiceIsNotNull()
	{
		return this.service != null;
	}
	public ims.core.clinical.vo.ServiceRefVo getService()
	{
		return this.service;
	}
	public void setService(ims.core.clinical.vo.ServiceRefVo value)
	{
		this.isValidated = false;
		this.service = value;
	}
	public boolean getSecurityLevelIsNotNull()
	{
		return this.securitylevel != null;
	}
	public ims.ocrr.vo.SecurityLevelConfigVo getSecurityLevel()
	{
		return this.securitylevel;
	}
	public void setSecurityLevel(ims.ocrr.vo.SecurityLevelConfigVo value)
	{
		this.isValidated = false;
		this.securitylevel = value;
	}
	public boolean getOrdInvResultStatusReasonIsNotNull()
	{
		return this.ordinvresultstatusreason != null;
	}
	public String getOrdInvResultStatusReason()
	{
		return this.ordinvresultstatusreason;
	}
	public static int getOrdInvResultStatusReasonMaxLength()
	{
		return 255;
	}
	public void setOrdInvResultStatusReason(String value)
	{
		this.isValidated = false;
		this.ordinvresultstatusreason = value;
	}
	public boolean getAllocatedForReviewSurnameIsNotNull()
	{
		return this.allocatedforreviewsurname != null;
	}
	public String getAllocatedForReviewSurname()
	{
		return this.allocatedforreviewsurname;
	}
	public static int getAllocatedForReviewSurnameMaxLength()
	{
		return 255;
	}
	public void setAllocatedForReviewSurname(String value)
	{
		this.isValidated = false;
		this.allocatedforreviewsurname = value;
	}
	public boolean getAllocatedForReviewForenameIsNotNull()
	{
		return this.allocatedforreviewforename != null;
	}
	public String getAllocatedForReviewForename()
	{
		return this.allocatedforreviewforename;
	}
	public static int getAllocatedForReviewForenameMaxLength()
	{
		return 255;
	}
	public void setAllocatedForReviewForename(String value)
	{
		this.isValidated = false;
		this.allocatedforreviewforename = value;
	}
	public boolean getOrdInvStatusChangeDateTimeIsNotNull()
	{
		return this.ordinvstatuschangedatetime != null;
	}
	public ims.framework.utils.DateTime getOrdInvStatusChangeDateTime()
	{
		return this.ordinvstatuschangedatetime;
	}
	public void setOrdInvStatusChangeDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.ordinvstatuschangedatetime = value;
	}
	public boolean getColFillDateTimeSuppliedIsNotNull()
	{
		return this.colfilldatetimesupplied != null;
	}
	public Boolean getColFillDateTimeSupplied()
	{
		return this.colfilldatetimesupplied;
	}
	public void setColFillDateTimeSupplied(Boolean value)
	{
		this.isValidated = false;
		this.colfilldatetimesupplied = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getSpecimenIsNotNull()
	{
		return this.specimen != null;
	}
	public ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection getSpecimen()
	{
		return this.specimen;
	}
	public void setSpecimen(ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection value)
	{
		this.isValidated = false;
		this.specimen = value;
	}
	public boolean getHospitalNumberIsNotNull()
	{
		return this.hospitalnumber != null;
	}
	public String getHospitalNumber()
	{
		return this.hospitalnumber;
	}
	public static int getHospitalNumberMaxLength()
	{
		return 255;
	}
	public void setHospitalNumber(String value)
	{
		this.isValidated = false;
		this.hospitalnumber = value;
	}
	public boolean getNHSNumberIsNotNull()
	{
		return this.nhsnumber != null;
	}
	public String getNHSNumber()
	{
		return this.nhsnumber;
	}
	public static int getNHSNumberMaxLength()
	{
		return 255;
	}
	public void setNHSNumber(String value)
	{
		this.isValidated = false;
		this.nhsnumber = value;
	}
	public boolean getResultSortDateIsNotNull()
	{
		return this.resultsortdate != null;
	}
	public ims.framework.utils.DateTime getResultSortDate()
	{
		return this.resultsortdate;
	}
	public void setResultSortDate(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.resultsortdate = value;
	}
	/**
	* Custom constructor for query
	*/
		public NewResultSearchListVo(Integer id, int version,
										java.util.Date repDateTime, Boolean repTimeSupplied,
										java.util.Date allocatedDateForReview,
										java.util.Date sortDate,
										Integer specimenId, Integer specimenVersion,
										Long colDateTimeFiller,
										String reviewingHcpSurname, String reviewingHcpForename,
										Integer patientId, Integer patientVersion,
										String patientSurname, String patientForename,
										String displayPatientIdentifier,
										String patientIdentifierHospitalNumber,
										String patientIdentifierNHS,
										String investigationName,
										Integer investigationType,
										Integer categoryId,
										Integer resultStatusId,
										Long abnormalResult,
										Integer orderInvStatusId, java.util.Date orderInvStatusChangedDateTime, String orderInvStatusReason,
										String serviceName,
										String patientLocationName, String patientClinicName, String outpatientDepartmentName,
										String responsibleGPSurname, String responsibleGPForename, String responsibleGpTitle,
										String responsibleClinicianSurname, String responsibleClinicianForename, String responsibleClinicianTitle,
										Integer serviceId, Integer serviceVersion,
										Integer securityLevelId, Integer securityLevelVersion, Integer securityLevel, String securityLevelDescription
									)
		{
			
			
			this.id	= id;
			this.version = version;
			
			if (repDateTime != null)
				this.repdatetime = new ims.framework.utils.DateTime(repDateTime);
			else
				this.repdatetime = null;
			
			this.reptimesupplied = repTimeSupplied;
			
			if (colDateTimeFiller > 0)
				this.colfilldatetimesupplied = Boolean.TRUE;
			else
				this.colfilldatetimesupplied = Boolean.FALSE;
			
			if (allocatedDateForReview != null)
				this.allocateddateforreview = new ims.framework.utils.DateTime(allocatedDateForReview);
			else
				this.allocateddateforreview = null;
			
			if (sortDate != null)
				this.resultsortdate = new ims.framework.utils.DateTime(sortDate);
			else
				this.resultstatus = null;
			
			if (specimenId != null)
			{
				this.specimen = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection();
				
				ims.ocrr.orderingresults.vo.OrderSpecimenRefVo spec = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVo(specimenId, specimenVersion);
				
				this.specimen.add(spec);
			}
			
			
			this.allocatedforreviewsurname = reviewingHcpSurname;
			this.allocatedforreviewforename = reviewingHcpForename;
		
			this.patient = new ims.core.patient.vo.PatientRefVo(patientId, patientVersion);
			this.patientsurname = patientSurname;
			this.patientforename = patientForename;
			
			this.patientidentifier = displayPatientIdentifier;
			this.hospitalnumber = patientIdentifierHospitalNumber;
			this.nhsnumber = patientIdentifierNHS;
			
			this.investigationname = investigationName;
			
			
			// Investigation Event Type
			if (investigationType == null)
				this.investigationeventtype = null;
			else if (investigationType < 0)
				this.investigationeventtype = ims.ocrr.vo.lookups.InvEventType.getNegativeInstance(investigationType);
			// TODO - Code for positive instances
			
			
			// Category
			if (categoryId == null)
				this.category = null;
			else if (categoryId < 0)
				this.category = ims.ocrr.vo.lookups.Category.getNegativeInstance(categoryId);
			// TODO - Code for positive instances
			
			
			// Result Status
			if (resultStatusId == null)
				this.resultstatus = null;
			else if (resultStatusId < 0) 
				this.resultstatus = ims.ocrr.vo.lookups.ResultStatus.getNegativeInstance(resultStatusId);
			// TODO - Code for positive instances
			
			
			if (abnormalResult > 0)
				this.abnormalresult = true;
			else
				this.abnormalresult = false;
			
			
			// Order Investigation Result Status
			if (orderInvStatusId == null)
				this.ordinvresultstatus = null;
			else if (orderInvStatusId < 0)
				this.ordinvresultstatus = ims.ocrr.vo.lookups.OrderInvStatus.getNegativeInstance(orderInvStatusId);
			
			
			if (orderInvStatusChangedDateTime != null)
				this.ordinvstatuschangedatetime = new ims.framework.utils.DateTime(orderInvStatusChangedDateTime);
			else
				this.ordinvstatuschangedatetime = null;
			
			
			this.ordinvresultstatusreason = orderInvStatusReason;
			
			
			this.discipline = serviceName;
			
			if (patientLocationName != null)
				this.locationname = patientLocationName;
			else if (patientClinicName != null)
				this.locationname = patientClinicName;
			else if (outpatientDepartmentName != null)
				this.locationname = outpatientDepartmentName;
			
		
			this.clinicianname = new String();
			
			if (responsibleClinicianSurname != null && responsibleClinicianSurname.length() > 0)
			{
				if (responsibleClinicianTitle != null && responsibleClinicianTitle.length() > 0)
				{
					this.clinicianname += responsibleClinicianTitle;
					this.clinicianname +=" ";
				}
				
				if (responsibleClinicianForename != null && responsibleClinicianForename.length() > 0)
				{
					this.clinicianname += responsibleClinicianForename;
					this.clinicianname += " ";
				}
				
				this.clinicianname += responsibleClinicianSurname;
			}
			else if (responsibleGPSurname != null && responsibleGPSurname.length() > 0)
			{
				if (responsibleGpTitle != null && responsibleGpTitle.length() > 0)
				{
					this.clinicianname += responsibleGpTitle;
					this.clinicianname += " ";
				}
				
				if (responsibleGPForename != null && responsibleGPForename.length() > 0)
				{
					this.clinicianname += responsibleGPForename;
					this.clinicianname += " ";
				}
		
				this.clinicianname += responsibleGPSurname;
			}
			
			
			// Build ServiceRefVo field
			if (serviceId != null)
				this.service = new ims.core.clinical.vo.ServiceRefVo(serviceId, serviceVersion);
			else
				this.service = null;
			
			// Build SecurityLevel field
			if (securityLevelId != null && securityLevel != null)
			{
				this.securitylevel = new SecurityLevelConfigVo(securityLevelId, securityLevelVersion);
				this.securitylevel.setSecurityLevel(securityLevel);
				this.securitylevel.setSecurityLevelDescription(securityLevelDescription);
			}
			else
				this.securitylevel = null;
		}
	/**
	* equals
	*/
		@Override
		public boolean equals(Object obj)
		{
			if (obj instanceof NewResultSearchListVo)
			{
				NewResultSearchListVo comparable = (NewResultSearchListVo) obj;
		
				if (this.id.equals(comparable.getID_OrderInvestigation()))
				{
					if (comparable.getSpecimen() != null)
					{
						if (this.specimen == null)
							this.specimen = new ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection();
		
						for (int i = 0; i < comparable.getSpecimen().size(); i++)
						{
							this.specimen.add(comparable.getSpecimen().get(i));
						}
					}
		
					return true;
				}
			}
		
			return super.equals(obj);
		}
	
	/**
	* getDisplayNameString
	*/
	private String getDisplayNameString(String surname, String forename, String title)
	{
		if (surname == null || surname.length() == 0)
			return null;
			
		StringBuilder displayName = new StringBuilder();
			
		if (title != null && title.length() > 0)
			displayName.append(title).append(" ");
			
		if (forename != null && title.length() > 0)
			displayName.append(forename).append(" ");
			
		displayName.append(surname);
			
		return displayName.toString();
	}
	
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.orderdetails == null)
			listOfErrors.add("OrderDetails is mandatory");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		NewResultSearchListVo clone = new NewResultSearchListVo(this.id, this.version);
		
		if(this.repdatetime == null)
			clone.repdatetime = null;
		else
			clone.repdatetime = (ims.framework.utils.DateTime)this.repdatetime.clone();
		clone.reptimesupplied = this.reptimesupplied;
		if(this.allocateddateforreview == null)
			clone.allocateddateforreview = null;
		else
			clone.allocateddateforreview = (ims.framework.utils.DateTime)this.allocateddateforreview.clone();
		clone.patientsurname = this.patientsurname;
		clone.patientforename = this.patientforename;
		clone.patientidentifier = this.patientidentifier;
		clone.investigationname = this.investigationname;
		if(this.category == null)
			clone.category = null;
		else
			clone.category = (ims.ocrr.vo.lookups.Category)this.category.clone();
		if(this.resultstatus == null)
			clone.resultstatus = null;
		else
			clone.resultstatus = (ims.ocrr.vo.lookups.ResultStatus)this.resultstatus.clone();
		clone.abnormalresult = this.abnormalresult;
		if(this.ordinvresultstatus == null)
			clone.ordinvresultstatus = null;
		else
			clone.ordinvresultstatus = (ims.ocrr.vo.lookups.OrderInvStatus)this.ordinvresultstatus.clone();
		clone.discipline = this.discipline;
		clone.locationname = this.locationname;
		clone.clinicianname = this.clinicianname;
		if(this.investigationeventtype == null)
			clone.investigationeventtype = null;
		else
			clone.investigationeventtype = (ims.ocrr.vo.lookups.InvEventType)this.investigationeventtype.clone();
		clone.orderdetails = this.orderdetails;
		clone.service = this.service;
		if(this.securitylevel == null)
			clone.securitylevel = null;
		else
			clone.securitylevel = (ims.ocrr.vo.SecurityLevelConfigVo)this.securitylevel.clone();
		clone.ordinvresultstatusreason = this.ordinvresultstatusreason;
		clone.allocatedforreviewsurname = this.allocatedforreviewsurname;
		clone.allocatedforreviewforename = this.allocatedforreviewforename;
		if(this.ordinvstatuschangedatetime == null)
			clone.ordinvstatuschangedatetime = null;
		else
			clone.ordinvstatuschangedatetime = (ims.framework.utils.DateTime)this.ordinvstatuschangedatetime.clone();
		clone.colfilldatetimesupplied = this.colfilldatetimesupplied;
		clone.patient = this.patient;
		clone.specimen = this.specimen;
		clone.hospitalnumber = this.hospitalnumber;
		clone.nhsnumber = this.nhsnumber;
		if(this.resultsortdate == null)
			clone.resultsortdate = null;
		else
			clone.resultsortdate = (ims.framework.utils.DateTime)this.resultsortdate.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(NewResultSearchListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A NewResultSearchListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		NewResultSearchListVo compareObj = (NewResultSearchListVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getResultSortDate() == null && compareObj.getResultSortDate() != null)
				return -1;
			if(this.getResultSortDate() != null && compareObj.getResultSortDate() == null)
				return 1;
			if(this.getResultSortDate() != null && compareObj.getResultSortDate() != null)
				retVal = this.getResultSortDate().compareTo(compareObj.getResultSortDate());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.repdatetime != null)
			count++;
		if(this.reptimesupplied != null)
			count++;
		if(this.allocateddateforreview != null)
			count++;
		if(this.patientsurname != null)
			count++;
		if(this.patientforename != null)
			count++;
		if(this.patientidentifier != null)
			count++;
		if(this.investigationname != null)
			count++;
		if(this.category != null)
			count++;
		if(this.resultstatus != null)
			count++;
		if(this.abnormalresult != null)
			count++;
		if(this.ordinvresultstatus != null)
			count++;
		if(this.discipline != null)
			count++;
		if(this.locationname != null)
			count++;
		if(this.clinicianname != null)
			count++;
		if(this.investigationeventtype != null)
			count++;
		if(this.orderdetails != null)
			count++;
		if(this.service != null)
			count++;
		if(this.securitylevel != null)
			count++;
		if(this.ordinvresultstatusreason != null)
			count++;
		if(this.allocatedforreviewsurname != null)
			count++;
		if(this.allocatedforreviewforename != null)
			count++;
		if(this.ordinvstatuschangedatetime != null)
			count++;
		if(this.colfilldatetimesupplied != null)
			count++;
		if(this.patient != null)
			count++;
		if(this.specimen != null)
			count++;
		if(this.hospitalnumber != null)
			count++;
		if(this.nhsnumber != null)
			count++;
		if(this.resultsortdate != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 28;
	}
	protected ims.framework.utils.DateTime repdatetime;
	protected Boolean reptimesupplied;
	protected ims.framework.utils.DateTime allocateddateforreview;
	protected String patientsurname;
	protected String patientforename;
	protected String patientidentifier;
	protected String investigationname;
	protected ims.ocrr.vo.lookups.Category category;
	protected ims.ocrr.vo.lookups.ResultStatus resultstatus;
	protected Boolean abnormalresult;
	protected ims.ocrr.vo.lookups.OrderInvStatus ordinvresultstatus;
	protected String discipline;
	protected String locationname;
	protected String clinicianname;
	protected ims.ocrr.vo.lookups.InvEventType investigationeventtype;
	protected ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo orderdetails;
	protected ims.core.clinical.vo.ServiceRefVo service;
	protected ims.ocrr.vo.SecurityLevelConfigVo securitylevel;
	protected String ordinvresultstatusreason;
	protected String allocatedforreviewsurname;
	protected String allocatedforreviewforename;
	protected ims.framework.utils.DateTime ordinvstatuschangedatetime;
	protected Boolean colfilldatetimesupplied;
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.ocrr.orderingresults.vo.OrderSpecimenRefVoCollection specimen;
	protected String hospitalnumber;
	protected String nhsnumber;
	protected ims.framework.utils.DateTime resultsortdate;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
