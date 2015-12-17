// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class CCGToContractConfigVoBean extends ims.vo.ValueObjectBean
{
	public CCGToContractConfigVoBean()
	{
	}
	public CCGToContractConfigVoBean(ims.RefMan.vo.CCGToContractConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.ccgcode = vo.getCCGCode();
		this.isactive = vo.getIsActive();
		this.isedited = vo.getIsEdited();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.CCGToContractConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.ccgcode = vo.getCCGCode();
		this.isactive = vo.getIsActive();
		this.isedited = vo.getIsEdited();
	}

	public ims.RefMan.vo.CCGToContractConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.CCGToContractConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.CCGToContractConfigVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.CCGToContractConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.CCGToContractConfigVo();
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
	public String getCCGCode()
	{
		return this.ccgcode;
	}
	public void setCCGCode(String value)
	{
		this.ccgcode = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public Boolean getIsEdited()
	{
		return this.isedited;
	}
	public void setIsEdited(Boolean value)
	{
		this.isedited = value;
	}

	private Integer id;
	private int version;
	private String ccgcode;
	private Boolean isactive;
	private Boolean isedited;
}