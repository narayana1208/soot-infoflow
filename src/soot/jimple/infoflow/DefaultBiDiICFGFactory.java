/**
 * (c) Copyright 2013, Tata Consultancy Services & Ecole Polytechnique de Montreal
 * All rights reserved
 */
package soot.jimple.infoflow;


import soot.SootMethod;
import soot.Unit;
import soot.jimple.infoflow.heros.InfoflowCFG;
import soot.jimple.toolkits.ide.icfg.BiDiInterproceduralCFG;

public class DefaultBiDiICFGFactory implements BiDirICFGFactory {

    @Override
    public BiDiInterproceduralCFG<Unit,SootMethod> buildBiDirICFG(){
        return new InfoflowCFG();
    }
}
