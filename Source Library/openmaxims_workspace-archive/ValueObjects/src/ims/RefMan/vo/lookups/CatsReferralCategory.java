// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class CatsReferralCategory extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public CatsReferralCategory()
	{
		super();
	}
	public CatsReferralCategory(int id)
	{
		super(id, "", true);
	}
	public CatsReferralCategory(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public CatsReferralCategory(int id, String text, boolean active, CatsReferralCategory parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public CatsReferralCategory(int id, String text, boolean active, CatsReferralCategory parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public CatsReferralCategory(int id, String text, boolean active, CatsReferralCategory parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static CatsReferralCategory buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new CatsReferralCategory(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (CatsReferralCategory)super.getParentInstance();
	}
	public CatsReferralCategory getParent()
	{
		return (CatsReferralCategory)super.getParentInstance();
	}
	public void setParent(CatsReferralCategory parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		CatsReferralCategory[] typedChildren = new CatsReferralCategory[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (CatsReferralCategory)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof CatsReferralCategory)
		{
			super.addChild((CatsReferralCategory)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof CatsReferralCategory)
		{
			super.removeChild((CatsReferralCategory)child);
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
		CatsReferralCategoryCollection result = new CatsReferralCategoryCollection();
		return result;
	}
	public static CatsReferralCategory[] getNegativeInstances()
	{
		return new CatsReferralCategory[] {};
	}
	public static String[] getNegativeInstanceNames()
	{
		return new String[] {};
	}
	public static CatsReferralCategory getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		// No negative instances found
		return null;
	}
	public static CatsReferralCategory getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		// No negative instances found
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1341033;
}
