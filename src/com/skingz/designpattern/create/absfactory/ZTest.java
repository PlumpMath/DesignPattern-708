/**
 * 
 */
package com.skingz.designpattern.create.absfactory;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactoryBench bfactory=new FactoryBench();
		bfactory.createEngine();
		bfactory.createGlass();
		bfactory.createWheel();
		
		FactoryBMW wfactory=new FactoryBMW();
		wfactory.createEngine();
		wfactory.createGlass();
		wfactory.createWheel();
	}

}
