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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.scheduling.vo;

/**
 * Linked to Scheduling.Booking_Appointment business object (ID: 1055100007).
 */
public class Booking_AppointmentTransportVo extends ims.scheduling.vo.Booking_AppointmentRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public Booking_AppointmentTransportVo()
	{
	}
	public Booking_AppointmentTransportVo(Integer id, int version)
	{
		super(id, version);
	}
	public Booking_AppointmentTransportVo(ims.scheduling.vo.beans.Booking_AppointmentTransportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.appointmentdate = bean.getAppointmentDate() == null ? null : bean.getAppointmentDate().buildDate();
		this.apptstarttime = bean.getApptStartTime() == null ? null : bean.getApptStartTime().buildTime();
		this.apptendtime = bean.getApptEndTime() == null ? null : bean.getApptEndTime().buildTime();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.earliestoffereddate = bean.getEarliestOfferedDate() == null ? null : bean.getEarliestOfferedDate().buildDate();
		this.session = bean.getSession() == null ? null : bean.getSession().buildVo();
		this.transporttype = bean.getTransportType() == null ? null : ims.scheduling.vo.lookups.ApptTransportType.buildLookup(bean.getTransportType());
		this.istransportrequired = bean.getIsTransportRequired();
		this.istransportbooked = bean.getIsTransportBooked();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.beans.Booking_AppointmentTransportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.appointmentdate = bean.getAppointmentDate() == null ? null : bean.getAppointmentDate().buildDate();
		this.apptstarttime = bean.getApptStartTime() == null ? null : bean.getApptStartTime().buildTime();
		this.apptendtime = bean.getApptEndTime() == null ? null : bean.getApptEndTime().buildTime();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.earliestoffereddate = bean.getEarliestOfferedDate() == null ? null : bean.getEarliestOfferedDate().buildDate();
		this.session = bean.getSession() == null ? null : bean.getSession().buildVo(map);
		this.transporttype = bean.getTransportType() == null ? null : ims.scheduling.vo.lookups.ApptTransportType.buildLookup(bean.getTransportType());
		this.istransportrequired = bean.getIsTransportRequired();
		this.istransportbooked = bean.getIsTransportBooked();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.beans.Booking_AppointmentTransportVoBean bean = null;
		if(map != null)
			bean = (ims.scheduling.vo.beans.Booking_AppointmentTransportVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.scheduling.vo.beans.Booking_AppointmentTransportVoBean();
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
		if(fieldName.equals("APPOINTMENTDATE"))
			return getAppointmentDate();
		if(fieldName.equals("APPTSTARTTIME"))
			return getApptStartTime();
		if(fieldName.equals("APPTENDTIME"))
			return getApptEndTime();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("EARLIESTOFFEREDDATE"))
			return getEarliestOfferedDate();
		if(fieldName.equals("SESSION"))
			return getSession();
		if(fieldName.equals("TRANSPORTTYPE"))
			return getTransportType();
		if(fieldName.equals("ISTRANSPORTREQUIRED"))
			return getIsTransportRequired();
		if(fieldName.equals("ISTRANSPORTBOOKED"))
			return getIsTransportBooked();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAppointmentDateIsNotNull()
	{
		return this.appointmentdate != null;
	}
	public ims.framework.utils.Date getAppointmentDate()
	{
		return this.appointmentdate;
	}
	public void setAppointmentDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.appointmentdate = value;
	}
	public boolean getApptStartTimeIsNotNull()
	{
		return this.apptstarttime != null;
	}
	public ims.framework.utils.Time getApptStartTime()
	{
		return this.apptstarttime;
	}
	public void setApptStartTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.apptstarttime = value;
	}
	public boolean getApptEndTimeIsNotNull()
	{
		return this.apptendtime != null;
	}
	public ims.framework.utils.Time getApptEndTime()
	{
		return this.apptendtime;
	}
	public void setApptEndTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.apptendtime = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.vo.PatientLiteVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.PatientLiteVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getEarliestOfferedDateIsNotNull()
	{
		return this.earliestoffereddate != null;
	}
	public ims.framework.utils.Date getEarliestOfferedDate()
	{
		return this.earliestoffereddate;
	}
	public void setEarliestOfferedDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.earliestoffereddate = value;
	}
	public boolean getSessionIsNotNull()
	{
		return this.session != null;
	}
	public ims.scheduling.vo.SessionLiteVo getSession()
	{
		return this.session;
	}
	public void setSession(ims.scheduling.vo.SessionLiteVo value)
	{
		this.isValidated = false;
		this.session = value;
	}
	public boolean getTransportTypeIsNotNull()
	{
		return this.transporttype != null;
	}
	public ims.scheduling.vo.lookups.ApptTransportType getTransportType()
	{
		return this.transporttype;
	}
	public void setTransportType(ims.scheduling.vo.lookups.ApptTransportType value)
	{
		this.isValidated = false;
		this.transporttype = value;
	}
	public boolean getIsTransportRequiredIsNotNull()
	{
		return this.istransportrequired != null;
	}
	public Boolean getIsTransportRequired()
	{
		return this.istransportrequired;
	}
	public void setIsTransportRequired(Boolean value)
	{
		this.isValidated = false;
		this.istransportrequired = value;
	}
	public boolean getIsTransportBookedIsNotNull()
	{
		return this.istransportbooked != null;
	}
	public Boolean getIsTransportBooked()
	{
		return this.istransportbooked;
	}
	public void setIsTransportBooked(Boolean value)
	{
		this.isValidated = false;
		this.istransportbooked = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
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
		if(this.patient != null)
		{
			if(!this.patient.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.session != null)
		{
			if(!this.session.isValidated())
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.patient != null)
		{
			String[] listOfOtherErrors = this.patient.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.session != null)
		{
			String[] listOfOtherErrors = this.session.validate();
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
	
		Booking_AppointmentTransportVo clone = new Booking_AppointmentTransportVo(this.id, this.version);
		
		if(this.appointmentdate == null)
			clone.appointmentdate = null;
		else
			clone.appointmentdate = (ims.framework.utils.Date)this.appointmentdate.clone();
		if(this.apptstarttime == null)
			clone.apptstarttime = null;
		else
			clone.apptstarttime = (ims.framework.utils.Time)this.apptstarttime.clone();
		if(this.apptendtime == null)
			clone.apptendtime = null;
		else
			clone.apptendtime = (ims.framework.utils.Time)this.apptendtime.clone();
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.core.vo.PatientLiteVo)this.patient.clone();
		if(this.earliestoffereddate == null)
			clone.earliestoffereddate = null;
		else
			clone.earliestoffereddate = (ims.framework.utils.Date)this.earliestoffereddate.clone();
		if(this.session == null)
			clone.session = null;
		else
			clone.session = (ims.scheduling.vo.SessionLiteVo)this.session.clone();
		if(this.transporttype == null)
			clone.transporttype = null;
		else
			clone.transporttype = (ims.scheduling.vo.lookups.ApptTransportType)this.transporttype.clone();
		clone.istransportrequired = this.istransportrequired;
		clone.istransportbooked = this.istransportbooked;
		clone.carecontext = this.carecontext;
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
		if (!(Booking_AppointmentTransportVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A Booking_AppointmentTransportVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((Booking_AppointmentTransportVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((Booking_AppointmentTransportVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.appointmentdate != null)
			count++;
		if(this.apptstarttime != null)
			count++;
		if(this.apptendtime != null)
			count++;
		if(this.patient != null)
			count++;
		if(this.earliestoffereddate != null)
			count++;
		if(this.session != null)
			count++;
		if(this.transporttype != null)
			count++;
		if(this.istransportrequired != null)
			count++;
		if(this.istransportbooked != null)
			count++;
		if(this.carecontext != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 10;
	}
	protected ims.framework.utils.Date appointmentdate;
	protected ims.framework.utils.Time apptstarttime;
	protected ims.framework.utils.Time apptendtime;
	protected ims.core.vo.PatientLiteVo patient;
	protected ims.framework.utils.Date earliestoffereddate;
	protected ims.scheduling.vo.SessionLiteVo session;
	protected ims.scheduling.vo.lookups.ApptTransportType transporttype;
	protected Boolean istransportrequired;
	protected Boolean istransportbooked;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	private boolean isValidated = false;
	private boolean isBusy = false;
}