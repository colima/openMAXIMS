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

package ims.emergency.vo;

/**
 * Linked to emergency.EDPartialAdmission business object (ID: 1086100043).
 */
public class EDPartialAdmissionVo extends ims.emergency.vo.EDPartialAdmissionRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EDPartialAdmissionVo()
	{
	}
	public EDPartialAdmissionVo(Integer id, int version)
	{
		super(id, version);
	}
	public EDPartialAdmissionVo(ims.emergency.vo.beans.EDPartialAdmissionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.decisiontoadmitdatetime = bean.getDecisionToAdmitDateTime() == null ? null : bean.getDecisionToAdmitDateTime().buildDateTime();
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.allocateddatetime = bean.getAllocatedDateTime() == null ? null : bean.getAllocatedDateTime().buildDateTime();
		this.allocatedbedtype = bean.getAllocatedBedType() == null ? null : ims.emergency.vo.lookups.AllocatedBedType.buildLookup(bean.getAllocatedBedType());
		this.allocatedbednote = bean.getAllocatedBedNote();
		this.allocatedward = bean.getAllocatedWard() == null ? null : bean.getAllocatedWard().buildVo();
		this.allocatedstatus = bean.getAllocatedStatus() == null ? null : ims.emergency.vo.lookups.AllocationStatus.buildLookup(bean.getAllocatedStatus());
		this.admissiondatetime = bean.getAdmissionDateTime() == null ? null : bean.getAdmissionDateTime().buildDateTime();
		this.admissionward = bean.getAdmissionWard() == null ? null : bean.getAdmissionWard().buildVo();
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo();
		this.admittingconsultant = bean.getAdmittingConsultant() == null ? null : bean.getAdmittingConsultant().buildVo();
		this.accomodationrequestedtype = bean.getAccomodationRequestedType() == null ? null : ims.core.vo.lookups.AccomodationRequestedType.buildLookup(bean.getAccomodationRequestedType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.EDPartialAdmissionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.decisiontoadmitdatetime = bean.getDecisionToAdmitDateTime() == null ? null : bean.getDecisionToAdmitDateTime().buildDateTime();
		this.specialty = bean.getSpecialty() == null ? null : ims.core.vo.lookups.Specialty.buildLookup(bean.getSpecialty());
		this.allocateddatetime = bean.getAllocatedDateTime() == null ? null : bean.getAllocatedDateTime().buildDateTime();
		this.allocatedbedtype = bean.getAllocatedBedType() == null ? null : ims.emergency.vo.lookups.AllocatedBedType.buildLookup(bean.getAllocatedBedType());
		this.allocatedbednote = bean.getAllocatedBedNote();
		this.allocatedward = bean.getAllocatedWard() == null ? null : bean.getAllocatedWard().buildVo(map);
		this.allocatedstatus = bean.getAllocatedStatus() == null ? null : ims.emergency.vo.lookups.AllocationStatus.buildLookup(bean.getAllocatedStatus());
		this.admissiondatetime = bean.getAdmissionDateTime() == null ? null : bean.getAdmissionDateTime().buildDateTime();
		this.admissionward = bean.getAdmissionWard() == null ? null : bean.getAdmissionWard().buildVo(map);
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo(map);
		this.admittingconsultant = bean.getAdmittingConsultant() == null ? null : bean.getAdmittingConsultant().buildVo(map);
		this.accomodationrequestedtype = bean.getAccomodationRequestedType() == null ? null : ims.core.vo.lookups.AccomodationRequestedType.buildLookup(bean.getAccomodationRequestedType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.EDPartialAdmissionVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.EDPartialAdmissionVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.EDPartialAdmissionVoBean();
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
		if(fieldName.equals("DECISIONTOADMITDATETIME"))
			return getDecisionToAdmitDateTime();
		if(fieldName.equals("SPECIALTY"))
			return getSpecialty();
		if(fieldName.equals("ALLOCATEDDATETIME"))
			return getAllocatedDateTime();
		if(fieldName.equals("ALLOCATEDBEDTYPE"))
			return getAllocatedBedType();
		if(fieldName.equals("ALLOCATEDBEDNOTE"))
			return getAllocatedBedNote();
		if(fieldName.equals("ALLOCATEDWARD"))
			return getAllocatedWard();
		if(fieldName.equals("ALLOCATEDSTATUS"))
			return getAllocatedStatus();
		if(fieldName.equals("ADMISSIONDATETIME"))
			return getAdmissionDateTime();
		if(fieldName.equals("ADMISSIONWARD"))
			return getAdmissionWard();
		if(fieldName.equals("AUTHORINGINFO"))
			return getAuthoringInfo();
		if(fieldName.equals("ADMITTINGCONSULTANT"))
			return getAdmittingConsultant();
		if(fieldName.equals("ACCOMODATIONREQUESTEDTYPE"))
			return getAccomodationRequestedType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDecisionToAdmitDateTimeIsNotNull()
	{
		return this.decisiontoadmitdatetime != null;
	}
	public ims.framework.utils.DateTime getDecisionToAdmitDateTime()
	{
		return this.decisiontoadmitdatetime;
	}
	public void setDecisionToAdmitDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.decisiontoadmitdatetime = value;
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
	public boolean getAllocatedDateTimeIsNotNull()
	{
		return this.allocateddatetime != null;
	}
	public ims.framework.utils.DateTime getAllocatedDateTime()
	{
		return this.allocateddatetime;
	}
	public void setAllocatedDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.allocateddatetime = value;
	}
	public boolean getAllocatedBedTypeIsNotNull()
	{
		return this.allocatedbedtype != null;
	}
	public ims.emergency.vo.lookups.AllocatedBedType getAllocatedBedType()
	{
		return this.allocatedbedtype;
	}
	public void setAllocatedBedType(ims.emergency.vo.lookups.AllocatedBedType value)
	{
		this.isValidated = false;
		this.allocatedbedtype = value;
	}
	public boolean getAllocatedBedNoteIsNotNull()
	{
		return this.allocatedbednote != null;
	}
	public String getAllocatedBedNote()
	{
		return this.allocatedbednote;
	}
	public static int getAllocatedBedNoteMaxLength()
	{
		return 1000;
	}
	public void setAllocatedBedNote(String value)
	{
		this.isValidated = false;
		this.allocatedbednote = value;
	}
	public boolean getAllocatedWardIsNotNull()
	{
		return this.allocatedward != null;
	}
	public ims.core.vo.LocationLiteVo getAllocatedWard()
	{
		return this.allocatedward;
	}
	public void setAllocatedWard(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.allocatedward = value;
	}
	public boolean getAllocatedStatusIsNotNull()
	{
		return this.allocatedstatus != null;
	}
	public ims.emergency.vo.lookups.AllocationStatus getAllocatedStatus()
	{
		return this.allocatedstatus;
	}
	public void setAllocatedStatus(ims.emergency.vo.lookups.AllocationStatus value)
	{
		this.isValidated = false;
		this.allocatedstatus = value;
	}
	public boolean getAdmissionDateTimeIsNotNull()
	{
		return this.admissiondatetime != null;
	}
	public ims.framework.utils.DateTime getAdmissionDateTime()
	{
		return this.admissiondatetime;
	}
	public void setAdmissionDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.admissiondatetime = value;
	}
	public boolean getAdmissionWardIsNotNull()
	{
		return this.admissionward != null;
	}
	public ims.core.vo.LocationLiteVo getAdmissionWard()
	{
		return this.admissionward;
	}
	public void setAdmissionWard(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.admissionward = value;
	}
	public boolean getAuthoringInfoIsNotNull()
	{
		return this.authoringinfo != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInfo()
	{
		return this.authoringinfo;
	}
	public void setAuthoringInfo(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinfo = value;
	}
	public boolean getAdmittingConsultantIsNotNull()
	{
		return this.admittingconsultant != null;
	}
	public ims.core.vo.HcpLiteVo getAdmittingConsultant()
	{
		return this.admittingconsultant;
	}
	public void setAdmittingConsultant(ims.core.vo.HcpLiteVo value)
	{
		this.isValidated = false;
		this.admittingconsultant = value;
	}
	public boolean getAccomodationRequestedTypeIsNotNull()
	{
		return this.accomodationrequestedtype != null;
	}
	public ims.core.vo.lookups.AccomodationRequestedType getAccomodationRequestedType()
	{
		return this.accomodationrequestedtype;
	}
	public void setAccomodationRequestedType(ims.core.vo.lookups.AccomodationRequestedType value)
	{
		this.isValidated = false;
		this.accomodationrequestedtype = value;
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
		if(this.authoringinfo != null)
		{
			if(!this.authoringinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.admittingconsultant != null)
		{
			if(!this.admittingconsultant.isValidated())
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
		if(this.decisiontoadmitdatetime == null)
			listOfErrors.add("DecisionToAdmitDateTime is mandatory");
		if(this.specialty == null)
			listOfErrors.add("Specialty is mandatory");
		if(this.allocatedbednote != null)
			if(this.allocatedbednote.length() > 1000)
				listOfErrors.add("The length of the field [allocatedbednote] in the value object [ims.emergency.vo.EDPartialAdmissionVo] is too big. It should be less or equal to 1000");
		if(this.authoringinfo != null)
		{
			String[] listOfOtherErrors = this.authoringinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.admittingconsultant == null)
			listOfErrors.add("AdmittingConsultant is mandatory");
		if(this.admittingconsultant != null)
		{
			String[] listOfOtherErrors = this.admittingconsultant.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
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
	
		EDPartialAdmissionVo clone = new EDPartialAdmissionVo(this.id, this.version);
		
		if(this.decisiontoadmitdatetime == null)
			clone.decisiontoadmitdatetime = null;
		else
			clone.decisiontoadmitdatetime = (ims.framework.utils.DateTime)this.decisiontoadmitdatetime.clone();
		if(this.specialty == null)
			clone.specialty = null;
		else
			clone.specialty = (ims.core.vo.lookups.Specialty)this.specialty.clone();
		if(this.allocateddatetime == null)
			clone.allocateddatetime = null;
		else
			clone.allocateddatetime = (ims.framework.utils.DateTime)this.allocateddatetime.clone();
		if(this.allocatedbedtype == null)
			clone.allocatedbedtype = null;
		else
			clone.allocatedbedtype = (ims.emergency.vo.lookups.AllocatedBedType)this.allocatedbedtype.clone();
		clone.allocatedbednote = this.allocatedbednote;
		if(this.allocatedward == null)
			clone.allocatedward = null;
		else
			clone.allocatedward = (ims.core.vo.LocationLiteVo)this.allocatedward.clone();
		if(this.allocatedstatus == null)
			clone.allocatedstatus = null;
		else
			clone.allocatedstatus = (ims.emergency.vo.lookups.AllocationStatus)this.allocatedstatus.clone();
		if(this.admissiondatetime == null)
			clone.admissiondatetime = null;
		else
			clone.admissiondatetime = (ims.framework.utils.DateTime)this.admissiondatetime.clone();
		if(this.admissionward == null)
			clone.admissionward = null;
		else
			clone.admissionward = (ims.core.vo.LocationLiteVo)this.admissionward.clone();
		if(this.authoringinfo == null)
			clone.authoringinfo = null;
		else
			clone.authoringinfo = (ims.core.vo.AuthoringInformationVo)this.authoringinfo.clone();
		if(this.admittingconsultant == null)
			clone.admittingconsultant = null;
		else
			clone.admittingconsultant = (ims.core.vo.HcpLiteVo)this.admittingconsultant.clone();
		if(this.accomodationrequestedtype == null)
			clone.accomodationrequestedtype = null;
		else
			clone.accomodationrequestedtype = (ims.core.vo.lookups.AccomodationRequestedType)this.accomodationrequestedtype.clone();
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
		if (!(EDPartialAdmissionVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EDPartialAdmissionVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((EDPartialAdmissionVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((EDPartialAdmissionVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.decisiontoadmitdatetime != null)
			count++;
		if(this.specialty != null)
			count++;
		if(this.allocateddatetime != null)
			count++;
		if(this.allocatedbedtype != null)
			count++;
		if(this.allocatedbednote != null)
			count++;
		if(this.allocatedward != null)
			count++;
		if(this.allocatedstatus != null)
			count++;
		if(this.admissiondatetime != null)
			count++;
		if(this.admissionward != null)
			count++;
		if(this.authoringinfo != null)
			count++;
		if(this.admittingconsultant != null)
			count++;
		if(this.accomodationrequestedtype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected ims.framework.utils.DateTime decisiontoadmitdatetime;
	protected ims.core.vo.lookups.Specialty specialty;
	protected ims.framework.utils.DateTime allocateddatetime;
	protected ims.emergency.vo.lookups.AllocatedBedType allocatedbedtype;
	protected String allocatedbednote;
	protected ims.core.vo.LocationLiteVo allocatedward;
	protected ims.emergency.vo.lookups.AllocationStatus allocatedstatus;
	protected ims.framework.utils.DateTime admissiondatetime;
	protected ims.core.vo.LocationLiteVo admissionward;
	protected ims.core.vo.AuthoringInformationVo authoringinfo;
	protected ims.core.vo.HcpLiteVo admittingconsultant;
	protected ims.core.vo.lookups.AccomodationRequestedType accomodationrequestedtype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
