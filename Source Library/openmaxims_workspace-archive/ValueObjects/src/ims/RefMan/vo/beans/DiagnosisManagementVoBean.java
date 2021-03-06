// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class DiagnosisManagementVoBean extends ims.vo.ValueObjectBean
{
	public DiagnosisManagementVoBean()
	{
	}
	public DiagnosisManagementVoBean(ims.RefMan.vo.DiagnosisManagementVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.recordinginformation = vo.getRecordingInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getRecordingInformation().getBean();
		this.lastauthoringhcp = vo.getLastAuthoringHCP() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getLastAuthoringHCP().getBean();
		this.diagnosis = vo.getDiagnosis() == null ? null : vo.getDiagnosis().getBeanCollection();
		this.procedures = vo.getProcedures() == null ? null : vo.getProcedures().getBeanCollection();
		this.firstdefinitivetreatmentdate = vo.getFirstDefinitiveTreatmentDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFirstDefinitiveTreatmentDate().getBean();
		this.investigationsandresults = vo.getInvestigationsAndResults();
		this.managementplan = vo.getManagementPlan();
		this.adviceandinfogiven = vo.getAdviceAndInfoGiven();
		this.actionrequiredbygp = vo.getActionRequiredByGP() == null ? null : (ims.vo.LookupInstanceBean)vo.getActionRequiredByGP().getBean();
		this.actionrequiredbygpnotes = vo.getActionRequiredByGPNotes();
		this.patientconsent = vo.getPatientConsent() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientConsent().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.DiagnosisManagementVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.recordinginformation = vo.getRecordingInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getRecordingInformation().getBean(map);
		this.lastauthoringhcp = vo.getLastAuthoringHCP() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getLastAuthoringHCP().getBean(map);
		this.diagnosis = vo.getDiagnosis() == null ? null : vo.getDiagnosis().getBeanCollection();
		this.procedures = vo.getProcedures() == null ? null : vo.getProcedures().getBeanCollection();
		this.firstdefinitivetreatmentdate = vo.getFirstDefinitiveTreatmentDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFirstDefinitiveTreatmentDate().getBean();
		this.investigationsandresults = vo.getInvestigationsAndResults();
		this.managementplan = vo.getManagementPlan();
		this.adviceandinfogiven = vo.getAdviceAndInfoGiven();
		this.actionrequiredbygp = vo.getActionRequiredByGP() == null ? null : (ims.vo.LookupInstanceBean)vo.getActionRequiredByGP().getBean();
		this.actionrequiredbygpnotes = vo.getActionRequiredByGPNotes();
		this.patientconsent = vo.getPatientConsent() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientConsent().getBean();
	}

	public ims.RefMan.vo.DiagnosisManagementVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.DiagnosisManagementVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.DiagnosisManagementVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.DiagnosisManagementVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.DiagnosisManagementVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.RefVoBean getCatsReferral()
	{
		return this.catsreferral;
	}
	public void setCatsReferral(ims.vo.RefVoBean value)
	{
		this.catsreferral = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getRecordingInformation()
	{
		return this.recordinginformation;
	}
	public void setRecordingInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.recordinginformation = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getLastAuthoringHCP()
	{
		return this.lastauthoringhcp;
	}
	public void setLastAuthoringHCP(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.lastauthoringhcp = value;
	}
	public ims.core.vo.beans.PatientDiagnosisAtConsultationVoBean[] getDiagnosis()
	{
		return this.diagnosis;
	}
	public void setDiagnosis(ims.core.vo.beans.PatientDiagnosisAtConsultationVoBean[] value)
	{
		this.diagnosis = value;
	}
	public ims.core.vo.beans.PatientProcedureShortVoBean[] getProcedures()
	{
		return this.procedures;
	}
	public void setProcedures(ims.core.vo.beans.PatientProcedureShortVoBean[] value)
	{
		this.procedures = value;
	}
	public ims.framework.utils.beans.DateBean getFirstDefinitiveTreatmentDate()
	{
		return this.firstdefinitivetreatmentdate;
	}
	public void setFirstDefinitiveTreatmentDate(ims.framework.utils.beans.DateBean value)
	{
		this.firstdefinitivetreatmentdate = value;
	}
	public String getInvestigationsAndResults()
	{
		return this.investigationsandresults;
	}
	public void setInvestigationsAndResults(String value)
	{
		this.investigationsandresults = value;
	}
	public String getManagementPlan()
	{
		return this.managementplan;
	}
	public void setManagementPlan(String value)
	{
		this.managementplan = value;
	}
	public String getAdviceAndInfoGiven()
	{
		return this.adviceandinfogiven;
	}
	public void setAdviceAndInfoGiven(String value)
	{
		this.adviceandinfogiven = value;
	}
	public ims.vo.LookupInstanceBean getActionRequiredByGP()
	{
		return this.actionrequiredbygp;
	}
	public void setActionRequiredByGP(ims.vo.LookupInstanceBean value)
	{
		this.actionrequiredbygp = value;
	}
	public String getActionRequiredByGPNotes()
	{
		return this.actionrequiredbygpnotes;
	}
	public void setActionRequiredByGPNotes(String value)
	{
		this.actionrequiredbygpnotes = value;
	}
	public ims.vo.LookupInstanceBean getPatientConsent()
	{
		return this.patientconsent;
	}
	public void setPatientConsent(ims.vo.LookupInstanceBean value)
	{
		this.patientconsent = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean catsreferral;
	private ims.core.vo.beans.AuthoringInformationVoBean recordinginformation;
	private ims.core.vo.beans.AuthoringInformationVoBean lastauthoringhcp;
	private ims.core.vo.beans.PatientDiagnosisAtConsultationVoBean[] diagnosis;
	private ims.core.vo.beans.PatientProcedureShortVoBean[] procedures;
	private ims.framework.utils.beans.DateBean firstdefinitivetreatmentdate;
	private String investigationsandresults;
	private String managementplan;
	private String adviceandinfogiven;
	private ims.vo.LookupInstanceBean actionrequiredbygp;
	private String actionrequiredbygpnotes;
	private ims.vo.LookupInstanceBean patientconsent;
}
