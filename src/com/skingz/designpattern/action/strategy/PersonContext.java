/**
 * 
 */
package com.skingz.designpattern.action.strategy;

/**
 * Title:    PersonContext
 * Description: 
 * @author Elizaber
 * @date 2016-12-15
 */
public class PersonContext {
	private IStrategyTravel travel;
	public PersonContext(IStrategyTravel tral){
		this.travel=tral;
	}
	public void setStrategy(IStrategyTravel tral){
		this.travel=tral;
	}
	public void travel(){
		this.travel.travelAlgorithm();
	}
}
