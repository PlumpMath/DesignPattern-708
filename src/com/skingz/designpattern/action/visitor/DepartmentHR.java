package com.skingz.designpattern.action.visitor;

//人力资源部类：具体访问者类  
public class DepartmentHR extends Department {

	//实现人力资源部对全职员工的访问   
	@Override
	public void visit(EmployeeFulltime employee) {
		 int workTime = employee.getWorkTime();    
	        System.out.print("正式员工_" + employee.getName() + " 实际工作时间为：" + workTime + "小时。");    
	        if(workTime > 40){    
	            System.out.println("加班时间为：" + (workTime - 40) + "小时。");    
	        }    
	        else if(workTime < 40) {    
	            System.out.println("请假时间为：" + (40 - workTime) + "小时。");    
	        }else{
	        	System.out.println("");
	        }       
	}
	
	//实现人力资源部对兼职员工的访问  
	@Override
	public void visit(EmployeeParttime employee) {
		 int workTime = employee.getWorkTime();    
	        System.out.println("临时工_" + employee.getName() + " 实际工作时间为：" + workTime + "小时。"); 
	}

}
