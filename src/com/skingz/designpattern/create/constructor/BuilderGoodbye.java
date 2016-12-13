/**
 * 
 */
package com.skingz.designpattern.create.constructor;

/**
 * Title:    BuilderGoodbye
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class BuilderGoodbye extends BuilderAbs {

	public BuilderGoodbye(){this.msg=new Msg();}
	@Override
	public void buildBody() {
		this.msg.setBody("goodbye my friend");
	}
	public void buildTitle(){ this.msg.setTitle("goodbye"); }
}
