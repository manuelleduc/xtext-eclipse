/*******************************************************************************
 * Copyright (c) 2009, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.builder.impl;

import static org.eclipse.xtext.builder.impl.BuilderUtil.*;
import static org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil.*;

import java.util.List;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroManager;
import org.eclipse.xtext.builder.tests.internal.TestsActivator;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Event;
import org.eclipse.xtext.ui.testing.util.TargetPlatformUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public abstract class AbstractBuilderTest extends Assert implements IResourceDescription.Event.Listener {
	public final String F_EXT = ".buildertestlanguage";
	private volatile List<Event> events = Lists.newArrayList();

	@BeforeClass
	public static void setupTargetPlatform() throws Exception {
		TargetPlatformUtil.setTargetPlatform(AbstractBuilderTest.class);
	}

	@Before
	public void setUp() throws Exception {
		assertEquals(0, countResourcesInIndex());
		assertEquals(0, root().getProjects().length);
		if (PlatformUI.isWorkbenchRunning()) {
			final IIntroManager introManager = PlatformUI.getWorkbench().getIntroManager();
			if (introManager.getIntro() != null) {
				Display.getDefault().asyncExec(new Runnable() {
					
					@Override
					public void run() {
						introManager.closeIntro(introManager.getIntro());
					}
				});
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		cleanWorkspace();
		reallyWaitForAutoBuild();
		events.clear();
		getBuilderState().removeListener(this);
		assertEquals(0, countResourcesInIndex());
		assertEquals(0, root().getProjects().length);
	}

	@Override
	public void descriptionsChanged(Event event) {
		this.events.add(event);
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
	public <T> T getInstance(Class<T> type) {
		Injector injector = TestsActivator.getInstance().getInjector(TestsActivator.ORG_ECLIPSE_XTEXT_BUILDER_TESTS_BUILDERTESTLANGUAGE);
		return injector.getInstance(type);
	}
}
