package com.skingz.designpattern.action.state;

//����״̬��
public abstract class AccountState {
	protected Account acc;
	protected String stateName="δ����";
	public String getStateName(){return stateName;};
	
    public abstract void deposit(double amount);    
    public abstract void withdraw(double amount);    
    public abstract void computeInterest();    
    public abstract void stateCheck();    
}
