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
// This code was generated by Calin Perebiceanu using IMS Development Environment (version 1.71 build 3700.28274)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.documents.domain.objects.DocumentsToBeDeleted;
import ims.core.documents.domain.objects.PatientDocument;
import ims.core.documents.vo.PatientDocumentRefVo;
import ims.core.domain.base.impl.BasePatientDocumentSearchImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.MemberOfStaffRefVo;
import ims.core.vo.DocumentsToBeDeletedVo;
import ims.core.vo.PatientDocumentSearchListVo;
import ims.core.vo.PatientDocumentVo;
import ims.core.vo.domain.DocumentsToBeDeletedVoAssembler;
import ims.core.vo.domain.EpisodeofCareShortVoAssembler;
import ims.core.vo.domain.PatientDocumentSearchListVoAssembler;
import ims.core.vo.domain.PatientDocumentVoAssembler;
import ims.core.vo.lookups.DocumentCategory;
import ims.core.vo.lookups.DocumentStatus;
import ims.core.vo.lookups.Specialty;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.Date;

import java.util.ArrayList;
import java.util.List;

public class PatientDocumentSearchImpl extends BasePatientDocumentSearchImpl
{
	private static final long serialVersionUID = 1L;

	public ims.core.vo.EpisodeofCareShortVoCollection listEpisodesOfCare(ims.core.patient.vo.PatientRefVo patientId)
	{
		if (patientId == null || !patientId.getID_PatientIsNotNull())
		{
			throw new CodingRuntimeException("Supplied patient is null or doesn't have an id.");
		}
		
		String hql = "select e1_1 from EpisodeOfCare as e1_1 left join e1_1.careSpell as c1_1 left join c1_1.patient as p1_1 where (p1_1.id = :Patient_id) order by e1_1.startDate asc ";
		
		List<?> list = getDomainFactory().find(hql, "Patient_id", patientId.getID_Patient());
		if (list == null || list.size() == 0)
			return null;
		
		return EpisodeofCareShortVoAssembler.createEpisodeofCareShortVoCollectionFromEpisodeOfCare(list);
	}

	public ims.core.vo.PatientDocumentSearchListVoCollection listPatientDocuments(PatientRefVo patientRef, EpisodeOfCareRefVo eoc, Specialty speciality, MemberOfStaffRefVo creatingMos, Date creatingDateFrom, Date creatingDateTo, DocumentCategory documentType, DocumentStatus documentStatus)
	{
		if (patientRef == null || !patientRef.getID_PatientIsNotNull())
		{
			throw new CodingRuntimeException("Supplied patient is null or doesn't have and id.");
		}
		if ( eoc== null && speciality == null && creatingMos == null && creatingDateFrom == null   
			 && creatingDateTo == null && documentType == null && documentStatus == null)
		{
			throw new CodingRuntimeException("All the search parameters provided are null.");
		}
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		StringBuilder sbJoins = new StringBuilder("select distinct p1_1 from PatientDocument as p1_1 ");
		StringBuilder sbQuery = new StringBuilder(" where ( p1_1.patient.id = :Patient_id "); 
				
				
		paramNames.add("Patient_id");
		paramValues.add(patientRef.getID_Patient());
		

		if (eoc != null )
		{
			sbQuery.append(" and p1_1.episodeofCare.id = :EpisodeOfCare_id ");
			paramNames.add("EpisodeOfCare_id");
			paramValues.add(eoc.getID_EpisodeOfCare());
		}
		
		if ( speciality != null )
		{
			sbJoins.append(" left join p1_1.specialty as l1_1");
			sbQuery.append("and l1_1.id = :Speciality_id ");
			paramNames.add("Speciality_id");
			paramValues.add(speciality.getID());
		}
		if (creatingMos  != null )
		{
			sbQuery.append("and p1_1.recordingUser.id = :MemberOfStaff_id ");
			paramNames.add("MemberOfStaff_id");
			paramValues.add(creatingMos.getID_MemberOfStaff());
			
		}
		if (creatingDateFrom  != null )
		{
			sbQuery.append("and p1_1.recordingDateTime >= :dateFrom ");
			paramNames.add("dateFrom");
			paramValues.add(creatingDateFrom.getDate());
			
		}
		if (creatingDateTo != null)
		{
			sbQuery.append("and p1_1.recordingDateTime < :dateTo ");
			paramNames.add("dateTo");
			paramValues.add(((Date) creatingDateTo.clone()).addDay(1).getDate());
		}
		if (documentType != null)
		{
			sbJoins.append(" left join p1_1.category as l2_1");
			sbQuery.append("and l2_1.id = :DocumentType_id ");
			paramNames.add("DocumentType_id");
			paramValues.add(documentType.getID());
		}
		if (documentStatus != null)
		{
			sbJoins.append(" left join p1_1.correspondenceStatus as l3_1");
			sbQuery.append("and l3_1.id = :DocumentStatus_Id ");
			paramNames.add("DocumentStatus_Id");
			paramValues.add(documentStatus.getID());
			
		}
		sbQuery.append(" ) order by p1_1.recordingDateTime desc ");
		
		sbJoins.append(sbQuery.toString());
		
		sbQuery = null;
		
		List<?> domainObjects = getDomainFactory().find(sbJoins.toString(), paramNames, paramValues);
		
		sbJoins = null;
		
		if(domainObjects == null || domainObjects.size() == 0)
			return null;
		
		return PatientDocumentSearchListVoAssembler.createPatientDocumentSearchListVoCollectionFromPatientDocument(domainObjects);
	}

