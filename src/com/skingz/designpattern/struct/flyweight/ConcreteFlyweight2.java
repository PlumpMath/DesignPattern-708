package com.skingz.designpattern.struct.flyweight;

public class ConcreteFlyweight2 extends Flyweight {
	
	//�����ⲿ״̬
	public ConcreteFlyweight2(String _Extrinsic){
		super(_Extrinsic);
	}
	//�����ⲿ״̬�����߼�����
	public void operate(){
	//ҵ���߼�
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
