/**
 * 
 */
package com.skingz.designpattern.struct.decorate;

/**
 * Title:    ZTestDecorte
 * Description: 
 * @author Elizaber
 * @date 2016-11-7
 */
public class ZTestDecorte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbsHamburger hum=new BurgerDrumstick();
		System.out.println(hum.getName()+"  $"+hum.getPrice());
		AbsHamburger let=new HamLettuce(hum);
		System.out.println(let.getName()+"  $"+let.getPrice());
		AbsHamburger pot=new HamPotatoes(let);
		System.out.println(pot.getName()+"  $"+pot.getPrice());
		AbsHamburger pot1=new HamPotatoes(hum);
		System.out.println(pot1.getName()+"  $"+pot1.getPrice());

	}

}
