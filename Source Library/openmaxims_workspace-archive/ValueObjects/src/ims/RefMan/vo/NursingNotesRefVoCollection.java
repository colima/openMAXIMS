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
 * Linked to RefMan.NursingNotes business object (ID: 1096100002).
 */
public class NursingNotesRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<NursingNotesRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<NursingNotesRefVo> col = new ArrayList<NursingNotesRefVo>();
	public final String getBoClassName()
	{
		return "ims.RefMan.domain.objects.NursingNotes";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(NursingNotesRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, NursingNotesRefVo value)
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
	public int indexOf(NursingNotesRefVo instance)
	{
		return col.indexOf(instance);
	}
	public NursingNotesRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, NursingNotesRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(NursingNotesRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(NursingNotesRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		NursingNotesRefVoCollection clone = new NursingNotesRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((NursingNotesRefVo)this.col.get(x).clone());
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
	public NursingNotesRefVo[] toArray()
	{
		NursingNotesRefVo[] arr = new NursingNotesRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public NursingNotesRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public NursingNotesRefVoCollection sort(SortOrder order)
	{
		return sort(new NursingNotesRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public NursingNotesRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<NursingNotesRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class NursingNotesRefVoComparator implements Comparator
	{
		private int direction = 1;
		public NursingNotesRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public NursingNotesRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			NursingNotesRefVo voObj1 = (NursingNotesRefVo)obj1;
			NursingNotesRefVo voObj2 = (NursingNotesRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}