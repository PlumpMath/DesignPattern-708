package com.skingz.designpattern.action.command;

public class CommandConcrete2 extends Command {
	Receiver receiver;
	//���ĸ�Receiver����������
	public CommandConcrete2(Receiver _recevier){ this.receiver=_recevier; }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.doSomething();
	}
}
