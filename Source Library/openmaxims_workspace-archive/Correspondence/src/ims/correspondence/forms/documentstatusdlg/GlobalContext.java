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

package ims.correspondence.forms.documentstatusdlg;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		Correspondence = new CorrespondenceContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPasEventIsNotNull()
		{
			return !cx_CorePasEvent.getValueIsNull(context);
		}
		public ims.core.admin.pas.vo.PASEventRefVo getPasEvent()
		{
			return (ims.core.admin.pas.vo.PASEventRefVo)cx_CorePasEvent.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorePasEvent = new ims.framework.ContextVariable("Core.PasEvent", "_cvp_Core.PasEvent");

		private ims.framework.Context context;
	}
	public final class CorrespondenceContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CorrespondenceContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCorrespondenceDetailsIsNotNull()
		{
			return !cx_CorrespondenceCorrespondenceDetails.getValueIsNull(context);
		}
		public ims.correspondence.vo.CorrespondenceDetailsRefVo getCorrespondenceDetails()
		{
			return (ims.correspondence.vo.CorrespondenceDetailsRefVo)cx_CorrespondenceCorrespondenceDetails.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorrespondenceCorrespondenceDetails = new ims.framework.ContextVariable("Correspondence.CorrespondenceDetails", "_cvp_Correspondence.CorrespondenceDetails");
		public boolean getcurrentCspStatusHistoryIsNotNull()
		{
			return !cx_CorrespondencecurrentCspStatusHistory.getValueIsNull(context);
		}
		public ims.correspondence.vo.CorrespondenceStatusHistoryVoCollection getcurrentCspStatusHistory()
		{
			return (ims.correspondence.vo.CorrespondenceStatusHistoryVoCollection)cx_CorrespondencecurrentCspStatusHistory.getValue(context);
		}
		public void setcurrentCspStatusHistory(ims.correspondence.vo.CorrespondenceStatusHistoryVoCollection value)
		{
			cx_CorrespondencecurrentCspStatusHistory.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorrespondencecurrentCspStatusHistory = new ims.framework.ContextVariable("Correspondence.currentCspStatusHistory", "_cv_Correspondence.currentCspStatusHistory");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public CorrespondenceContext Correspondence;
}
