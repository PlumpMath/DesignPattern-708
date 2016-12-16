/**
 * 
 */
package com.skingz.designpattern.struct.bridge;

/**
 * Title:    CarBig
 * Description: 
 * @author Elizaber
 * @date 2016-12-16
 */
public class CarBig extends AbsCar {

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.bridge.AbsCar#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.print("¥Û–Õ≥µ ");
		road.showRoadName();
	}

}
