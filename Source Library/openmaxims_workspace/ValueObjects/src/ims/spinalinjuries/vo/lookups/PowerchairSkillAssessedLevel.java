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

package ims.spinalinjuries.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class PowerchairSkillAssessedLevel extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public PowerchairSkillAssessedLevel()
	{
		super();
	}
	public PowerchairSkillAssessedLevel(int id)
	{
		super(id, "", true);
	}
	public PowerchairSkillAssessedLevel(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public PowerchairSkillAssessedLevel(int id, String text, boolean active, PowerchairSkillAssessedLevel parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public PowerchairSkillAssessedLevel(int id, String text, boolean active, PowerchairSkillAssessedLevel parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public PowerchairSkillAssessedLevel(int id, String text, boolean active, PowerchairSkillAssessedLevel parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static PowerchairSkillAssessedLevel buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new PowerchairSkillAssessedLevel(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (PowerchairSkillAssessedLevel)super.getParentInstance();
	}
	public PowerchairSkillAssessedLevel getParent()
	{
		return (PowerchairSkillAssessedLevel)super.getParentInstance();
	}
	public void setParent(PowerchairSkillAssessedLevel parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		PowerchairSkillAssessedLevel[] typedChildren = new PowerchairSkillAssessedLevel[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (PowerchairSkillAssessedLevel)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof PowerchairSkillAssessedLevel)
		{
			super.addChild((PowerchairSkillAssessedLevel)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof PowerchairSkillAssessedLevel)
		{
			super.removeChild((PowerchairSkillAssessedLevel)child);
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
		PowerchairSkillAssessedLevelCollection result = new PowerchairSkillAssessedLevelCollection();
		result.add(INDEPENDENT);
		result.add(SUPERVISION);
		result.add(SAFE);
		return result;
	}
	public static PowerchairSkillAssessedLevel[] getNegativeInstances()
	{
		PowerchairSkillAssessedLevel[] instances = new PowerchairSkillAssessedLevel[3];
		instances[0] = INDEPENDENT;
		instances[1] = SUPERVISION;
		instances[2] = SAFE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "INDEPENDENT";
		negativeInstances[1] = "SUPERVISION";
		negativeInstances[2] = "SAFE";
		return negativeInstances;
	}
	public static PowerchairSkillAssessedLevel getNegativeInstance(String name)
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
	public static PowerchairSkillAssessedLevel getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		PowerchairSkillAssessedLevel[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1051066;
	public static final PowerchairSkillAssessedLevel INDEPENDENT = new PowerchairSkillAssessedLevel(-250, "Independent", true, null, null, Color.Default);
	public static final PowerchairSkillAssessedLevel SUPERVISION = new PowerchairSkillAssessedLevel(-251, "Supervision", true, null, null, Color.Default);
	public static final PowerchairSkillAssessedLevel SAFE = new PowerchairSkillAssessedLevel(-252, "Safe", true, null, null, Color.Default);
}