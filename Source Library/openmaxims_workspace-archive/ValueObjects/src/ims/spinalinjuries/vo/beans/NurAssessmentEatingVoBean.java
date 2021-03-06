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

package ims.spinalinjuries.vo.beans;

public class NurAssessmentEatingVoBean extends ims.vo.ValueObjectBean
{
	public NurAssessmentEatingVoBean()
	{
	}
	public NurAssessmentEatingVoBean(ims.spinalinjuries.vo.NurAssessmentEatingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.iscomplete = vo.getIsComplete();
		this.assessmentinfo = vo.getAssessmentInfo() == null ? null : vo.getAssessmentInfo().getBeanCollection();
		this.copy = vo.getCopy();
		this.componenttype = vo.getComponentType() == null ? null : (ims.vo.LookupInstanceBean)vo.getComponentType().getBean();
		this.lastassessmentinfo = vo.getLastAssessmentInfo() == null ? null : (ims.nursing.vo.beans.AssessmentInfoBean)vo.getLastAssessmentInfo().getBean();
		this.careplantemplate = vo.getCarePlanTemplate() == null ? null : vo.getCarePlanTemplate().getBeanCollection();
		this.careplans = vo.getCarePlans() == null ? null : vo.getCarePlans().getBeanCollection();
		this.patientrequireassistance = vo.getPatientRequireAssistance() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientRequireAssistance().getBean();
		this.nutritionalmethod = vo.getNutritionalMethod() == null ? null : vo.getNutritionalMethod().getBeanCollection();
		this.oralassessment = vo.getOralAssessment() == null ? null : vo.getOralAssessment().getBeanCollection();
		this.difficultiesinswallowing = vo.getDifficultiesInSwallowing() == null ? null : (ims.vo.LookupInstanceBean)vo.getDifficultiesInSwallowing().getBean();
		this.referralspeechandlanguagetherapist = vo.getReferralSpeechAndLanguageTherapist() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralSpeechAndLanguageTherapist().getBean();
		this.referraldietitian = vo.getReferralDietitian() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDietitian().getBean();
		this.specialdiet = vo.getSpecialDiet() == null ? null : vo.getSpecialDiet().getBeanCollection();
		this.alcoholunits = vo.getAlcoholUnits();
		this.nutritionalriskassessment = vo.getNutritionalRiskAssessment() == null ? null : (ims.nursing.vo.beans.NutritionalRiskAssessmentVoBean)vo.getNutritionalRiskAssessment().getBean();
		this.nutritionalriskscore = vo.getNutritionalRiskScore();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.spinalinjuries.vo.NurAssessmentEatingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.iscomplete = vo.getIsComplete();
		this.assessmentinfo = vo.getAssessmentInfo() == null ? null : vo.getAssessmentInfo().getBeanCollection();
		this.copy = vo.getCopy();
		this.componenttype = vo.getComponentType() == null ? null : (ims.vo.LookupInstanceBean)vo.getComponentType().getBean();
		this.lastassessmentinfo = vo.getLastAssessmentInfo() == null ? null : (ims.nursing.vo.beans.AssessmentInfoBean)vo.getLastAssessmentInfo().getBean(map);
		this.careplantemplate = vo.getCarePlanTemplate() == null ? null : vo.getCarePlanTemplate().getBeanCollection();
		this.careplans = vo.getCarePlans() == null ? null : vo.getCarePlans().getBeanCollection();
		this.patientrequireassistance = vo.getPatientRequireAssistance() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientRequireAssistance().getBean();
		this.nutritionalmethod = vo.getNutritionalMethod() == null ? null : vo.getNutritionalMethod().getBeanCollection();
		this.oralassessment = vo.getOralAssessment() == null ? null : vo.getOralAssessment().getBeanCollection();
		this.difficultiesinswallowing = vo.getDifficultiesInSwallowing() == null ? null : (ims.vo.LookupInstanceBean)vo.getDifficultiesInSwallowing().getBean();
		this.referralspeechandlanguagetherapist = vo.getReferralSpeechAndLanguageTherapist() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralSpeechAndLanguageTherapist().getBean();
		this.referraldietitian = vo.getReferralDietitian() == null ? null : (ims.framework.utils.beans.DateBean)vo.getReferralDietitian().getBean();
		this.specialdiet = vo.getSpecialDiet() == null ? null : vo.getSpecialDiet().getBeanCollection();
		this.alcoholunits = vo.getAlcoholUnits();
		this.nutritionalriskassessment = vo.getNutritionalRiskAssessment() == null ? null : (ims.nursing.vo.beans.NutritionalRiskAssessmentVoBean)vo.getNutritionalRiskAssessment().getBean(map);
		this.nutritionalriskscore = vo.getNutritionalRiskScore();
	}

