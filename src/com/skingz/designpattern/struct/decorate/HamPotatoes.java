/**
 * 
 */
package com.skingz.designpattern.struct.decorate;

/**
 * Title:    HamPotatoes
 * Description:  装饰者（加土豆丝）
 * @author Elizaber
 * @date
 */
public class HamPotatoes extends Condiment {

	AbsHamburger hamburger;
	public HamPotatoes(AbsHamburger hamburger){ this.hamburger=hamburger; }
	public String getName(){
		return hamburger.getName()+"+土豆丝";
	}
	public double getPrice() {
		return hamburger.getPrice()+2.0;
	}

}
