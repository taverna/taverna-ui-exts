/*******************************************************************************
 * Copyright (C) 2007 The University of Manchester
 *
 *  Modifications to the initial code base are copyright of their
 *  respective authors, or their employers as appropriate.
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2.1 of
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 ******************************************************************************/
package net.sf.taverna.t2.workbench.views.graph.toolbar;

import java.net.URI;

import javax.swing.Action;

import net.sf.taverna.t2.ui.menu.AbstractMenuAction;
import net.sf.taverna.t2.workbench.edits.EditManager;
import net.sf.taverna.t2.workbench.file.FileManager;
import net.sf.taverna.t2.workbench.ui.DataflowSelectionManager;
import net.sf.taverna.t2.workbench.views.graph.actions.SetDefaultInputPortValueAction;

/**
 *
 * @author Alex Nenadic
 *
 */
public class SetDefaultInputPortValueToolbarAction extends AbstractMenuAction {

	private static final URI SET_INPUT_PORT_DEFAULT_URI = URI
			.create("http://taverna.sf.net/2008/t2workbench/menu#graphToolbarSetInputPortDefault");

	public static final URI GRAPH_EDIT_TOOLBAR_SECTION = URI
	.create("http://taverna.sf.net/2008/t2workbench/menu#graphEditToolbarSection");

	private EditManager editManager;
	private FileManager fileManager;
	private DataflowSelectionManager dataflowSelectionManager;


	public SetDefaultInputPortValueToolbarAction() {
		super(GRAPH_EDIT_TOOLBAR_SECTION, 40, SET_INPUT_PORT_DEFAULT_URI);
	}

	@Override
	protected Action createAction() {
		return new SetDefaultInputPortValueAction(editManager, fileManager, dataflowSelectionManager);
	}

	public void setEditManager(EditManager editManager) {
		this.editManager = editManager;
	}

	public void setFileManager(FileManager fileManager) {
		this.fileManager = fileManager;
	}

	public void setDataflowSelectionManager(DataflowSelectionManager dataflowSelectionManager) {
		this.dataflowSelectionManager = dataflowSelectionManager;
	}

}



