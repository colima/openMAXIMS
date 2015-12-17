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

package ims.dtomove.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to dto_move.MachineModality business object (ID: 1105100005).
 */
public class MachineModalityVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<MachineModalityVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<MachineModalityVo> col = new ArrayList<MachineModalityVo>();
	public String getBoClassName()
	{
		return "ims.dto_move.domain.objects.MachineModality";
	}
	public boolean add(MachineModalityVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, MachineModalityVo value)
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
	public int indexOf(MachineModalityVo instance)
	{
		return col.indexOf(instance);
	}
	public MachineModalityVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, MachineModalityVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(MachineModalityVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(MachineModalityVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		MachineModalityVoCollection clone = new MachineModalityVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((MachineModalityVo)this.col.get(x).clone());
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
	public MachineModalityVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public MachineModalityVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public MachineModalityVoCollection sort(SortOrder order)
	{
		return sort(new MachineModalityVoComparator(order));
	}
	public MachineModalityVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new MachineModalityVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public MachineModalityVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.dto_move.vo.MachineModalityRefVoCollection toRefVoCollection()
	{
		ims.dto_move.vo.MachineModalityRefVoCollection result = new ims.dto_move.vo.MachineModalityRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public MachineModalityVo[] toArray()
	{
		MachineModalityVo[] arr = new MachineModalityVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<MachineModalityVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class MachineModalityVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public MachineModalityVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public MachineModalityVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public MachineModalityVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			MachineModalityVo voObj1 = (MachineModalityVo)obj1;
			MachineModalityVo voObj2 = (MachineModalityVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.dtomove.vo.beans.MachineModalityVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.dtomove.vo.beans.MachineModalityVoBean[] getBeanCollectionArray()
	{
		ims.dtomove.vo.beans.MachineModalityVoBean[] result = new ims.dtomove.vo.beans.MachineModalityVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			MachineModalityVo vo = ((MachineModalityVo)col.get(i));
			result[i] = (ims.dtomove.vo.beans.MachineModalityVoBean)vo.getBean();
		}
		return result;
	}
	public static MachineModalityVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		MachineModalityVoCollection coll = new MachineModalityVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.dtomove.vo.beans.MachineModalityVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static MachineModalityVoCollection buildFromBeanCollection(ims.dtomove.vo.beans.MachineModalityVoBean[] beans)
	{
		MachineModalityVoCollection coll = new MachineModalityVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}