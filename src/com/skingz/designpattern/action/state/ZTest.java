package com.skingz.designpattern.action.state;

/**
 *  Sunny�����˾��Ϊĳ���п���һ�����ÿ�ҵ��ϵͳ�������˻�(Account)�Ǹ�ϵͳ�ĺ�����֮һ��ͨ��������Sunny�����˾������Ա�����ڸ�ϵͳ�У��˻���������״̬�����ڲ�ͬ״̬���˻����ڲ�ͬ����Ϊ������˵�����£�
       (1) ����˻��������ڵ���0�����˻���״̬Ϊ����״̬(Normal State)����ʱ�û��ȿ�������˻����Ҳ���ԴӸ��˻�ȡ�
       (2) ����˻������С��0�����Ҵ���-2000�����˻���״̬Ϊ͸֧״̬(Overdraft State)����ʱ�û��ȿ�������˻����Ҳ���ԴӸ��˻�ȡ�����Ҫ���������Ϣ��
       (3) ����˻���������-2000����ô�˻���״̬Ϊ����״̬(Restricted State)����ʱ�û�ֻ������˻��������ٴ���ȡ�ͬʱҲ�����������Ϣ��
       (4) �������Ĳ�ͬ����������״̬�ɷ����໥ת����
 * @author Administrator
 *
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account acc = new Account("����",0.0);    
        acc.deposit(1000);    
        acc.withdraw(2000);    
        acc.deposit(3000);    
        acc.withdraw(4000);    
        acc.withdraw(1000);    
        acc.computeInterest();
	}

}
