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

package ims.assessment.forms.graphicassessmentinstantiation;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void onFormModeChanged();
	abstract protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbStatusValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDrawingImageQuestionsEdited(int index) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDrawingImageQuestionsRemoved(int index) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDrawingImageQuestionsNote(ims.framework.controls.DrawingControlShape shape) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDyngrdQuestionsCellButtonClicked(ims.framework.controls.DynamicGridCell cell);
	abstract protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onCmbImagesValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onLnkReturnToListClick() throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormOpen();
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.btnUpdate().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnUpdateClick();
			}
		});
		this.form.cmbStatus().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbStatusValueChanged();
			}
		});
		this.form.lyrDetails().tabImages().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabImagesActivated();
			}
		});
		this.form.lyrDetails().tabQuestions().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrDetailstabQuestionsActivated();
			}
		});
		this.form.lyrDetails().tabImages().drawingImageQuestions().setDrawingControlShapeEditedEvent(new DrawingControlShapeEdited()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int index) throws ims.framework.exceptions.PresentationLogicException
			{
				onDrawingImageQuestionsEdited(index);
			}
		});
		this.form.lyrDetails().tabImages().drawingImageQuestions().setDrawingControlShapeRemovedEvent(new DrawingControlShapeRemoved()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int index) throws ims.framework.exceptions.PresentationLogicException
			{
				onDrawingImageQuestionsRemoved(index);
			}
		});
		this.form.lyrDetails().tabImages().drawingImageQuestions().setDrawingControlNoteEvent(new DrawingControlNote()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DrawingControlShape shape) throws ims.framework.exceptions.PresentationLogicException
			{
				onDrawingImageQuestionsNote(shape);
			}
		});
		this.form.lyrDetails().tabQuestions().dyngrdQuestions().setDynamicGridCellButtonClickedEvent(new DynamicGridCellButtonClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridCell cell) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdQuestionsCellButtonClicked(cell);
			}
		});
		this.form.btnCancel().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnCancelClick();
			}
		});
		this.form.btnSave().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSaveClick();
			}
		});
		this.form.cmbImages().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onCmbImagesValueChanged();
			}
		});
		this.form.lnkReturnToList().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onLnkReturnToListClick();
			}
		});
	}
	private void onlyrDetailstabImagesActivated()
	{
		this.form.lyrDetails().showtabImages();
	}
	private void onlyrDetailstabQuestionsActivated()
	{
		this.form.lyrDetails().showtabQuestions();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}