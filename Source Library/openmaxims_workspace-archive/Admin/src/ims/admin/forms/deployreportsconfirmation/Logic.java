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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 4680.16533)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.admin.forms.deployreportsconfirmation;

import com.ims.query.builder.client.ReportTemplateManifest;

import ims.admin.vo.SystemReportVo;
import ims.admin.vo.SystemReportVoCollection;
import ims.core.vo.TemplateBoLiteVo;
import ims.core.vo.TemplateBoLiteVoCollection;
import ims.framework.controls.DynamicGridCell;
import ims.framework.controls.DynamicGridColumn;
import ims.framework.controls.DynamicGridRow;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.DynamicCellType;
import ims.framework.utils.Color;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	private static final int COL_NAME = 1;
	private static final int COL_LAST_DEPLOY = 2;
	private static final int COL_LAST_MODIFY = 3;
	

	
	//------------------------------------------------------------------------------------------------------------------------------------
	//	Event handlers region
	//------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		
		open();
	}

	@Override
	protected void onBtnDeployClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.OK);
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}


	//------------------------------------------------------------------------------------------------------------------------------------
	//	Form presentation functions
	//------------------------------------------------------------------------------------------------------------------------------------

	protected void initialize()
	{
		// Initialize dynamic grid
		form.dyngrdReports().clear();
		
		DynamicGridColumn colName = form.dyngrdReports().getColumns().newColumn("Report/Template name", COL_NAME);
		colName.setWidth(500);
		
		DynamicGridColumn colDeployed = form.dyngrdReports().getColumns().newColumn("Last deployed", COL_LAST_DEPLOY);
		colDeployed.setWidth(100);
		
		DynamicGridColumn colModified = form.dyngrdReports().getColumns().newColumn("Last modified", COL_LAST_MODIFY);
		colModified.setWidth(100);
	}
	
	private void open()
	{
		populateReports(form.getGlobalContext().Admin.getReportsModifiedSinceLastDeployment());
	}

	private void populateReports(SystemReportVoCollection reports)
	{
		form.dyngrdReports().getRows().clear();
		
		if (reports == null)
			return;
		
		for (SystemReportVo report : reports)
		{
			DynamicGridRow reportRow = form.dyngrdReports().getRows().newRow();
			
			reportRow.setCollapsedImage(form.getImages().Admin.Audit);
			reportRow.setExpandedImage(form.getImages().Admin.Audit);
			
			if (report.getLastDeployment() != null && report.getLastUpdated() != null
					&& report.getLastDeployment().isLessThan(report.getLastUpdated()))
			{
				reportRow.setTextColor(Color.Black);
			}
			else
			{
				reportRow.setTextColor(Color.Gray);
			}

			DynamicGridCell cellName = reportRow.getCells().newCell(form.dyngrdReports().getColumns().getByIdentifier(COL_NAME), DynamicCellType.STRING);
			cellName.setValue("<b>" + report.getReportName() + "</b>");
			cellName.setReadOnly(true);
			cellName.setTooltip(getReportTemplate(report.getReportXml()));
			
			DynamicGridCell cellLastDeployed = reportRow.getCells().newCell(form.dyngrdReports().getColumns().getByIdentifier(COL_LAST_DEPLOY), DynamicCellType.DATETIME);
			cellLastDeployed.setValue(report.getLastDeployment());
			cellLastDeployed.setReadOnly(true);
			
			DynamicGridCell cellLastModified = reportRow.getCells().newCell(form.dyngrdReports().getColumns().getByIdentifier(COL_LAST_MODIFY), DynamicCellType.DATETIME);
			cellLastModified.setValue(report.getLastUpdated());
			cellLastModified.setReadOnly(true);
			
			reportRow.setValue(report);
			
			if (report.getTemplates() != null)
				populateTemplates(reportRow, report.getTemplates());
			
			reportRow.setExpanded(true);
		}
	}

	
	private void populateTemplates(DynamicGridRow reportRow, TemplateBoLiteVoCollection templates)
	{
		if (templates == null)
			return;
		
		for (TemplateBoLiteVo template : templates)
		{
			DynamicGridRow templateRow = reportRow.getRows().newRow();
			
			templateRow.setCollapsedImage(form.getImages().Admin.Edit);
			templateRow.setExpandedImage(form.getImages().Admin.Edit);
			
			if (template.getLastDeployment() != null && template.getLastUpdated() != null
					&& template.getLastDeployment().isLessThan(template.getLastUpdated()))
			{
				templateRow.setTextColor(Color.Black);
			}
			else
			{
				templateRow.setTextColor(Color.Gray);
			}

			DynamicGridCell cellName = templateRow.getCells().newCell(form.dyngrdReports().getColumns().getByIdentifier(COL_NAME), DynamicCellType.STRING);
			cellName.setValue(template.getName());
			cellName.setTooltip(getTemplateTooltip(template.getTemplateXml()));
			cellName.setReadOnly(true);
			
			DynamicGridCell cellLastDeployed = templateRow.getCells().newCell(form.dyngrdReports().getColumns().getByIdentifier(COL_LAST_DEPLOY), DynamicCellType.DATETIME);
			cellLastDeployed.setValue(template.getLastDeployment());
			cellLastDeployed.setReadOnly(true);
			
			DynamicGridCell cellLastModified = templateRow.getCells().newCell(form.dyngrdReports().getColumns().getByIdentifier(COL_LAST_MODIFY), DynamicCellType.DATETIME);
			cellLastModified.setValue(template.getLastUpdated());
			cellLastModified.setReadOnly(true);
			
			templateRow.setValue(template);
		}
	}


	private String getReportTemplate(String reportXml)
	{
		StringBuilder tooltip = new StringBuilder();
		
		new ReportTemplateManifest().extractReportInfoFromXml(reportXml, tooltip);

		return tooltip.toString();
	}


	private String getTemplateTooltip(String templateXml)
	{
		return new ReportTemplateManifest().extractTemplateInfoFromXml(templateXml);
	}
}
