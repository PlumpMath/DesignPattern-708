/**
 * 
 */
package com.skingz.designpattern.action.strategy;

/**
 * Title:    StrategyAirplane
 * Description: 
 * @author Elizaber
 * @date 2016-12-15
 */
public class StrategyAirplane implements IStrategyTravel {

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.action.strategy.IStrategyTravel#travelAlgorithm()
	 */
	public void travelAlgorithm() {
		System.out.println("AirPlane");
	}

}
