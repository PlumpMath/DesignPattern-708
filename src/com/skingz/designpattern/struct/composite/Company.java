/**
 * 
 */
package com.skingz.designpattern.struct.composite;

/**
 * Title:    Company
 * Description: 
 * @author Elizaber
 * @date 2016-11-17
 */
public abstract class Company {
	private String name;  
	  
    public Company(String name) {  
        this.name = name;  
    }  
  
    public Company() {  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    protected abstract void add(Company company);  
  
    protected abstract void romove(Company company);  
  
    protected abstract void display(int depth);  
}
