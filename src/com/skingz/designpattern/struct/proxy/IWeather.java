/**
 * 
 */
package com.skingz.designpattern.struct.proxy;

/**
 * Title:    IWeather
 * Description: ���������ɫ(Subject):���� 
 * @author Elizaber
 * @date 2016-12-20
 */
public interface IWeather {
 public void request(String city);
 public void display(String city);
 public void isValidCity(String city);
}
