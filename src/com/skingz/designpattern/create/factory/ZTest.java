/**
 * 
 */
package com.skingz.designpattern.create.factory;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class ZTest {
 public static void main(String[] args){
	 CarFactory factory=new CarFactory();
	 Car benchCar=factory.CreateCar("bench");
	 Car bmwCar=factory.CreateCar("bmw");
 }
}
