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

package ims.core.vo;

/**
 * Linked to core.clinical.PatientProcedure business object (ID: 1003100017).
 */
public class PatientProcedureVo extends ims.core.vo.PatientProcedureShortVo implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IClinicalCodingValue
{
	private static final long serialVersionUID = 1L;

	public PatientProcedureVo()
	{
	}
	public PatientProcedureVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientProcedureVo(ims.core.vo.beans.PatientProcedureVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.procedure = bean.getProcedure() == null ? null : bean.getProcedure().buildVo();
		this.proceduredescription = bean.getProcedureDescription();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.infosource = bean.getInfoSource() == null ? null : ims.core.vo.lookups.SourceofInformation.buildLookup(bean.getInfoSource());
		this.carecontext = bean.getCareContext() == null ? null : bean.getCareContext().buildVo();
		this.procdate = bean.getProcDate() == null ? null : bean.getProcDate().buildPartialDate();
		this.includeindischargeletter = bean.getIncludeInDischargeLetter();
		this.sitetext = bean.getSiteText();
		this.proclaterality = bean.getProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getProcLaterality());
		this.procedurestatus = bean.getProcedureStatus() == null ? null : ims.core.vo.lookups.PatientProcedureStatus.buildLookup(bean.getProcedureStatus());
		this.proctime = bean.getProcTime() == null ? null : bean.getProcTime().buildTime();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : new ims.core.admin.vo.EpisodeOfCareRefVo(new Integer(bean.getEpisodeOfCare().getId()), bean.getEpisodeOfCare().getVersion());
		this.isprimary = bean.getIsPrimary();
		this.notes = bean.getNotes();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.procedureurgency = bean.getProcedureUrgency() == null ? null : ims.core.vo.lookups.ProcedureUrgency.buildLookup(bean.getProcedureUrgency());
		this.procedureoutcome = bean.getProcedureOutcome() == null ? null : ims.clinical.vo.lookups.PatientProcedureOutcome.buildLookup(bean.getProcedureOutcome());
		this.dateplanned = bean.getDatePlanned() == null ? null : bean.getDatePlanned().buildPartialDate();
		this.plannedproc = bean.getPlannedProc() == null ? null : new ims.core.clinical.vo.PatientProcedureRefVo(new Integer(bean.getPlannedProc().getId()), bean.getPlannedProc().getVersion());
		this.procsite = bean.getProcSite() == null ? null : ims.core.vo.lookups.MedicalHistoryProcedureSite.buildLookup(bean.getProcSite());
		// Interface field type not supported.
		this.procedureintent = bean.getProcedureIntent() == null ? null : ims.core.vo.lookups.ProcedureIntent.buildLookup(bean.getProcedureIntent());
		this.location = bean.getLocation();
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.confirmedstatus = bean.getConfirmedStatus() == null ? null : ims.core.vo.lookups.ConfirmedStatus.buildLookup(bean.getConfirmedStatus());
		this.confirmedby = bean.getConfirmedBy() == null ? null : bean.getConfirmedBy().buildVo();
		this.confirmeddatetime = bean.getConfirmedDateTime() == null ? null : bean.getConfirmedDateTime().buildDateTime();
		this.excludefromothers = bean.getExcludeFromOthers();
		this.hcppresent = ims.core.vo.HcpLiteVoCollection.buildFromBeanCollection(bean.getHCPPresent());
		this.inserteddevices = ims.core.vo.PatientCharacteristicVoCollection.buildFromBeanCollection(bean.getInsertedDevices());
		this.removeddevices = ims.core.vo.PatientCharacteristicVoCollection.buildFromBeanCollection(bean.getRemovedDevices());
		this.assocclinicalnote = bean.getAssocClinicalNote();
		this.proclocation = bean.getProcLocation() == null ? null : ims.core.vo.lookups.ProcedureLocation.buildLookup(bean.getProcLocation());
		this.clinicalcontact = bean.getClinicalContact() == null ? null : bean.getClinicalContact().buildVo();
		this.ispmh = bean.getIsPMH();
		this.cancelleddate = bean.getCancelledDate() == null ? null : bean.getCancelledDate().buildDate();
		this.cancelledreason = bean.getCancelledReason();
		this.surgeonsgrade = bean.getSurgeonsGrade() == null ? null : ims.core.vo.lookups.MedicGrade.buildLookup(bean.getSurgeonsGrade());
		this.procenddate = bean.getProcEndDate() == null ? null : bean.getProcEndDate().buildPartialDate();
		this.procendtime = bean.getProcEndTime() == null ? null : bean.getProcEndTime().buildTime();
		this.signifproc = bean.getSignifProc();
		this.intraoperativerecord = bean.getIntraOperativeRecord() == null ? null : bean.getIntraOperativeRecord().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PatientProcedureVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.procedure = bean.getProcedure() == null ? null : bean.getProcedure().buildVo(map);
		this.proceduredescription = bean.getProcedureDescription();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.infosource = bean.getInfoSource() == null ? null : ims.core.vo.lookups.SourceofInformation.buildLookup(bean.getInfoSource());
		this.carecontext = bean.getCareContext() == null ? null : bean.getCareContext().buildVo(map);
		this.procdate = bean.getProcDate() == null ? null : bean.getProcDate().buildPartialDate();
		this.includeindischargeletter = bean.getIncludeInDischargeLetter();
		this.sitetext = bean.getSiteText();
		this.proclaterality = bean.getProcLaterality() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getProcLaterality());
		this.procedurestatus = bean.getProcedureStatus() == null ? null : ims.core.vo.lookups.PatientProcedureStatus.buildLookup(bean.getProcedureStatus());
		this.proctime = bean.getProcTime() == null ? null : bean.getProcTime().buildTime();
		this.episodeofcare = bean.getEpisodeOfCare() == null ? null : new ims.core.admin.vo.EpisodeOfCareRefVo(new Integer(bean.getEpisodeOfCare().getId()), bean.getEpisodeOfCare().getVersion());
		this.isprimary = bean.getIsPrimary();
		this.notes = bean.getNotes();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.procedureurgency = bean.getProcedureUrgency() == null ? null : ims.core.vo.lookups.ProcedureUrgency.buildLookup(bean.getProcedureUrgency());
		this.procedureoutcome = bean.getProcedureOutcome() == null ? null : ims.clinical.vo.lookups.PatientProcedureOutcome.buildLookup(bean.getProcedureOutcome());
		this.dateplanned = bean.getDatePlanned() == null ? null : bean.getDatePlanned().buildPartialDate();
		this.plannedproc = bean.getPlannedProc() == null ? null : new ims.core.clinical.vo.PatientProcedureRefVo(new Integer(bean.getPlannedProc().getId()), bean.getPlannedProc().getVersion());
		this.procsite = bean.getProcSite() == null ? null : ims.core.vo.lookups.MedicalHistoryProcedureSite.buildLookup(bean.getProcSite());
		// Interface field type not supported.
		this.procedureintent = bean.getProcedureIntent() == null ? null : ims.core.vo.lookups.ProcedureIntent.buildLookup(bean.getProcedureIntent());
		this.location = bean.getLocation();
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.confirmedstatus = bean.getConfirmedStatus() == null ? null : ims.core.vo.lookups.ConfirmedStatus.buildLookup(bean.getConfirmedStatus());
		this.confirmedby = bean.getConfirmedBy() == null ? null : bean.getConfirmedBy().buildVo(map);
		this.confirmeddatetime = bean.getConfirmedDateTime() == null ? null : bean.getConfirmedDateTime().buildDateTime();
		this.excludefromothers = bean.getExcludeFromOthers();
		this.hcppresent = ims.core.vo.HcpLiteVoCollection.buildFromBeanCollection(bean.getHCPPresent());
		this.inserteddevices = ims.core.vo.PatientCharacteristicVoCollection.buildFromBeanCollection(bean.getInsertedDevices());
		this.removeddevices = ims.core.vo.PatientCharacteristicVoCollection.buildFromBeanCollection(bean.getRemovedDevices());
		this.assocclinicalnote = bean.getAssocClinicalNote();
		this.proclocation = bean.getProcLocation() == null ? null : ims.core.vo.lookups.ProcedureLocation.buildLookup(bean.getProcLocation());
		this.clinicalcontact = bean.getClinicalContact() == null ? null : bean.getClinicalContact().buildVo(map);
		this.ispmh = bean.getIsPMH();
		this.cancelleddate = bean.getCancelledDate() == null ? null : bean.getCancelledDate().buildDate();
		this.cancelledreason = bean.getCancelledReason();
		this.surgeonsgrade = bean.getSurgeonsGrade() == null ? null : ims.core.vo.lookups.MedicGrade.buildLookup(bean.getSurgeonsGrade());
		this.procenddate = bean.getProcEndDate() == null ? null : bean.getProcEndDate().buildPartialDate();
		this.procendtime = bean.getProcEndTime() == null ? null : bean.getProcEndTime().buildTime();
		this.signifproc = bean.getSignifProc();
		this.intraoperativerecord = bean.getIntraOperativeRecord() == null ? null : bean.getIntraOperativeRecord().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PatientProcedureVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PatientProcedureVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PatientProcedureVoBean();
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
		if(fieldName.equals("LOCATION"))
			return getLocation();
		if(fieldName.equals("SPECIALTY"))
			return getSpecialty();
		if(fieldName.equals("CONFIRMEDSTATUS"))
			return getConfirmedStatus();
		if(fieldName.equals("CONFIRMEDBY"))
			return getConfirmedBy();
		if(fieldName.equals("CONFIRMEDDATETIME"))
			return getConfirmedDateTime();
		if(fieldName.equals("EXCLUDEFROMOTHERS"))
			return getExcludeFromOthers();
		if(fieldName.equals("HCPPRESENT"))
			return getHCPPresent();
		if(fieldName.equals("INSERTEDDEVICES"))
			return getInsertedDevices();
		if(fieldName.equals("REMOVEDDEVICES"))
			return getRemovedDevices();
		if(fieldName.equals("ASSOCCLINICALNOTE"))
			return getAssocClinicalNote();
		if(fieldName.equals("PROCLOCATION"))
			return getProcLocation();
		if(fieldName.equals("CLINICALCONTACT"))
			return getClinicalContact();
		if(fieldName.equals("ISPMH"))
			return getIsPMH();
		if(fieldName.equals("CANCELLEDDATE"))
			return getCancelledDate();
		if(fieldName.equals("CANCELLEDREASON"))
			return getCancelledReason();
		if(fieldName.equals("SURGEONSGRADE"))
			return getSurgeonsGrade();
		if(fieldName.equals("PROCENDDATE"))
			return getProcEndDate();
		if(fieldName.equals("PROCENDTIME"))
			return getProcEndTime();
		if(fieldName.equals("SIGNIFPROC"))
			return getSignifProc();
		if(fieldName.equals("INTRAOPERATIVERECORD"))
			return getIntraOperativeRecord();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getLocationIsNotNull()
	{
		return this.location != null;
	}
	public String getLocation()
	{
		return this.location;
	}
	public static int getLocationMaxLength()
	{
		return 255;
	}
	public void setLocation(String value)
	{
		this.isValidated = false;
		this.location = value;
	}
	public boolean getSpecialtyIsNotNull()
	{
		return this.specialty != null;
	}
	public ims.core.vo.lookups.Specialty getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.core.vo.lookups.Specialty value)
	{
		this.isValidated = false;
		this.specialty = value;
	}
	public boolean getConfirmedStatusIsNotNull()
	{
		return this.confirmedstatus != null;
	}
	public ims.core.vo.lookups.ConfirmedStatus getConfirmedStatus()
	{
		return this.confirmedstatus;
	}
	public void setConfirmedStatus(ims.core.vo.lookups.ConfirmedStatus value)
	{
		this.isValidated = false;
		this.confirmedstatus = value;
	}
	public boolean getConfirmedByIsNotNull()
	{
		return this.confirmedby != null;
	}
	public ims.core.vo.Hcp getConfirmedBy()
	{
		return this.confirmedby;
	}
	public void setConfirmedBy(ims.core.vo.Hcp value)
	{
		this.isValidated = false;
		this.confirmedby = value;
	}
	public boolean getConfirmedDateTimeIsNotNull()
	{
		return this.confirmeddatetime != null;
	}
	public ims.framework.utils.DateTime getConfirmedDateTime()
	{
		return this.confirmeddatetime;
	}
	public void setConfirmedDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.confirmeddatetime = value;
	}
	public boolean getExcludeFromOthersIsNotNull()
	{
		return this.excludefromothers != null;
	}
	public Boolean getExcludeFromOthers()
	{
		return this.excludefromothers;
	}
	public void setExcludeFromOthers(Boolean value)
	{
		this.isValidated = false;
		this.excludefromothers = value;
	}
	public boolean getHCPPresentIsNotNull()
	{
		return this.hcppresent != null;
	}
	public ims.core.vo.HcpLiteVoCollection getHCPPresent()
	{
		return this.hcppresent;
	}
	public void setHCPPresent(ims.core.vo.HcpLiteVoCollection value)
	{
		this.isValidated = false;
		this.hcppresent = value;
	}
	public boolean getInsertedDevicesIsNotNull()
	{
		return this.inserteddevices != null;
	}
	public ims.core.vo.PatientCharacteristicVoCollection getInsertedDevices()
	{
		return this.inserteddevices;
	}
	public void setInsertedDevices(ims.core.vo.PatientCharacteristicVoCollection value)
	{
		this.isValidated = false;
		this.inserteddevices = value;
	}
	public boolean getRemovedDevicesIsNotNull()
	{
		return this.removeddevices != null;
	}
	public ims.core.vo.PatientCharacteristicVoCollection getRemovedDevices()
	{
		return this.removeddevices;
	}
	public void setRemovedDevices(ims.core.vo.PatientCharacteristicVoCollection value)
	{
		this.isValidated = false;
		this.removeddevices = value;
	}
	public boolean getAssocClinicalNoteIsNotNull()
	{
		return this.assocclinicalnote != null;
	}
	public String getAssocClinicalNote()
	{
		return this.assocclinicalnote;
	}
	public static int getAssocClinicalNoteMaxLength()
	{
		return 255;
	}
	public void setAssocClinicalNote(String value)
	{
		this.isValidated = false;
		this.assocclinicalnote = value;
	}
	public boolean getProcLocationIsNotNull()
	{
		return this.proclocation != null;
	}
	public ims.core.vo.lookups.ProcedureLocation getProcLocation()
	{
		return this.proclocation;
	}
	public void setProcLocation(ims.core.vo.lookups.ProcedureLocation value)
	{
		this.isValidated = false;
		this.proclocation = value;
	}
	public boolean getClinicalContactIsNotNull()
	{
		return this.clinicalcontact != null;
	}
	public ims.core.vo.ClinicalContactShortVo getClinicalContact()
	{
		return this.clinicalcontact;
	}
	public void setClinicalContact(ims.core.vo.ClinicalContactShortVo value)
	{
		this.isValidated = false;
		this.clinicalcontact = value;
	}
	public boolean getIsPMHIsNotNull()
	{
		return this.ispmh != null;
	}
	public Boolean getIsPMH()
	{
		return this.ispmh;
	}
	public void setIsPMH(Boolean value)
	{
		this.isValidated = false;
		this.ispmh = value;
	}
	public boolean getCancelledDateIsNotNull()
	{
		return this.cancelleddate != null;
	}
	public ims.framework.utils.Date getCancelledDate()
	{
		return this.cancelleddate;
	}
	public void setCancelledDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.cancelleddate = value;
	}
	public boolean getCancelledReasonIsNotNull()
	{
		return this.cancelledreason != null;
	}
	public String getCancelledReason()
	{
		return this.cancelledreason;
	}
	public static int getCancelledReasonMaxLength()
	{
		return 255;
	}
	public void setCancelledReason(String value)
	{
		this.isValidated = false;
		this.cancelledreason = value;
	}
	public boolean getSurgeonsGradeIsNotNull()
	{
		return this.surgeonsgrade != null;
	}
	public ims.core.vo.lookups.MedicGrade getSurgeonsGrade()
	{
		return this.surgeonsgrade;
	}
	public void setSurgeonsGrade(ims.core.vo.lookups.MedicGrade value)
	{
		this.isValidated = false;
		this.surgeonsgrade = value;
	}
	public boolean getProcEndDateIsNotNull()
	{
		return this.procenddate != null;
	}
	public ims.framework.utils.PartialDate getProcEndDate()
	{
		return this.procenddate;
	}
	public void setProcEndDate(ims.framework.utils.PartialDate value)
	{
		this.isValidated = false;
		this.procenddate = value;
	}
	public boolean getProcEndTimeIsNotNull()
	{
		return this.procendtime != null;
	}
	public ims.framework.utils.Time getProcEndTime()
	{
		return this.procendtime;
	}
	public void setProcEndTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.procendtime = value;
	}
	public boolean getSignifProcIsNotNull()
	{
		return this.signifproc != null;
	}
	public Boolean getSignifProc()
	{
		return this.signifproc;
	}
	public void setSignifProc(Boolean value)
	{
		this.isValidated = false;
		this.signifproc = value;
	}
	public boolean getIntraOperativeRecordIsNotNull()
	{
		return this.intraoperativerecord != null;
	}
	public ims.clinical.vo.IntraOperativeCareRecordMinVo getIntraOperativeRecord()
	{
		return this.intraoperativerecord;
	}
	public void setIntraOperativeRecord(ims.clinical.vo.IntraOperativeCareRecordMinVo value)
	{
		this.isValidated = false;
		this.intraoperativerecord = value;
	}
	/**
	* IClinicalCoding methods
	*/
	public ims.vo.ValueObject getIClinicalCodingValue() 
	{
		return this.procedure;
	}
	public void setIClinicalCodingValue(ims.vo.ValueObject vo) 
	{
		this.procedure = (ims.core.vo.ProcedureLiteVo)vo;
	}
	public String getIClinicalCodingValueDescription() 
	{
		return this.proceduredescription;
	}
	public void setIClinicalCodingValueDescription(String value) 
	{
		this.proceduredescription = value;
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
		if(this.procedure != null)
		{
			if(!this.procedure.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.confirmedby != null)
		{
			if(!this.confirmedby.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.hcppresent != null)
		{
			if(!this.hcppresent.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.inserteddevices != null)
		{
			if(!this.inserteddevices.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.removeddevices != null)
		{
			if(!this.removeddevices.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.procedure != null)
		{
			String[] listOfOtherErrors = this.procedure.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.proceduredescription == null || this.proceduredescription.length() == 0)
			listOfErrors.add("Procedure Description is mandatory");
		else if(this.proceduredescription.length() > 255)
			listOfErrors.add("The length of the field [proceduredescription] in the value object [ims.core.vo.PatientProcedureVo] is too big. It should be less or equal to 255");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.infosource == null)
			listOfErrors.add("InfoSource is mandatory");
		if(this.sitetext != null)
			if(this.sitetext.length() > 255)
				listOfErrors.add("The length of the field [sitetext] in the value object [ims.core.vo.PatientProcedureVo] is too big. It should be less or equal to 255");
		if(this.episodeofcare == null)
			listOfErrors.add("EpisodeOfCare is mandatory");
		if(this.notes != null)
			if(this.notes.length() > 500)
				listOfErrors.add("The length of the field [notes] in the value object [ims.core.vo.PatientProcedureVo] is too big. It should be less or equal to 500");
		if(this.location != null)
			if(this.location.length() > 255)
				listOfErrors.add("The length of the field [location] in the value object [ims.core.vo.PatientProcedureVo] is too big. It should be less or equal to 255");
		if(this.confirmedby != null)
		{
			String[] listOfOtherErrors = this.confirmedby.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.hcppresent != null)
		{
			String[] listOfOtherErrors = this.hcppresent.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.inserteddevices != null)
		{
			String[] listOfOtherErrors = this.inserteddevices.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.removeddevices != null)
		{
			String[] listOfOtherErrors = this.removeddevices.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.cancelledreason != null)
			if(this.cancelledreason.length() > 255)
				listOfErrors.add("The length of the field [cancelledreason] in the value object [ims.core.vo.PatientProcedureVo] is too big. It should be less or equal to 255");
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
	
		PatientProcedureVo clone = new PatientProcedureVo(this.id, this.version);
		
		if(this.procedure == null)
			clone.procedure = null;
		else
			clone.procedure = (ims.core.vo.ProcedureLiteVo)this.procedure.clone();
		clone.proceduredescription = this.proceduredescription;
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.infosource == null)
			clone.infosource = null;
		else
			clone.infosource = (ims.core.vo.lookups.SourceofInformation)this.infosource.clone();
		if(this.carecontext == null)
			clone.carecontext = null;
		else
			clone.carecontext = (ims.core.vo.CareContextLiteVo)this.carecontext.clone();
		if(this.procdate == null)
			clone.procdate = null;
		else
			clone.procdate = (ims.framework.utils.PartialDate)this.procdate.clone();
		clone.includeindischargeletter = this.includeindischargeletter;
		clone.sitetext = this.sitetext;
		if(this.proclaterality == null)
			clone.proclaterality = null;
		else
			clone.proclaterality = (ims.core.vo.lookups.LateralityLRB)this.proclaterality.clone();
		if(this.procedurestatus == null)
			clone.procedurestatus = null;
		else
			clone.procedurestatus = (ims.core.vo.lookups.PatientProcedureStatus)this.procedurestatus.clone();
		if(this.proctime == null)
			clone.proctime = null;
		else
			clone.proctime = (ims.framework.utils.Time)this.proctime.clone();
		clone.episodeofcare = this.episodeofcare;
		clone.isprimary = this.isprimary;
		clone.notes = this.notes;
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		if(this.procedureurgency == null)
			clone.procedureurgency = null;
		else
			clone.procedureurgency = (ims.core.vo.lookups.ProcedureUrgency)this.procedureurgency.clone();
		if(this.procedureoutcome == null)
			clone.procedureoutcome = null;
		else
			clone.procedureoutcome = (ims.clinical.vo.lookups.PatientProcedureOutcome)this.procedureoutcome.clone();
		if(this.dateplanned == null)
			clone.dateplanned = null;
		else
			clone.dateplanned = (ims.framework.utils.PartialDate)this.dateplanned.clone();
		clone.plannedproc = this.plannedproc;
		if(this.procsite == null)
			clone.procsite = null;
		else
			clone.procsite = (ims.core.vo.lookups.MedicalHistoryProcedureSite)this.procsite.clone();
		clone.peformedby = this.peformedby;
		if(this.procedureintent == null)
			clone.procedureintent = null;
		else
			clone.procedureintent = (ims.core.vo.lookups.ProcedureIntent)this.procedureintent.clone();
		clone.location = this.location;
		if(this.specialty == null)
			clone.specialty = null;
		else
			clone.specialty = (ims.core.vo.lookups.Specialty)this.specialty.clone();
		if(this.confirmedstatus == null)
			clone.confirmedstatus = null;
		else
			clone.confirmedstatus = (ims.core.vo.lookups.ConfirmedStatus)this.confirmedstatus.clone();
		if(this.confirmedby == null)
			clone.confirmedby = null;
		else
			clone.confirmedby = (ims.core.vo.Hcp)this.confirmedby.clone();
		if(this.confirmeddatetime == null)
			clone.confirmeddatetime = null;
		else
			clone.confirmeddatetime = (ims.framework.utils.DateTime)this.confirmeddatetime.clone();
		clone.excludefromothers = this.excludefromothers;
		if(this.hcppresent == null)
			clone.hcppresent = null;
		else
			clone.hcppresent = (ims.core.vo.HcpLiteVoCollection)this.hcppresent.clone();
		if(this.inserteddevices == null)
			clone.inserteddevices = null;
		else
			clone.inserteddevices = (ims.core.vo.PatientCharacteristicVoCollection)this.inserteddevices.clone();
		if(this.removeddevices == null)
			clone.removeddevices = null;
		else
			clone.removeddevices = (ims.core.vo.PatientCharacteristicVoCollection)this.removeddevices.clone();
		clone.assocclinicalnote = this.assocclinicalnote;
		if(this.proclocation == null)
			clone.proclocation = null;
		else
			clone.proclocation = (ims.core.vo.lookups.ProcedureLocation)this.proclocation.clone();
		if(this.clinicalcontact == null)
			clone.clinicalcontact = null;
		else
			clone.clinicalcontact = (ims.core.vo.ClinicalContactShortVo)this.clinicalcontact.clone();
		clone.ispmh = this.ispmh;
		if(this.cancelleddate == null)
			clone.cancelleddate = null;
		else
			clone.cancelleddate = (ims.framework.utils.Date)this.cancelleddate.clone();
		clone.cancelledreason = this.cancelledreason;
		if(this.surgeonsgrade == null)
			clone.surgeonsgrade = null;
		else
			clone.surgeonsgrade = (ims.core.vo.lookups.MedicGrade)this.surgeonsgrade.clone();
		if(this.procenddate == null)
			clone.procenddate = null;
		else
			clone.procenddate = (ims.framework.utils.PartialDate)this.procenddate.clone();
		if(this.procendtime == null)
			clone.procendtime = null;
		else
			clone.procendtime = (ims.framework.utils.Time)this.procendtime.clone();
		clone.signifproc = this.signifproc;
		if(this.intraoperativerecord == null)
			clone.intraoperativerecord = null;
		else
			clone.intraoperativerecord = (ims.clinical.vo.IntraOperativeCareRecordMinVo)this.intraoperativerecord.clone();
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
		if (!(PatientProcedureVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientProcedureVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PatientProcedureVo compareObj = (PatientProcedureVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSysInfo() == null && compareObj.getSysInfo() != null)
				return -1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() == null)
				return 1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() != null)
				retVal = this.getSysInfo().compareTo(compareObj.getSysInfo());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.location != null)
			count++;
		if(this.specialty != null)
			count++;
		if(this.confirmedstatus != null)
			count++;
		if(this.confirmedby != null)
			count++;
		if(this.confirmeddatetime != null)
			count++;
		if(this.excludefromothers != null)
			count++;
		if(this.hcppresent != null)
			count++;
		if(this.inserteddevices != null)
			count++;
		if(this.removeddevices != null)
			count++;
		if(this.assocclinicalnote != null)
			count++;
		if(this.proclocation != null)
			count++;
		if(this.clinicalcontact != null)
			count++;
		if(this.ispmh != null)
			count++;
		if(this.cancelleddate != null)
			count++;
		if(this.cancelledreason != null)
			count++;
		if(this.surgeonsgrade != null)
			count++;
		if(this.procenddate != null)
			count++;
		if(this.procendtime != null)
			count++;
		if(this.signifproc != null)
			count++;
		if(this.intraoperativerecord != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 20;
	}
	protected String location;
	protected ims.core.vo.lookups.Specialty specialty;
	protected ims.core.vo.lookups.ConfirmedStatus confirmedstatus;
	protected ims.core.vo.Hcp confirmedby;
	protected ims.framework.utils.DateTime confirmeddatetime;
	protected Boolean excludefromothers;
	protected ims.core.vo.HcpLiteVoCollection hcppresent;
	protected ims.core.vo.PatientCharacteristicVoCollection inserteddevices;
	protected ims.core.vo.PatientCharacteristicVoCollection removeddevices;
	protected String assocclinicalnote;
	protected ims.core.vo.lookups.ProcedureLocation proclocation;
	protected ims.core.vo.ClinicalContactShortVo clinicalcontact;
	protected Boolean ispmh;
	protected ims.framework.utils.Date cancelleddate;
	protected String cancelledreason;
	protected ims.core.vo.lookups.MedicGrade surgeonsgrade;
	protected ims.framework.utils.PartialDate procenddate;
	protected ims.framework.utils.Time procendtime;
	protected Boolean signifproc;
	protected ims.clinical.vo.IntraOperativeCareRecordMinVo intraoperativerecord;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
