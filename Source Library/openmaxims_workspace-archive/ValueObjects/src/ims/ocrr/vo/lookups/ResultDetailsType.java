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

package ims.ocrr.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ResultDetailsType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ResultDetailsType()
	{
		super();
	}
	public ResultDetailsType(int id)
	{
		super(id, "", true);
	}
	public ResultDetailsType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ResultDetailsType(int id, String text, boolean active, ResultDetailsType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ResultDetailsType(int id, String text, boolean active, ResultDetailsType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ResultDetailsType(int id, String text, boolean active, ResultDetailsType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ResultDetailsType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ResultDetailsType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ResultDetailsType)super.getParentInstance();
	}
	public ResultDetailsType getParent()
	{
		return (ResultDetailsType)super.getParentInstance();
	}
	public void setParent(ResultDetailsType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ResultDetailsType[] typedChildren = new ResultDetailsType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ResultDetailsType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ResultDetailsType)
		{
			super.addChild((ResultDetailsType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ResultDetailsType)
		{
			super.removeChild((ResultDetailsType)child);
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
		ResultDetailsTypeCollection result = new ResultDetailsTypeCollection();
		result.add(PATHOLOGY);
		result.add(CLINICAL);
		result.add(DOCUMENT);
		return result;
	}
	public static ResultDetailsType[] getNegativeInstances()
	{
		ResultDetailsType[] instances = new ResultDetailsType[3];
		instances[0] = PATHOLOGY;
		instances[1] = CLINICAL;
		instances[2] = DOCUMENT;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "PATHOLOGY";
		negativeInstances[1] = "CLINICAL";
		negativeInstances[2] = "DOCUMENT";
		return negativeInstances;
	}
	public static ResultDetailsType getNegativeInstance(String name)
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
	public static ResultDetailsType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ResultDetailsType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1161058;
	public static final ResultDetailsType PATHOLOGY = new ResultDetailsType(-2479, "Pathology", true, null, null, Color.Default);
	public static final ResultDetailsType CLINICAL = new ResultDetailsType(-2480, "Clinical", true, null, null, Color.Default);
	public static final ResultDetailsType DOCUMENT = new ResultDetailsType(-2481, "Document", true, null, null, Color.Default);
}
