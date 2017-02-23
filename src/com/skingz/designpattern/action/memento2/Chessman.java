package com.skingz.designpattern.action.memento2;

public class Chessman implements Cloneable {
	private String label;    
    private int x;    
    private int y;    
    
    public Chessman(String label,int x,int y) {    
        this.label = label;    
        this.x = x;    
        this.y = y;    
    }    
    
    public void setLabel(String label) {    
        this.label = label;     
    }    
    
    public void setX(int x) {    
        this.x = x;     
    }    
    
    public void setY(int y) {    
        this.y = y;     
    }    
    
    public String getLabel() {    
        return (this.label);     
    }    
    
    public int getX() {    
        return (this.x);     
    }    
    
    public int getY() {    
        return (this.y);     
    }    
    
    public Object clone(){
		 try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	 }
}
