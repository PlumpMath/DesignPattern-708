/**
 * 
 */
package com.skingz.designpattern.struct.adapter;

/**
 * Title:    YObjectAdapter
 * Description: �������ֱ࣬�ӹ����������࣬ͬʱʵ�ֱ�׼�ӿ�
 * @author Elizaber
 * @date 2016-11-17
 */
public class YObjectAdapter implements Target{
	// ֱ�ӹ�����������  
    private Adaptee adaptee;  
      
    // ����ͨ�����캯�����������Ҫ����ı����������  
    public YObjectAdapter (Adaptee adaptee) {  
        this.adaptee = adaptee;  
    }  
      
    public void request() {  
        // ������ʹ��ί�еķ�ʽ������⹦��  
        this.adaptee.specificRequest();  
    }  
}
