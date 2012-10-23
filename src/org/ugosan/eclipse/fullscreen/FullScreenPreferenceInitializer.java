/*******************************************************************************
 * Copyright (c) 2010 Ugo Sangiorgi and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *  Daoen Pan <http://code.google.com/u/gr8vyguy/> - Original code
 *******************************************************************************/
package org.ugosan.eclipse.fullscreen;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.preferences.ScopedPreferenceStore;


public class FullScreenPreferenceInitializer extends
		AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		ScopedPreferenceStore preferences = new ScopedPreferenceStore(
				InstanceScope.INSTANCE, FullScreenActivator.ID);
		preferences.setDefault(FullScreenActivator.HIDE_MENU_BAR, true);
		preferences.setDefault(FullScreenActivator.HIDE_STATUS_BAR, true);
		preferences.setDefault(FullScreenActivator.FULLSCREEN_STARTUP, false);
	}

}
