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

package ims.icp.vo;

/**
 * Linked to ICPs.Instantiation.PatientICP business object (ID: 1100100000).
 */
public class PatientICP_CompletionInfoVo extends ims.icps.instantiation.vo.PatientICPRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientICP_CompletionInfoVo()
	{
	}
	public PatientICP_CompletionInfoVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientICP_CompletionInfoVo(ims.icp.vo.beans.PatientICP_CompletionInfoVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hasoutstandingadminactions = bean.getHasOutstandingAdminActions();
		this.hasoutstandingnursingactions = bean.getHasOutstandingNursingActions();
		this.hasoutstandingphysioactions = bean.getHasOutstandingPhysioActions();
		this.hasoutstandingclinicalactions = bean.getHasOutstandingClinicalActions();
		this.completeddatetime = bean.getCompletedDateTime() == null ? null : bean.getCompletedDateTime().buildDateTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.icp.vo.beans.PatientICP_CompletionInfoVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.hasoutstandingadminactions = bean.getHasOutstandingAdminActions();
		this.hasoutstandingnursingactions = bean.getHasOutstandingNursingActions();
		this.hasoutstandingphysioactions = bean.getHasOutstandingPhysioActions();
		this.hasoutstandingclinicalactions = bean.getHasOutstandingClinicalActions();
		this.completeddatetime = bean.getCompletedDateTime() == null ? null : bean.getCompletedDateTime().buildDateTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.icp.vo.beans.PatientICP_CompletionInfoVoBean bean = null;
		if(map != null)
			bean = (ims.icp.vo.beans.PatientICP_CompletionInfoVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.icp.vo.beans.PatientICP_CompletionInfoVoBean();
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
		if(fieldName.equals("HASOUTSTANDINGADMINACTIONS"))
			return getHasOutstandingAdminActions();
		if(fieldName.equals("HASOUTSTANDINGNURSINGACTIONS"))
			return getHasOutstandingNursingActions();
		if(fieldName.equals("HASOUTSTANDINGPHYSIOACTIONS"))
			return getHasOutstandingPhysioActions();
		if(fieldName.equals("HASOUTSTANDINGCLINICALACTIONS"))
			return getHasOutstandingClinicalActions();
		if(fieldName.equals("COMPLETEDDATETIME"))
			return getCompletedDateTime();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getHasOutstandingAdminActionsIsNotNull()
	{
		return this.hasoutstandingadminactions != null;
	}
	public Boolean getHasOutstandingAdminActions()
	{
		return this.hasoutstandingadminactions;
	}
	public void setHasOutstandingAdminActions(Boolean value)
	{
		this.isValidated = false;
		this.hasoutstandingadminactions = value;
	}
	public boolean getHasOutstandingNursingActionsIsNotNull()
	{
		return this.hasoutstandingnursingactions != null;
	}
	public Boolean getHasOutstandingNursingActions()
	{
		return this.hasoutstandingnursingactions;
	}
	public void setHasOutstandingNursingActions(Boolean value)
	{
		this.isValidated = false;
		this.hasoutstandingnursingactions = value;
	}
	public boolean getHasOutstandingPhysioActionsIsNotNull()
	{
		return this.hasoutstandingphysioactions != null;
	}
	public Boolean getHasOutstandingPhysioActions()
	{
		return this.hasoutstandingphysioactions;
	}
	public void setHasOutstandingPhysioActions(Boolean value)
	{
		this.isValidated = false;
		this.hasoutstandingphysioactions = value;
	}
	public boolean getHasOutstandingClinicalActionsIsNotNull()
	{
		return this.hasoutstandingclinicalactions != null;
	}
	public Boolean getHasOutstandingClinicalActions()
	{
		return this.hasoutstandingclinicalactions;
	}
	public void setHasOutstandingClinicalActions(Boolean value)
	{
		this.isValidated = false;
		this.hasoutstandingclinicalactions = value;
	}
	public boolean getCompletedDateTimeIsNotNull()
	{
		return this.completeddatetime != null;
	}
	public ims.framework.utils.DateTime getCompletedDateTime()
	{
		return this.completeddatetime;
	}
	public void setCompletedDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.completeddatetime = value;
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
		if(this.hasoutstandingadminactions == null)
			listOfErrors.add("hasOutstandingAdminActions is mandatory");
		if(this.hasoutstandingnursingactions == null)
			listOfErrors.add("hasOutstandingNursingActions is mandatory");
		if(this.hasoutstandingphysioactions == null)
			listOfErrors.add("hasOutstandingPhysioActions is mandatory");
		if(this.hasoutstandingclinicalactions == null)
			listOfErrors.add("hasOutstandingClinicalActions is mandatory");
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
	
		PatientICP_CompletionInfoVo clone = new PatientICP_CompletionInfoVo(this.id, this.version);
		
		clone.hasoutstandingadminactions = this.hasoutstandingadminactions;
		clone.hasoutstandingnursingactions = this.hasoutstandingnursingactions;
		clone.hasoutstandingphysioactions = this.hasoutstandingphysioactions;
		clone.hasoutstandingclinicalactions = this.hasoutstandingclinicalactions;
		if(this.completeddatetime == null)
			clone.completeddatetime = null;
		else
			clone.completeddatetime = (ims.framework.utils.DateTime)this.completeddatetime.clone();
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
		if (!(PatientICP_CompletionInfoVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientICP_CompletionInfoVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientICP_CompletionInfoVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientICP_CompletionInfoVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.hasoutstandingadminactions != null)
			count++;
		if(this.hasoutstandingnursingactions != null)
			count++;
		if(this.hasoutstandingphysioactions != null)
			count++;
		if(this.hasoutstandingclinicalactions != null)
			count++;
		if(this.completeddatetime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected Boolean hasoutstandingadminactions;
	protected Boolean hasoutstandingnursingactions;
	protected Boolean hasoutstandingphysioactions;
	protected Boolean hasoutstandingclinicalactions;
	protected ims.framework.utils.DateTime completeddatetime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
