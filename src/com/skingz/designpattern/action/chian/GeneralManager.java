/**
 * 
 */
package com.skingz.designpattern.action.chian;

/**
 * Title:    GeneralManager
 * Description: 
 * @author Elizaber
 * @date 2016-12-15
 */
public class GeneralManager extends AbsHandler{
	 @Override  
	    public String handleFeeRequest(String user, double fee) {  
	          
	        String str = "";  
	        //�ܾ����Ȩ�޺ܴ�ֻҪ����������������Դ���  
	        if(fee >= 1000)  
	        {  
	            //Ϊ�˲��ԣ��򵥵㣬ֻͬ������������  
	            if("����".equals(user))  
	            {  
	                str = "�ɹ����ܾ���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";      
	            }else  
	            {  
	                //������һ�ɲ�ͬ��  
	                str = "ʧ�ܣ��ܾ���ͬ�⡾" + user + "���ľ۲ͷ��ã����Ϊ" + fee + "Ԫ";  
	            }  
	        }else  
	        {  
	            //������к�̵Ĵ�����󣬼�������  
	            if(getSuccessor() != null)  
	            {  
	                return getSuccessor().handleFeeRequest(user, fee);  
	            }  
	        }  
	        return str;  
	    }  
}
