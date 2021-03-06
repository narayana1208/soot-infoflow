/*******************************************************************************
 * Copyright (c) 2012 Secure Software Engineering Group at EC SPRIDE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors: Christian Fritz, Steven Arzt, Siegfried Rasthofer, Eric
 * Bodden, and others.
 ******************************************************************************/
package soot.jimple.infoflow.test.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;

import soot.jimple.infoflow.Infoflow;
/**
 * test taint propagation in queues
 */
@Ignore
public class QueueTests extends JUnitTests {

	@Test
	public void concreteSynchronousQueueTest() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<soot.jimple.infoflow.test.QueueTestCode: void concreteWriteReadTest()>");
		infoflow.computeInfoflow(path, epoints, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void concreteSynchronousQueueNegativeTest() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<soot.jimple.infoflow.test.QueueTestCode: void concreteWriteReadNegativeTest()>");
		infoflow.computeInfoflow(path, epoints, sources, sinks);
		negativeCheckInfoflow(infoflow);
	}

}
