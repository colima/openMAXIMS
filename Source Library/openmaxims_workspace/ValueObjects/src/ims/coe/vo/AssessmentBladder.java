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

package ims.coe.vo;

/**
 * Linked to nursing.assessment.Assessment Component business object (ID: 1015100001).
 */
public class AssessmentBladder extends ims.nursing.vo.AssessmentComponent implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AssessmentBladder()
	{
	}
	public AssessmentBladder(Integer id, int version)
	{
		super(id, version);
	}
	public AssessmentBladder(ims.coe.vo.beans.AssessmentBladderBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.iscomplete = bean.getIsComplete();
		this.assessmentinfo = ims.nursing.vo.AssessmentInfoCollection.buildFromBeanCollection(bean.getAssessmentInfo());
		this.copy = bean.getCopy();
		this.componenttype = bean.getComponentType() == null ? null : ims.nursing.vo.lookups.AssessmentComponentType.buildLookup(bean.getComponentType());
		this.lastassessmentinfo = bean.getLastAssessmentInfo() == null ? null : bean.getLastAssessmentInfo().buildVo();
		this.careplantemplate = ims.nursing.vo.CarePlanTemplateCollection.buildFromBeanCollection(bean.getCarePlanTemplate());
		this.careplans = ims.nursing.vo.CarePlanCollection.buildFromBeanCollection(bean.getCarePlans());
		this.continence = bean.getContinence() == null ? null : bean.getContinence().buildVo();
		this.bladdermicturition = bean.getBladderMicturition() == null ? null : bean.getBladderMicturition().buildVo();
		this.assistancecontinence = bean.getAssistanceContinence() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getAssistanceContinence());
		this.bladderskills = ims.coe.vo.BladderSkillsCollection.buildFromBeanCollection(bean.getBladderSkills());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.coe.vo.beans.AssessmentBladderBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.iscomplete = bean.getIsComplete();
		this.assessmentinfo = ims.nursing.vo.AssessmentInfoCollection.buildFromBeanCollection(bean.getAssessmentInfo());
		this.copy = bean.getCopy();
		this.componenttype = bean.getComponentType() == null ? null : ims.nursing.vo.lookups.AssessmentComponentType.buildLookup(bean.getComponentType());
		this.lastassessmentinfo = bean.getLastAssessmentInfo() == null ? null : bean.getLastAssessmentInfo().buildVo(map);
		this.careplantemplate = ims.nursing.vo.CarePlanTemplateCollection.buildFromBeanCollection(bean.getCarePlanTemplate());
		this.careplans = ims.nursing.vo.CarePlanCollection.buildFromBeanCollection(bean.getCarePlans());
		this.continence = bean.getContinence() == null ? null : bean.getContinence().buildVo(map);
		this.bladdermicturition = bean.getBladderMicturition() == null ? null : bean.getBladderMicturition().buildVo(map);
		this.assistancecontinence = bean.getAssistanceContinence() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getAssistanceContinence());
		this.bladderskills = ims.coe.vo.BladderSkillsCollection.buildFromBeanCollection(bean.getBladderSkills());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.coe.vo.beans.AssessmentBladderBean bean = null;
		if(map != null)
			bean = (ims.coe.vo.beans.AssessmentBladderBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.coe.vo.beans.AssessmentBladderBean();
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
		if(fieldName.equals("CONTINENCE"))
			return getContinence();
		if(fieldName.equals("BLADDERMICTURITION"))
			return getBladderMicturition();
		if(fieldName.equals("ASSISTANCECONTINENCE"))
			return getAssistanceContinence();
		if(fieldName.equals("BLADDERSKILLS"))
			return getBladderSkills();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getContinenceIsNotNull()
	{
		return this.continence != null;
	}
	public ims.nursing.vo.ContinenceVo getContinence()
	{
		return this.continence;
	}
	public void setContinence(ims.nursing.vo.ContinenceVo value)
	{
		this.isValidated = false;
		this.continence = value;
	}
	public boolean getBladderMicturitionIsNotNull()
	{
		return this.bladdermicturition != null;
	}
	public ims.coe.vo.MicturitionVo getBladderMicturition()
	{
		return this.bladdermicturition;
	}
	public void setBladderMicturition(ims.coe.vo.MicturitionVo value)
	{
		this.isValidated = false;
		this.bladdermicturition = value;
	}
	public boolean getAssistanceContinenceIsNotNull()
	{
		return this.assistancecontinence != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getAssistanceContinence()
	{
		return this.assistancecontinence;
	}
	public void setAssistanceContinence(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.assistancecontinence = value;
	}
	public boolean getBladderSkillsIsNotNull()
	{
		return this.bladderskills != null;
	}
	public ims.coe.vo.BladderSkillsCollection getBladderSkills()
	{
		return this.bladderskills;
	}
	public void setBladderSkills(ims.coe.vo.BladderSkillsCollection value)
	{
		this.isValidated = false;
		this.bladderskills = value;
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
		if(this.assessmentinfo != null)
		{
			if(!this.assessmentinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.lastassessmentinfo != null)
		{
			if(!this.lastassessmentinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.careplantemplate != null)
		{
			if(!this.careplantemplate.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.careplans != null)
		{
			if(!this.careplans.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.continence != null)
		{
			if(!this.continence.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.bladdermicturition != null)
		{
			if(!this.bladdermicturition.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.bladderskills != null)
		{
			if(!this.bladderskills.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.assessmentinfo != null)
		{
			String[] listOfOtherErrors = this.assessmentinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.lastassessmentinfo != null)
		{
			String[] listOfOtherErrors = this.lastassessmentinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.careplantemplate != null)
		{
			String[] listOfOtherErrors = this.careplantemplate.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.careplans != null)
		{
			String[] listOfOtherErrors = this.careplans.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.continence != null)
		{
			String[] listOfOtherErrors = this.continence.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.bladdermicturition != null)
		{
			String[] listOfOtherErrors = this.bladdermicturition.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.bladderskills != null)
		{
			String[] listOfOtherErrors = this.bladderskills.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
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
	
		AssessmentBladder clone = new AssessmentBladder(this.id, this.version);
		
		clone.iscomplete = this.iscomplete;
		if(this.assessmentinfo == null)
			clone.assessmentinfo = null;
		else
			clone.assessmentinfo = (ims.nursing.vo.AssessmentInfoCollection)this.assessmentinfo.clone();
		clone.copy = this.copy;
		if(this.componenttype == null)
			clone.componenttype = null;
		else
			clone.componenttype = (ims.nursing.vo.lookups.AssessmentComponentType)this.componenttype.clone();
		if(this.lastassessmentinfo == null)
			clone.lastassessmentinfo = null;
		else
			clone.lastassessmentinfo = (ims.nursing.vo.AssessmentInfo)this.lastassessmentinfo.clone();
		if(this.careplantemplate == null)
			clone.careplantemplate = null;
		else
			clone.careplantemplate = (ims.nursing.vo.CarePlanTemplateCollection)this.careplantemplate.clone();
		if(this.careplans == null)
			clone.careplans = null;
		else
			clone.careplans = (ims.nursing.vo.CarePlanCollection)this.careplans.clone();
		if(this.continence == null)
			clone.continence = null;
		else
			clone.continence = (ims.nursing.vo.ContinenceVo)this.continence.clone();
		if(this.bladdermicturition == null)
			clone.bladdermicturition = null;
		else
			clone.bladdermicturition = (ims.coe.vo.MicturitionVo)this.bladdermicturition.clone();
		if(this.assistancecontinence == null)
			clone.assistancecontinence = null;
		else
			clone.assistancecontinence = (ims.core.vo.lookups.YesNoUnknown)this.assistancecontinence.clone();
		if(this.bladderskills == null)
			clone.bladderskills = null;
		else
			clone.bladderskills = (ims.coe.vo.BladderSkillsCollection)this.bladderskills.clone();
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
		if (!(AssessmentBladder.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AssessmentBladder object cannot be compared an Object of type " + obj.getClass().getName());
		}
		AssessmentBladder compareObj = (AssessmentBladder)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_AssessmentComponent() == null && compareObj.getID_AssessmentComponent() != null)
				return -1;
			if(this.getID_AssessmentComponent() != null && compareObj.getID_AssessmentComponent() == null)
				return 1;
			if(this.getID_AssessmentComponent() != null && compareObj.getID_AssessmentComponent() != null)
				retVal = this.getID_AssessmentComponent().compareTo(compareObj.getID_AssessmentComponent());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.continence != null)
			count++;
		if(this.bladdermicturition != null)
			count++;
		if(this.assistancecontinence != null)
			count++;
		if(this.bladderskills != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 4;
	}
	protected ims.nursing.vo.ContinenceVo continence;
	protected ims.coe.vo.MicturitionVo bladdermicturition;
	protected ims.core.vo.lookups.YesNoUnknown assistancecontinence;
	protected ims.coe.vo.BladderSkillsCollection bladderskills;
	private boolean isValidated = false;
	private boolean isBusy = false;
}