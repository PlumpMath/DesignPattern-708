/**
 * 
 */
package com.skingz.designpattern.create.prototype;

/**
 * Title:    AnimalAction
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public class AnimalAction implements Cloneable{
	 private boolean canSing;
	 private boolean canWalk;
	 
	 public AnimalAction(boolean sing,boolean walk){
		 this.canSing=sing;
		 this.canWalk=walk;
	 }
	 public void setCanSing(boolean sing){this.canSing=sing;}
	 public void setCanWalk(boolean walk){this.canWalk=walk;}
	 
	 public String Sing(){ return canSing?"singing..":" can't sing.."; }
	 public String Walk(){return canWalk?"walking..":"can't walking..";}
	 
	 public Object clone(){
		 try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	 }
}
