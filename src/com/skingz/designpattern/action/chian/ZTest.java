/**
 * 
 */
package com.skingz.designpattern.action.chian;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-15
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//先要组装责任链 
		AbsHandler h3=new ProjectManager();
		AbsHandler h2=new DeptManager();
		AbsHandler h1=new GeneralManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		//开始测试  
        String test1 = h3.handleFeeRequest("张三", 300);  
        System.out.println("test1 = " + test1);  
        String test2 = h3.handleFeeRequest("李四", 300);  
        System.out.println("test2 = " + test2);  
        System.out.println("---------------------------------------");  
          
        String test3 = h3.handleFeeRequest("张三", 700);  
        System.out.println("test3 = " + test3);  
        String test4 = h3.handleFeeRequest("李四", 700);  
        System.out.println("test4 = " + test4);  
        System.out.println("---------------------------------------");  
          
        String test5 = h3.handleFeeRequest("张三", 1500);  
        System.out.println("test5 = " + test5);  
        String test6 = h3.handleFeeRequest("李四", 1500);  
        System.out.println("test6 = " + test6);  
	}

}
