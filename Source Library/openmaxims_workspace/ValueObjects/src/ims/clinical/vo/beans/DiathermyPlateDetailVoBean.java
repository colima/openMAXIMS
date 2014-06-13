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

package ims.clinical.vo.beans;

public class DiathermyPlateDetailVoBean extends ims.vo.ValueObjectBean
{
	public DiathermyPlateDetailVoBean()
	{
	}
	public DiathermyPlateDetailVoBean(ims.clinical.vo.DiathermyPlateDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.diathermytype = vo.getDiathermyType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDiathermyType().getBean();
		this.skinshaved = vo.getSkinShaved() == null ? null : (ims.vo.LookupInstanceBean)vo.getSkinShaved().getBean();
		this.skinintact = vo.getSkinintact() == null ? null : (ims.vo.LookupInstanceBean)vo.getSkinintact().getBean();
		this.plateposition = vo.getPlatePosition();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.DiathermyPlateDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.diathermytype = vo.getDiathermyType() == null ? null : (ims.vo.LookupInstanceBean)vo.getDiathermyType().getBean();
		this.skinshaved = vo.getSkinShaved() == null ? null : (ims.vo.LookupInstanceBean)vo.getSkinShaved().getBean();
		this.skinintact = vo.getSkinintact() == null ? null : (ims.vo.LookupInstanceBean)vo.getSkinintact().getBean();
		this.plateposition = vo.getPlatePosition();
	}

	public ims.clinical.vo.DiathermyPlateDetailVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.DiathermyPlateDetailVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.DiathermyPlateDetailVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.DiathermyPlateDetailVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.DiathermyPlateDetailVo();
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
	public ims.vo.LookupInstanceBean getDiathermyType()
	{
		return this.diathermytype;
	}
	public void setDiathermyType(ims.vo.LookupInstanceBean value)
	{
		this.diathermytype = value;
	}
	public ims.vo.LookupInstanceBean getSkinShaved()
	{
		return this.skinshaved;
	}
	public void setSkinShaved(ims.vo.LookupInstanceBean value)
	{
		this.skinshaved = value;
	}
	public ims.vo.LookupInstanceBean getSkinintact()
	{
		return this.skinintact;
	}
	public void setSkinintact(ims.vo.LookupInstanceBean value)
	{
		this.skinintact = value;
	}
	public String getPlatePosition()
	{
		return this.plateposition;
	}
	public void setPlatePosition(String value)
	{
		this.plateposition = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean diathermytype;
	private ims.vo.LookupInstanceBean skinshaved;
	private ims.vo.LookupInstanceBean skinintact;
	private String plateposition;
}