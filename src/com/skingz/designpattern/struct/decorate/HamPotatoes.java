/**
 * 
 */
package com.skingz.designpattern.struct.decorate;

/**
 * Title:    HamPotatoes
 * Description:  װ���ߣ�������˿��
 * @author Elizaber
 * @date
 */
public class HamPotatoes extends Condiment {

	AbsHamburger hamburger;
	public HamPotatoes(AbsHamburger hamburger){ this.hamburger=hamburger; }
	public String getName(){
		return hamburger.getName()+"+����˿";
	}
	public double getPrice() {
		return hamburger.getPrice()+2.0;
	}

}
