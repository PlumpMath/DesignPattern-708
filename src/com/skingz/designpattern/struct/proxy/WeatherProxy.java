/**
 * 
 */
package com.skingz.designpattern.struct.proxy;

/**
 * Title:    WeatherProxy
 * Description: 
 * @author Elizaber
 * @date 2016-12-20
 */
public class WeatherProxy implements IWeather {
	private IWeather _client;
	private IWeather client(){
		if(_client==null){
			_client=new WeatherReal();
		}
		return _client;
	}
	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.proxy.IWeather#request(java.lang.String)
	 */
	public void request(String city) {
		this.client().request(city);
	}

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.proxy.IWeather#display(java.lang.String)
	 */
	public void display(String city) {
		this.client().display(city);
	}

	/* (non-Javadoc)
	 * @see com.skingz.designpattern.struct.proxy.IWeather#isValidCity(java.lang.String)
	 */
	public void isValidCity(String city) {
		this.client().isValidCity(city);
	}

}
