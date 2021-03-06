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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class TCIForPatientElectiveList extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100064;
	private static final long serialVersionUID = 1096100064L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** TCIDate */
	private java.util.Date tCIDate;
	/** TCITime */
	private String tCITime;
	/** TCIOfferMethod */
	private ims.domain.lookups.LookupInstance tCIOfferMethod;
	/** DateTCIOffered */
	private java.util.Date dateTCIOffered;
	/** DateTCIAccepted */
	private java.util.Date dateTCIAccepted;
	/** Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	/** Session */
	private ims.scheduling.domain.objects.Sch_Session session;
	/** Comments */
	private String comments;
	/** RTTBreachReason */
	private ims.domain.lookups.LookupInstance rTTBreachReason;
	/** PlanningElectiveAttribute */
	private ims.domain.lookups.LookupInstance planningElective;
	/** TCIHospital */
	private ims.core.resource.place.domain.objects.Location tCIHospital;
	/** Ward */
	private ims.core.resource.place.domain.objects.Location tCIWard;
	/** Bed */
	private String tCIBed;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Hcp tCIConsultant;
	/** CurrentOutcome */
	private ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList currentOutcome;
	/** OutcomeHistory
	  * Collection of ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList.
	  */
	private java.util.List outcomeHistory;
	/** IsActive */
	private Boolean isActive;
	/** AdmissionDetail */
	private ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail;
	/** BedManagerComment */
	private String bedManagerComment;
	private ims.domain.lookups.LookupInstance day28BreachReason;
	private String day28BreachComment;
	private String rTTBreachComment;
	private java.util.Date plannedTCIDate;
	/** A cancel HL7 message for this TCI has been processed */
	private Boolean cancelMsgProcessed;
	/** Was Reasonable 28 day Offer Made */
	private Boolean wasReasonable28dayOfferMade;
	/** 28 Day TCI Date Offered */
	private java.util.Date _28DayTCIDateOffered;
	/** 28 Date of Offer */
	private java.util.Date _28DateOfOffer;
	/** 28ReasonDeclined */
	private ims.domain.lookups.LookupInstance _28ReasonDeclined;
	private Boolean subjectTo28DayRule;
	private ims.domain.lookups.LookupInstance rule28DayStatus;
	private java.util.Date rule28DayPeriodStart;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TCIForPatientElectiveList (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TCIForPatientElectiveList ()
    {
    	super();
    }
    public TCIForPatientElectiveList (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.TCIForPatientElectiveList.class;
	}


	public java.util.Date getTCIDate() {
		return tCIDate;
	}
	public void setTCIDate(java.util.Date tCIDate) {
		this.tCIDate = tCIDate;
	}

	public String getTCITime() {
		return tCITime;
	}
	public void setTCITime(String tCITime) {
		this.tCITime = tCITime;
	}

	public ims.domain.lookups.LookupInstance getTCIOfferMethod() {
		return tCIOfferMethod;
	}
	public void setTCIOfferMethod(ims.domain.lookups.LookupInstance tCIOfferMethod) {
		this.tCIOfferMethod = tCIOfferMethod;
	}

	public java.util.Date getDateTCIOffered() {
		return dateTCIOffered;
	}
	public void setDateTCIOffered(java.util.Date dateTCIOffered) {
		this.dateTCIOffered = dateTCIOffered;
	}

	public java.util.Date getDateTCIAccepted() {
		return dateTCIAccepted;
	}
	public void setDateTCIAccepted(java.util.Date dateTCIAccepted) {
		this.dateTCIAccepted = dateTCIAccepted;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(ims.scheduling.domain.objects.Booking_Appointment appointment) {
		this.appointment = appointment;
	}

	public ims.scheduling.domain.objects.Sch_Session getSession() {
		return session;
	}
	public void setSession(ims.scheduling.domain.objects.Sch_Session session) {
		this.session = session;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.domain.lookups.LookupInstance getRTTBreachReason() {
		return rTTBreachReason;
	}
	public void setRTTBreachReason(ims.domain.lookups.LookupInstance rTTBreachReason) {
		this.rTTBreachReason = rTTBreachReason;
	}

	public ims.domain.lookups.LookupInstance getPlanningElective() {
		return planningElective;
	}
	public void setPlanningElective(ims.domain.lookups.LookupInstance planningElective) {
		this.planningElective = planningElective;
	}

	public ims.core.resource.place.domain.objects.Location getTCIHospital() {
		return tCIHospital;
	}
	public void setTCIHospital(ims.core.resource.place.domain.objects.Location tCIHospital) {
		this.tCIHospital = tCIHospital;
	}

	public ims.core.resource.place.domain.objects.Location getTCIWard() {
		return tCIWard;
	}
	public void setTCIWard(ims.core.resource.place.domain.objects.Location tCIWard) {
		this.tCIWard = tCIWard;
	}

	public String getTCIBed() {
		return tCIBed;
	}
	public void setTCIBed(String tCIBed) {
		if ( null != tCIBed && tCIBed.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tCIBed. Tried to set value: "+
				tCIBed);
		}
		this.tCIBed = tCIBed;
	}

	public ims.core.resource.people.domain.objects.Hcp getTCIConsultant() {
		return tCIConsultant;
	}
	public void setTCIConsultant(ims.core.resource.people.domain.objects.Hcp tCIConsultant) {
		this.tCIConsultant = tCIConsultant;
	}

	public ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList getCurrentOutcome() {
		return currentOutcome;
	}
	public void setCurrentOutcome(ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList currentOutcome) {
		this.currentOutcome = currentOutcome;
	}

	public java.util.List getOutcomeHistory() {
		if ( null == outcomeHistory ) {
			outcomeHistory = new java.util.ArrayList();
		}
		return outcomeHistory;
	}
	public void setOutcomeHistory(java.util.List paramValue) {
		this.outcomeHistory = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.admin.pas.domain.objects.AdmissionDetail getAdmissionDetail() {
		return admissionDetail;
	}
	public void setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail) {
		this.admissionDetail = admissionDetail;
	}

	public String getBedManagerComment() {
		return bedManagerComment;
	}
	public void setBedManagerComment(String bedManagerComment) {
		if ( null != bedManagerComment && bedManagerComment.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bedManagerComment. Tried to set value: "+
				bedManagerComment);
		}
		this.bedManagerComment = bedManagerComment;
	}

	public ims.domain.lookups.LookupInstance getDay28BreachReason() {
		return day28BreachReason;
	}
	public void setDay28BreachReason(ims.domain.lookups.LookupInstance day28BreachReason) {
		this.day28BreachReason = day28BreachReason;
	}

	public String getDay28BreachComment() {
		return day28BreachComment;
	}
	public void setDay28BreachComment(String day28BreachComment) {
		if ( null != day28BreachComment && day28BreachComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for day28BreachComment. Tried to set value: "+
				day28BreachComment);
		}
		this.day28BreachComment = day28BreachComment;
	}

	public String getRTTBreachComment() {
		return rTTBreachComment;
	}
	public void setRTTBreachComment(String rTTBreachComment) {
		if ( null != rTTBreachComment && rTTBreachComment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rTTBreachComment. Tried to set value: "+
				rTTBreachComment);
		}
		this.rTTBreachComment = rTTBreachComment;
	}

	public java.util.Date getPlannedTCIDate() {
		return plannedTCIDate;
	}
	public void setPlannedTCIDate(java.util.Date plannedTCIDate) {
		this.plannedTCIDate = plannedTCIDate;
	}

	public Boolean isCancelMsgProcessed() {
		return cancelMsgProcessed;
	}
	public void setCancelMsgProcessed(Boolean cancelMsgProcessed) {
		this.cancelMsgProcessed = cancelMsgProcessed;
	}

	public Boolean isWasReasonable28dayOfferMade() {
		return wasReasonable28dayOfferMade;
	}
	public void setWasReasonable28dayOfferMade(Boolean wasReasonable28dayOfferMade) {
		this.wasReasonable28dayOfferMade = wasReasonable28dayOfferMade;
	}

	public java.util.Date get_28DayTCIDateOffered() {
		return _28DayTCIDateOffered;
	}
	public void set_28DayTCIDateOffered(java.util.Date _28DayTCIDateOffered) {
		this._28DayTCIDateOffered = _28DayTCIDateOffered;
	}

	public java.util.Date get_28DateOfOffer() {
		return _28DateOfOffer;
	}
	public void set_28DateOfOffer(java.util.Date _28DateOfOffer) {
		this._28DateOfOffer = _28DateOfOffer;
	}

	public ims.domain.lookups.LookupInstance get_28ReasonDeclined() {
		return _28ReasonDeclined;
	}
	public void set_28ReasonDeclined(ims.domain.lookups.LookupInstance _28ReasonDeclined) {
		this._28ReasonDeclined = _28ReasonDeclined;
	}

	public Boolean isSubjectTo28DayRule() {
		return subjectTo28DayRule;
	}
	public void setSubjectTo28DayRule(Boolean subjectTo28DayRule) {
		this.subjectTo28DayRule = subjectTo28DayRule;
	}

	public ims.domain.lookups.LookupInstance getRule28DayStatus() {
		return rule28DayStatus;
	}
	public void setRule28DayStatus(ims.domain.lookups.LookupInstance rule28DayStatus) {
		this.rule28DayStatus = rule28DayStatus;
	}

	public java.util.Date getRule28DayPeriodStart() {
		return rule28DayPeriodStart;
	}
	public void setRule28DayPeriodStart(java.util.Date rule28DayPeriodStart) {
		this.rule28DayPeriodStart = rule28DayPeriodStart;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*tCIDate* :");
		auditStr.append(tCIDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCITime* :");
		auditStr.append(tCITime);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIOfferMethod* :");
		if (tCIOfferMethod != null)
			auditStr.append(tCIOfferMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTCIOffered* :");
		auditStr.append(dateTCIOffered);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTCIAccepted* :");
		auditStr.append(dateTCIAccepted);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointment* :");
		if (appointment != null)
		{
			auditStr.append(toShortClassName(appointment));
				
		    auditStr.append(appointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*session* :");
		if (session != null)
		{
			auditStr.append(toShortClassName(session));
				
		    auditStr.append(session.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTBreachReason* :");
		if (rTTBreachReason != null)
			auditStr.append(rTTBreachReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*planningElective* :");
		if (planningElective != null)
			auditStr.append(planningElective.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIHospital* :");
		if (tCIHospital != null)
		{
			auditStr.append(toShortClassName(tCIHospital));
				
		    auditStr.append(tCIHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIWard* :");
		if (tCIWard != null)
		{
			auditStr.append(toShortClassName(tCIWard));
				
		    auditStr.append(tCIWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIBed* :");
		auditStr.append(tCIBed);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIConsultant* :");
		if (tCIConsultant != null)
		{
			auditStr.append(toShortClassName(tCIConsultant));
				
		    auditStr.append(tCIConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentOutcome* :");
		if (currentOutcome != null)
		{
			auditStr.append(toShortClassName(currentOutcome));
				
		    auditStr.append(currentOutcome.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeHistory* :");
		if (outcomeHistory != null)
		{
		int i16=0;
		for (i16=0; i16<outcomeHistory.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList obj = (ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList)outcomeHistory.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDetail* :");
		if (admissionDetail != null)
		{
			auditStr.append(toShortClassName(admissionDetail));
				
		    auditStr.append(admissionDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bedManagerComment* :");
		auditStr.append(bedManagerComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*day28BreachReason* :");
		if (day28BreachReason != null)
			auditStr.append(day28BreachReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*day28BreachComment* :");
		auditStr.append(day28BreachComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*rTTBreachComment* :");
		auditStr.append(rTTBreachComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedTCIDate* :");
		auditStr.append(plannedTCIDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelMsgProcessed* :");
		auditStr.append(cancelMsgProcessed);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasReasonable28dayOfferMade* :");
		auditStr.append(wasReasonable28dayOfferMade);
	    auditStr.append("; ");
		auditStr.append("\r\n*_28DayTCIDateOffered* :");
		auditStr.append(_28DayTCIDateOffered);
	    auditStr.append("; ");
		auditStr.append("\r\n*_28DateOfOffer* :");
		auditStr.append(_28DateOfOffer);
	    auditStr.append("; ");
		auditStr.append("\r\n*_28ReasonDeclined* :");
		if (_28ReasonDeclined != null)
			auditStr.append(_28ReasonDeclined.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*subjectTo28DayRule* :");
		auditStr.append(subjectTo28DayRule);
	    auditStr.append("; ");
		auditStr.append("\r\n*rule28DayStatus* :");
		if (rule28DayStatus != null)
			auditStr.append(rule28DayStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*rule28DayPeriodStart* :");
		auditStr.append(rule28DayPeriodStart);
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "TCIForPatientElectiveList";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getTCIDate() != null)
		{
			sb.append("<tCIDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTCIDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</tCIDate>");		
		}
		if (this.getTCITime() != null)
		{
			sb.append("<tCITime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTCITime().toString()));
			sb.append("</tCITime>");		
		}
		if (this.getTCIOfferMethod() != null)
		{
			sb.append("<tCIOfferMethod>");
			sb.append(this.getTCIOfferMethod().toXMLString()); 
			sb.append("</tCIOfferMethod>");		
		}
		if (this.getDateTCIOffered() != null)
		{
			sb.append("<dateTCIOffered>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTCIOffered()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTCIOffered>");		
		}
		if (this.getDateTCIAccepted() != null)
		{
			sb.append("<dateTCIAccepted>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTCIAccepted()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTCIAccepted>");		
		}
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(this.getAppointment().toXMLString(domMap)); 	
			sb.append("</appointment>");		
		}
		if (this.getSession() != null)
		{
			sb.append("<session>");
			sb.append(this.getSession().toXMLString(domMap)); 	
			sb.append("</session>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getRTTBreachReason() != null)
		{
			sb.append("<rTTBreachReason>");
			sb.append(this.getRTTBreachReason().toXMLString()); 
			sb.append("</rTTBreachReason>");		
		}
		if (this.getPlanningElective() != null)
		{
			sb.append("<planningElective>");
			sb.append(this.getPlanningElective().toXMLString()); 
			sb.append("</planningElective>");		
		}
		if (this.getTCIHospital() != null)
		{
			sb.append("<tCIHospital>");
			sb.append(this.getTCIHospital().toXMLString(domMap)); 	
			sb.append("</tCIHospital>");		
		}
		if (this.getTCIWard() != null)
		{
			sb.append("<tCIWard>");
			sb.append(this.getTCIWard().toXMLString(domMap)); 	
			sb.append("</tCIWard>");		
		}
		if (this.getTCIBed() != null)
		{
			sb.append("<tCIBed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTCIBed().toString()));
			sb.append("</tCIBed>");		
		}
		if (this.getTCIConsultant() != null)
		{
			sb.append("<tCIConsultant>");
			sb.append(this.getTCIConsultant().toXMLString(domMap)); 	
			sb.append("</tCIConsultant>");		
		}
		if (this.getCurrentOutcome() != null)
		{
			sb.append("<currentOutcome>");
			sb.append(this.getCurrentOutcome().toXMLString(domMap)); 	
			sb.append("</currentOutcome>");		
		}
		if (this.getOutcomeHistory() != null)
		{
			if (this.getOutcomeHistory().size() > 0 )
			{
			sb.append("<outcomeHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOutcomeHistory(), domMap));
			sb.append("</outcomeHistory>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getAdmissionDetail() != null)
		{
			sb.append("<admissionDetail>");
			sb.append(this.getAdmissionDetail().toXMLString(domMap)); 	
			sb.append("</admissionDetail>");		
		}
		if (this.getBedManagerComment() != null)
		{
			sb.append("<bedManagerComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBedManagerComment().toString()));
			sb.append("</bedManagerComment>");		
		}
		if (this.getDay28BreachReason() != null)
		{
			sb.append("<day28BreachReason>");
			sb.append(this.getDay28BreachReason().toXMLString()); 
			sb.append("</day28BreachReason>");		
		}
		if (this.getDay28BreachComment() != null)
		{
			sb.append("<day28BreachComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDay28BreachComment().toString()));
			sb.append("</day28BreachComment>");		
		}
		if (this.getRTTBreachComment() != null)
		{
			sb.append("<rTTBreachComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRTTBreachComment().toString()));
			sb.append("</rTTBreachComment>");		
		}
		if (this.getPlannedTCIDate() != null)
		{
			sb.append("<plannedTCIDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPlannedTCIDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</plannedTCIDate>");		
		}
		if (this.isCancelMsgProcessed() != null)
		{
			sb.append("<cancelMsgProcessed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCancelMsgProcessed().toString()));
			sb.append("</cancelMsgProcessed>");		
		}
		if (this.isWasReasonable28dayOfferMade() != null)
		{
			sb.append("<wasReasonable28dayOfferMade>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasReasonable28dayOfferMade().toString()));
			sb.append("</wasReasonable28dayOfferMade>");		
		}
		if (this.get_28DayTCIDateOffered() != null)
		{
			sb.append("<_28DayTCIDateOffered>");
			sb.append(new ims.framework.utils.DateTime(this.get_28DayTCIDateOffered()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_28DayTCIDateOffered>");		
		}
		if (this.get_28DateOfOffer() != null)
		{
			sb.append("<_28DateOfOffer>");
			sb.append(new ims.framework.utils.DateTime(this.get_28DateOfOffer()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_28DateOfOffer>");		
		}
		if (this.get_28ReasonDeclined() != null)
		{
			sb.append("<_28ReasonDeclined>");
			sb.append(this.get_28ReasonDeclined().toXMLString()); 
			sb.append("</_28ReasonDeclined>");		
		}
		if (this.isSubjectTo28DayRule() != null)
		{
			sb.append("<subjectTo28DayRule>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSubjectTo28DayRule().toString()));
			sb.append("</subjectTo28DayRule>");		
		}
		if (this.getRule28DayStatus() != null)
		{
			sb.append("<rule28DayStatus>");
			sb.append(this.getRule28DayStatus().toXMLString()); 
			sb.append("</rule28DayStatus>");		
		}
		if (this.getRule28DayPeriodStart() != null)
		{
			sb.append("<rule28DayPeriodStart>");
			sb.append(new ims.framework.utils.DateTime(this.getRule28DayPeriodStart()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</rule28DayPeriodStart>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			TCIForPatientElectiveList domainObject = getTCIForPatientElectiveListfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			TCIForPatientElectiveList domainObject = getTCIForPatientElectiveListfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static TCIForPatientElectiveList getTCIForPatientElectiveListfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTCIForPatientElectiveListfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TCIForPatientElectiveList getTCIForPatientElectiveListfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TCIForPatientElectiveList.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TCIForPatientElectiveList.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TCIForPatientElectiveList class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TCIForPatientElectiveList)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TCIForPatientElectiveList.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TCIForPatientElectiveList ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TCIForPatientElectiveList)factory.getImportedDomainObject(TCIForPatientElectiveList.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TCIForPatientElectiveList();
		}
		String keyClassName = "TCIForPatientElectiveList";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TCIForPatientElectiveList)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TCIForPatientElectiveList obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("tCIDate");
		if(fldEl != null)
		{	
    		obj.setTCIDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("tCITime");
		if(fldEl != null)
		{	
    		obj.setTCITime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tCIOfferMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTCIOfferMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateTCIOffered");
		if(fldEl != null)
		{	
    		obj.setDateTCIOffered(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateTCIAccepted");
		if(fldEl != null)
		{	
    		obj.setDateTCIAccepted(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("appointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("session");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSession(ims.scheduling.domain.objects.Sch_Session.getSch_SessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rTTBreachReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRTTBreachReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("planningElective");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlanningElective(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tCIHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTCIHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tCIWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTCIWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tCIBed");
		if(fldEl != null)
		{	
    		obj.setTCIBed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tCIConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTCIConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentOutcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentOutcome(ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList.getTCIOutcomeForPatientElectiveListfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("outcomeHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOutcomeHistory(ims.RefMan.domain.objects.TCIOutcomeForPatientElectiveList.fromListXMLString(fldEl, factory, obj.getOutcomeHistory(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail.getAdmissionDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bedManagerComment");
		if(fldEl != null)
		{	
    		obj.setBedManagerComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("day28BreachReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDay28BreachReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("day28BreachComment");
		if(fldEl != null)
		{	
    		obj.setDay28BreachComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rTTBreachComment");
		if(fldEl != null)
		{	
    		obj.setRTTBreachComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("plannedTCIDate");
		if(fldEl != null)
		{	
    		obj.setPlannedTCIDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cancelMsgProcessed");
		if(fldEl != null)
		{	
    		obj.setCancelMsgProcessed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasReasonable28dayOfferMade");
		if(fldEl != null)
		{	
    		obj.setWasReasonable28dayOfferMade(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("_28DayTCIDateOffered");
		if(fldEl != null)
		{	
    		obj.set_28DayTCIDateOffered(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("_28DateOfOffer");
		if(fldEl != null)
		{	
    		obj.set_28DateOfOffer(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("_28ReasonDeclined");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.set_28ReasonDeclined(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("subjectTo28DayRule");
		if(fldEl != null)
		{	
    		obj.setSubjectTo28DayRule(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rule28DayStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRule28DayStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("rule28DayPeriodStart");
		if(fldEl != null)
		{	
    		obj.setRule28DayPeriodStart(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "outcomeHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TCIDate = "tCIDate";
		public static final String TCITime = "tCITime";
		public static final String TCIOfferMethod = "tCIOfferMethod";
		public static final String DateTCIOffered = "dateTCIOffered";
		public static final String DateTCIAccepted = "dateTCIAccepted";
		public static final String Appointment = "appointment";
		public static final String Session = "session";
		public static final String Comments = "comments";
		public static final String RTTBreachReason = "rTTBreachReason";
		public static final String PlanningElective = "planningElective";
		public static final String TCIHospital = "tCIHospital";
		public static final String TCIWard = "tCIWard";
		public static final String TCIBed = "tCIBed";
		public static final String TCIConsultant = "tCIConsultant";
		public static final String CurrentOutcome = "currentOutcome";
		public static final String OutcomeHistory = "outcomeHistory";
		public static final String IsActive = "isActive";
		public static final String AdmissionDetail = "admissionDetail";
		public static final String BedManagerComment = "bedManagerComment";
		public static final String Day28BreachReason = "day28BreachReason";
		public static final String Day28BreachComment = "day28BreachComment";
		public static final String RTTBreachComment = "rTTBreachComment";
		public static final String PlannedTCIDate = "plannedTCIDate";
		public static final String CancelMsgProcessed = "cancelMsgProcessed";
		public static final String WasReasonable28dayOfferMade = "wasReasonable28dayOfferMade";
		public static final String _28DayTCIDateOffered = "_28DayTCIDateOffered";
		public static final String _28DateOfOffer = "_28DateOfOffer";
		public static final String _28ReasonDeclined = "_28ReasonDeclined";
		public static final String SubjectTo28DayRule = "subjectTo28DayRule";
		public static final String Rule28DayStatus = "rule28DayStatus";
		public static final String Rule28DayPeriodStart = "rule28DayPeriodStart";
	}
}

