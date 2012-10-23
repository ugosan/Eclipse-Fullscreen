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

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.ugosan.eclipse.fullscreen.messages"; //$NON-NLS-1$
	
	public static String FullScreenPreferencePage_0;
	public static String FullScreenPreferencePage_1;
	public static String FullScreenPreferencePage_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
