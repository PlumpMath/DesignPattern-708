package com.skingz.designpattern.struct.flyweight;

public class ConcreteFlyweight1 extends Flyweight {
	//�����ⲿ״̬
	public ConcreteFlyweight1(String _Extrinsic){
		super(_Extrinsic);
	}
	//�����ⲿ״̬�����߼�����
	public void operate(){
	//ҵ���߼�
		System.out.println("Concrete---Flyweight1 : " + this.Extrinsic); 
	}
}

