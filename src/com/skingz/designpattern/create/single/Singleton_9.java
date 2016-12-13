/**
 * 
 */
package com.skingz.designpattern.create.single;

/**
 * Title:    Singleton_9
 * Description: ±ê×¼Ð´·¨
 * @author Elizaber
 * @date 2016-12-9
 */
public class Singleton_9 {
	private volatile static Singleton_9 instance;
	 private Singleton_9(){}
	 public static Singleton_9 getInstance(){
		 if(instance==null){
			 synchronized(Singleton_9.class){
				 if(instance==null)instance=new Singleton_9();
			 }
		 }
		 return instance;
	 }
}
