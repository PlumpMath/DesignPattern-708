/**
 * 
 */
package com.skingz.designpattern.struct.bridge;

/**
 * Title:    CarSmall
 * Description: 
 * @author Elizaber
 * @date 2016-12-16
 */
public class CarSmall extends AbsCar {

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.bridge.AbsCar#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Ð¡ÐÍ³µ ");
		road.showRoadName();
	}

}
