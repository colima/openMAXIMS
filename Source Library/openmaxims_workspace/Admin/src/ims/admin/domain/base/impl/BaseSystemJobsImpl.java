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

package ims.admin.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseSystemJobsImpl extends DomainImpl implements ims.admin.domain.SystemJobs, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validategetJobNameMyImsId(Integer imsId)
	{
		if(imsId == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'imsId' of type 'Integer' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSystemJobByImsId(Integer imsId)
	{
		if(imsId == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'imsId' of type 'Integer' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSystemJobDetailsByImsId(Integer imsId)
	{
		if(imsId == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'imsId' of type 'Integer' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatesaveSystemJobDetails(ims.admin.vo.ConfiguredJobVo jobDetails)
	{
		if(jobDetails == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'jobDetails' of type 'ims.admin.vo.ConfiguredJobVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetSystemJobVo(Integer id)
	{
		if(id == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'id' of type 'Integer' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetConfiguredJobVo(Integer id)
	{
		if(id == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'id' of type 'Integer' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetAppUsersShort(ims.admin.vo.AppUserShortVo voRef)
	{
		if(voRef == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'voRef' of type 'ims.admin.vo.AppUserShortVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetHistory(Integer id)
	{
		if(id == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'id' of type 'Integer' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetRoleCodeFromAppRoleSpineRbac(Integer appRef)
	{
	}
}
