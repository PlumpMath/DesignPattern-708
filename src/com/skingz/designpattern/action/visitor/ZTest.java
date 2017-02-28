package com.skingz.designpattern.action.visitor;

/***
 * Sunny�����˾��Ϊĳ���п���һ��OAϵͳ���ڸ�OAϵͳ�а���һ��Ա����Ϣ������ϵͳ��������Ա��������ʽԱ������ʱ����ÿ��������Դ���Ͳ��񲿵Ȳ�����Ҫ��Ա�����ݽ��л��ܣ��������ݰ���Ա������ʱ�䡢Ա�����ʵȡ��ù�˾�����ƶ����£�
       (1) ��ʽԱ��(Full time  Employee)ÿ�ܹ���ʱ��Ϊ40Сʱ����ͬ���𡢲�ͬ���ŵ�Ա��ÿ�ܻ������ʲ�ͬ���������40Сʱ���������ְ���100Ԫ/Сʱ��Ϊ�Ӱ�ѣ��������40Сʱ����ȱʱ�䰴����ٴ���������۹�����80Ԫ/Сʱ���㣬ֱ���������ʿ۳�����Ϊֹ�����˼�¼ʵ�ʹ���ʱ���⣬������Դ�����¼�Ӱ�ʱ�������ʱ������ΪԱ��ƽʱ���ֵ�һ�����ݡ�
       (2) ��ʱ��(Part time  Employee)ÿ�ܹ���ʱ�䲻�̶����������ʰ�Сʱ���㣬��ͬ��λ����ʱ��Сʱ���ʲ�ͬ��������Դ��ֻ���¼ʵ�ʹ���ʱ�䡣
       ������Դ���Ͳ��񲿹�����Ա���Ը��ݸ��Ե���Ҫ��Ա�����ݽ��л��ܴ���������Դ���������ÿ��Ա������ʱ�䣬�����񲿸������ÿ��Ա�����ʡ�
 * @author Administrator
 *
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();    
        Employee fte1,fte2,fte3,pte1,pte2;    
    
        fte1 = new EmployeeFulltime("���޼�",3200.00,45);    
        fte2 = new EmployeeFulltime("���",2000.00,40);    
        fte3 = new EmployeeFulltime("����",2400.00,38);    
        pte1 = new EmployeeParttime("���߹�",80.00,20);    
        pte2 = new EmployeeParttime("����",60.00,18);    
    
        list.addEmployee(fte1);    
        list.addEmployee(fte2);    
        list.addEmployee(fte3);    
        list.addEmployee(pte1);    
        list.addEmployee(pte2);    
    
        Department dep=new DepartmentFA();    
        list.accept(dep); 
        
        Department dep2=new DepartmentHR();
        list.accept(dep2);
	}

}
