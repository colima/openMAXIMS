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

package ims.assessment.vo;

/**
 * Linked to Assessment.Configuration.UserDefinedObjectComponent business object (ID: 1028100005).
 */
public class UserDefinedObjectComponentVo extends ims.assessment.configuration.vo.UserDefinedObjectComponentRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public UserDefinedObjectComponentVo()
	{
	}
	public UserDefinedObjectComponentVo(Integer id, int version)
	{
		super(id, version);
	}
	public UserDefinedObjectComponentVo(ims.assessment.vo.beans.UserDefinedObjectComponentVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.userassessment = bean.getUserAssessment() == null ? null : bean.getUserAssessment().buildVo();
		this.graphic = bean.getGraphic() == null ? null : bean.getGraphic().buildVo();
		this.activestatus = bean.getActiveStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getActiveStatus());
		this.seqno = bean.getSeqNo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.beans.UserDefinedObjectComponentVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.userassessment = bean.getUserAssessment() == null ? null : bean.getUserAssessment().buildVo(map);
		this.graphic = bean.getGraphic() == null ? null : bean.getGraphic().buildVo(map);
		this.activestatus = bean.getActiveStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getActiveStatus());
		this.seqno = bean.getSeqNo();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.beans.UserDefinedObjectComponentVoBean bean = null;
		if(map != null)
			bean = (ims.assessment.vo.beans.UserDefinedObjectComponentVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.assessment.vo.beans.UserDefinedObjectComponentVoBean();
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
		if(fieldName.equals("USERASSESSMENT"))
			return getUserAssessment();
		if(fieldName.equals("GRAPHIC"))
			return getGraphic();
		if(fieldName.equals("ACTIVESTATUS"))
			return getActiveStatus();
		if(fieldName.equals("SEQNO"))
			return getSeqNo();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getUserAssessmentIsNotNull()
	{
		return this.userassessment != null;
	}
	public ims.assessment.vo.UserAssessmentVo getUserAssessment()
	{
		return this.userassessment;
	}
	public void setUserAssessment(ims.assessment.vo.UserAssessmentVo value)
	{
		this.isValidated = false;
		this.userassessment = value;
	}
	public boolean getGraphicIsNotNull()
	{
		return this.graphic != null;
	}
	public ims.assessment.vo.GraphicAssessmentVo getGraphic()
	{
		return this.graphic;
	}
	public void setGraphic(ims.assessment.vo.GraphicAssessmentVo value)
	{
		this.isValidated = false;
		this.graphic = value;
	}
	public boolean getActiveStatusIsNotNull()
	{
		return this.activestatus != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getActiveStatus()
	{
		return this.activestatus;
	}
	public void setActiveStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.activestatus = value;
	}
	public boolean getSeqNoIsNotNull()
	{
		return this.seqno != null;
	}
	public Integer getSeqNo()
	{
		return this.seqno;
	}
	public void setSeqNo(Integer value)
	{
		this.isValidated = false;
		this.seqno = value;
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
		if(this.activestatus == null)
			listOfErrors.add("Status is mandatory");
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
	
		UserDefinedObjectComponentVo clone = new UserDefinedObjectComponentVo(this.id, this.version);
		
		if(this.userassessment == null)
			clone.userassessment = null;
		else
			clone.userassessment = (ims.assessment.vo.UserAssessmentVo)this.userassessment.clone();
		if(this.graphic == null)
			clone.graphic = null;
		else
			clone.graphic = (ims.assessment.vo.GraphicAssessmentVo)this.graphic.clone();
		if(this.activestatus == null)
			clone.activestatus = null;
		else
			clone.activestatus = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.activestatus.clone();
		clone.seqno = this.seqno;
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
		if (!(UserDefinedObjectComponentVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A UserDefinedObjectComponentVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		UserDefinedObjectComponentVo compareObj = (UserDefinedObjectComponentVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSeqNo() == null && compareObj.getSeqNo() != null)
				return -1;
			if(this.getSeqNo() != null && compareObj.getSeqNo() == null)
				return 1;
			if(this.getSeqNo() != null && compareObj.getSeqNo() != null)
				retVal = this.getSeqNo().compareTo(compareObj.getSeqNo());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.userassessment != null)
			count++;
		if(this.graphic != null)
			count++;
		if(this.activestatus != null)
			count++;
		if(this.seqno != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.assessment.vo.UserAssessmentVo userassessment;
	protected ims.assessment.vo.GraphicAssessmentVo graphic;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus activestatus;
	protected Integer seqno;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
