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

package ims.emergency.vo;

/**
 * Linked to emergency.InterventionTreatmentDetail business object (ID: 1086100021).
 */
public class InterventionTreatmentDetailVo extends ims.emergency.vo.InterventionTreatmentDetailLiteVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public InterventionTreatmentDetailVo()
	{
	}
	public InterventionTreatmentDetailVo(Integer id, int version)
	{
		super(id, version);
	}
	public InterventionTreatmentDetailVo(ims.emergency.vo.beans.InterventionTreatmentDetailVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.treatmentinterventiondescription = bean.getTreatmentInterventionDescription();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.treatmentintervention = bean.getTreatmentIntervention() == null ? null : bean.getTreatmentIntervention().buildVo();
		this.addedduringcoding = bean.getAddedDuringCoding();
		this.codingsequence = bean.getCodingSequence();
		this.interventiontreatmentcomplete = bean.getInterventionTreatmentComplete() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getInterventionTreatmentComplete());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.InterventionTreatmentDetailVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.treatmentinterventiondescription = bean.getTreatmentInterventionDescription();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.treatmentintervention = bean.getTreatmentIntervention() == null ? null : bean.getTreatmentIntervention().buildVo(map);
		this.addedduringcoding = bean.getAddedDuringCoding();
		this.codingsequence = bean.getCodingSequence();
		this.interventiontreatmentcomplete = bean.getInterventionTreatmentComplete() == null ? null : ims.core.vo.lookups.YesNo.buildLookup(bean.getInterventionTreatmentComplete());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.InterventionTreatmentDetailVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.InterventionTreatmentDetailVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.InterventionTreatmentDetailVoBean();
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
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("TREATMENTINTERVENTION"))
			return getTreatmentIntervention();
		if(fieldName.equals("ADDEDDURINGCODING"))
			return getAddedDuringCoding();
		if(fieldName.equals("CODINGSEQUENCE"))
			return getCodingSequence();
		if(fieldName.equals("INTERVENTIONTREATMENTCOMPLETE"))
			return getInterventionTreatmentComplete();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean getTreatmentInterventionIsNotNull()
	{
		return this.treatmentintervention != null;
	}
	public ims.clinicaladmin.vo.TreatmentInterventionLiteVo getTreatmentIntervention()
	{
		return this.treatmentintervention;
	}
	public void setTreatmentIntervention(ims.clinicaladmin.vo.TreatmentInterventionLiteVo value)
	{
		this.isValidated = false;
		this.treatmentintervention = value;
	}
	public boolean getAddedDuringCodingIsNotNull()
	{
		return this.addedduringcoding != null;
	}
	public Boolean getAddedDuringCoding()
	{
		return this.addedduringcoding;
	}
	public void setAddedDuringCoding(Boolean value)
	{
		this.isValidated = false;
		this.addedduringcoding = value;
	}
	public boolean getCodingSequenceIsNotNull()
	{
		return this.codingsequence != null;
	}
	public Integer getCodingSequence()
	{
		return this.codingsequence;
	}
	public void setCodingSequence(Integer value)
	{
		this.isValidated = false;
		this.codingsequence = value;
	}
	public boolean getInterventionTreatmentCompleteIsNotNull()
	{
		return this.interventiontreatmentcomplete != null;
	}
	public ims.core.vo.lookups.YesNo getInterventionTreatmentComplete()
	{
		return this.interventiontreatmentcomplete;
	}
	public void setInterventionTreatmentComplete(ims.core.vo.lookups.YesNo value)
	{
		this.isValidated = false;
		this.interventiontreatmentcomplete = value;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.treatmentintervention != null)
		{
			if(!this.treatmentintervention.isValidated())
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
		if(this.treatmentinterventiondescription == null || this.treatmentinterventiondescription.length() == 0)
			listOfErrors.add("TreatmentInterventionDescription is mandatory");
		else if(this.treatmentinterventiondescription.length() > 255)
			listOfErrors.add("The length of the field [treatmentinterventiondescription] in the value object [ims.emergency.vo.InterventionTreatmentDetailVo] is too big. It should be less or equal to 255");
		if(this.authoringinformation == null)
			listOfErrors.add("Authoring HCP and Authoring Date/Time are mandatory.");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.treatmentintervention != null)
		{
			String[] listOfOtherErrors = this.treatmentintervention.validate();
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
	
		InterventionTreatmentDetailVo clone = new InterventionTreatmentDetailVo(this.id, this.version);
		
		clone.treatmentinterventiondescription = this.treatmentinterventiondescription;
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.treatmentintervention == null)
			clone.treatmentintervention = null;
		else
			clone.treatmentintervention = (ims.clinicaladmin.vo.TreatmentInterventionLiteVo)this.treatmentintervention.clone();
		clone.addedduringcoding = this.addedduringcoding;
		clone.codingsequence = this.codingsequence;
		if(this.interventiontreatmentcomplete == null)
			clone.interventiontreatmentcomplete = null;
		else
			clone.interventiontreatmentcomplete = (ims.core.vo.lookups.YesNo)this.interventiontreatmentcomplete.clone();
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
		if (!(InterventionTreatmentDetailVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A InterventionTreatmentDetailVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		InterventionTreatmentDetailVo compareObj = (InterventionTreatmentDetailVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getCodingSequence() == null && compareObj.getCodingSequence() != null)
				return -1;
			if(this.getCodingSequence() != null && compareObj.getCodingSequence() == null)
				return 1;
			if(this.getCodingSequence() != null && compareObj.getCodingSequence() != null)
				retVal = this.getCodingSequence().compareTo(compareObj.getCodingSequence());
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
		if(this.authoringinformation != null)
			count++;
		if(this.treatmentintervention != null)
			count++;
		if(this.addedduringcoding != null)
			count++;
		if(this.codingsequence != null)
			count++;
		if(this.interventiontreatmentcomplete != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 5;
	}
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.clinicaladmin.vo.TreatmentInterventionLiteVo treatmentintervention;
	protected Boolean addedduringcoding;
	protected Integer codingsequence;
	protected ims.core.vo.lookups.YesNo interventiontreatmentcomplete;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
