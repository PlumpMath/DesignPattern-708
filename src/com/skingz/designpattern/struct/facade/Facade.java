/**
 * 
 */
package com.skingz.designpattern.struct.facade;

/**
 * Title:    Facade
 * Description:  �ṩ�ķ������Ը���ҵ���������
 * @author Elizaber
 * @date 2016-12-16
 */
public class Facade {
	IServiceA sa;
	IServiceB sb;
	IServiceC sc;
	public Facade(){
		sa=new ServiceAImpl();
		sb=new ServiceBImpl();
		sc=new ServiceCImpl();
	}
	
	public void methodA(){
		sa.methodA();
		sb.methodB();
	}
	public void methodB(){
		sb.methodB();
	}
	public void methodC(){
		sc.methodC();
		sb.methodB();
	}
	public void methodD(){
		sc.methodC();
		sa.methodA();
	}
}
