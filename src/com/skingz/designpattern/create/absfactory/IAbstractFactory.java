/**
 * 
 */
package com.skingz.designpattern.create.absfactory;

/**
 * Title:    IAbstractFactory
 * Description: 
 * @author Elizaber
 * @date 2016-12-9
 */
public abstract class IAbstractFactory {
	public IAbstractFactory() {
	}
  public abstract IPEngine createEngine();
  public abstract IPGlass createGlass();
  public abstract IPWheel createWheel();
}
