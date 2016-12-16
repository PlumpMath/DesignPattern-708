/**
 * 
 */
package com.skingz.designpattern.struct.bridge;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-16
 */
public class ZTest {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsPerson ap=new PersonMan();
		ap.car=new CarBig();
		ap.car.road=new RoadStreet();
		ap.dirve();
	}

}
