/**
 * 
 */
package com.skingz.designpattern.struct.adapter;


/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-11-17
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	private static void testClassAdapter(){
		// ʹ����ͨ������  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        // ʹ�����⹦���࣬��������  
        Target adapter = new YClassAdapter();  
        adapter.request();  
	}
	private static void testObjectAdapter(){
		// ʹ����ͨ������  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        // ʹ�����⹦���࣬�������࣬  
        // ��Ҫ�ȴ���һ����������Ķ�����Ϊ����  
        Target adapter = new YObjectAdapter(new Adaptee());  
        adapter.request();  
	}

}
