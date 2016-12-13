/**
 * 
 */
package com.skingz.designpattern.create.constructor;

/**
 * Title:    BuilderWelcome
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class BuilderWelcome extends BuilderAbs {

	public BuilderWelcome (){
		this.msg=new Msg();
	}
	@Override
	public void buildBody() {
		this.msg.setBody("welcome to my programe...");
	}
	public void buildTitle(){ this.msg.setTitle("welcome"); }

}
