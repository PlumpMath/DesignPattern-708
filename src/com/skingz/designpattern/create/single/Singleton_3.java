/**
 * 
 */
package com.skingz.designpattern.create.single;

/**
 * Title:    Singleton_3
 * Description: ����classloder���Ʊ����˶��̵߳�ͬ�����⣬������instance����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ���getInstance������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ��instance��Ȼû�дﵽlazy loading��Ч����
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
