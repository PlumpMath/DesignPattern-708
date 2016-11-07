/**
 * 
 */
package com.skingz.designpattern.struct.decorate;

/**
 * Title:    HamLettuce
 * Description:  装饰者(生菜)
 * @author Elizaber
 * @date
 */
public class HamLettuce extends Condiment {
	
	AbsHamburger hamburger;
	public HamLettuce(AbsHamburger hamburger){ this.hamburger=hamburger; }
	public String getName() {
		return hamburger.getName()+"+生菜";
	}
	public double getPrice() {
		return hamburger.getPrice()+1.5;
	}

}
