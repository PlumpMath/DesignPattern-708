package com.skingz.designpattern.struct.flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	public static int getFlyweightSize(){
		return pool.size();
	}
	
	//����һ��������
	private static HashMap<String,Flyweight> pool= new HashMap<String,Flyweight>();
	//��Ԫ����
	public static Flyweight getFlyWeight(String Extrinsic){
		//��Ҫ���صĶ���
		Flyweight flyweight = null;
		//�ڳ���û�иö���
		if(pool.containsKey(Extrinsic)){
			flyweight = pool.get(Extrinsic);
		}else{
			//�����ⲿ״̬������Ԫ����
			flyweight = new ConcreteFlyweight1(Extrinsic);
			//���õ�����
			pool.put(Extrinsic, flyweight);
		}
		return flyweight;
	}
}