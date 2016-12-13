/**
 * 
 */
package com.skingz.designpattern.create.single;

/**
 * Title:    Singleton_4
 * Description: ��new Singleton_3 һ�� 
 * @author Elizaber
 * @date 2016-12-9
 */
public class Singleton_4 {
	private static Singleton_4 instance =null;
	static{
		instance=new Singleton_4();  
	}
	
	 private Singleton_4 (){}
	 public static Singleton_4 getInstance() {  
	      return instance;  
	 }  
}
