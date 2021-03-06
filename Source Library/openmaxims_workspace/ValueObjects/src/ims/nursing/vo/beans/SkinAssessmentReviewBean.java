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

package ims.nursing.vo.beans;

public class SkinAssessmentReviewBean extends ims.vo.ValueObjectBean
{
	public SkinAssessmentReviewBean()
	{
	}
	public SkinAssessmentReviewBean(ims.nursing.vo.SkinAssessmentReview vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.datetimereview = vo.getDateTimeReview() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDateTimeReview().getBean();
		this.hcpreview = vo.getHCPReview() == null ? null : (ims.core.vo.beans.HcpBean)vo.getHCPReview().getBean();
		this.sitedetails = vo.getSiteDetails();
		this.howlongisitpresent = vo.getHowLongIsItPresent();
		this.pressuresoregrade = vo.getPressureSoreGrade() == null ? null : (ims.vo.LookupInstanceBean)vo.getPressureSoreGrade().getBean();
		this.length = vo.getLength();
		this.width = vo.getWidth();
		this.depth = vo.getDepth();
		this.woundbed = vo.getWoundBed() == null ? null : (ims.vo.LookupInstanceBean)vo.getWoundBed().getBean();
		this.surroundingskin = vo.getSurroundingSkin() == null ? null : (ims.vo.LookupInstanceBean)vo.getSurroundingSkin().getBean();
		this.exudateamount = vo.getExudateAmount() == null ? null : (ims.vo.LookupInstanceBean)vo.getExudateAmount().getBean();
		this.exudatetype = vo.getExudateType() == null ? null : (ims.vo.LookupInstanceBean)vo.getExudateType().getBean();
		this.odour = vo.getOdour() == null ? null : (ims.vo.LookupInstanceBean)vo.getOdour().getBean();
		this.pain = vo.getPain() == null ? null : (ims.vo.LookupInstanceBean)vo.getPain().getBean();
		this.infectionsuspected = vo.getInfectionSuspected();
		this.swabtaken = vo.getSwabTaken();
		this.woundtraced = vo.getWoundTraced();
		this.cleansedwith = vo.getCleansedWith() == null ? null : (ims.vo.LookupInstanceBean)vo.getCleansedWith().getBean();
		this.primarydressing = vo.getPrimaryDressing() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrimaryDressing().getBean();
		this.secondarydressing = vo.getSecondaryDressing() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondaryDressing().getBean();
		this.frequencyofchange = vo.getFrequencyOfChange() == null ? null : (ims.vo.LookupInstanceBean)vo.getFrequencyOfChange().getBean();
		this.comment = vo.getComment();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.SkinAssessmentReview vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.datetimereview = vo.getDateTimeReview() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getDateTimeReview().getBean();
		this.hcpreview = vo.getHCPReview() == null ? null : (ims.core.vo.beans.HcpBean)vo.getHCPReview().getBean(map);
		this.sitedetails = vo.getSiteDetails();
		this.howlongisitpresent = vo.getHowLongIsItPresent();
		this.pressuresoregrade = vo.getPressureSoreGrade() == null ? null : (ims.vo.LookupInstanceBean)vo.getPressureSoreGrade().getBean();
		this.length = vo.getLength();
		this.width = vo.getWidth();
		this.depth = vo.getDepth();
		this.woundbed = vo.getWoundBed() == null ? null : (ims.vo.LookupInstanceBean)vo.getWoundBed().getBean();
		this.surroundingskin = vo.getSurroundingSkin() == null ? null : (ims.vo.LookupInstanceBean)vo.getSurroundingSkin().getBean();
		this.exudateamount = vo.getExudateAmount() == null ? null : (ims.vo.LookupInstanceBean)vo.getExudateAmount().getBean();
		this.exudatetype = vo.getExudateType() == null ? null : (ims.vo.LookupInstanceBean)vo.getExudateType().getBean();
		this.odour = vo.getOdour() == null ? null : (ims.vo.LookupInstanceBean)vo.getOdour().getBean();
		this.pain = vo.getPain() == null ? null : (ims.vo.LookupInstanceBean)vo.getPain().getBean();
		this.infectionsuspected = vo.getInfectionSuspected();
		this.swabtaken = vo.getSwabTaken();
		this.woundtraced = vo.getWoundTraced();
		this.cleansedwith = vo.getCleansedWith() == null ? null : (ims.vo.LookupInstanceBean)vo.getCleansedWith().getBean();
		this.primarydressing = vo.getPrimaryDressing() == null ? null : (ims.vo.LookupInstanceBean)vo.getPrimaryDressing().getBean();
		this.secondarydressing = vo.getSecondaryDressing() == null ? null : (ims.vo.LookupInstanceBean)vo.getSecondaryDressing().getBean();
		this.frequencyofchange = vo.getFrequencyOfChange() == null ? null : (ims.vo.LookupInstanceBean)vo.getFrequencyOfChange().getBean();
		this.comment = vo.getComment();
	}

