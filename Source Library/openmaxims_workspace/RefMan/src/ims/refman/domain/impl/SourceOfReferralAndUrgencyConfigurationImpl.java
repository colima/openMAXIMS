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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 5360.17707)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import java.util.List;

import ims.RefMan.domain.base.impl.BaseSourceOfReferralAndUrgencyConfigurationImpl;
import ims.core.domain.objects.ReferralSourceUrgency;
import ims.core.vo.ReferralSourceUrgencyVo;
import ims.core.vo.domain.ReferralSourceUrgencyVoAssembler;
import ims.domain.DomainFactory;
import ims.framework.exceptions.CodingRuntimeException;

public class SourceOfReferralAndUrgencyConfigurationImpl extends BaseSourceOfReferralAndUrgencyConfigurationImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.ReferralSourceUrgencyVoCollection getSourceOfReferralConfigVoColl()
	{
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("from ReferralSourceUrgency");
		List<?> list = factory.find(hql.toString());
		if( list != null && list.size() > 0 )
			return ReferralSourceUrgencyVoAssembler.createReferralSourceUrgencyVoCollectionFromReferralSourceUrgency(list);
		
		
		return null;
	}

	public void saveRecord(ims.core.vo.ReferralSourceUrgencyVoCollection recordColl) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException
	{
		if( recordColl == null || recordColl.size() == 0 )
			throw new CodingRuntimeException("ReferralSourceUrgencyVoCollection is null");
		
		DomainFactory factory = getDomainFactory();
		for(int i = 0 ; i < recordColl.size(); i++)
		{
			ReferralSourceUrgencyVo tempVo = recordColl.get(i);
			if( tempVo != null)
			{
				ReferralSourceUrgency doReferralSourceUrgency = ReferralSourceUrgencyVoAssembler.extractReferralSourceUrgency(factory, tempVo);
				if( doReferralSourceUrgency != null)
					factory.save(doReferralSourceUrgency);
			}
		}
	}
}
