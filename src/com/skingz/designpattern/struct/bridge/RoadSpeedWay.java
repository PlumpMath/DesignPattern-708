/**
 * 
 */
package com.skingz.designpattern.struct.bridge;

/**
 * Title:    RoadSpeedWay
 * Description: 
 * @author Elizaber
 * @date 2016-12-16
 */
public class RoadSpeedWay extends AbsRoad {

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.bridge.AbsRoad#showRoadName()
	 */
	@Override
	public void showRoadName() {
		// TODO Auto-generated method stub
		System.out.print("在高速路上");
	}

}
