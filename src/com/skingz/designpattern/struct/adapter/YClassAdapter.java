/**
 * 
 */
package com.skingz.designpattern.struct.adapter;

/**
 * Title:    ClassAdapter
 * Description:  ��������,���ü̳�ʵ��
 * 				(�ȼ̳����е������࣬��ʵ�ֱ�׼�ӿ�)
 * @author Elizaber
 * @date 2016-11-17
 */
public class YClassAdapter extends Adaptee implements Target{
	public void request() {
		super.specificRequest();
	}
}