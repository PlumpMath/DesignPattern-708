package com.skingz.designpattern.action.state;

//³éÏó×´Ì¬Àà
public abstract class AccountState {
	protected Account acc;
	protected String stateName="Î´¼¤»î";
	public String getStateName(){return stateName;};
	
    public abstract void deposit(double amount);    
    public abstract void withdraw(double amount);    
    public abstract void computeInterest();    
    public abstract void stateCheck();    
}
