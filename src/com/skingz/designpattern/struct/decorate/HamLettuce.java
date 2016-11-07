/**
 * 
 */
package com.skingz.designpattern.struct.decorate;

/**
 * Title:    HamLettuce
 * Description:  װ����(����)
 * @author Elizaber
 * @date
 */
public class HamLettuce extends Condiment {
	
	AbsHamburger hamburger;
	public HamLettuce(AbsHamburger hamburger){ this.hamburger=hamburger; }
	public String getName() {
		return hamburger.getName()+"+����";
	}
	public double getPrice() {
		return hamburger.getPrice()+1.5;
	}

}
