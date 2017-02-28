package com.skingz.designpattern.action.visitor;

//������Դ���ࣺ�����������  
public class DepartmentHR extends Department {

	//ʵ��������Դ����ȫְԱ���ķ���   
	@Override
	public void visit(EmployeeFulltime employee) {
		 int workTime = employee.getWorkTime();    
	        System.out.print("��ʽԱ��_" + employee.getName() + " ʵ�ʹ���ʱ��Ϊ��" + workTime + "Сʱ��");    
	        if(workTime > 40){    
	            System.out.println("�Ӱ�ʱ��Ϊ��" + (workTime - 40) + "Сʱ��");    
	        }    
	        else if(workTime < 40) {    
	            System.out.println("���ʱ��Ϊ��" + (40 - workTime) + "Сʱ��");    
	        }else{
	        	System.out.println("");
	        }       
	}
	
	//ʵ��������Դ���Լ�ְԱ���ķ���  
	@Override
	public void visit(EmployeeParttime employee) {
		 int workTime = employee.getWorkTime();    
	        System.out.println("��ʱ��_" + employee.getName() + " ʵ�ʹ���ʱ��Ϊ��" + workTime + "Сʱ��"); 
	}

}
