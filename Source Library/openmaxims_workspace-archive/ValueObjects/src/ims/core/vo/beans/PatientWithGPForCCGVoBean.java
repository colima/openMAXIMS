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

package ims.core.vo.beans;

public class PatientWithGPForCCGVoBean extends ims.vo.ValueObjectBean
{
	public PatientWithGPForCCGVoBean()
	{
	}
	public PatientWithGPForCCGVoBean(ims.core.vo.PatientWithGPForCCGVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean();
		this.address = vo.getAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getAddress().getBean();
		this.gp = vo.getGp() == null ? null : (ims.core.vo.beans.GpShortVoBean)vo.getGp().getBean();
		this.gpsurgery = vo.getGpSurgery() == null ? null : (ims.core.vo.beans.LocSiteShortVoBean)vo.getGpSurgery().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PatientWithGPForCCGVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean(map);
		this.address = vo.getAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getAddress().getBean(map);
		this.gp = vo.getGp() == null ? null : (ims.core.vo.beans.GpShortVoBean)vo.getGp().getBean(map);
		this.gpsurgery = vo.getGpSurgery() == null ? null : (ims.core.vo.beans.LocSiteShortVoBean)vo.getGpSurgery().getBean(map);
	}

	public ims.core.vo.PatientWithGPForCCGVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PatientWithGPForCCGVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PatientWithGPForCCGVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PatientWithGPForCCGVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PatientWithGPForCCGVo();
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
	public ims.core.vo.beans.PersonNameBean getName()
	{
		return this.name;
	}
	public void setName(ims.core.vo.beans.PersonNameBean value)
	{
		this.name = value;
	}
	public ims.core.vo.beans.PersonAddressBean getAddress()
	{
		return this.address;
	}
	public void setAddress(ims.core.vo.beans.PersonAddressBean value)
	{
		this.address = value;
	}
	public ims.core.vo.beans.GpShortVoBean getGp()
	{
		return this.gp;
	}
	public void setGp(ims.core.vo.beans.GpShortVoBean value)
	{
		this.gp = value;
	}
	public ims.core.vo.beans.LocSiteShortVoBean getGpSurgery()
	{
		return this.gpsurgery;
	}
	public void setGpSurgery(ims.core.vo.beans.LocSiteShortVoBean value)
	{
		this.gpsurgery = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PersonNameBean name;
	private ims.core.vo.beans.PersonAddressBean address;
	private ims.core.vo.beans.GpShortVoBean gp;
	private ims.core.vo.beans.LocSiteShortVoBean gpsurgery;
}