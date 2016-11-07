package com.skingz.designpattern.struct.decorate;

/**
 * Title:  AbsHamburger
 * Description: ºº±¤ ³éÏóÀà
 * @author Elizaber
 * @date
 */
public abstract class AbsHamburger {
	protected String name;

	public String getName() {
		return name;
	}
	public abstract double getPrice();
}
