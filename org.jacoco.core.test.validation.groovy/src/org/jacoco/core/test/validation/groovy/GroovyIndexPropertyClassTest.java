/*******************************************************************************
 * Copyright (c) 2009, 2023 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Stephan Classen
 *    Vadim Bauer
 *
 *******************************************************************************/
package org.jacoco.core.test.validation.groovy;

import org.jacoco.core.test.validation.ValidationTestBase;
import org.jacoco.core.test.validation.groovy.targets.GroovyIndexPropertyClassTarget;
import org.junit.Test;

/**
 * Test of class with fields annotated by
 * {@link groovy.transform.IndexedProperty} annotation.
 */
public class GroovyIndexPropertyClassTest extends ValidationTestBase {
	public GroovyIndexPropertyClassTest() {
		super(GroovyIndexPropertyClassTarget.class);
	}

	@Test
	public void test_method_count() {
		assertMethodCount(1);
	}
}
