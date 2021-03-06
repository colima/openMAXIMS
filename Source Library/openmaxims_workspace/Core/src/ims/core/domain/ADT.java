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

package ims.core.domain;

// Generated from form domain impl
public interface ADT extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.core.vo.InpatientEpisodeVo admitPatient(ims.core.vo.PatientShort patVo, ims.core.vo.InpatientEpisodeVo episVo, ims.framework.utils.DateTime transactionDT) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.InpatientEpisodeVo transferPatient(ims.core.patient.vo.PatientRefVo patVo, ims.core.resource.people.vo.HcpRefVo consultant, ims.core.resource.place.vo.LocationRefVo location, Integer stay) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.DischargedEpisodeVo dischargePatient(ims.core.vo.PatientShort patVo, ims.core.vo.DischargedEpisodeVo dischEpisVo, ims.core.vo.CareContextInterfaceVo voCareContext) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.OutPatientAttendanceVo recordOPAttendance(ims.core.vo.PatientShort patVo, ims.core.vo.OutPatientAttendanceVo attVo, ims.core.vo.CareContextInterfaceVo careContext) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Record an AneAttendance
	*/
	public ims.core.vo.AneAttendanceVo recordAEAttendance(ims.core.vo.AneAttendanceVo attendance, ims.core.vo.PatientShort patient, Boolean bCancelDischarge) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Cancels the given appointment
	*/
	public void cancelAppointment(ims.core.vo.OutPatientAttendanceVo attendance, ims.core.vo.CareContextInterfaceVo voCareContext) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Updates the Inpatient Record - following an A08 event type - overloaded method that will update the patient record
	*/
	public void updateInpatient(ims.core.vo.InpatientEpisodeVo inpatientRecord, ims.core.vo.CareContextInterfaceVo voCareContext, Boolean updatePatientRecord) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Cancels a previously entered Admission.
	* Returns silently if patient is not currently an inpatient.
	*/
	public Boolean cancelAdmission(ims.core.vo.PatientShort patVo) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.InpatientEpisodeVo cancelDischarge(ims.core.vo.PatientShort patVo, ims.core.vo.DischargedEpisodeVo dischEpisVo, ims.core.vo.CareContextInterfaceVo voCareContext) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Sets boolean flag for patient leave for the given patient
	*/
	public void recordInpatientLeave(ims.core.patient.vo.PatientRefVo patient) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Sets the boolean flag for the Inpatient record for the given patient
	*/
	public void cancelInpatientLeave(ims.core.vo.PatientShort patient) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Get's the outpatient appointment record based on the pas event supplied - uses unique index on event id, patient and event datetime to get the pasEvent record from the database, and then uses this to get the outpatient attendance record
	*/
	public ims.core.vo.OutPatientAttendanceVo getOutpatientAppointment(ims.core.vo.PasEventVo pasEvent);

	// Generated from form domain interface definition
	/**
	* Gets the current InpatientEpisode record for the given patient
	*/
	public ims.core.vo.InpatientEpisodeVo getCurrentAdmissionRecord(ims.core.patient.vo.PatientRefVo patient);

	// Generated from form domain interface definition
	/**
	* getPasEvent
	*/
	public ims.core.vo.PasEventVo getPasEventByUnqIdx(ims.core.patient.vo.PatientRefVo voPatientRef, String pasEventId);

	// Generated from form domain interface definition
	public ims.core.vo.PasEventVo getPasEvent(ims.core.admin.pas.vo.PASEventRefVo voPasEventRef);

	// Generated from form domain interface definition
	public ims.core.vo.PasEventVo createPasEvent(ims.framework.utils.DateTime eventDateTime, ims.core.patient.vo.PatientRefVo voRefPatient, ims.correspondence.vo.PasContactVo voPasContact) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Gets the  AneAttendance Record for the PasEvent supplied
	*/
	public ims.core.vo.AneAttendanceVo getAnEAttendance(ims.core.vo.PasEventVo pasEvent);

	// Generated from form domain interface definition
	/**
	* Retrieves the current discharge record for the patient with pas event details matching that passed in the parameter.
	*/
	public ims.core.vo.DischargedEpisodeVo getCurrentDischarge(ims.core.vo.PatientShort patVo, ims.core.vo.DischargedEpisodeVo dischEpisVo);

	// Generated from form domain interface definition
	public ims.core.vo.PendingEmergencyAdmissionVo getPendingEmergencyAdmission(ims.core.vo.PasEventVo pasEventVo);

	// Generated from form domain interface definition
	public ims.core.vo.PendingEmergencyAdmissionVo recordPendingEmergencyAdmission(ims.core.vo.PasEventVo pasEventVo, ims.core.vo.PendingEmergencyAdmissionVo pendingEmergencyAdmission) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.PendingElectiveAdmissionHl7Vo getPendingElectiveAdmission(ims.core.vo.PasEventVo pasEventVo);

	// Generated from form domain interface definition
	public ims.core.vo.PendingElectiveAdmissionHl7Vo recordPendingElectiveAdmission(ims.core.vo.PasEventVo pasEventVo, ims.core.vo.PendingElectiveAdmissionHl7Vo pendingElectiveAdmissionVo) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.InpatientEpisodeVo transferPatient(ims.core.patient.vo.PatientRefVo patVo, ims.core.resource.people.vo.HcpRefVo consultant, ims.core.resource.place.vo.LocationRefVo location) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.InpatientEpisodeVo transferPatient(ims.core.patient.vo.PatientRefVo patVo, ims.core.resource.people.vo.HcpRefVo consultant, ims.core.resource.place.vo.LocationRefVo location, Integer stay, ims.core.resource.place.vo.LocationRefVo fromWard, ims.framework.utils.DateTime transferDateTime, ims.framework.utils.DateTime transactionDT, ims.vo.LookupInstVo specialty) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getCareContextByPasEvent
	*/
	public ims.core.vo.CareContextInterfaceVo getCareContextByPasEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent);

	// Generated from form domain interface definition
	public ims.core.vo.InpatientEpisodeVo readmitPatient(ims.core.vo.PatientShort patVo, ims.core.vo.InpatientEpisodeVo episVo) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Gets the ED attendance details for an ED attendance
	*/
	public ims.emergency.vo.ifEDAttendanceVo getEDAttendanceDetails(ims.vo.interfaces.IHL7OutboundMessageHandler attendanceHandler);

	// Generated from form domain interface definition
	/**
	* Return the Private Insurance company for a given code
	*/
	public ims.core.vo.PrivateInsuranceCompanyVo getPrivateInsuranceCompany(String extId, ims.core.vo.lookups.TaxonomyType taxonomyType);

	// Generated from form domain interface definition
	/**
	* get the partial admission details to generate outbound messages
	*/
	public ims.emergency.vo.ifInpatientADTVo getPartialAdmissionDetails(ims.hl7adtout.vo.InPatientADTMessageQueueRefVo queueItem);

	// Generated from form domain interface definition
	/**
	* PAS cancels the admission record associated with a partial admission setting admission ward and date time to null
	*/
	public void cancelPartialAdmission(String partialAdmissionId) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void createDementiaRecordIfRequired(ims.domain.DomainFactory factory, ims.core.admin.pas.domain.objects.AdmissionDetail adt) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* gets Booking Appointment Details
	*/
	public ims.scheduling.vo.ifOutBookingAppointmentVo getBookingAppointmentDetails(ims.scheduling.vo.AppointmentMessageQueueVo apptQueueItem);

	// Generated from form domain interface definition
	public void updateDementiaRecordForDischarge(ims.domain.DomainFactory factory, ims.core.admin.pas.domain.objects.AdmissionDetail doAdmissionDetail,  ims.core.admin.pas.domain.objects.DischargedEpisode dischDo) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.ForeignKeyViolationException;

	// Generated from form domain interface definition
	public ims.dtomove.vo.ifApptDetailsVo getRadiotherapyApptDetails(ims.dtomove.vo.RadioTherapySchedQueueVo queueItem);

	// Generated from form domain interface definition
	public ims.core.vo.ifInpatientEpisodeVo getInpatientEpisodeDetails(ims.ocs_if.vo.InpatientEpisodeQueueVo inpatientEpisodeQueueVo) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for an Inpatient admission
	*/
	public void triggerAdmissionEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for an Inpatient transfer
	*/
	public void triggerTransferEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for an Inpatient discharge
	*/
	public void triggerDischargeEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for the cancellation of an Inpatient admission
	*/
	public void triggerCancelAdmissionEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for the cancellation of an Inpatient transfer
	*/
	public void triggerCancelTransferEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for cancelaation an Inpatient discharge
	*/
	public void triggerCancelDischargeEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for update of an Inpatient admission
	*/
	public void triggerUpdateAdmissionEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent, ims.core.vo.lookups.MsgUpdateType type) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for Leave of Absence for an Inpatient admission
	*/
	public void triggerLeaveOfAbsenceEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for Return from Leave of Absence for an Inpatient admission
	*/
	public void triggerReturnFromLeaveOfAbsenceEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for cancellation of Leave of Absence for an Inpatient admission
	*/
	public void triggerCancelLeaveOfAbsenceEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for cancellation of Return from Leave of Absence for an Inpatient admission
	*/
	public void triggerCancelReturnFromLeaveOfAbsenceEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.hl7.vo.ifWardMessageQueueVo getWardMessageQueueDetails(ims.hl7.vo.WardMessageQueueVo queueItem) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* Consultant MOS
	*/
	public ims.hl7.vo.ifMOSMessageQueueVo getMOSMessageQueueDetails(ims.hl7.vo.MOSMessageQueueVo queueItem) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.hl7.vo.ifGPMessageQueueVo getGPMessageQueueDetails(ims.hl7.vo.GPMessageQueueVo queueItem) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.hl7.vo.ifGPPracticeMessageQueueVo getGPPracticeMessageQueueDetails(ims.hl7.vo.GPPracticeMessageQueueVo queueItem) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public void vteOnDischarge(ims.core.patient.domain.objects.Patient domPatient, ims.core.admin.pas.domain.objects.DischargedEpisode disDo, ims.core.admin.pas.domain.objects.InpatientEpisode ipDo) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void vteOnAdmission(ims.core.admin.pas.domain.objects.InpatientEpisode ipDo, ims.core.patient.domain.objects.Patient domPatient, Boolean isElective);

	// Generated from form domain interface definition
	public void vteOnCancelAdmission(ims.core.admin.pas.domain.objects.InpatientEpisode ipDo, ims.core.patient.domain.objects.Patient domPatient) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.hl7.vo.ifElectiveListMessageQueueVo getElectiveListMessageQueueDetails(ims.hl7.vo.ElectiveListMessageQueueVo queueItem) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get the assembled booking appointment for a schBookingId
	*/
	public ims.scheduling.vo.Booking_AppointmentVo getBookingAppointment(Integer appointmentId);

	// Generated from form domain interface definition
	/**
	* Triggers a queue item for a pending ward transfer
	*/
	public void triggerPendingTransferEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* triggers a queue item for cancellation of a pending ward transfer
	*/
	public void triggerCancelPendingTransferEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* Gets the current InpatientEpisode BO
	*/
	public ims.core.admin.pas.domain.objects.InpatientEpisode getCurrentAdmission(ims.core.patient.vo.PatientRefVo patVo);

	// Generated from form domain interface definition
	public void triggerPendingDischargeEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public void triggerCancelPendingDischargeEvent(ims.core.admin.pas.vo.PASEventRefVo pasEvent) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.scheduling.vo.Booking_AppointmentVo getBookingAppointmentWithExternalId(String externalId);

	// Generated from form domain interface definition
	/**
	* Updates the Inpatient Record - following an A08 event type
	*/
	public void updateInpatient(ims.core.vo.InpatientEpisodeVo inpatientRecord, ims.core.vo.CareContextInterfaceVo voCareContext) throws ims.domain.exceptions.StaleObjectException;
}
