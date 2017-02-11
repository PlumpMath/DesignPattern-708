package com.skingz.designpattern.action.command;

public class ZTest {

	public static void main(String[] args) {
		//��������������Invoker
		Invoker invoker = new Invoker();
		//���������
		Receiver receiver = new ReciverConcrete1();
		//����һ�����͸������ߵ�����
		Command command = new CommandConcrete1(receiver);
		//�������������ȥִ��
		invoker.setCommand(command);
		invoker.action();
	}

}
