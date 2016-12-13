/**
 * 
 */
package com.skingz.designpattern.create.single;

/**
 * Title:    Singleton_2
 * Description: �̰߳�ȫ������Ч�ʲ��ߣ�ͬʱֻ����һ���̷߳���
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
