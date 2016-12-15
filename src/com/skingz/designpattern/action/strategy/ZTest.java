/**
 * 
 */
package com.skingz.designpattern.action.strategy;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-15
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonContext context=new PersonContext(new StrategyAirplane());
		context.travel();
	}

}
