/**
 * 
 */
package com.skingz.designpattern.struct.adapter;

/**
 * Title:    YObjectAdapter
 * Description: 适配器类，直接关联被适配类，同时实现标准接口
 * @author Elizaber
 * @date 2016-11-17
 */
public class YObjectAdapter implements Target{
	// 直接关联被适配类  
    private Adaptee adaptee;  
      
    // 可以通过构造函数传入具体需要适配的被适配类对象  
    public YObjectAdapter (Adaptee adaptee) {  
        this.adaptee = adaptee;  
    }  
      
    public void request() {  
        // 这里是使用委托的方式完成特殊功能  
        this.adaptee.specificRequest();  
    }  
}
