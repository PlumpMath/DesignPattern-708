/**
 * 
 */
package com.skingz.designpattern.create.constructor;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BuilderAbs builder=new BuilderGoodbye();
		Director director=new Director(builder);
		director.constract("china", "moon");
	}

}
