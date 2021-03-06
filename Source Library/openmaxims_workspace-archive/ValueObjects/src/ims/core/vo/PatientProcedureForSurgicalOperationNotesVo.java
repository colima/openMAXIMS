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

package ims.core.vo;

/**
 * Linked to core.clinical.PatientProcedure business object (ID: 1003100017).
 */
public class PatientProcedureForSurgicalOperationNotesVo extends ims.core.clinical.vo.PatientProcedureRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientProcedureForSurgicalOperationNotesVo()
	{
	}
	public PatientProcedureForSurgicalOperationNotesVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientProcedureForSurgicalOperationNotesVo(ims.core.vo.beans.PatientProcedureForSurgicalOperationNotesVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.proceduredescription = bean.getProcedureDescription();
		this.procedure = bean.getProcedure() == null ? null : new ims.core.clinical.vo.ProcedureRefVo(new Integer(bean.getProcedure().getId()), bean.getProcedure().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PatientProcedureForSurgicalOperationNotesVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.proceduredescription = bean.getProcedureDescription();
		this.procedure = bean.getProcedure() == null ? null : new ims.core.clinical.vo.ProcedureRefVo(new Integer(bean.getProcedure().getId()), bean.getProcedure().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PatientProcedureForSurgicalOperationNotesVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PatientProcedureForSurgicalOperationNotesVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PatientProcedureForSurgicalOperationNotesVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("PROCEDUREDESCRIPTION"))
			return getProcedureDescription();
		if(fieldName.equals("PROCEDURE"))
			return getProcedure();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getProcedureDescriptionIsNotNull()
	{
		return this.proceduredescription != null;
	}
	public String getProcedureDescription()
	{
		return this.proceduredescription;
	}
	public static int getProcedureDescriptionMaxLength()
	{
		return 255;
	}
	public void setProcedureDescription(String value)
	{
		this.isValidated = false;
		this.proceduredescription = value;
	}
	public boolean getProcedureIsNotNull()
	{
		return this.procedure != null;
	}
	public ims.core.clinical.vo.ProcedureRefVo getProcedure()
	{
		return this.procedure;
	}
	public void setProcedure(ims.core.clinical.vo.ProcedureRefVo value)
	{
		this.isValidated = false;
		this.procedure = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.proceduredescription == null || this.proceduredescription.length() == 0)
			listOfErrors.add("ProcedureDescription is mandatory");
		else if(this.proceduredescription.length() > 255)
			listOfErrors.add("The length of the field [proceduredescription] in the value object [ims.core.vo.PatientProcedureForSurgicalOperationNotesVo] is too big. It should be less or equal to 255");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientProcedureForSurgicalOperationNotesVo clone = new PatientProcedureForSurgicalOperationNotesVo(this.id, this.version);
		
		clone.proceduredescription = this.proceduredescription;
		clone.procedure = this.procedure;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(PatientProcedureForSurgicalOperationNotesVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientProcedureForSurgicalOperationNotesVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientProcedureForSurgicalOperationNotesVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientProcedureForSurgicalOperationNotesVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.proceduredescription != null)
			count++;
		if(this.procedure != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected String proceduredescription;
	protected ims.core.clinical.vo.ProcedureRefVo procedure;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
