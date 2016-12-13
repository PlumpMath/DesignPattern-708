/**
 * 
 */
package com.skingz.designpattern.create.constructor;

/**
 * Title:    Director
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class Director {
	BuilderAbs builder;
	public Director(BuilderAbs build){this.builder=build;}
	public void constract(String to,String from){
		builder.buildTo(to);
		builder.buildFrom(from);
		builder.buildTitle();
		builder.buildBody();
	}
}
