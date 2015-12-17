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

package ims.clinical.vo.beans;

public class ServiceConfigIntReferralForReferralVoBean extends ims.vo.ValueObjectBean
{
	public ServiceConfigIntReferralForReferralVoBean()
	{
	}
	public ServiceConfigIntReferralForReferralVoBean(ims.clinical.vo.ServiceConfigIntReferralForReferralVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.requireshcpauthorisation = vo.getRequiresHcpAuthorisation();
		this.nonhcpacceptance = vo.getNonHcpAcceptance();
		this.nohcpallowedforservice = vo.getNoHCPAllowedForService();
		this.service = vo.getService() == null ? null : (ims.clinical.vo.beans.ServiceForIncomingReferralListVoBean)vo.getService().getBean();
		this.active = vo.getActive();
		this.tooltiptext = vo.getTooltipText();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.ServiceConfigIntReferralForReferralVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.requireshcpauthorisation = vo.getRequiresHcpAuthorisation();
		this.nonhcpacceptance = vo.getNonHcpAcceptance();
		this.nohcpallowedforservice = vo.getNoHCPAllowedForService();
		this.service = vo.getService() == null ? null : (ims.clinical.vo.beans.ServiceForIncomingReferralListVoBean)vo.getService().getBean(map);
		this.active = vo.getActive();
		this.tooltiptext = vo.getTooltipText();
	}

	public ims.clinical.vo.ServiceConfigIntReferralForReferralVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.ServiceConfigIntReferralForReferralVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.ServiceConfigIntReferralForReferralVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.ServiceConfigIntReferralForReferralVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.ServiceConfigIntReferralForReferralVo();
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
	public Boolean getRequiresHcpAuthorisation()
	{
		return this.requireshcpauthorisation;
	}
	public void setRequiresHcpAuthorisation(Boolean value)
	{
		this.requireshcpauthorisation = value;
	}
	public Boolean getNonHcpAcceptance()
	{
		return this.nonhcpacceptance;
	}
	public void setNonHcpAcceptance(Boolean value)
	{
		this.nonhcpacceptance = value;
	}
	public Boolean getNoHCPAllowedForService()
	{
		return this.nohcpallowedforservice;
	}
	public void setNoHCPAllowedForService(Boolean value)
	{
		this.nohcpallowedforservice = value;
	}
	public ims.clinical.vo.beans.ServiceForIncomingReferralListVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.clinical.vo.beans.ServiceForIncomingReferralListVoBean value)
	{
		this.service = value;
	}
	public Boolean getActive()
	{
		return this.active;
	}
	public void setActive(Boolean value)
	{
		this.active = value;
	}
	public String getTooltipText()
	{
		return this.tooltiptext;
	}
	public void setTooltipText(String value)
	{
		this.tooltiptext = value;
	}

	private Integer id;
	private int version;
	private Boolean requireshcpauthorisation;
	private Boolean nonhcpacceptance;
	private Boolean nohcpallowedforservice;
	private ims.clinical.vo.beans.ServiceForIncomingReferralListVoBean service;
	private Boolean active;
	private String tooltiptext;
}