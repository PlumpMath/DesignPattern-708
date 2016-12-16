/**
 * 
 */
package com.skingz.designpattern.struct.bridge;

/**
 * Title:    PersonMan
 * Description: 
 * @author Elizaber
 * @date 2016-12-16
 */
public class PersonMan extends AbsPerson {

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.bridge.AbsPerson#dirve()
	 */
	@Override
	public void dirve() {
		// TODO Auto-generated method stub
		System.out.print("˧�翪 ");
		car.run();
	}

}
