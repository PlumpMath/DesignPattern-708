package com.skingz.designpattern.action.visitor;

//�����ࣺ����������� 
public abstract class Department {
	//����һ�����صķ��ʷ��������ڷ��ʲ�ͬ���͵ľ���Ԫ��    
    public abstract void visit(EmployeeFulltime employee);    
    public abstract void visit(EmployeeParttime employee);
}
