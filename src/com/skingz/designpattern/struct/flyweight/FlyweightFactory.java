package com.skingz.designpattern.struct.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	public static int getFlyweightSize(){
		return pool.size();
	}
	
	//定义一个池容器
	private static HashMap<String,Flyweight> pool= new HashMap<String,Flyweight>();
	//享元工厂
	public static Flyweight getFlyWeight(String Extrinsic){
		//需要返回的对象
		Flyweight flyweight = null;
		//在池中没有该对象
		if(pool.containsKey(Extrinsic)){
			flyweight = pool.get(Extrinsic);
		}else{
			//根据外部状态创建享元对象
			flyweight = new ConcreteFlyweight1(Extrinsic);
			//放置到池中
			pool.put(Extrinsic, flyweight);
		}
		return flyweight;
	}
}