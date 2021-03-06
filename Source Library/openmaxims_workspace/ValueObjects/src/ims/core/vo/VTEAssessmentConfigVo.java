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

package ims.core.vo;

/**
 * Linked to core.admin.VTEAssessmentConfig business object (ID: 1004100069).
 */
public class VTEAssessmentConfigVo extends ims.core.admin.vo.VTEAssessmentConfigRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public VTEAssessmentConfigVo()
	{
	}
	public VTEAssessmentConfigVo(Integer id, int version)
	{
		super(id, version);
	}
	public VTEAssessmentConfigVo(ims.core.vo.beans.VTEAssessmentConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.preopassessmentvalidperiod = bean.getPreOpAssessmentValidPeriod();
		this.excludedwards = ims.core.vo.VTEAssessmentExclusionsVoCollection.buildFromBeanCollection(bean.getExcludedWards());
		this.excludedspecialties = ims.core.vo.VTEAssessmentExclusionsVoCollection.buildFromBeanCollection(bean.getExcludedSpecialties());
		this.excludedcombination = ims.core.vo.VTEAssessmentExclusionsVoCollection.buildFromBeanCollection(bean.getExcludedCombination());
		this.colourconfiguration = ims.core.vo.VTEAssessmentColourConfigVoCollection.buildFromBeanCollection(bean.getColourConfiguration());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.VTEAssessmentConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.preopassessmentvalidperiod = bean.getPreOpAssessmentValidPeriod();
		this.excludedwards = ims.core.vo.VTEAssessmentExclusionsVoCollection.buildFromBeanCollection(bean.getExcludedWards());
		this.excludedspecialties = ims.core.vo.VTEAssessmentExclusionsVoCollection.buildFromBeanCollection(bean.getExcludedSpecialties());
		this.excludedcombination = ims.core.vo.VTEAssessmentExclusionsVoCollection.buildFromBeanCollection(bean.getExcludedCombination());
		this.colourconfiguration = ims.core.vo.VTEAssessmentColourConfigVoCollection.buildFromBeanCollection(bean.getColourConfiguration());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.VTEAssessmentConfigVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.VTEAssessmentConfigVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.VTEAssessmentConfigVoBean();
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
		if(fieldName.equals("PREOPASSESSMENTVALIDPERIOD"))
			return getPreOpAssessmentValidPeriod();
		if(fieldName.equals("EXCLUDEDWARDS"))
			return getExcludedWards();
		if(fieldName.equals("EXCLUDEDSPECIALTIES"))
			return getExcludedSpecialties();
		if(fieldName.equals("EXCLUDEDCOMBINATION"))
			return getExcludedCombination();
		if(fieldName.equals("COLOURCONFIGURATION"))
			return getColourConfiguration();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPreOpAssessmentValidPeriodIsNotNull()
	{
		return this.preopassessmentvalidperiod != null;
	}
	public Integer getPreOpAssessmentValidPeriod()
	{
		return this.preopassessmentvalidperiod;
	}
	public void setPreOpAssessmentValidPeriod(Integer value)
	{
		this.isValidated = false;
		this.preopassessmentvalidperiod = value;
	}
	public boolean getExcludedWardsIsNotNull()
	{
		return this.excludedwards != null;
	}
	public ims.core.vo.VTEAssessmentExclusionsVoCollection getExcludedWards()
	{
		return this.excludedwards;
	}
	public void setExcludedWards(ims.core.vo.VTEAssessmentExclusionsVoCollection value)
	{
		this.isValidated = false;
		this.excludedwards = value;
	}
	public boolean getExcludedSpecialtiesIsNotNull()
	{
		return this.excludedspecialties != null;
	}
	public ims.core.vo.VTEAssessmentExclusionsVoCollection getExcludedSpecialties()
	{
		return this.excludedspecialties;
	}
	public void setExcludedSpecialties(ims.core.vo.VTEAssessmentExclusionsVoCollection value)
	{
		this.isValidated = false;
		this.excludedspecialties = value;
	}
	public boolean getExcludedCombinationIsNotNull()
	{
		return this.excludedcombination != null;
	}
	public ims.core.vo.VTEAssessmentExclusionsVoCollection getExcludedCombination()
	{
		return this.excludedcombination;
	}
	public void setExcludedCombination(ims.core.vo.VTEAssessmentExclusionsVoCollection value)
	{
		this.isValidated = false;
		this.excludedcombination = value;
	}
	public boolean getColourConfigurationIsNotNull()
	{
		return this.colourconfiguration != null;
	}
	public ims.core.vo.VTEAssessmentColourConfigVoCollection getColourConfiguration()
	{
		return this.colourconfiguration;
	}
	public void setColourConfiguration(ims.core.vo.VTEAssessmentColourConfigVoCollection value)
	{
		this.isValidated = false;
		this.colourconfiguration = value;
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
		if(this.excludedwards != null)
		{
			if(!this.excludedwards.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.excludedspecialties != null)
		{
			if(!this.excludedspecialties.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.excludedcombination != null)
		{
			if(!this.excludedcombination.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.colourconfiguration != null)
		{
			if(!this.colourconfiguration.isValidated())
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
		if(this.excludedwards != null)
		{
			String[] listOfOtherErrors = this.excludedwards.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.excludedspecialties != null)
		{
			String[] listOfOtherErrors = this.excludedspecialties.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.excludedcombination != null)
		{
			String[] listOfOtherErrors = this.excludedcombination.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.colourconfiguration != null)
		{
			String[] listOfOtherErrors = this.colourconfiguration.validate();
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
	
		VTEAssessmentConfigVo clone = new VTEAssessmentConfigVo(this.id, this.version);
		
		clone.preopassessmentvalidperiod = this.preopassessmentvalidperiod;
		if(this.excludedwards == null)
			clone.excludedwards = null;
		else
			clone.excludedwards = (ims.core.vo.VTEAssessmentExclusionsVoCollection)this.excludedwards.clone();
		if(this.excludedspecialties == null)
			clone.excludedspecialties = null;
		else
			clone.excludedspecialties = (ims.core.vo.VTEAssessmentExclusionsVoCollection)this.excludedspecialties.clone();
		if(this.excludedcombination == null)
			clone.excludedcombination = null;
		else
			clone.excludedcombination = (ims.core.vo.VTEAssessmentExclusionsVoCollection)this.excludedcombination.clone();
		if(this.colourconfiguration == null)
			clone.colourconfiguration = null;
		else
			clone.colourconfiguration = (ims.core.vo.VTEAssessmentColourConfigVoCollection)this.colourconfiguration.clone();
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
		if (!(VTEAssessmentConfigVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A VTEAssessmentConfigVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((VTEAssessmentConfigVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((VTEAssessmentConfigVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.preopassessmentvalidperiod != null)
			count++;
		if(this.excludedwards != null)
			count++;
		if(this.excludedspecialties != null)
			count++;
		if(this.excludedcombination != null)
			count++;
		if(this.colourconfiguration != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected Integer preopassessmentvalidperiod;
	protected ims.core.vo.VTEAssessmentExclusionsVoCollection excludedwards;
	protected ims.core.vo.VTEAssessmentExclusionsVoCollection excludedspecialties;
	protected ims.core.vo.VTEAssessmentExclusionsVoCollection excludedcombination;
	protected ims.core.vo.VTEAssessmentColourConfigVoCollection colourconfiguration;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
