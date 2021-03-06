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

package ims.scheduling.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class AppointmentTrackingStatus extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public AppointmentTrackingStatus()
	{
		super();
	}
	public AppointmentTrackingStatus(int id)
	{
		super(id, "", true);
	}
	public AppointmentTrackingStatus(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public AppointmentTrackingStatus(int id, String text, boolean active, AppointmentTrackingStatus parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public AppointmentTrackingStatus(int id, String text, boolean active, AppointmentTrackingStatus parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public AppointmentTrackingStatus(int id, String text, boolean active, AppointmentTrackingStatus parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static AppointmentTrackingStatus buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new AppointmentTrackingStatus(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (AppointmentTrackingStatus)super.getParentInstance();
	}
	public AppointmentTrackingStatus getParent()
	{
		return (AppointmentTrackingStatus)super.getParentInstance();
	}
	public void setParent(AppointmentTrackingStatus parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		AppointmentTrackingStatus[] typedChildren = new AppointmentTrackingStatus[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (AppointmentTrackingStatus)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof AppointmentTrackingStatus)
		{
			super.addChild((AppointmentTrackingStatus)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof AppointmentTrackingStatus)
		{
			super.removeChild((AppointmentTrackingStatus)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		AppointmentTrackingStatusCollection result = new AppointmentTrackingStatusCollection();
		result.add(PATIENT_ARRIVED);
		result.add(PATIENT_SEEN_BY_CONSULTANT);
		result.add(PATIENT_WAITING_FOR_NEXT);
		result.add(PATIENT_SEEN_BY_ANAESTHETIST);
		result.add(PATIENT_WITH_PHYSIOTHERAPY);
		result.add(PATIENT_SEEN_BY_PREOP_NURSE);
		result.add(PATIENT_WITH_DIAGNOSTIC_SERVICES);
		result.add(PATIENT_VISIT_COMPLETE);
		result.add(UNDO_ARRIVAL);
		result.add(UNDO_DNA);
		result.add(UNDO_NOT_SEEN);
		result.add(UNDO_SEEN);
		return result;
	}
	public static AppointmentTrackingStatus[] getNegativeInstances()
	{
		AppointmentTrackingStatus[] instances = new AppointmentTrackingStatus[12];
		instances[0] = PATIENT_ARRIVED;
		instances[1] = PATIENT_SEEN_BY_CONSULTANT;
		instances[2] = PATIENT_WAITING_FOR_NEXT;
		instances[3] = PATIENT_SEEN_BY_ANAESTHETIST;
		instances[4] = PATIENT_WITH_PHYSIOTHERAPY;
		instances[5] = PATIENT_SEEN_BY_PREOP_NURSE;
		instances[6] = PATIENT_WITH_DIAGNOSTIC_SERVICES;
		instances[7] = PATIENT_VISIT_COMPLETE;
		instances[8] = UNDO_ARRIVAL;
		instances[9] = UNDO_DNA;
		instances[10] = UNDO_NOT_SEEN;
		instances[11] = UNDO_SEEN;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[12];
		negativeInstances[0] = "PATIENT_ARRIVED";
		negativeInstances[1] = "PATIENT_SEEN_BY_CONSULTANT";
		negativeInstances[2] = "PATIENT_WAITING_FOR_NEXT";
		negativeInstances[3] = "PATIENT_SEEN_BY_ANAESTHETIST";
		negativeInstances[4] = "PATIENT_WITH_PHYSIOTHERAPY";
		negativeInstances[5] = "PATIENT_SEEN_BY_PREOP_NURSE";
		negativeInstances[6] = "PATIENT_WITH_DIAGNOSTIC_SERVICES";
		negativeInstances[7] = "PATIENT_VISIT_COMPLETE";
		negativeInstances[8] = "UNDO_ARRIVAL";
		negativeInstances[9] = "UNDO_DNA";
		negativeInstances[10] = "UNDO_NOT_SEEN";
		negativeInstances[11] = "UNDO_SEEN";
		return negativeInstances;
	}
	public static AppointmentTrackingStatus getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static AppointmentTrackingStatus getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		AppointmentTrackingStatus[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1141023;
	public static final AppointmentTrackingStatus PATIENT_ARRIVED = new AppointmentTrackingStatus(-2120, "Arrived", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus PATIENT_SEEN_BY_CONSULTANT = new AppointmentTrackingStatus(-2121, "Seen by Consultant", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus PATIENT_WAITING_FOR_NEXT = new AppointmentTrackingStatus(-2122, "Waiting for Next", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus PATIENT_SEEN_BY_ANAESTHETIST = new AppointmentTrackingStatus(-2123, "Seen by Anaesthetist", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus PATIENT_WITH_PHYSIOTHERAPY = new AppointmentTrackingStatus(-2124, "Seen by Physiotherapy", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus PATIENT_SEEN_BY_PREOP_NURSE = new AppointmentTrackingStatus(-2125, "Seen by Pre-Op Nurse", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus PATIENT_WITH_DIAGNOSTIC_SERVICES = new AppointmentTrackingStatus(-2126, "Seen by Diagnostic services", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus PATIENT_VISIT_COMPLETE = new AppointmentTrackingStatus(-2127, "Visit Complete", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus UNDO_ARRIVAL = new AppointmentTrackingStatus(-2606, "Undo Arrival", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus UNDO_DNA = new AppointmentTrackingStatus(-2968, "Undo DNA", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus UNDO_NOT_SEEN = new AppointmentTrackingStatus(-2969, "Undo Not Seen", true, null, null, Color.Default);
	public static final AppointmentTrackingStatus UNDO_SEEN = new AppointmentTrackingStatus(-2970, "Undo Seen", true, null, null, Color.Default);
}
