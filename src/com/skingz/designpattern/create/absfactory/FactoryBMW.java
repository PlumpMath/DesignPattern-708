/**
 * 
 */
package com.skingz.designpattern.create.absfactory;

/**
 * Title:    FactoryBMW
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class FactoryBMW extends IAbstractFactory{
	public IPEngine createEngine() {
		return new PEngineBMW();
	}
	public IPGlass createGlass() {
		return new PGlassBMW();
	}
	public IPWheel createWheel() {
		return null;
	}
}
