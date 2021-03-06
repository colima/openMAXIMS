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

package ims.RefMan.vo.beans;

public class DischargeSummaryPacuAndWardLiteVoBean extends ims.vo.ValueObjectBean
{
	public DischargeSummaryPacuAndWardLiteVoBean()
	{
	}
	public DischargeSummaryPacuAndWardLiteVoBean(ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
		this.dischargedatetime = vo.getDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDischargeDateTime().getBean();
		this.dischargetype = vo.getDischargeType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDischargeType().getBean();
		this.dischargeepisode = vo.getDischargeEpisode() == null ? null : new ims.vo.RefVoBean(vo.getDischargeEpisode().getBoId(), vo.getDischargeEpisode().getBoVersion());
		this.iscurrent = vo.getIsCurrent();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.catsreferral = vo.getCatsReferral() == null ? null : new ims.vo.RefVoBean(vo.getCatsReferral().getBoId(), vo.getCatsReferral().getBoVersion());
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
		this.dischargedatetime = vo.getDischargeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDischargeDateTime().getBean();
		this.dischargetype = vo.getDischargeType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDischargeType().getBean();
		this.dischargeepisode = vo.getDischargeEpisode() == null ? null : new ims.vo.RefVoBean(vo.getDischargeEpisode().getBoId(), vo.getDischargeEpisode().getBoVersion());
		this.iscurrent = vo.getIsCurrent();
	}

	public ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.DischargeSummaryPacuAndWardLiteVo();
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
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}
	public ims.framework.utils.beans.DateTimeBean getDischargeDateTime()
	{
		return this.dischargedatetime;
	}
	public void setDischargeDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.dischargedatetime = value;
	}
	public ims.vo.LookupInstanceBean getDischargeType()
	{
		return this.dischargetype;
	}
	public void setDischargeType(ims.vo.LookupInstanceBean value)
	{
		this.dischargetype = value;
	}
	public ims.vo.RefVoBean getDischargeEpisode()
	{
		return this.dischargeepisode;
	}
	public void setDischargeEpisode(ims.vo.RefVoBean value)
	{
		this.dischargeepisode = value;
	}
	public Boolean getIsCurrent()
	{
		return this.iscurrent;
	}
	public void setIsCurrent(Boolean value)
	{
		this.iscurrent = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean catsreferral;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
	private ims.framework.utils.beans.DateTimeBean dischargedatetime;
	private ims.vo.LookupInstanceBean dischargetype;
	private ims.vo.RefVoBean dischargeepisode;
	private Boolean iscurrent;
}
