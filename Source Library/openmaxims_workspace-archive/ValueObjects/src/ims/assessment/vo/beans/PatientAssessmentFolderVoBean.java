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

package ims.assessment.vo.beans;

public class PatientAssessmentFolderVoBean extends ims.vo.ValueObjectBean
{
	public PatientAssessmentFolderVoBean()
	{
	}
	public PatientAssessmentFolderVoBean(ims.assessment.vo.PatientAssessmentFolderVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.foldername = vo.getFolderName();
		this.patientassessments = vo.getPatientAssessments() == null ? null : vo.getPatientAssessments().getBeanCollection();
		this.graphicassessments = vo.getGraphicAssessments() == null ? null : vo.getGraphicAssessments().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.PatientAssessmentFolderVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.foldername = vo.getFolderName();
		this.patientassessments = vo.getPatientAssessments() == null ? null : vo.getPatientAssessments().getBeanCollection();
		this.graphicassessments = vo.getGraphicAssessments() == null ? null : vo.getGraphicAssessments().getBeanCollection();
	}

	public ims.assessment.vo.PatientAssessmentFolderVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.assessment.vo.PatientAssessmentFolderVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.PatientAssessmentFolderVo vo = null;
		if(map != null)
			vo = (ims.assessment.vo.PatientAssessmentFolderVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.assessment.vo.PatientAssessmentFolderVo();
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
	public String getFolderName()
	{
		return this.foldername;
	}
	public void setFolderName(String value)
	{
		this.foldername = value;
	}
	public ims.assessment.vo.beans.UserAssessmentShortVoBean[] getPatientAssessments()
	{
		return this.patientassessments;
	}
	public void setPatientAssessments(ims.assessment.vo.beans.UserAssessmentShortVoBean[] value)
	{
		this.patientassessments = value;
	}
	public ims.assessment.vo.beans.GraphicAssessmentShortVoBean[] getGraphicAssessments()
	{
		return this.graphicassessments;
	}
	public void setGraphicAssessments(ims.assessment.vo.beans.GraphicAssessmentShortVoBean[] value)
	{
		this.graphicassessments = value;
	}

	private Integer id;
	private int version;
	private String foldername;
	private ims.assessment.vo.beans.UserAssessmentShortVoBean[] patientassessments;
	private ims.assessment.vo.beans.GraphicAssessmentShortVoBean[] graphicassessments;
}
