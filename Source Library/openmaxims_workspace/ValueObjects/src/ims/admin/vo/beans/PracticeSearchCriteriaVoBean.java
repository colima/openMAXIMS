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

package ims.admin.vo.beans;

public class PracticeSearchCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public PracticeSearchCriteriaVoBean()
	{
	}
	public PracticeSearchCriteriaVoBean(ims.admin.vo.PracticeSearchCriteriaVo vo)
	{
		this.name = vo.getName();
		this.address = vo.getAddress();
		this.taxonomytype = vo.getTaxonomyType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTaxonomyType().getBean();
		this.taxonomycode = vo.getTaxonomyCode();
		this.isactive = vo.getIsActive();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.admin.vo.PracticeSearchCriteriaVo vo)
	{
		this.name = vo.getName();
		this.address = vo.getAddress();
		this.taxonomytype = vo.getTaxonomyType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTaxonomyType().getBean();
		this.taxonomycode = vo.getTaxonomyCode();
		this.isactive = vo.getIsActive();
	}

	public ims.admin.vo.PracticeSearchCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.admin.vo.PracticeSearchCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.admin.vo.PracticeSearchCriteriaVo vo = null;
		if(map != null)
			vo = (ims.admin.vo.PracticeSearchCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.admin.vo.PracticeSearchCriteriaVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public String getName()
	{
		return this.name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String value)
	{
		this.address = value;
	}
	public ims.vo.LookupInstanceBean getTaxonomyType()
	{
		return this.taxonomytype;
	}
	public void setTaxonomyType(ims.vo.LookupInstanceBean value)
	{
		this.taxonomytype = value;
	}
	public String getTaxonomyCode()
	{
		return this.taxonomycode;
	}
	public void setTaxonomyCode(String value)
	{
		this.taxonomycode = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}

	private String name;
	private String address;
	private ims.vo.LookupInstanceBean taxonomytype;
	private String taxonomycode;
	private Boolean isactive;
}
