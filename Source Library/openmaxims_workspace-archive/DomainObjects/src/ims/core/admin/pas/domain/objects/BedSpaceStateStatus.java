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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class BedSpaceStateStatus extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100010;
	private static final long serialVersionUID = 1014100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** BedStatus */
	private ims.domain.lookups.LookupInstance bedStatus;
	/** StatusDateTime */
	private java.util.Date statusDateTime;
	/** Reason For Bed Closure */
	private ims.domain.lookups.LookupInstance reasonForClosure;
	/** Estimated Reopening Date Time */
	private java.util.Date estReopeningDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public BedSpaceStateStatus (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BedSpaceStateStatus ()
    {
    	super();
    }
    public BedSpaceStateStatus (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.BedSpaceStateStatus.class;
	}


	public ims.domain.lookups.LookupInstance getBedStatus() {
		return bedStatus;
	}
	public void setBedStatus(ims.domain.lookups.LookupInstance bedStatus) {
		this.bedStatus = bedStatus;
	}

	public java.util.Date getStatusDateTime() {
		return statusDateTime;
	}
	public void setStatusDateTime(java.util.Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public ims.domain.lookups.LookupInstance getReasonForClosure() {
		return reasonForClosure;
	}
	public void setReasonForClosure(ims.domain.lookups.LookupInstance reasonForClosure) {
		this.reasonForClosure = reasonForClosure;
	}

	public java.util.Date getEstReopeningDateTime() {
		return estReopeningDateTime;
	}
	public void setEstReopeningDateTime(java.util.Date estReopeningDateTime) {
		this.estReopeningDateTime = estReopeningDateTime;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*bedStatus* :");
		if (bedStatus != null)
			auditStr.append(bedStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusDateTime* :");
		auditStr.append(statusDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForClosure* :");
		if (reasonForClosure != null)
			auditStr.append(reasonForClosure.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*estReopeningDateTime* :");
		auditStr.append(estReopeningDateTime);
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "BedSpaceStateStatus";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getBedStatus() != null)
		{
			sb.append("<bedStatus>");
			sb.append(this.getBedStatus().toXMLString()); 
			sb.append("</bedStatus>");		
		}
		if (this.getStatusDateTime() != null)
		{
			sb.append("<statusDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStatusDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</statusDateTime>");		
		}
		if (this.getReasonForClosure() != null)
		{
			sb.append("<reasonForClosure>");
			sb.append(this.getReasonForClosure().toXMLString()); 
			sb.append("</reasonForClosure>");		
		}
		if (this.getEstReopeningDateTime() != null)
		{
			sb.append("<estReopeningDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEstReopeningDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</estReopeningDateTime>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			BedSpaceStateStatus domainObject = getBedSpaceStateStatusfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			BedSpaceStateStatus domainObject = getBedSpaceStateStatusfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static BedSpaceStateStatus getBedSpaceStateStatusfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBedSpaceStateStatusfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BedSpaceStateStatus getBedSpaceStateStatusfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BedSpaceStateStatus.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BedSpaceStateStatus.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BedSpaceStateStatus class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BedSpaceStateStatus)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BedSpaceStateStatus.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BedSpaceStateStatus ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BedSpaceStateStatus)factory.getImportedDomainObject(BedSpaceStateStatus.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BedSpaceStateStatus();
		}
		String keyClassName = "BedSpaceStateStatus";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BedSpaceStateStatus)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BedSpaceStateStatus obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("bedStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBedStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusDateTime");
		if(fldEl != null)
		{	
    		obj.setStatusDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonForClosure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForClosure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("estReopeningDateTime");
		if(fldEl != null)
		{	
    		obj.setEstReopeningDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String BedStatus = "bedStatus";
		public static final String StatusDateTime = "statusDateTime";
		public static final String ReasonForClosure = "reasonForClosure";
		public static final String EstReopeningDateTime = "estReopeningDateTime";
	}
}

