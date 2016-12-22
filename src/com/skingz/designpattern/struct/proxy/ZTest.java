/**
 * 
 */
package com.skingz.designpattern.struct.proxy;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-22
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWeather weather=new WeatherProxy();
		weather.display("shanghai");
	}

}
