/**
 * 
 */
package com.skingz.designpattern.create.factory;

/**
 * Title:    CarFactory
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class CarFactory {
	public Car CreateCar(String carType){
		if(carType.equals("bench")){
			return new CarBench();
		}else if(carType.equals("bmw")){
			return new CarBMW();
		}else return null;
	}
}
