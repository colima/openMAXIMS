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

public class MergedPatientVoBean extends ims.vo.ValueObjectBean
{
	public MergedPatientVoBean()
	{
	}
	public MergedPatientVoBean(ims.core.vo.MergedPatientVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean();
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.dod = vo.getDod() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDod().getBean();
		this.address = vo.getAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getAddress().getBean();
		this.identifiers = vo.getIdentifiers() == null ? null : vo.getIdentifiers().getBeanCollection();
		this.gp = vo.getGp() == null ? null : new ims.vo.RefVoBean(vo.getGp().getBoId(), vo.getGp().getBoVersion());
		this.gpsurgery = vo.getGpSurgery() == null ? null : new ims.vo.RefVoBean(vo.getGpSurgery().getBoId(), vo.getGpSurgery().getBoVersion());
		this.nok = vo.getNok() == null ? null : (ims.core.vo.beans.NextOfKinBean)vo.getNok().getBean();
		this.ethnicorigin = vo.getEthnicOrigin() == null ? null : (ims.vo.LookupInstanceBean)vo.getEthnicOrigin().getBean();
		this.religion = vo.getReligion() == null ? null : (ims.vo.LookupInstanceBean)vo.getReligion().getBean();
		this.maritalstatus = vo.getMaritalStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getMaritalStatus().getBean();
		this.occupation = vo.getOccupation() == null ? null : (ims.vo.LookupInstanceBean)vo.getOccupation().getBean();
		this.language = vo.getLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getLanguage().getBean();
		this.commchannels = vo.getCommChannels() == null ? null : vo.getCommChannels().getBeanCollection();
		this.insurance = vo.getInsurance() == null ? null : (ims.core.vo.beans.InsuranceVoBean)vo.getInsurance().getBean();
		this.addresses = vo.getAddresses() == null ? null : vo.getAddresses().getBeanCollection();
		this.destiantionpatient = vo.getDestiantionPatient() == null ? null : new ims.vo.RefVoBean(vo.getDestiantionPatient().getBoId(), vo.getDestiantionPatient().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.MergedPatientVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.name = vo.getName() == null ? null : (ims.core.vo.beans.PersonNameBean)vo.getName().getBean(map);
		this.sex = vo.getSex() == null ? null : (ims.vo.LookupInstanceBean)vo.getSex().getBean();
		this.dob = vo.getDob() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDob().getBean();
		this.dod = vo.getDod() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDod().getBean();
		this.address = vo.getAddress() == null ? null : (ims.core.vo.beans.PersonAddressBean)vo.getAddress().getBean(map);
		this.identifiers = vo.getIdentifiers() == null ? null : vo.getIdentifiers().getBeanCollection();
		this.gp = vo.getGp() == null ? null : new ims.vo.RefVoBean(vo.getGp().getBoId(), vo.getGp().getBoVersion());
		this.gpsurgery = vo.getGpSurgery() == null ? null : new ims.vo.RefVoBean(vo.getGpSurgery().getBoId(), vo.getGpSurgery().getBoVersion());
		this.nok = vo.getNok() == null ? null : (ims.core.vo.beans.NextOfKinBean)vo.getNok().getBean(map);
		this.ethnicorigin = vo.getEthnicOrigin() == null ? null : (ims.vo.LookupInstanceBean)vo.getEthnicOrigin().getBean();
		this.religion = vo.getReligion() == null ? null : (ims.vo.LookupInstanceBean)vo.getReligion().getBean();
		this.maritalstatus = vo.getMaritalStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getMaritalStatus().getBean();
		this.occupation = vo.getOccupation() == null ? null : (ims.vo.LookupInstanceBean)vo.getOccupation().getBean();
		this.language = vo.getLanguage() == null ? null : (ims.vo.LookupInstanceBean)vo.getLanguage().getBean();
		this.commchannels = vo.getCommChannels() == null ? null : vo.getCommChannels().getBeanCollection();
		this.insurance = vo.getInsurance() == null ? null : (ims.core.vo.beans.InsuranceVoBean)vo.getInsurance().getBean(map);
		this.addresses = vo.getAddresses() == null ? null : vo.getAddresses().getBeanCollection();
		this.destiantionpatient = vo.getDestiantionPatient() == null ? null : new ims.vo.RefVoBean(vo.getDestiantionPatient().getBoId(), vo.getDestiantionPatient().getBoVersion());
	}

	public ims.core.vo.MergedPatientVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.MergedPatientVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.MergedPatientVo vo = null;
		if(map != null)
			vo = (ims.core.vo.MergedPatientVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.MergedPatientVo();
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
	public ims.vo.LookupInstanceBean getSex()
	{
		return this.sex;
	}
	public void setSex(ims.vo.LookupInstanceBean value)
	{
		this.sex = value;
	}
	public ims.framework.utils.beans.PartialDateBean getDob()
	{
		return this.dob;
	}
	public void setDob(ims.framework.utils.beans.PartialDateBean value)
	{
		this.dob = value;
	}
	public ims.framework.utils.beans.DateBean getDod()
	{
		return this.dod;
	}
	public void setDod(ims.framework.utils.beans.DateBean value)
	{
		this.dod = value;
	}
	public ims.core.vo.beans.PersonAddressBean getAddress()
	{
		return this.address;
	}
	public void setAddress(ims.core.vo.beans.PersonAddressBean value)
	{
		this.address = value;
	}
	public ims.core.vo.beans.PatientIdBean[] getIdentifiers()
	{
		return this.identifiers;
	}
	public void setIdentifiers(ims.core.vo.beans.PatientIdBean[] value)
	{
		this.identifiers = value;
	}
	public ims.vo.RefVoBean getGp()
	{
		return this.gp;
	}
	public void setGp(ims.vo.RefVoBean value)
	{
		this.gp = value;
	}
	public ims.vo.RefVoBean getGpSurgery()
	{
		return this.gpsurgery;
	}
	public void setGpSurgery(ims.vo.RefVoBean value)
	{
		this.gpsurgery = value;
	}
	public ims.core.vo.beans.NextOfKinBean getNok()
	{
		return this.nok;
	}
	public void setNok(ims.core.vo.beans.NextOfKinBean value)
	{
		this.nok = value;
	}
	public ims.vo.LookupInstanceBean getEthnicOrigin()
	{
		return this.ethnicorigin;
	}
	public void setEthnicOrigin(ims.vo.LookupInstanceBean value)
	{
		this.ethnicorigin = value;
	}
	public ims.vo.LookupInstanceBean getReligion()
	{
		return this.religion;
	}
	public void setReligion(ims.vo.LookupInstanceBean value)
	{
		this.religion = value;
	}
	public ims.vo.LookupInstanceBean getMaritalStatus()
	{
		return this.maritalstatus;
	}
	public void setMaritalStatus(ims.vo.LookupInstanceBean value)
	{
		this.maritalstatus = value;
	}
	public ims.vo.LookupInstanceBean getOccupation()
	{
		return this.occupation;
	}
	public void setOccupation(ims.vo.LookupInstanceBean value)
	{
		this.occupation = value;
	}
	public ims.vo.LookupInstanceBean getLanguage()
	{
		return this.language;
	}
	public void setLanguage(ims.vo.LookupInstanceBean value)
	{
		this.language = value;
	}
	public ims.core.vo.beans.CommChannelVoBean[] getCommChannels()
	{
		return this.commchannels;
	}
	public void setCommChannels(ims.core.vo.beans.CommChannelVoBean[] value)
	{
		this.commchannels = value;
	}
	public ims.core.vo.beans.InsuranceVoBean getInsurance()
	{
		return this.insurance;
	}
	public void setInsurance(ims.core.vo.beans.InsuranceVoBean value)
	{
		this.insurance = value;
	}
	public ims.core.vo.beans.PersonAddressBean[] getAddresses()
	{
		return this.addresses;
	}
	public void setAddresses(ims.core.vo.beans.PersonAddressBean[] value)
	{
		this.addresses = value;
	}
	public ims.vo.RefVoBean getDestiantionPatient()
	{
		return this.destiantionpatient;
	}
	public void setDestiantionPatient(ims.vo.RefVoBean value)
	{
		this.destiantionpatient = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PersonNameBean name;
	private ims.vo.LookupInstanceBean sex;
	private ims.framework.utils.beans.PartialDateBean dob;
	private ims.framework.utils.beans.DateBean dod;
	private ims.core.vo.beans.PersonAddressBean address;
	private ims.core.vo.beans.PatientIdBean[] identifiers;
	private ims.vo.RefVoBean gp;
	private ims.vo.RefVoBean gpsurgery;
	private ims.core.vo.beans.NextOfKinBean nok;
	private ims.vo.LookupInstanceBean ethnicorigin;
	private ims.vo.LookupInstanceBean religion;
	private ims.vo.LookupInstanceBean maritalstatus;
	private ims.vo.LookupInstanceBean occupation;
	private ims.vo.LookupInstanceBean language;
	private ims.core.vo.beans.CommChannelVoBean[] commchannels;
	private ims.core.vo.beans.InsuranceVoBean insurance;
	private ims.core.vo.beans.PersonAddressBean[] addresses;
	private ims.vo.RefVoBean destiantionpatient;
}