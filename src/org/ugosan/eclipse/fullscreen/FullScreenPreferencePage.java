/*******************************************************************************
 * Copyright (c) 2010 Ugo Sangiorgi and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *  gr8vyguy <http://code.google.com/u/gr8vyguy/> - Original code
 *******************************************************************************/
package org.ugosan.eclipse.fullscreen;

import java.io.IOException;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

public class FullScreenPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	private ScopedPreferenceStore preferences;

	public FullScreenPreferencePage() {
		super(GRID);
		preferences = new ScopedPreferenceStore(new InstanceScope(),
				FullScreenActivator.ID);
		setPreferenceStore(preferences);
	}

	protected void createFieldEditors() {
		BooleanFieldEditor boolEditor = new BooleanFieldEditor(
				FullScreenActivator.HIDE_MENU_BAR,
				Messages.FullScreenPreferencePage_0, getFieldEditorParent());
		addField(boolEditor);
		BooleanFieldEditor boolEditor_status = new BooleanFieldEditor(
				FullScreenActivator.HIDE_STATUS_BAR,
				Messages.FullScreenPreferencePage_1, getFieldEditorParent());
		addField(boolEditor_status);
	}

	public void init(IWorkbench workbench) {
	}

	public boolean performOk() {
		try {
			preferences.save();
		} catch (IOException e) {
		}
		return super.performOk();
	}
}
