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
		// 使用普通功能类  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        // 使用特殊功能类，即适配类  
        Target adapter = new YClassAdapter();  
        adapter.request();  
	}
	private static void testObjectAdapter(){
		// 使用普通功能类  
        Target concreteTarget = new ConcreteTarget();  
        concreteTarget.request();  
          
        // 使用特殊功能类，即适配类，  
        // 需要先创建一个被适配类的对象作为参数  
        Target adapter = new YObjectAdapter(new Adaptee());  
        adapter.request();  
	}

}
