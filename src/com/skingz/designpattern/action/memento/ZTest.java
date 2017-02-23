package com.skingz.designpattern.action.memento;

/**
 * Sunny软件公司欲开发一款可以运行在Android平台的触摸式中国象棋软件，由于考虑到有些用户是“菜鸟”，经常不小心走错棋；
 * 还有些用户因为不习惯使用手指在手机屏幕上拖动棋子，常常出现操作失误，因此该中国象棋软件要提供“悔棋”功能，用户走错棋或操作失误后可恢复到前一个步骤
 * @author Administrator
 *
 */
public class ZTest {
	private static int index = -1; //定义一个索引来记录当前状态所在位置    
    private static MementoCaretaker mc = new MementoCaretaker();    
    
    public static void main(String args[]) {    
        Chessman chess = new Chessman("车",1,1);    
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
        
    //下棋    
    public static void play(Chessman chess) {   
    	System.out.println("******下棋******");
        mc.setMemento(chess.save()); //保存备忘录    
        index ++;     
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");    
    }    
    
    //悔棋    
    public static void undo(Chessman chess,int i) {    
        System.out.println("******悔棋******");    
        index --;     
        chess.restore(mc.getMemento(i-1)); //撤销到上一个备忘录    
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");    
    }    
    
    //撤销悔棋    
    public static void redo(Chessman chess,int i) {    
        System.out.println("******撤销悔棋******");     
        index ++;     
        chess.restore(mc.getMemento(i+1)); //恢复到下一个备忘录    
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");    
    }       

}
