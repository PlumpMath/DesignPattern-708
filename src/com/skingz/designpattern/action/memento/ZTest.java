package com.skingz.designpattern.action.memento;

/**
 * Sunny�����˾������һ�����������Androidƽ̨�Ĵ���ʽ�й�������������ڿ��ǵ���Щ�û��ǡ����񡱣�������С���ߴ��壻
 * ����Щ�û���Ϊ��ϰ��ʹ����ָ���ֻ���Ļ���϶����ӣ��������ֲ���ʧ����˸��й��������Ҫ�ṩ�����塱���ܣ��û��ߴ�������ʧ���ɻָ���ǰһ������
 * @author Administrator
 *
 */
public class ZTest {
	private static int index = -1; //����һ����������¼��ǰ״̬����λ��    
    private static MementoCaretaker mc = new MementoCaretaker();    
    
    public static void main(String args[]) {    
        Chessman chess = new Chessman("��",1,1);    
        play(chess);            
        chess.setY(4);    
        play(chess);    
        chess.setX(5);    
        play(chess);        
        undo(chess,index);    
        undo(chess,index);      
        redo(chess,index);  
        redo(chess,index);    
    }    
        
    //����    
    public static void play(Chessman chess) {   
    	System.out.println("******����******");
        mc.setMemento(chess.save()); //���汸��¼    
        index ++;     
        System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");    
    }    
    
    //����    
    public static void undo(Chessman chess,int i) {    
        System.out.println("******����******");    
        index --;     
        chess.restore(mc.getMemento(i-1)); //��������һ������¼    
        System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");    
    }    
    
    //��������    
    public static void redo(Chessman chess,int i) {    
        System.out.println("******��������******");     
        index ++;     
        chess.restore(mc.getMemento(i+1)); //�ָ�����һ������¼    
        System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");    
    }       

}
