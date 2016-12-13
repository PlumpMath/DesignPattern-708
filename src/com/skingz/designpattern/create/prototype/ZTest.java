/**
 * 
 */
package com.skingz.designpattern.create.prototype;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class ZTest {
 public static void main(String[] args){
	 test_Low();
	 test_Deep();
 }
 /**
  * 
  */
 public static void test_Low(){
	 System.out.println("«≥∏¥÷∆...");
	 Animal pro=new Animal();
	 pro.setName("chiken");
	 pro.setAction(new AnimalAction(true,true));
	 Animal pro2=(Animal)pro.clone();
	 pro2.setName("chiken_2");
	 pro2.getAction().setCanSing(false);
	 
	 System.out.println(pro.getName()+"  "+pro.getAction().Sing());
	 System.out.println(pro2.getName()+"  "+pro2.getAction().Sing());
 }
 public static void test_Deep(){
	 System.out.println("…Ó∏¥÷∆...");
	 Animal pro=new Animal();
	 pro.setName("chiken");
	 pro.setAction(new AnimalAction(true,true));
	 Animal pro2=(Animal)pro.deepClone();
	 pro2.setName("chiken_2");
	 pro2.getAction().setCanSing(false);
	 
	 System.out.println(pro.getName()+"  "+pro.getAction().Sing());
	 System.out.println(pro2.getName()+"  "+pro2.getAction().Sing());
 }
}
