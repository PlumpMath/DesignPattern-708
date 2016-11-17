/**
 * 
 */
package com.skingz.designpattern.struct.adapter;

/**
 * Title:    ClassAdapter
 * Description:  类适配器,采用继承实现
 * 				(先继承已有的特殊类，再实现标准接口)
 * @author Elizaber
 * @date 2016-11-17
 */
public class YClassAdapter extends Adaptee implements Target{
	public void request() {
		super.specificRequest();
	}
}