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

package ims.spinalinjuries.domain;

// Generated from form domain impl
public interface MedSystemreview extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.generalmedical.vo.AdmisSysRevewVo getAdmisSystemReviewByClinicalContact(ims.core.vo.ClinicalContactShortVo voClinicalContactShort);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.AdmisSysRevewVo saveAdmisSystemReview(ims.generalmedical.vo.AdmisSysRevewVo admisSysReview, ims.core.vo.ClinicalContactShortVo contact) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.generalmedical.vo.AdmisSysRevewVo getAdmisSystemReviewByCareContext(ims.core.admin.vo.CareContextRefVo voCareContextRef);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.MedicalProbOnAdmisVoCollection getPatientProblemByClinicalContact(ims.core.vo.ClinicalContactShortVo voClinicalContactShort);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.MedicalProbOnAdmisVoCollection getPatientProblemByCareContext(ims.core.admin.vo.CareContextRefVo voCareContextRef);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.SystemReviewVoCollection getAdmisSystemReviewCollByCareContext(ims.core.admin.vo.CareContextRefVo voCareContextRef);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.SystemReviewVoCollection getAdmisSystemReviewCollByClinicalContact(ims.core.vo.ClinicalContactShortVo voClinicalContactShort);

	// Generated from form domain interface definition
	public void saveProblemsAdmis(ims.generalmedical.vo.MedicalProbOnAdmisVoCollection problemColl) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.generalmedical.vo.MedicalProbOnAdmisVoCollection getRiePatientProblemBYCareConntext(ims.core.admin.vo.CareContextRefVo voCareContextRef);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.MedicalProbOnAdmisVoCollection getRiePatientProblemByClinicalContact(ims.core.vo.ClinicalContactShortVo voClinicalCOntactShort);
}
