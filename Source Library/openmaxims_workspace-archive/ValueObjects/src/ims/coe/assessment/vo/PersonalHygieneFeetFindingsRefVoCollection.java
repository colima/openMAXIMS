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

package ims.coe.assessment.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to coe.assessment.Personal Hygiene Feet Findings business object (ID: 1012100026).
 */
public class PersonalHygieneFeetFindingsRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<PersonalHygieneFeetFindingsRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<PersonalHygieneFeetFindingsRefVo> col = new ArrayList<PersonalHygieneFeetFindingsRefVo>();
	public final String getBoClassName()
	{
		return "ims.coe.assessment.domain.objects.PersonalHygieneFeetFindings";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(PersonalHygieneFeetFindingsRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, PersonalHygieneFeetFindingsRefVo value)
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
	public int indexOf(PersonalHygieneFeetFindingsRefVo instance)
	{
		return col.indexOf(instance);
	}
	public PersonalHygieneFeetFindingsRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, PersonalHygieneFeetFindingsRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(PersonalHygieneFeetFindingsRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(PersonalHygieneFeetFindingsRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		PersonalHygieneFeetFindingsRefVoCollection clone = new PersonalHygieneFeetFindingsRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((PersonalHygieneFeetFindingsRefVo)this.col.get(x).clone());
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
	public PersonalHygieneFeetFindingsRefVo[] toArray()
	{
		PersonalHygieneFeetFindingsRefVo[] arr = new PersonalHygieneFeetFindingsRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public PersonalHygieneFeetFindingsRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public PersonalHygieneFeetFindingsRefVoCollection sort(SortOrder order)
	{
		return sort(new PersonalHygieneFeetFindingsRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public PersonalHygieneFeetFindingsRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<PersonalHygieneFeetFindingsRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class PersonalHygieneFeetFindingsRefVoComparator implements Comparator
	{
		private int direction = 1;
		public PersonalHygieneFeetFindingsRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public PersonalHygieneFeetFindingsRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			PersonalHygieneFeetFindingsRefVo voObj1 = (PersonalHygieneFeetFindingsRefVo)obj1;
			PersonalHygieneFeetFindingsRefVo voObj2 = (PersonalHygieneFeetFindingsRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}
