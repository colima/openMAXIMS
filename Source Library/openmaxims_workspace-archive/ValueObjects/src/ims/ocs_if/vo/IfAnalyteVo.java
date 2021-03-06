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

package ims.ocs_if.vo;

/**
 * Linked to OCRR.Configuration.Analyte business object (ID: 1061100009).
 */
public class IfAnalyteVo extends ims.ocrr.configuration.vo.AnalyteRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public IfAnalyteVo()
	{
	}
	public IfAnalyteVo(Integer id, int version)
	{
		super(id, version);
	}
	public IfAnalyteVo(ims.ocs_if.vo.beans.IfAnalyteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.analyteextcode = bean.getAnalyteExtCode();
		this.analyteexttext = bean.getAnalyteExtText();
		this.providersystem = bean.getProviderSystem() == null ? null : new ims.core.admin.vo.ProviderSystemRefVo(new Integer(bean.getProviderSystem().getId()), bean.getProviderSystem().getVersion());
		this.locationservice = bean.getLocationService() == null ? null : new ims.core.resource.place.vo.LocationServiceRefVo(new Integer(bean.getLocationService().getId()), bean.getLocationService().getVersion());
		this.service = bean.getService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getService().getId()), bean.getService().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocs_if.vo.beans.IfAnalyteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.analyteextcode = bean.getAnalyteExtCode();
		this.analyteexttext = bean.getAnalyteExtText();
		this.providersystem = bean.getProviderSystem() == null ? null : new ims.core.admin.vo.ProviderSystemRefVo(new Integer(bean.getProviderSystem().getId()), bean.getProviderSystem().getVersion());
		this.locationservice = bean.getLocationService() == null ? null : new ims.core.resource.place.vo.LocationServiceRefVo(new Integer(bean.getLocationService().getId()), bean.getLocationService().getVersion());
		this.service = bean.getService() == null ? null : new ims.core.clinical.vo.ServiceRefVo(new Integer(bean.getService().getId()), bean.getService().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocs_if.vo.beans.IfAnalyteVoBean bean = null;
		if(map != null)
			bean = (ims.ocs_if.vo.beans.IfAnalyteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocs_if.vo.beans.IfAnalyteVoBean();
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
		if(fieldName.equals("ANALYTEEXTCODE"))
			return getAnalyteExtCode();
		if(fieldName.equals("ANALYTEEXTTEXT"))
			return getAnalyteExtText();
		if(fieldName.equals("PROVIDERSYSTEM"))
			return getProviderSystem();
		if(fieldName.equals("LOCATIONSERVICE"))
			return getLocationService();
		if(fieldName.equals("SERVICE"))
			return getService();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAnalyteExtCodeIsNotNull()
	{
		return this.analyteextcode != null;
	}
	public String getAnalyteExtCode()
	{
		return this.analyteextcode;
	}
	public static int getAnalyteExtCodeMaxLength()
	{
		return 50;
	}
	public void setAnalyteExtCode(String value)
	{
		this.isValidated = false;
		this.analyteextcode = value;
	}
	public boolean getAnalyteExtTextIsNotNull()
	{
		return this.analyteexttext != null;
	}
	public String getAnalyteExtText()
	{
		return this.analyteexttext;
	}
	public static int getAnalyteExtTextMaxLength()
	{
		return 100;
	}
	public void setAnalyteExtText(String value)
	{
		this.isValidated = false;
		this.analyteexttext = value;
	}
	public boolean getProviderSystemIsNotNull()
	{
		return this.providersystem != null;
	}
	public ims.core.admin.vo.ProviderSystemRefVo getProviderSystem()
	{
		return this.providersystem;
	}
	public void setProviderSystem(ims.core.admin.vo.ProviderSystemRefVo value)
	{
		this.isValidated = false;
		this.providersystem = value;
	}
	public boolean getLocationServiceIsNotNull()
	{
		return this.locationservice != null;
	}
	public ims.core.resource.place.vo.LocationServiceRefVo getLocationService()
	{
		return this.locationservice;
	}
	public void setLocationService(ims.core.resource.place.vo.LocationServiceRefVo value)
	{
		this.isValidated = false;
		this.locationservice = value;
	}
	public boolean getServiceIsNotNull()
	{
		return this.service != null;
	}
	public ims.core.clinical.vo.ServiceRefVo getService()
	{
		return this.service;
	}
	public void setService(ims.core.clinical.vo.ServiceRefVo value)
	{
		this.isValidated = false;
		this.service = value;
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
		if(this.analyteextcode != null)
			if(this.analyteextcode.length() > 50)
				listOfErrors.add("The length of the field [analyteextcode] in the value object [ims.ocs_if.vo.IfAnalyteVo] is too big. It should be less or equal to 50");
		if(this.analyteexttext != null)
			if(this.analyteexttext.length() > 100)
				listOfErrors.add("The length of the field [analyteexttext] in the value object [ims.ocs_if.vo.IfAnalyteVo] is too big. It should be less or equal to 100");
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
	
		IfAnalyteVo clone = new IfAnalyteVo(this.id, this.version);
		
		clone.analyteextcode = this.analyteextcode;
		clone.analyteexttext = this.analyteexttext;
		clone.providersystem = this.providersystem;
		clone.locationservice = this.locationservice;
		clone.service = this.service;
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
		if (!(IfAnalyteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A IfAnalyteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((IfAnalyteVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((IfAnalyteVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.analyteextcode != null)
			count++;
		if(this.analyteexttext != null)
			count++;
		if(this.providersystem != null)
			count++;
		if(this.locationservice != null)
			count++;
		if(this.service != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected String analyteextcode;
	protected String analyteexttext;
	protected ims.core.admin.vo.ProviderSystemRefVo providersystem;
	protected ims.core.resource.place.vo.LocationServiceRefVo locationservice;
	protected ims.core.clinical.vo.ServiceRefVo service;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
