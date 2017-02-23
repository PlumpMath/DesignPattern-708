package com.skingz.designpattern.struct.flyweight;

public class ConcreteFlyweight1 extends Flyweight {
	//接受外部状态
	public ConcreteFlyweight1(String _Extrinsic){
		super(_Extrinsic);
	}
	//根据外部状态进行逻辑处理
	public void operate(){
	//业务逻辑
		System.out.println("Concrete---Flyweight1 : " + this.Extrinsic); 
	}
}