	public PatientDocumentVo getPatientDocument(PatientDocumentRefVo documentID) 
	{
		if(documentID == null || !documentID.getID_PatientDocumentIsNotNull())
		{
			throw new CodingRuntimeException("Cannot get PatientDocument on null PatientDocumentId.");
		}
		
		return PatientDocumentVoAssembler.create((PatientDocument) getDomainFactory().getDomainObject(PatientDocument.class, documentID.getID_PatientDocument()));
	}

	public PatientDocumentSearchListVo getPatientDocumentSearchListVo(PatientDocumentRefVo patientDocumentId) 
	{
		if(patientDocumentId == null || !patientDocumentId.getID_PatientDocumentIsNotNull())
		{
			throw new CodingRuntimeException("Cannot get PatientDocument on null PatientDocumentId.");
		}
		
		return PatientDocumentSearchListVoAssembler.create((PatientDocument) getDomainFactory().getDomainObject(PatientDocument.class, patientDocumentId.getID_PatientDocument()));
	}

	public PatientDocumentVo savePatientDocument(PatientDocumentVo document) throws StaleObjectException 
	{
		if(document == null)
			throw new CodingRuntimeException("Can not save a null PatientDocumentVo.");
		
		if(!document.isValidated())
			throw new CodingRuntimeException("PatientDocumentVo not validated");
		
		DomainFactory factory = getDomainFactory();
		PatientDocument doc = PatientDocumentVoAssembler.extractPatientDocument(factory, document);
		factory.save(doc);	
		
		return PatientDocumentVoAssembler.create(doc);
	}

	public void saveToBeDeteled(DocumentsToBeDeletedVo document) 
	{
		if(document == null)
			throw new CodingRuntimeException("Can not save a null DocumentsToBeDeletedVo.");
		
		if(!document.isValidated())
			throw new CodingRuntimeException("DocumentsToBeDeletedVo not validated");
		
		DomainFactory factory = getDomainFactory();
		DocumentsToBeDeleted doDocument = DocumentsToBeDeletedVoAssembler.extractDocumentsToBeDeleted(factory, document);
		
		try 
		{
			factory.save(doDocument);
		} 
		catch (StaleObjectException e) 
		{
			//should never happen
		}
	}

	public Boolean isStaleObjectException(PatientDocumentVo patientDocument) 
	{
		if(patientDocument == null)
			return false;
		
		DomainFactory factory = getDomainFactory();
		
		List<?> patDoc = factory.find("select d.id from PatientDocument as d where d.id = :docId and d.version > :docVersion", new String[] {"docId", "docVersion"}, new Object[] {patientDocument.getID_PatientDocument(), patientDocument.getVersion_PatientDocument()});
		
		if(patDoc != null && patDoc.size() > 0)
			return true;
		
		return false;
	}
}
