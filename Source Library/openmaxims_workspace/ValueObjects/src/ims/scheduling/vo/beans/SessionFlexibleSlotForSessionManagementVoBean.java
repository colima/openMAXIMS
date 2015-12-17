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

package ims.scheduling.vo.beans;

public class SessionFlexibleSlotForSessionManagementVoBean extends ims.vo.ValueObjectBean
{
	public SessionFlexibleSlotForSessionManagementVoBean()
	{
	}
	public SessionFlexibleSlotForSessionManagementVoBean(ims.scheduling.vo.SessionFlexibleSlotForSessionManagementVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttime = vo.getStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTime().getBean();
		this.isactive = vo.getIsActive();
		this.duration = vo.getDuration();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.appointment = vo.getAppointment() == null ? null : (ims.scheduling.vo.beans.BookingAppointmentForSessionManagementVoBean)vo.getAppointment().getBean();
		this.slotresp = vo.getSlotResp() == null ? null : (ims.scheduling.vo.beans.SessionListOwnerLiteVoBean)vo.getSlotResp().getBean();
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.comment = vo.getComment();
		this.catsreferral = vo.getCatsReferral() == null ? null : (ims.RefMan.vo.beans.CatsReferralForSessionManagementVoBean)vo.getCatsReferral().getBean();
		this.cancelblockreason = vo.getCancelBlockReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getCancelBlockReason().getBean();
		this.cancelblockcomment = vo.getCancelBlockComment();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.SessionFlexibleSlotForSessionManagementVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttime = vo.getStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTime().getBean();
		this.isactive = vo.getIsActive();
		this.duration = vo.getDuration();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.appointment = vo.getAppointment() == null ? null : (ims.scheduling.vo.beans.BookingAppointmentForSessionManagementVoBean)vo.getAppointment().getBean(map);
		this.slotresp = vo.getSlotResp() == null ? null : (ims.scheduling.vo.beans.SessionListOwnerLiteVoBean)vo.getSlotResp().getBean(map);
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.comment = vo.getComment();
		this.catsreferral = vo.getCatsReferral() == null ? null : (ims.RefMan.vo.beans.CatsReferralForSessionManagementVoBean)vo.getCatsReferral().getBean(map);
		this.cancelblockreason = vo.getCancelBlockReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getCancelBlockReason().getBean();
		this.cancelblockcomment = vo.getCancelBlockComment();
	}

	public ims.scheduling.vo.SessionFlexibleSlotForSessionManagementVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.SessionFlexibleSlotForSessionManagementVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.SessionFlexibleSlotForSessionManagementVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.SessionFlexibleSlotForSessionManagementVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.SessionFlexibleSlotForSessionManagementVo();
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
	public ims.framework.utils.beans.TimeBean getStartTime()
	{
		return this.starttime;
	}
	public void setStartTime(ims.framework.utils.beans.TimeBean value)
	{
		this.starttime = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public Integer getDuration()
	{
		return this.duration;
	}
	public void setDuration(Integer value)
	{
		this.duration = value;
	}
	public ims.vo.LookupInstanceBean getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.vo.LookupInstanceBean value)
	{
		this.status = value;
	}
	public ims.scheduling.vo.beans.BookingAppointmentForSessionManagementVoBean getAppointment()
	{
		return this.appointment;
	}
	public void setAppointment(ims.scheduling.vo.beans.BookingAppointmentForSessionManagementVoBean value)
	{
		this.appointment = value;
	}
	public ims.scheduling.vo.beans.SessionListOwnerLiteVoBean getSlotResp()
	{
		return this.slotresp;
	}
	public void setSlotResp(ims.scheduling.vo.beans.SessionListOwnerLiteVoBean value)
	{
		this.slotresp = value;
	}
	public ims.vo.LookupInstanceBean getPriority()
	{
		return this.priority;
	}
	public void setPriority(ims.vo.LookupInstanceBean value)
	{
		this.priority = value;
	}
	public String getComment()
	{
		return this.comment;
	}
	public void setComment(String value)
	{
		this.comment = value;
	}
	public ims.RefMan.vo.beans.CatsReferralForSessionManagementVoBean getCatsReferral()
	{
		return this.catsreferral;
	}
	public void setCatsReferral(ims.RefMan.vo.beans.CatsReferralForSessionManagementVoBean value)
	{
		this.catsreferral = value;
	}
	public ims.vo.LookupInstanceBean getCancelBlockReason()
	{
		return this.cancelblockreason;
	}
	public void setCancelBlockReason(ims.vo.LookupInstanceBean value)
	{
		this.cancelblockreason = value;
	}
	public String getCancelBlockComment()
	{
		return this.cancelblockcomment;
	}
	public void setCancelBlockComment(String value)
	{
		this.cancelblockcomment = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.TimeBean starttime;
	private Boolean isactive;
	private Integer duration;
	private ims.vo.LookupInstanceBean status;
	private ims.scheduling.vo.beans.BookingAppointmentForSessionManagementVoBean appointment;
	private ims.scheduling.vo.beans.SessionListOwnerLiteVoBean slotresp;
	private ims.vo.LookupInstanceBean priority;
	private String comment;
	private ims.RefMan.vo.beans.CatsReferralForSessionManagementVoBean catsreferral;
	private ims.vo.LookupInstanceBean cancelblockreason;
	private String cancelblockcomment;
}