	public ims.nursing.vo.SkinAssessmentReview buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.nursing.vo.SkinAssessmentReview buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.SkinAssessmentReview vo = null;
		if(map != null)
			vo = (ims.nursing.vo.SkinAssessmentReview)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.nursing.vo.SkinAssessmentReview();
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
	public ims.framework.utils.beans.DateTimeBean getDateTimeReview()
	{
		return this.datetimereview;
	}
	public void setDateTimeReview(ims.framework.utils.beans.DateTimeBean value)
	{
		this.datetimereview = value;
	}
	public ims.core.vo.beans.HcpBean getHCPReview()
	{
		return this.hcpreview;
	}
	public void setHCPReview(ims.core.vo.beans.HcpBean value)
	{
		this.hcpreview = value;
	}
	public String getSiteDetails()
	{
		return this.sitedetails;
	}
	public void setSiteDetails(String value)
	{
		this.sitedetails = value;
	}
	public String getHowLongIsItPresent()
	{
		return this.howlongisitpresent;
	}
	public void setHowLongIsItPresent(String value)
	{
		this.howlongisitpresent = value;
	}
	public ims.vo.LookupInstanceBean getPressureSoreGrade()
	{
		return this.pressuresoregrade;
	}
	public void setPressureSoreGrade(ims.vo.LookupInstanceBean value)
	{
		this.pressuresoregrade = value;
	}
	public Float getLength()
	{
		return this.length;
	}
	public void setLength(Float value)
	{
		this.length = value;
	}
	public Float getWidth()
	{
		return this.width;
	}
	public void setWidth(Float value)
	{
		this.width = value;
	}
	public Float getDepth()
	{
		return this.depth;
	}
	public void setDepth(Float value)
	{
		this.depth = value;
	}
	public ims.vo.LookupInstanceBean getWoundBed()
	{
		return this.woundbed;
	}
	public void setWoundBed(ims.vo.LookupInstanceBean value)
	{
		this.woundbed = value;
	}
	public ims.vo.LookupInstanceBean getSurroundingSkin()
	{
		return this.surroundingskin;
	}
	public void setSurroundingSkin(ims.vo.LookupInstanceBean value)
	{
		this.surroundingskin = value;
	}
	public ims.vo.LookupInstanceBean getExudateAmount()
	{
		return this.exudateamount;
	}
	public void setExudateAmount(ims.vo.LookupInstanceBean value)
	{
		this.exudateamount = value;
	}
	public ims.vo.LookupInstanceBean getExudateType()
	{
		return this.exudatetype;
	}
	public void setExudateType(ims.vo.LookupInstanceBean value)
	{
		this.exudatetype = value;
	}
	public ims.vo.LookupInstanceBean getOdour()
	{
		return this.odour;
	}
	public void setOdour(ims.vo.LookupInstanceBean value)
	{
		this.odour = value;
	}
	public ims.vo.LookupInstanceBean getPain()
	{
		return this.pain;
	}
	public void setPain(ims.vo.LookupInstanceBean value)
	{
		this.pain = value;
	}
	public Boolean getInfectionSuspected()
	{
		return this.infectionsuspected;
	}
	public void setInfectionSuspected(Boolean value)
	{
		this.infectionsuspected = value;
	}
	public Boolean getSwabTaken()
	{
		return this.swabtaken;
	}
	public void setSwabTaken(Boolean value)
	{
		this.swabtaken = value;
	}
	public Boolean getWoundTraced()
	{
		return this.woundtraced;
	}
	public void setWoundTraced(Boolean value)
	{
		this.woundtraced = value;
	}
	public ims.vo.LookupInstanceBean getCleansedWith()
	{
		return this.cleansedwith;
	}
	public void setCleansedWith(ims.vo.LookupInstanceBean value)
	{
		this.cleansedwith = value;
	}
	public ims.vo.LookupInstanceBean getPrimaryDressing()
	{
		return this.primarydressing;
	}
	public void setPrimaryDressing(ims.vo.LookupInstanceBean value)
	{
		this.primarydressing = value;
	}
	public ims.vo.LookupInstanceBean getSecondaryDressing()
	{
		return this.secondarydressing;
	}
	public void setSecondaryDressing(ims.vo.LookupInstanceBean value)
	{
		this.secondarydressing = value;
	}
	public ims.vo.LookupInstanceBean getFrequencyOfChange()
	{
		return this.frequencyofchange;
	}
	public void setFrequencyOfChange(ims.vo.LookupInstanceBean value)
	{
		this.frequencyofchange = value;
	}
	public String getComment()
	{
		return this.comment;
	}
	public void setComment(String value)
	{
		this.comment = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean datetimereview;
	private ims.core.vo.beans.HcpBean hcpreview;
	private String sitedetails;
	private String howlongisitpresent;
	private ims.vo.LookupInstanceBean pressuresoregrade;
	private Float length;
	private Float width;
	private Float depth;
	private ims.vo.LookupInstanceBean woundbed;
	private ims.vo.LookupInstanceBean surroundingskin;
	private ims.vo.LookupInstanceBean exudateamount;
	private ims.vo.LookupInstanceBean exudatetype;
	private ims.vo.LookupInstanceBean odour;
	private ims.vo.LookupInstanceBean pain;
	private Boolean infectionsuspected;
	private Boolean swabtaken;
	private Boolean woundtraced;
	private ims.vo.LookupInstanceBean cleansedwith;
	private ims.vo.LookupInstanceBean primarydressing;
	private ims.vo.LookupInstanceBean secondarydressing;
	private ims.vo.LookupInstanceBean frequencyofchange;
	private String comment;
}
