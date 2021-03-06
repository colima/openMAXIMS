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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.dementiaamtsform;

import ims.clinical.vo.DementiaAndDementiaAssesInvestigForRecordBrowserVo;
import ims.clinical.vo.DementiaAssessAndInvestigateVoCollection;
import ims.clinical.vo.DementiaForRecordBrowserVoCollection;
import ims.clinical.vo.DementiaVo;
import ims.framework.enumerations.FormMode;
import ims.framework.enumerations.SortOrder;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	
	protected void onRecbrDementiaAMTSValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		recbrDementiaAMTSValueChanged();
	}
	private void recbrDementiaAMTSValueChanged()
	{
		form.ccDementiaAssessment().clearControls();
		if( form.recbrDementiaAMTS().getValue() != null )
		{
			DementiaVo tempVo  = domain.getDementiaVo(form.recbrDementiaAMTS().getValue().getDementia());
			if( tempVo != null )
			{
				if( form.recbrDementiaAMTS().getValue().getIsStepTwo().equals(Boolean.TRUE))
				{
					form.ccDementiaAssessment().initialize(Boolean.FALSE);
					form.ccDementiaAssessment().setValue(tempVo, tempVo.getStepTwoAssess());
					form.ccDementiaAssessment().setMode(FormMode.VIEW);
//					form.ccDementiaAssessment().initialize(tempVo, FormMode.VIEW, null);
				}
				else
				{
					form.ccDementiaAssessment().initialize(Boolean.TRUE);
					form.ccDementiaAssessment().setValue(tempVo, form.recbrDementiaAMTS().getValue().getDementiaAndInvestigate());
					form.ccDementiaAssessment().setMode(FormMode.VIEW);
//					form.ccDementiaAssessment().initialize(tempVo, FormMode.VIEW, form.recbrDementiaAMTS().getValue().getDementiaAndInvestigate());
				}
			}
		}
		else 
		{
			form.ccDementiaAssessment().initialize(Boolean.FALSE);
			form.ccDementiaAssessment().setValue(null, null);
			form.ccDementiaAssessment().setMode(FormMode.VIEW);
//			form.ccDementiaAssessment().initialize(null, FormMode.VIEW, null);
		}
		
		form.ccDementiaAssessment().hideNewEditAndRieButtons();
	}
	private void open()
	{
		DementiaForRecordBrowserVoCollection tempVoColl = domain.getDementiaForRecordBrowserVo(form.getGlobalContext().Core.getPatientShort());
		if( tempVoColl != null && tempVoColl.size() > 0)
		{
			loadRecordBrowser(tempVoColl);
			if( form.recbrDementiaAMTS().getValues() != null &&  form.recbrDementiaAMTS().getValues().size() > 0)
				form.recbrDementiaAMTS().setValue((DementiaAndDementiaAssesInvestigForRecordBrowserVo) form.recbrDementiaAMTS().getValues().get(0));
			//recbrDementiaAMTSValueChanged();
		}
		recbrDementiaAMTSValueChanged();
	}
	private void loadRecordBrowser( DementiaForRecordBrowserVoCollection tempVoColl)
	{
		if( tempVoColl == null  || tempVoColl.size() == 0)
			return;
		for (int i = 0 ; i < tempVoColl.size() ; i++)
		{
			
			if( tempVoColl.get(i) != null && tempVoColl.get(i).getFollowUpAssessmentsIsNotNull())
			{
				DementiaAssessAndInvestigateVoCollection tempColl = tempVoColl.get(i).getFollowUpAssessments();
				tempColl.sort(SortOrder.DESCENDING);
				for( int j = 0; j < tempColl.size();j++)
				{
					if( tempVoColl.get(i).getFollowUpAssessments().get(j) != null )
					{
						StringBuffer sb = new StringBuffer();
						sb.append((tempColl.get(j).getAuthoringInformation().getAuthoringHcpIsNotNull()  && tempColl.get(j).getAuthoringInformation().getAuthoringHcpIsNotNull() ? tempColl.get(j).getAuthoringInformation().getAuthoringHcp().toString():"") +" " + (tempColl.get(j).getAuthoringInformation().getAuthoringHcpIsNotNull() && tempColl.get(j).getAuthoringInformation().getAuthoringDateTimeIsNotNull() ? tempColl.get(j).getAuthoringInformation().getAuthoringDateTime().toString():""));
						sb.append(" - Score: ");
						sb.append(tempColl.get(j).getAMTSScore());
						
						DementiaAndDementiaAssesInvestigForRecordBrowserVo temp = new DementiaAndDementiaAssesInvestigForRecordBrowserVo();
						temp.setDementia(tempVoColl.get(i));
						temp.setDementiaAndInvestigate(tempColl.get(j));
						temp.setIsStepTwo(Boolean.FALSE);
						form.recbrDementiaAMTS().newRow(temp, sb.toString());
					}
				}
			}
			
			if( tempVoColl.get(i) != null && tempVoColl.get(i).getStepTwoAssessIsNotNull()) 
			{
				StringBuffer sb = new StringBuffer();
				sb.append(tempVoColl.get(i).getStepTwoAssessIsNotNull()? tempVoColl.get(i).getStepTwoAssess().getAuthoringInformation().toString(" "):" ");
				sb.append(" - Score: ");
				sb.append(tempVoColl.get(i).getStepTwoAssessIsNotNull()? tempVoColl.get(i).getStepTwoAssess().getAMTSScore():"");
				DementiaAndDementiaAssesInvestigForRecordBrowserVo temp = new DementiaAndDementiaAssesInvestigForRecordBrowserVo();
				temp.setDementia(tempVoColl.get(i));
				temp.setDementiaAndInvestigate(tempVoColl.get(i).getStepTwoAssess());
				temp.setIsStepTwo(Boolean.TRUE);
				form.recbrDementiaAMTS().newRow(temp, sb.toString());
			}
			
		}
	}
}
