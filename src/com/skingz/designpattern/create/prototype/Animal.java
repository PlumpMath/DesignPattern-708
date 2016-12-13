/**
 * 
 */
package com.skingz.designpattern.create.prototype;

/**
 * Title:    Animal
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class Animal implements Cloneable{
 private String name;
 private AnimalAction action;
 public String getName(){return this.name;}
 public AnimalAction getAction(){return this.action;}
 public void setName(String name){this.name=name;}
 public void setAction(AnimalAction action){this.action=action;}
 
 public Object clone(){
	 try {
		return super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
 }
 public Object deepClone(){
	 try {
		 Animal an=(Animal) super.clone();
		 if(an.action!=null){
			 an.setAction((AnimalAction)an.action.clone());
		 }
		 return an;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
 }
}
