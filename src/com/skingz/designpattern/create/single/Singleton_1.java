/**
 * 
 */
package com.skingz.designpattern.create.single;

/**
 * Title:    Singleton_1
 * Description:  线程不安全,最low的一种.多线程不能正常工作
 * @author Elizaber
 * @date 2016-12-9
 */
public class Singleton_1 {
 private  static Singleton_1 instance;
 private Singleton_1(){}
 public static Singleton_1 getInstance(){
	 if(instance==null)instance=new Singleton_1();
	 return instance;
 }
}
