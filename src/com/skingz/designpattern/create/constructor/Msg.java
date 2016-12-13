/**
 * 
 */
package com.skingz.designpattern.create.constructor;

/**
 * Title:    Msg
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class Msg {
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	private String to;
	private String from;
	private String body;
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return from+" --> "+to+":"+title+"("+ body +")";
	}
}
