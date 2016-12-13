/**
 * 
 */
package com.skingz.designpattern.create.single;

/**
 * Title:    Singleton_2
 * Description: 线程安全，但是效率不高，同时只能有一个线程访问
 * @author Elizaber
 * @date 2016-12-9
 */
public class Singleton_2 {
	 private  static Singleton_2 instance;
	 private Singleton_2(){}
	 public static synchronized Singleton_2 getInstance(){
		 if(instance==null)instance=new Singleton_2();
		 return instance;
	 }
}
