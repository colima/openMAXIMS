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

package ims.pathways.vo;

/**
 * Linked to Pathways.PathwaysRTTClockImpact business object (ID: 1088100013).
 */
public class PathwayRTTClockImpactVo extends ims.pathways.vo.PathwaysRTTClockImpactRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PathwayRTTClockImpactVo()
	{
	}
	public PathwayRTTClockImpactVo(Integer id, int version)
	{
		super(id, version);
	}
	public PathwayRTTClockImpactVo(ims.pathways.vo.beans.PathwayRTTClockImpactVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.initialclock = bean.getInitialClock() == null ? null : new ims.pathways.vo.PathwayClockRefVo(new Integer(bean.getInitialClock().getId()), bean.getInitialClock().getVersion());
		this.finalclock = bean.getFinalClock() == null ? null : new ims.pathways.vo.PathwayClockRefVo(new Integer(bean.getFinalClock().getId()), bean.getFinalClock().getVersion());
		this.initialrttstatus = bean.getInitialRTTStatus() == null ? null : new ims.pathways.vo.PathwayRTTStatusRefVo(new Integer(bean.getInitialRTTStatus().getId()), bean.getInitialRTTStatus().getVersion());
		this.finalrttstatus = bean.getFinalRTTStatus() == null ? null : new ims.pathways.vo.PathwayRTTStatusRefVo(new Integer(bean.getFinalRTTStatus().getId()), bean.getFinalRTTStatus().getVersion());
		this.clockstarted = bean.getClockStarted();
		this.clockstopped = bean.getClockStopped();
		this.journey = bean.getJourney() == null ? null : new ims.pathways.vo.PatientPathwayJourneyRefVo(new Integer(bean.getJourney().getId()), bean.getJourney().getVersion());
		this.source = bean.getSource() == null ? null : ims.pathways.vo.lookups.RTTClockImpactSource.buildLookup(bean.getSource());
		this.outcomeevent = bean.getOutcomeEvent() == null ? null : new ims.pathways.vo.RTTStatusEventMapRefVo(new Integer(bean.getOutcomeEvent().getId()), bean.getOutcomeEvent().getVersion());
		this.initialclockstate = bean.getInitialClockState() == null ? null : ims.pathways.vo.lookups.RTTClockState.buildLookup(bean.getInitialClockState());
		this.finalclockstate = bean.getFinalClockState() == null ? null : ims.pathways.vo.lookups.RTTClockState.buildLookup(bean.getFinalClockState());
		this.outcomedescription = bean.getOutcomeDescription();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.pathways.vo.beans.PathwayRTTClockImpactVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.initialclock = bean.getInitialClock() == null ? null : new ims.pathways.vo.PathwayClockRefVo(new Integer(bean.getInitialClock().getId()), bean.getInitialClock().getVersion());
		this.finalclock = bean.getFinalClock() == null ? null : new ims.pathways.vo.PathwayClockRefVo(new Integer(bean.getFinalClock().getId()), bean.getFinalClock().getVersion());
		this.initialrttstatus = bean.getInitialRTTStatus() == null ? null : new ims.pathways.vo.PathwayRTTStatusRefVo(new Integer(bean.getInitialRTTStatus().getId()), bean.getInitialRTTStatus().getVersion());
		this.finalrttstatus = bean.getFinalRTTStatus() == null ? null : new ims.pathways.vo.PathwayRTTStatusRefVo(new Integer(bean.getFinalRTTStatus().getId()), bean.getFinalRTTStatus().getVersion());
		this.clockstarted = bean.getClockStarted();
		this.clockstopped = bean.getClockStopped();
		this.journey = bean.getJourney() == null ? null : new ims.pathways.vo.PatientPathwayJourneyRefVo(new Integer(bean.getJourney().getId()), bean.getJourney().getVersion());
		this.source = bean.getSource() == null ? null : ims.pathways.vo.lookups.RTTClockImpactSource.buildLookup(bean.getSource());
		this.outcomeevent = bean.getOutcomeEvent() == null ? null : new ims.pathways.vo.RTTStatusEventMapRefVo(new Integer(bean.getOutcomeEvent().getId()), bean.getOutcomeEvent().getVersion());
		this.initialclockstate = bean.getInitialClockState() == null ? null : ims.pathways.vo.lookups.RTTClockState.buildLookup(bean.getInitialClockState());
		this.finalclockstate = bean.getFinalClockState() == null ? null : ims.pathways.vo.lookups.RTTClockState.buildLookup(bean.getFinalClockState());
		this.outcomedescription = bean.getOutcomeDescription();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.pathways.vo.beans.PathwayRTTClockImpactVoBean bean = null;
		if(map != null)
			bean = (ims.pathways.vo.beans.PathwayRTTClockImpactVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.pathways.vo.beans.PathwayRTTClockImpactVoBean();
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
		if(fieldName.equals("INITIALCLOCK"))
			return getInitialClock();
		if(fieldName.equals("FINALCLOCK"))
			return getFinalClock();
		if(fieldName.equals("INITIALRTTSTATUS"))
			return getInitialRTTStatus();
		if(fieldName.equals("FINALRTTSTATUS"))
			return getFinalRTTStatus();
		if(fieldName.equals("CLOCKSTARTED"))
			return getClockStarted();
		if(fieldName.equals("CLOCKSTOPPED"))
			return getClockStopped();
		if(fieldName.equals("JOURNEY"))
			return getJourney();
		if(fieldName.equals("SOURCE"))
			return getSource();
		if(fieldName.equals("OUTCOMEEVENT"))
			return getOutcomeEvent();
		if(fieldName.equals("INITIALCLOCKSTATE"))
			return getInitialClockState();
		if(fieldName.equals("FINALCLOCKSTATE"))
			return getFinalClockState();
		if(fieldName.equals("OUTCOMEDESCRIPTION"))
			return getOutcomeDescription();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getInitialClockIsNotNull()
	{
		return this.initialclock != null;
	}
	public ims.pathways.vo.PathwayClockRefVo getInitialClock()
	{
		return this.initialclock;
	}
	public void setInitialClock(ims.pathways.vo.PathwayClockRefVo value)
	{
		this.isValidated = false;
		this.initialclock = value;
	}
	public boolean getFinalClockIsNotNull()
	{
		return this.finalclock != null;
	}
	public ims.pathways.vo.PathwayClockRefVo getFinalClock()
	{
		return this.finalclock;
	}
	public void setFinalClock(ims.pathways.vo.PathwayClockRefVo value)
	{
		this.isValidated = false;
		this.finalclock = value;
	}
	public boolean getInitialRTTStatusIsNotNull()
	{
		return this.initialrttstatus != null;
	}
	public ims.pathways.vo.PathwayRTTStatusRefVo getInitialRTTStatus()
	{
		return this.initialrttstatus;
	}
	public void setInitialRTTStatus(ims.pathways.vo.PathwayRTTStatusRefVo value)
	{
		this.isValidated = false;
		this.initialrttstatus = value;
	}
	public boolean getFinalRTTStatusIsNotNull()
	{
		return this.finalrttstatus != null;
	}
	public ims.pathways.vo.PathwayRTTStatusRefVo getFinalRTTStatus()
	{
		return this.finalrttstatus;
	}
	public void setFinalRTTStatus(ims.pathways.vo.PathwayRTTStatusRefVo value)
	{
		this.isValidated = false;
		this.finalrttstatus = value;
	}
	public boolean getClockStartedIsNotNull()
	{
		return this.clockstarted != null;
	}
	public Boolean getClockStarted()
	{
		return this.clockstarted;
	}
	public void setClockStarted(Boolean value)
	{
		this.isValidated = false;
		this.clockstarted = value;
	}
	public boolean getClockStoppedIsNotNull()
	{
		return this.clockstopped != null;
	}
	public Boolean getClockStopped()
	{
		return this.clockstopped;
	}
	public void setClockStopped(Boolean value)
	{
		this.isValidated = false;
		this.clockstopped = value;
	}
	public boolean getJourneyIsNotNull()
	{
		return this.journey != null;
	}
	public ims.pathways.vo.PatientPathwayJourneyRefVo getJourney()
	{
		return this.journey;
	}
	public void setJourney(ims.pathways.vo.PatientPathwayJourneyRefVo value)
	{
		this.isValidated = false;
		this.journey = value;
	}
	public boolean getSourceIsNotNull()
	{
		return this.source != null;
	}
	public ims.pathways.vo.lookups.RTTClockImpactSource getSource()
	{
		return this.source;
	}
	public void setSource(ims.pathways.vo.lookups.RTTClockImpactSource value)
	{
		this.isValidated = false;
		this.source = value;
	}
	public boolean getOutcomeEventIsNotNull()
	{
		return this.outcomeevent != null;
	}
	public ims.pathways.vo.RTTStatusEventMapRefVo getOutcomeEvent()
	{
		return this.outcomeevent;
	}
	public void setOutcomeEvent(ims.pathways.vo.RTTStatusEventMapRefVo value)
	{
		this.isValidated = false;
		this.outcomeevent = value;
	}
	public boolean getInitialClockStateIsNotNull()
	{
		return this.initialclockstate != null;
	}
	public ims.pathways.vo.lookups.RTTClockState getInitialClockState()
	{
		return this.initialclockstate;
	}
	public void setInitialClockState(ims.pathways.vo.lookups.RTTClockState value)
	{
		this.isValidated = false;
		this.initialclockstate = value;
	}
	public boolean getFinalClockStateIsNotNull()
	{
		return this.finalclockstate != null;
	}
	public ims.pathways.vo.lookups.RTTClockState getFinalClockState()
	{
		return this.finalclockstate;
	}
	public void setFinalClockState(ims.pathways.vo.lookups.RTTClockState value)
	{
		this.isValidated = false;
		this.finalclockstate = value;
	}
	public boolean getOutcomeDescriptionIsNotNull()
	{
		return this.outcomedescription != null;
	}
	public String getOutcomeDescription()
	{
		return this.outcomedescription;
	}
	public static int getOutcomeDescriptionMaxLength()
	{
		return 255;
	}
	public void setOutcomeDescription(String value)
	{
		this.isValidated = false;
		this.outcomedescription = value;
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
		if(this.journey == null)
			listOfErrors.add("Journey is mandatory");
		if(this.source == null)
			listOfErrors.add("Source is mandatory");
		if(this.initialclockstate == null)
			listOfErrors.add("InitialClockState is mandatory");
		if(this.finalclockstate == null)
			listOfErrors.add("FinalClockState is mandatory");
		if(this.outcomedescription != null)
			if(this.outcomedescription.length() > 255)
				listOfErrors.add("The length of the field [outcomedescription] in the value object [ims.pathways.vo.PathwayRTTClockImpactVo] is too big. It should be less or equal to 255");
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
	
		PathwayRTTClockImpactVo clone = new PathwayRTTClockImpactVo(this.id, this.version);
		
		clone.initialclock = this.initialclock;
		clone.finalclock = this.finalclock;
		clone.initialrttstatus = this.initialrttstatus;
		clone.finalrttstatus = this.finalrttstatus;
		clone.clockstarted = this.clockstarted;
		clone.clockstopped = this.clockstopped;
		clone.journey = this.journey;
		if(this.source == null)
			clone.source = null;
		else
			clone.source = (ims.pathways.vo.lookups.RTTClockImpactSource)this.source.clone();
		clone.outcomeevent = this.outcomeevent;
		if(this.initialclockstate == null)
			clone.initialclockstate = null;
		else
			clone.initialclockstate = (ims.pathways.vo.lookups.RTTClockState)this.initialclockstate.clone();
		if(this.finalclockstate == null)
			clone.finalclockstate = null;
		else
			clone.finalclockstate = (ims.pathways.vo.lookups.RTTClockState)this.finalclockstate.clone();
		clone.outcomedescription = this.outcomedescription;
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
		if (!(PathwayRTTClockImpactVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PathwayRTTClockImpactVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PathwayRTTClockImpactVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PathwayRTTClockImpactVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.initialclock != null)
			count++;
		if(this.finalclock != null)
			count++;
		if(this.initialrttstatus != null)
			count++;
		if(this.finalrttstatus != null)
			count++;
		if(this.clockstarted != null)
			count++;
		if(this.clockstopped != null)
			count++;
		if(this.journey != null)
			count++;
		if(this.source != null)
			count++;
		if(this.outcomeevent != null)
			count++;
		if(this.initialclockstate != null)
			count++;
		if(this.finalclockstate != null)
			count++;
		if(this.outcomedescription != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected ims.pathways.vo.PathwayClockRefVo initialclock;
	protected ims.pathways.vo.PathwayClockRefVo finalclock;
	protected ims.pathways.vo.PathwayRTTStatusRefVo initialrttstatus;
	protected ims.pathways.vo.PathwayRTTStatusRefVo finalrttstatus;
	protected Boolean clockstarted;
	protected Boolean clockstopped;
	protected ims.pathways.vo.PatientPathwayJourneyRefVo journey;
	protected ims.pathways.vo.lookups.RTTClockImpactSource source;
	protected ims.pathways.vo.RTTStatusEventMapRefVo outcomeevent;
	protected ims.pathways.vo.lookups.RTTClockState initialclockstate;
	protected ims.pathways.vo.lookups.RTTClockState finalclockstate;
	protected String outcomedescription;
	private boolean isValidated = false;
	private boolean isBusy = false;
}