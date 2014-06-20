// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 4261.20360)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import ims.RefMan.domain.base.impl.BasePreviousReferralsDialogImpl;
import ims.core.vo.PatientDocumentLiteVoCollection;
import ims.core.vo.domain.PatientDocumentLiteVoAssembler;
import ims.core.vo.lookups.DocumentCategory;
import ims.framework.exceptions.CodingRuntimeException;

public class PreviousReferralsDialogImpl extends BasePreviousReferralsDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.PatientDocumentLiteVo getCatsReport(ims.RefMan.vo.CatsReferralRefVo referral)
	{
		if(referral == null || referral.getID_CatsReferral() == null)
			throw new CodingRuntimeException("Cannot get Cats Referral on null Referral Id.");
		
		String query = "select pd from CatsReferral as c left join c.referralDocuments as pd where c.id = :ReferralId and pd.category.id = :CatsReport order by pd.recordingDateTime desc";
		
		PatientDocumentLiteVoCollection coll = PatientDocumentLiteVoAssembler.createPatientDocumentLiteVoCollectionFromPatientDocument(getDomainFactory().find(query, new String[] {"ReferralId", "CatsReport"}, new Object[] {referral.getID_CatsReferral(), DocumentCategory.CATS_FINAL_REPORT.getID()}));
		
		if(coll != null && coll.size() > 0)
			return coll.get(0);
		
		return null;
	}
}