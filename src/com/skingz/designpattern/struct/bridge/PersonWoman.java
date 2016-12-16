/**
 * 
 */
package com.skingz.designpattern.struct.bridge;

/**
 * Title:    PersonWoman
 * Description: 
 * @author Elizaber
 * @date 2016-12-16
 */
public class PersonWoman extends AbsPerson {

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.bridge.AbsPerson#dirve()
	 */
	@Override
	public void dirve() {
		// TODO Auto-generated method stub
		System.out.print("ÃÀÅ®¿ª ");
		car.run();
	}

}