	public ims.spinalinjuries.vo.NurAssessmentEatingVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.spinalinjuries.vo.NurAssessmentEatingVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.spinalinjuries.vo.NurAssessmentEatingVo vo = null;
		if(map != null)
			vo = (ims.spinalinjuries.vo.NurAssessmentEatingVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.spinalinjuries.vo.NurAssessmentEatingVo();
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
	public Boolean getIsComplete()
	{
		return this.iscomplete;
	}
	public void setIsComplete(Boolean value)
	{
		this.iscomplete = value;
	}
	public ims.nursing.vo.beans.AssessmentInfoBean[] getAssessmentInfo()
	{
		return this.assessmentinfo;
	}
	public void setAssessmentInfo(ims.nursing.vo.beans.AssessmentInfoBean[] value)
	{
		this.assessmentinfo = value;
	}
	public Boolean getCopy()
	{
		return this.copy;
	}
	public void setCopy(Boolean value)
	{
		this.copy = value;
	}
	public ims.vo.LookupInstanceBean getComponentType()
	{
		return this.componenttype;
	}
	public void setComponentType(ims.vo.LookupInstanceBean value)
	{
		this.componenttype = value;
	}
	public ims.nursing.vo.beans.AssessmentInfoBean getLastAssessmentInfo()
	{
		return this.lastassessmentinfo;
	}
	public void setLastAssessmentInfo(ims.nursing.vo.beans.AssessmentInfoBean value)
	{
		this.lastassessmentinfo = value;
	}
	public ims.nursing.vo.beans.CarePlanTemplateBean[] getCarePlanTemplate()
	{
		return this.careplantemplate;
	}
	public void setCarePlanTemplate(ims.nursing.vo.beans.CarePlanTemplateBean[] value)
	{
		this.careplantemplate = value;
	}
	public ims.nursing.vo.beans.CarePlanBean[] getCarePlans()
	{
		return this.careplans;
	}
	public void setCarePlans(ims.nursing.vo.beans.CarePlanBean[] value)
	{
		this.careplans = value;
	}
	public ims.vo.LookupInstanceBean getPatientRequireAssistance()
	{
		return this.patientrequireassistance;
	}
	public void setPatientRequireAssistance(ims.vo.LookupInstanceBean value)
	{
		this.patientrequireassistance = value;
	}
	public ims.nursing.vo.beans.NutritionalMethodVoBean[] getNutritionalMethod()
	{
		return this.nutritionalmethod;
	}
	public void setNutritionalMethod(ims.nursing.vo.beans.NutritionalMethodVoBean[] value)
	{
		this.nutritionalmethod = value;
	}
	public ims.nursing.vo.beans.OralAssessmentBean[] getOralAssessment()
	{
		return this.oralassessment;
	}
	public void setOralAssessment(ims.nursing.vo.beans.OralAssessmentBean[] value)
	{
		this.oralassessment = value;
	}
	public ims.vo.LookupInstanceBean getDifficultiesInSwallowing()
	{
		return this.difficultiesinswallowing;
	}
	public void setDifficultiesInSwallowing(ims.vo.LookupInstanceBean value)
	{
		this.difficultiesinswallowing = value;
	}
	public ims.framework.utils.beans.DateBean getReferralSpeechAndLanguageTherapist()
	{
		return this.referralspeechandlanguagetherapist;
	}
	public void setReferralSpeechAndLanguageTherapist(ims.framework.utils.beans.DateBean value)
	{
		this.referralspeechandlanguagetherapist = value;
	}
	public ims.framework.utils.beans.DateBean getReferralDietitian()
	{
		return this.referraldietitian;
	}
	public void setReferralDietitian(ims.framework.utils.beans.DateBean value)
	{
		this.referraldietitian = value;
	}
	public java.util.Collection getSpecialDiet()
	{
		return this.specialdiet;
	}
	public void setSpecialDiet(java.util.Collection value)
	{
		this.specialdiet = value;
	}
	public void addSpecialDiet(java.util.Collection value)
	{
		if(this.specialdiet == null)
			this.specialdiet = new java.util.ArrayList();
		this.specialdiet.add(value);
	}
	public Integer getAlcoholUnits()
	{
		return this.alcoholunits;
	}
	public void setAlcoholUnits(Integer value)
	{
		this.alcoholunits = value;
	}
	public ims.nursing.vo.beans.NutritionalRiskAssessmentVoBean getNutritionalRiskAssessment()
	{
		return this.nutritionalriskassessment;
	}
	public void setNutritionalRiskAssessment(ims.nursing.vo.beans.NutritionalRiskAssessmentVoBean value)
	{
		this.nutritionalriskassessment = value;
	}
	public Integer getNutritionalRiskScore()
	{
		return this.nutritionalriskscore;
	}
	public void setNutritionalRiskScore(Integer value)
	{
		this.nutritionalriskscore = value;
	}

	private Integer id;
	private int version;
	private Boolean iscomplete;
	private ims.nursing.vo.beans.AssessmentInfoBean[] assessmentinfo;
	private Boolean copy;
	private ims.vo.LookupInstanceBean componenttype;
	private ims.nursing.vo.beans.AssessmentInfoBean lastassessmentinfo;
	private ims.nursing.vo.beans.CarePlanTemplateBean[] careplantemplate;
	private ims.nursing.vo.beans.CarePlanBean[] careplans;
	private ims.vo.LookupInstanceBean patientrequireassistance;
	private ims.nursing.vo.beans.NutritionalMethodVoBean[] nutritionalmethod;
	private ims.nursing.vo.beans.OralAssessmentBean[] oralassessment;
	private ims.vo.LookupInstanceBean difficultiesinswallowing;
	private ims.framework.utils.beans.DateBean referralspeechandlanguagetherapist;
	private ims.framework.utils.beans.DateBean referraldietitian;
	private java.util.Collection specialdiet;
	private Integer alcoholunits;
	private ims.nursing.vo.beans.NutritionalRiskAssessmentVoBean nutritionalriskassessment;
	private Integer nutritionalriskscore;
}
