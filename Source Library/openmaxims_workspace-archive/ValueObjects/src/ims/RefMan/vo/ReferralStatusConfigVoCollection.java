// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.admin.ReferralStatusConfig business object (ID: 1004100034).
 */
public class ReferralStatusConfigVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<ReferralStatusConfigVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<ReferralStatusConfigVo> col = new ArrayList<ReferralStatusConfigVo>();
	public String getBoClassName()
	{
		return "ims.core.admin.domain.objects.ReferralStatusConfig";
	}
	public boolean add(ReferralStatusConfigVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, ReferralStatusConfigVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(ReferralStatusConfigVo instance)
	{
		return col.indexOf(instance);
	}
	public ReferralStatusConfigVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, ReferralStatusConfigVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(ReferralStatusConfigVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(ReferralStatusConfigVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		ReferralStatusConfigVoCollection clone = new ReferralStatusConfigVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((ReferralStatusConfigVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public ReferralStatusConfigVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public ReferralStatusConfigVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public ReferralStatusConfigVoCollection sort(SortOrder order)
	{
		return sort(new ReferralStatusConfigVoComparator(order));
	}
	public ReferralStatusConfigVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new ReferralStatusConfigVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public ReferralStatusConfigVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.core.admin.vo.ReferralStatusConfigRefVoCollection toRefVoCollection()
	{
		ims.core.admin.vo.ReferralStatusConfigRefVoCollection result = new ims.core.admin.vo.ReferralStatusConfigRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public ReferralStatusConfigVo[] toArray()
	{
		ReferralStatusConfigVo[] arr = new ReferralStatusConfigVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<ReferralStatusConfigVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class ReferralStatusConfigVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public ReferralStatusConfigVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ReferralStatusConfigVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public ReferralStatusConfigVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			ReferralStatusConfigVo voObj1 = (ReferralStatusConfigVo)obj1;
			ReferralStatusConfigVo voObj2 = (ReferralStatusConfigVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.ReferralStatusConfigVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.ReferralStatusConfigVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.ReferralStatusConfigVoBean[] result = new ims.RefMan.vo.beans.ReferralStatusConfigVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			ReferralStatusConfigVo vo = ((ReferralStatusConfigVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.ReferralStatusConfigVoBean)vo.getBean();
		}
		return result;
	}
	public static ReferralStatusConfigVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ReferralStatusConfigVoCollection coll = new ReferralStatusConfigVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.ReferralStatusConfigVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static ReferralStatusConfigVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.ReferralStatusConfigVoBean[] beans)
	{
		ReferralStatusConfigVoCollection coll = new ReferralStatusConfigVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
