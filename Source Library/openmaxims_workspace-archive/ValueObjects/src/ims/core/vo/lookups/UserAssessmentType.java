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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class UserAssessmentType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public UserAssessmentType()
	{
		super();
	}
	public UserAssessmentType(int id)
	{
		super(id, "", true);
	}
	public UserAssessmentType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public UserAssessmentType(int id, String text, boolean active, UserAssessmentType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public UserAssessmentType(int id, String text, boolean active, UserAssessmentType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public UserAssessmentType(int id, String text, boolean active, UserAssessmentType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static UserAssessmentType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new UserAssessmentType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (UserAssessmentType)super.getParentInstance();
	}
	public UserAssessmentType getParent()
	{
		return (UserAssessmentType)super.getParentInstance();
	}
	public void setParent(UserAssessmentType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		UserAssessmentType[] typedChildren = new UserAssessmentType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (UserAssessmentType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof UserAssessmentType)
		{
			super.addChild((UserAssessmentType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof UserAssessmentType)
		{
			super.removeChild((UserAssessmentType)child);
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
		UserAssessmentTypeCollection result = new UserAssessmentTypeCollection();
		result.add(ADL);
		result.add(SKIN);
		result.add(BLAD);
		result.add(BWEL);
		result.add(MOB);
		result.add(WC);
		result.add(COM);
		result.add(DIS);
		result.add(PSY);
		result.add(DPP);
		result.add(NURSEDISCHARGECHKLST);
		return result;
	}
	public static UserAssessmentType[] getNegativeInstances()
	{
		UserAssessmentType[] instances = new UserAssessmentType[11];
		instances[0] = ADL;
		instances[1] = SKIN;
		instances[2] = BLAD;
		instances[3] = BWEL;
		instances[4] = MOB;
		instances[5] = WC;
		instances[6] = COM;
		instances[7] = DIS;
		instances[8] = PSY;
		instances[9] = DPP;
		instances[10] = NURSEDISCHARGECHKLST;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[11];
		negativeInstances[0] = "ADL";
		negativeInstances[1] = "SKIN";
		negativeInstances[2] = "BLAD";
		negativeInstances[3] = "BWEL";
		negativeInstances[4] = "MOB";
		negativeInstances[5] = "WC";
		negativeInstances[6] = "COM";
		negativeInstances[7] = "DIS";
		negativeInstances[8] = "PSY";
		negativeInstances[9] = "DPP";
		negativeInstances[10] = "NURSEDISCHARGECHKLST";
		return negativeInstances;
	}
	public static UserAssessmentType getNegativeInstance(String name)
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
	public static UserAssessmentType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		UserAssessmentType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021134;
	public static final UserAssessmentType ADL = new UserAssessmentType(-768, "Activities of Daily Living ", true, null, null, Color.Default);
	public static final UserAssessmentType SKIN = new UserAssessmentType(-769, "Skin Management", true, null, null, Color.Default);
	public static final UserAssessmentType BLAD = new UserAssessmentType(-770, "Bladder Management", true, null, null, Color.Default);
	public static final UserAssessmentType BWEL = new UserAssessmentType(-771, "Bowel Management", true, null, null, Color.Default);
	public static final UserAssessmentType MOB = new UserAssessmentType(-772, "Mobility", true, null, null, Color.Default);
	public static final UserAssessmentType WC = new UserAssessmentType(-773, "Wheelchair and Equipment", true, null, null, Color.Default);
	public static final UserAssessmentType COM = new UserAssessmentType(-774, "Community Preparation ", true, null, null, Color.Default);
	public static final UserAssessmentType DIS = new UserAssessmentType(-775, "Discharge Coordination ", true, null, null, Color.Default);
	public static final UserAssessmentType PSY = new UserAssessmentType(-776, "Psychological Issues", true, null, null, Color.Default);
	public static final UserAssessmentType DPP = new UserAssessmentType(-969, "DailyPatientProgress", true, null, null, Color.Default);
	public static final UserAssessmentType NURSEDISCHARGECHKLST = new UserAssessmentType(-970, "Nursing Discharge Checklist", true, null, null, Color.Default);
}