/**
 * 
 */
package com.skingz.designpattern.struct.proxy;

/**
 * Title:    WeatherReal
 * Description: 
 * @author Elizaber
 * @date 2016-12-20
 */
public class WeatherReal implements IWeather {

	protected String url="www.baidu.com";
	protected String xmlWeather="";
	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.proxy.IWeather#request(java.lang.String)
	 */
	public void request(String city) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.proxy.IWeather#display(java.lang.String)
	 */
	public void display(String city) {
		// TODO Auto-generated method stub
		System.out.println("WeatherReal is displaying..."+city);
	}

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.proxy.IWeather#isValidCity(java.lang.String)
	 */
	public void isValidCity(String city) {
		// TODO Auto-generated method stub

	}

}
