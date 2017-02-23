package com.skingz.designpattern.struct.flyweight;

public class ZTest {
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Flyweight fly1,fly2,fly3,fly4,fly5,fly6;
		Flyweight fly1=FlyweightFactory.getFlyWeight("Google");
		Flyweight fly2=FlyweightFactory.getFlyWeight("BaiDu");
		Flyweight fly3=FlyweightFactory.getFlyWeight("Google");
		Flyweight fly4=FlyweightFactory.getFlyWeight("Google");
		Flyweight fly5=FlyweightFactory.getFlyWeight("Google");
		Flyweight fly6=FlyweightFactory.getFlyWeight("Google");
		
		fly1.operate(); 
		fly2.operate(); 
		fly3.operate(); 
		fly4.operate(); 
		fly5.operate(); 
		fly6.operate(); 

		System.out.println("totalSize:"+FlyweightFactory.getFlyweightSize());
	}

}
