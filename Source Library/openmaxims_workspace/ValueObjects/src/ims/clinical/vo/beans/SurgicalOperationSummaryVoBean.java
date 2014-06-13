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

package ims.clinical.vo.beans;

public class SurgicalOperationSummaryVoBean extends ims.vo.ValueObjectBean
{
	public SurgicalOperationSummaryVoBean()
	{
	}
	public SurgicalOperationSummaryVoBean(ims.clinical.vo.SurgicalOperationSummaryVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.initiatinghcp = vo.getInitiatingHCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getInitiatingHCP().getBean();
		this.operationdetailscompleted = vo.getOperationDetailsCompleted();
		this.summarydocumentgenerated = vo.getSummaryDocumentGenerated();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.SurgicalOperationSummaryVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.initiatinghcp = vo.getInitiatingHCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getInitiatingHCP().getBean(map);
		this.operationdetailscompleted = vo.getOperationDetailsCompleted();
		this.summarydocumentgenerated = vo.getSummaryDocumentGenerated();
	}

	public ims.clinical.vo.SurgicalOperationSummaryVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.SurgicalOperationSummaryVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.SurgicalOperationSummaryVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.SurgicalOperationSummaryVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.SurgicalOperationSummaryVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getInitiatingHCP()
	{
		return this.initiatinghcp;
	}
	public void setInitiatingHCP(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.initiatinghcp = value;
	}
	public Boolean getOperationDetailsCompleted()
	{
		return this.operationdetailscompleted;
	}
	public void setOperationDetailsCompleted(Boolean value)
	{
		this.operationdetailscompleted = value;
	}
	public Boolean getSummaryDocumentGenerated()
	{
		return this.summarydocumentgenerated;
	}
	public void setSummaryDocumentGenerated(Boolean value)
	{
		this.summarydocumentgenerated = value;
	}

	private Integer id;
	private int version;
	private ims.vo.RefVoBean carecontext;
	private ims.core.vo.beans.HcpLiteVoBean initiatinghcp;
	private Boolean operationdetailscompleted;
	private Boolean summarydocumentgenerated;
}