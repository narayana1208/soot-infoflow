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

import soot.jimple.infoflow.Infoflow;
/**
 * contain test cases for taint propagation in Maps.
 */
public class MapTests extends JUnitTests {

    @Test
    public void mapPos0Test(){
    	Infoflow infoflow = initInfoflow();

    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void writeReadPos0Test()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);		
		
		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }
    
    @Test
    public void mapPos1Test(){
    	Infoflow infoflow = initInfoflow();

    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);
    	
    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void writeReadPos1Test()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);	

		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }

    @Test
    public void concreteMapPos0Test(){
    	Infoflow infoflow = initInfoflow();

    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);
    	
    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void concreteWriteReadPos0Test()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);

		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }
    
    @Test
    public void concreteLinkedMapPos0Test(){
    	Infoflow infoflow = initInfoflow();

    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void concreteLinkedWriteReadPos0Test()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);

		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }

    @Test
    public void concreteMapPos1Test(){
    	Infoflow infoflow = initInfoflow();
    	
    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void concreteWriteReadPos1Test()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);

		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }
    
    @Test
    public void concreteMapTest2(){
    	Infoflow infoflow = initInfoflow();
    	
    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void concreteWriteRead2Test()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);
    
		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }
    
    @Test
    public void mapIteratorTest(){
    	Infoflow infoflow = initInfoflow();
    	
    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void iteratorTest()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);		

		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }
    
    @Test
    public void mapEntryTest(){
    	Infoflow infoflow = initInfoflow();
    	
    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void entryTest()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);	
    
		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }
    
    @Test
    public void concreteTableTest(){
    	Infoflow infoflow = initInfoflow();
    	
    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void concreteWriteReadTableTest()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		checkInfoflow(infoflow, 1);
		
		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }
    
    @Test
    public void concreteNegativeTest(){
    	Infoflow infoflow = initInfoflow();
    	
    	int oldAPLength = Infoflow.getAccessPathLength();
    	infoflow.setAccessPathLength(1);
    	int oldDepth = Infoflow.getAbstractionDepth();
    	infoflow.setAbstractionDepth(1);

    	List<String> epoints = new ArrayList<String>();
    	epoints.add("<soot.jimple.infoflow.test.MapTestCode: void concreteWriteReadNegativeTest()>");
		infoflow.computeInfoflow(path, epoints,sources, sinks);
		negativeCheckInfoflow(infoflow);
    
		infoflow.setAccessPathLength(oldAPLength);	// this is a global setting! Restore it when we're done
		infoflow.setAbstractionDepth(oldDepth);
    }

}
