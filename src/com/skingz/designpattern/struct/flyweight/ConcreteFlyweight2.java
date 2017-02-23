package com.skingz.designpattern.struct.flyweight;

public class ConcreteFlyweight2 extends Flyweight {
	
	//接受外部状态
	public ConcreteFlyweight2(String _Extrinsic){
		super(_Extrinsic);
	}
	//根据外部状态进行逻辑处理
	public void operate(){
	//业务逻辑
		System.out.println("Concrete---Flyweight2 : " + this.Extrinsic); 
	} 
//	private String string;  
//	public ConcreteFlyweight2(String str){  
//		string = str;  
//	}  
//	public void operation()  {  
//		System.out.println("Concrete---Flyweight : " + string);  
//	}  

}
