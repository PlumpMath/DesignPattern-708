/**
 * 
 */
package com.skingz.designpattern.create.constructor;

/**
 * Title:    IBuilder
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public abstract class BuilderAbs {
	protected Msg msg;
	//public Msg getMsg(){return this.msg;}
	public abstract void buildBody();
	public void buildTo(String to){ msg.setTo(to);}
	public void buildFrom(String from){msg.setFrom(from);}
	public abstract void buildTitle();
}
