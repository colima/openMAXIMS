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

public class TTAMedicationDetailLiteVoBean extends ims.vo.ValueObjectBean
{
	public TTAMedicationDetailLiteVoBean()
	{
	}
	public TTAMedicationDetailLiteVoBean(ims.clinical.vo.TTAMedicationDetailLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.othermedicationtext = vo.getOtherMedicationText();
		this.dosevalue = vo.getDoseValue();
		this.doseunit = vo.getDoseUnit() == null ? null : (ims.vo.LookupInstanceBean)vo.getDoseUnit().getBean();
		this.form = vo.getForm() == null ? null : (ims.vo.LookupInstanceBean)vo.getForm().getBean();
		this.route = vo.getRoute() == null ? null : (ims.vo.LookupInstanceBean)vo.getRoute().getBean();
		this.frequencyvalue = vo.getFrequencyValue();
		this.frequencyunit = vo.getFrequencyUnit() == null ? null : (ims.vo.LookupInstanceBean)vo.getFrequencyUnit().getBean();
		this.commenceddate = vo.getCommencedDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCommencedDate().getBean();
		this.medication = vo.getMedication() == null ? null : (ims.core.vo.beans.MedicationLiteVoBean)vo.getMedication().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.TTAMedicationDetailLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.othermedicationtext = vo.getOtherMedicationText();
		this.dosevalue = vo.getDoseValue();
		this.doseunit = vo.getDoseUnit() == null ? null : (ims.vo.LookupInstanceBean)vo.getDoseUnit().getBean();
		this.form = vo.getForm() == null ? null : (ims.vo.LookupInstanceBean)vo.getForm().getBean();
		this.route = vo.getRoute() == null ? null : (ims.vo.LookupInstanceBean)vo.getRoute().getBean();
		this.frequencyvalue = vo.getFrequencyValue();
		this.frequencyunit = vo.getFrequencyUnit() == null ? null : (ims.vo.LookupInstanceBean)vo.getFrequencyUnit().getBean();
		this.commenceddate = vo.getCommencedDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getCommencedDate().getBean();
		this.medication = vo.getMedication() == null ? null : (ims.core.vo.beans.MedicationLiteVoBean)vo.getMedication().getBean(map);
	}

	public ims.clinical.vo.TTAMedicationDetailLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.TTAMedicationDetailLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.TTAMedicationDetailLiteVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.TTAMedicationDetailLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.TTAMedicationDetailLiteVo();
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
	public String getOtherMedicationText()
	{
		return this.othermedicationtext;
	}
	public void setOtherMedicationText(String value)
	{
		this.othermedicationtext = value;
	}
	public Float getDoseValue()
	{
		return this.dosevalue;
	}
	public void setDoseValue(Float value)
	{
		this.dosevalue = value;
	}
	public ims.vo.LookupInstanceBean getDoseUnit()
	{
		return this.doseunit;
	}
	public void setDoseUnit(ims.vo.LookupInstanceBean value)
	{
		this.doseunit = value;
	}
	public ims.vo.LookupInstanceBean getForm()
	{
		return this.form;
	}
	public void setForm(ims.vo.LookupInstanceBean value)
	{
		this.form = value;
	}
	public ims.vo.LookupInstanceBean getRoute()
	{
		return this.route;
	}
	public void setRoute(ims.vo.LookupInstanceBean value)
	{
		this.route = value;
	}
	public Integer getFrequencyValue()
	{
		return this.frequencyvalue;
	}
	public void setFrequencyValue(Integer value)
	{
		this.frequencyvalue = value;
	}
	public ims.vo.LookupInstanceBean getFrequencyUnit()
	{
		return this.frequencyunit;
	}
	public void setFrequencyUnit(ims.vo.LookupInstanceBean value)
	{
		this.frequencyunit = value;
	}
	public ims.framework.utils.beans.DateBean getCommencedDate()
	{
		return this.commenceddate;
	}
	public void setCommencedDate(ims.framework.utils.beans.DateBean value)
	{
		this.commenceddate = value;
	}
	public ims.core.vo.beans.MedicationLiteVoBean getMedication()
	{
		return this.medication;
	}
	public void setMedication(ims.core.vo.beans.MedicationLiteVoBean value)
	{
		this.medication = value;
	}

	private Integer id;
	private int version;
	private String othermedicationtext;
	private Float dosevalue;
	private ims.vo.LookupInstanceBean doseunit;
	private ims.vo.LookupInstanceBean form;
	private ims.vo.LookupInstanceBean route;
	private Integer frequencyvalue;
	private ims.vo.LookupInstanceBean frequencyunit;
	private ims.framework.utils.beans.DateBean commenceddate;
	private ims.core.vo.beans.MedicationLiteVoBean medication;
}
