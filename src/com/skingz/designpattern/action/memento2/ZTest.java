package com.skingz.designpattern.action.memento2;

/** ( �ÿ�¡ʵ�� ����¼)
 * Sunny�����˾������һ�����������Androidƽ̨�Ĵ���ʽ�й�������������ڿ��ǵ���Щ�û��ǡ����񡱣�������С���ߴ��壻
 * ����Щ�û���Ϊ��ϰ��ʹ����ָ���ֻ���Ļ���϶����ӣ��������ֲ���ʧ����˸��й��������Ҫ�ṩ�����塱���ܣ��û��ߴ�������ʧ���ɻָ���ǰһ������
 * @author Administrator
 *
 */
public class ZTest {
	private static int index = -1; //����һ������(����)����¼��ǰ״̬����λ��
	private static MementoCaretaker mc = new MementoCaretaker();  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Chessman chess = new Chessman("��",1,1);    
        play(chess);            
        chess.setY(4);    
        play(chess);    
        chess.setX(5);    
        play(chess);        
        undo(chess);    
        undo(chess);      
        redo(chess); 
        play(chess);    
        chess.setX(2); 
        redo(chess);  
	}
	//����    
    public static void play(Chessman chess) {
    	index++;
        mc.setMemento(chess.clone(),index); //���汸��¼       
        System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");    
    }    
    
    //����    
    public static void undo(Chessman chess) {   
    	index--;
        System.out.println("******����******");   
        chess=mc.getMemento(index);//��������һ������¼    
        System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");    
    }    
    
    //��������    (��������Ϊ����һ����Ϊ���ǻ��� �� �������Ч��)
    public static void redo(Chessman chess) {   
    	index++;
        System.out.println("******��������******");        
        Chessman chess1=mc.getMemento(index); //�ָ�����һ������¼    
        if(chess1==null){
        	System.out.println("******�������� ��Ч******");
        }else{
        	chess=chess1;
        	System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");
        }
    }    

}
