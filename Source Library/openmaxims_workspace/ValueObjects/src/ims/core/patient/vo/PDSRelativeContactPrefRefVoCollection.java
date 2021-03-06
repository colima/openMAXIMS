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

package ims.core.patient.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.patient.PDSRelativeContactPref business object (ID: 1001100027).
 */
public class PDSRelativeContactPrefRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<PDSRelativeContactPrefRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PDSRelativeContactPrefRefVo> col = new ArrayList<PDSRelativeContactPrefRefVo>();
	public final String getBoClassName()
	{
		return "ims.core.patient.domain.objects.PDSRelativeContactPref";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(PDSRelativeContactPrefRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PDSRelativeContactPrefRefVo value)
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
	public int indexOf(PDSRelativeContactPrefRefVo instance)
	{
		return col.indexOf(instance);
	}
	public PDSRelativeContactPrefRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PDSRelativeContactPrefRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PDSRelativeContactPrefRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PDSRelativeContactPrefRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PDSRelativeContactPrefRefVoCollection clone = new PDSRelativeContactPrefRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PDSRelativeContactPrefRefVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		return clone;
	}
	public boolean isValidated()
	{
		return true;
	}
	public String[] validate()
	{
		return null;
	}
	public PDSRelativeContactPrefRefVo[] toArray()
	{
		PDSRelativeContactPrefRefVo[] arr = new PDSRelativeContactPrefRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public PDSRelativeContactPrefRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PDSRelativeContactPrefRefVoCollection sort(SortOrder order)
	{
		return sort(new PDSRelativeContactPrefRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public PDSRelativeContactPrefRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<PDSRelativeContactPrefRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PDSRelativeContactPrefRefVoComparator implements Comparator
	{
		private int direction = 1;
		public PDSRelativeContactPrefRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PDSRelativeContactPrefRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			PDSRelativeContactPrefRefVo voObj1 = (PDSRelativeContactPrefRefVo)obj1;
			PDSRelativeContactPrefRefVo voObj2 = (PDSRelativeContactPrefRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}
