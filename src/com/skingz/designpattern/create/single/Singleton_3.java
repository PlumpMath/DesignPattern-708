/**
 * 
 */
package com.skingz.designpattern.create.single;

/**
 * Title:    Singleton_3
 * Description: 基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用getInstance方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到lazy loading的效果。
 * @author Elizaber
 * @date 2016-12-9
 */
public class Singleton_3 {
	 private static Singleton_3 instance = new Singleton_3();  
	 private Singleton_3 (){}
	 public static Singleton_3 getInstance() {  
	      return instance;  
	 }  
}
