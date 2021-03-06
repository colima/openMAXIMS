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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 4868.26580)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.eas.domain.impl;

import ims.domain.exceptions.StaleObjectException;
import ims.eas.domain.base.impl.BaseRequestImageTransferImpl;
import ims.eas.domain.objects.ElectronicActionSheet;
import ims.eas.vo.EASwithImageTransfersVo;
import ims.eas.vo.domain.EASwithImageTransfersVoAssembler;
import ims.framework.exceptions.CodingRuntimeException;


public class RemoveImageTransferImpl extends BaseRequestImageTransferImpl
{

	private static final long serialVersionUID = 1L;

	
	public EASwithImageTransfersVo getElectronicActionSheet(ims.eas.vo.ElectronicActionSheetRefVo eas)
	{
		if (eas == null || eas.getID_ElectronicActionSheet() == null)
			return null;
		
		return EASwithImageTransfersVoAssembler.create((ElectronicActionSheet) getDomainFactory().getDomainObject(ElectronicActionSheet.class, eas.getID_ElectronicActionSheet()));
	}

	
	public void save(EASwithImageTransfersVo imageTransfers) throws StaleObjectException
	{
		if (imageTransfers == null)
			throw new CodingRuntimeException("Can not save null records");
		

		ElectronicActionSheet easDom = EASwithImageTransfersVoAssembler.extractElectronicActionSheet(getDomainFactory(), imageTransfers);
		
		getDomainFactory().save(easDom);
		
		return;
	}
}
