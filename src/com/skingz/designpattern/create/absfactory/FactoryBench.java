/**
 * 
 */
package com.skingz.designpattern.create.absfactory;

/**
 * Title:    FactoryBench
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class FactoryBench extends IAbstractFactory {

	public IPEngine createEngine() {
		return new PEngineBench();
	}
	public IPGlass createGlass() {
		return new PGlassBench();
	}
	public IPWheel createWheel() {
		return null;
	}

}
