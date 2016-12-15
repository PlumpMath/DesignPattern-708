/**
 * 
 */
package com.skingz.designpattern.action.chian;

/**
 * Title:    AbsHandler
 * Description: ����۲ͷ��õĹ�������۲ͷ��õĴ�������һ���ǣ�������������д���뵥��Ȼ�󽻸��쵼���������������׼�������쵼��֪ͨ����������ͨ����Ȼ��������ȥ������ȡ���ã����û����׼�������쵼��֪ͨ����������δͨ��������Ҳ�ʹ����ա�
				��ͬ������쵼�����������Ķ���ǲ�һ���ģ����磬��Ŀ����ֻ������500Ԫ���ڵ����룻���ž���������1000Ԫ���ڵ����룻���ܾ��������������ȵ�����
 * @author Elizaber
 * @date 2016-12-15
 */
public abstract class AbsHandler {
	 /**
     * ���к�̵����ζ���
     */
    protected AbsHandler successor=null;
   
    /**
     * ȡֵ����
     */
    public AbsHandler getSuccessor() {
        return successor;
    }
    /**
     * ��ֵ���������ú�̵����ζ���
     */
    public void setSuccessor(AbsHandler successor) {
        this.successor = successor;
    }
    /** 
     * ����۲ͷ��õ����� 
     * @param user    ������ 
     * @param fee    �����Ǯ�� 
     * @return        �ɹ���ʧ�ܵľ���֪ͨ 
     */  
    public abstract String handleFeeRequest(String user , double fee);  
}
