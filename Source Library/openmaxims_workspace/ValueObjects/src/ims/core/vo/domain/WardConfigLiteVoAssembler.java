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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class WardConfigLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.WardConfigLiteVo copy(ims.core.vo.WardConfigLiteVo valueObjectDest, ims.core.vo.WardConfigLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WardBayConfig(valueObjectSrc.getID_WardBayConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// Bays
		valueObjectDest.setBays(valueObjectSrc.getBays());
		// MainSpecialty
		valueObjectDest.setMainSpecialty(valueObjectSrc.getMainSpecialty());
		// Specialties
		valueObjectDest.setSpecialties(valueObjectSrc.getSpecialties());
		// isWaitingArea
		valueObjectDest.setIsWaitingArea(valueObjectSrc.getIsWaitingArea());
		// numOfBeds
		valueObjectDest.setNumOfBeds(valueObjectSrc.getNumOfBeds());
		// numOfOccupiedBeds
		valueObjectDest.setNumOfOccupiedBeds(valueObjectSrc.getNumOfOccupiedBeds());
		// WardAvailabilityStatus
		valueObjectDest.setWardAvailabilityStatus(valueObjectSrc.getWardAvailabilityStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWardConfigLiteVoCollectionFromWardBayConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardBayConfig objects.
	 */
	public static ims.core.vo.WardConfigLiteVoCollection createWardConfigLiteVoCollectionFromWardBayConfig(java.util.Set domainObjectSet)	
	{
		return createWardConfigLiteVoCollectionFromWardBayConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardBayConfig objects.
	 */
	public static ims.core.vo.WardConfigLiteVoCollection createWardConfigLiteVoCollectionFromWardBayConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.WardConfigLiteVoCollection voList = new ims.core.vo.WardConfigLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.WardBayConfig domainObject = (ims.core.admin.pas.domain.objects.WardBayConfig) iterator.next();
			ims.core.vo.WardConfigLiteVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardBayConfig objects.
	 */
	public static ims.core.vo.WardConfigLiteVoCollection createWardConfigLiteVoCollectionFromWardBayConfig(java.util.List domainObjectList) 
	{
		return createWardConfigLiteVoCollectionFromWardBayConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardBayConfig objects.
	 */
	public static ims.core.vo.WardConfigLiteVoCollection createWardConfigLiteVoCollectionFromWardBayConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.WardConfigLiteVoCollection voList = new ims.core.vo.WardConfigLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.WardBayConfig domainObject = (ims.core.admin.pas.domain.objects.WardBayConfig) domainObjectList.get(i);
			ims.core.vo.WardConfigLiteVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.core.admin.pas.domain.objects.WardBayConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWardBayConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardConfigLiteVoCollection voCollection) 
	 {
	 	return extractWardBayConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWardBayConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardConfigLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardConfigLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardBayConfig domainObject = WardConfigLiteVoAssembler.extractWardBayConfig(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
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
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.core.admin.pas.domain.objects.WardBayConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWardBayConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardConfigLiteVoCollection voCollection) 
	 {
	 	return extractWardBayConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWardBayConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardConfigLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardConfigLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardBayConfig domainObject = WardConfigLiteVoAssembler.extractWardBayConfig(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardBayConfig object.
	 * @param domainObject ims.core.admin.pas.domain.objects.WardBayConfig
	 */
	 public static ims.core.vo.WardConfigLiteVo create(ims.core.admin.pas.domain.objects.WardBayConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardBayConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.WardConfigLiteVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.WardBayConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.WardConfigLiteVo valueObject = (ims.core.vo.WardConfigLiteVo) map.getValueObject(domainObject, ims.core.vo.WardConfigLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.WardConfigLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.WardBayConfig
	 */
	 public static ims.core.vo.WardConfigLiteVo insert(ims.core.vo.WardConfigLiteVo valueObject, ims.core.admin.pas.domain.objects.WardBayConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.WardBayConfig
	 */
	 public static ims.core.vo.WardConfigLiteVo insert(DomainObjectMap map, ims.core.vo.WardConfigLiteVo valueObject, ims.core.admin.pas.domain.objects.WardBayConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WardBayConfig(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// Bays
		valueObject.setBays(ims.core.vo.domain.BayConfigLiteVoAssembler.createBayConfigLiteVoCollectionFromBayConfig(map, domainObject.getBays()) );
		// MainSpecialty
		ims.domain.lookups.LookupInstance instance3 = domainObject.getMainSpecialty();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup3 = new ims.core.vo.lookups.Specialty(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.Specialty(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setMainSpecialty(voLookup3);
		}
				// Specialties
		java.util.List listSpecialties = domainObject.getSpecialties();
		ims.core.vo.lookups.SpecialtyCollection Specialties = new ims.core.vo.lookups.SpecialtyCollection();
		for(java.util.Iterator iterator = listSpecialties.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.Specialty voInstance = new ims.core.vo.lookups.Specialty(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.Specialty(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Specialties.add(voInstance);
		}
		valueObject.setSpecialties( Specialties );
		// isWaitingArea
		valueObject.setIsWaitingArea( domainObject.isIsWaitingArea() );
		// numOfBeds
		valueObject.setNumOfBeds(domainObject.getNumOfBeds());
		// numOfOccupiedBeds
		valueObject.setNumOfOccupiedBeds(domainObject.getNumOfOccupiedBeds());
		// WardAvailabilityStatus
		ims.domain.lookups.LookupInstance instance8 = domainObject.getWardStatus();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.WardBayStatus voLookup8 = new ims.core.vo.lookups.WardBayStatus(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.WardBayStatus parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.WardBayStatus(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setWardAvailabilityStatus(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.WardBayConfig extractWardBayConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardConfigLiteVo valueObject) 
	{
		return 	extractWardBayConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.WardBayConfig extractWardBayConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardConfigLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WardBayConfig();
		ims.core.admin.pas.domain.objects.WardBayConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardBayConfig)domMap.get(valueObject);
			}
			// ims.core.vo.WardConfigLiteVo ID_WardBayConfig field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.WardBayConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WardBayConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardBayConfig)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.WardBayConfig) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.WardBayConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WardBayConfig());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.core.layout.vo.BayConfigRefVoCollection refCollection2 = new ims.core.layout.vo.BayConfigRefVoCollection();
		if (valueObject.getBays() != null)
		{
			for (int i2=0; i2<valueObject.getBays().size(); i2++)
			{
				ims.core.layout.vo.BayConfigRefVo ref2 = (ims.core.layout.vo.BayConfigRefVo)valueObject.getBays().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.Set domainBays2 = domainObject.getBays();
		if (domainBays2 == null)
		{
			domainBays2 = new java.util.HashSet();
		}
		java.util.Set newSet2  = new java.util.HashSet();
		for(int i=0; i<size2; i++) 
		{
			ims.core.layout.vo.BayConfigRefVo vo = refCollection2.get(i);					
			ims.core.layout.domain.objects.BayConfig dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.layout.domain.objects.BayConfig)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.layout.domain.objects.BayConfig)domainFactory.getDomainObject( ims.core.layout.domain.objects.BayConfig.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainBays2.contains(dom))
			{
				domainBays2.add(dom);
			}
			newSet2.add(dom);			
		}
		java.util.Set removedSet2 = new java.util.HashSet();
		java.util.Iterator iter2 = domainBays2.iterator();
		//Find out which objects need to be removed
		while (iter2.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter2.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet2.contains(o))
			{
				removedSet2.add(o);
			}
		}
		iter2 = removedSet2.iterator();
		//Remove the unwanted objects
		while (iter2.hasNext())
		{
			domainBays2.remove(iter2.next());
		}		
		
		domainObject.setBays(domainBays2);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getMainSpecialty() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getMainSpecialty().getID());
		}
		domainObject.setMainSpecialty(value3);
		ims.core.vo.lookups.SpecialtyCollection collection4 =
	valueObject.getSpecialties();
	    java.util.List domainSpecialties = domainObject.getSpecialties();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainSpecialties = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSpecialties.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecialties.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecialties.size())
			{
				Object tmp = domainSpecialties.get(i);
				domainSpecialties.set(i, domainSpecialties.get(domIdx));
				domainSpecialties.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j4 = domainSpecialties.size();
		while (j4 > collection4Size)
		{
			domainSpecialties.remove(j4-1);
			j4 = domainSpecialties.size();
		}

		domainObject.setSpecialties(domainSpecialties);		
		domainObject.setIsWaitingArea(valueObject.getIsWaitingArea());
		domainObject.setNumOfBeds(valueObject.getNumOfBeds());
		domainObject.setNumOfOccupiedBeds(valueObject.getNumOfOccupiedBeds());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getWardAvailabilityStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getWardAvailabilityStatus().getID());
		}
		domainObject.setWardStatus(value8);

		return domainObject;
	}

}
