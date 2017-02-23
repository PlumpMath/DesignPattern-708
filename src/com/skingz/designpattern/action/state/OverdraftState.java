package com.skingz.designpattern.action.state;

//͸֧״̬������״̬�� 
public class OverdraftState extends AccountState {

	public OverdraftState(AccountState state) {    
        this.acc = state.acc;  
        this.stateName="͸֧״̬";
    }    
        
    public void deposit(double amount) {    
        acc.setBalance(acc.getBalance() + amount);    
        stateCheck();    
    }    
        
    public void withdraw(double amount) {    
        acc.setBalance(acc.getBalance() - amount);    
        stateCheck();    
    }    
        
    public void computeInterest() {    
        System.out.println("������Ϣ��");    
    }    
        
    //״̬ת��    
    public void stateCheck() {    
        if (acc.getBalance() > 0) {    
            acc.setState(new NormalState(this));    
        }    
        else if (acc.getBalance() == -2000) {    
            acc.setState(new RestrictedState(this));    
        }    
        else if (acc.getBalance() < -2000) {    
            System.out.println("�������ޣ�");    
        }    
    }

}