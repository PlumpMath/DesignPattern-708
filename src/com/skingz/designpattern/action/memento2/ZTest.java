package com.skingz.designpattern.action.memento2;

/** ( 用克隆实现 备忘录)
 * Sunny软件公司欲开发一款可以运行在Android平台的触摸式中国象棋软件，由于考虑到有些用户是“菜鸟”，经常不小心走错棋；
 * 还有些用户因为不习惯使用手指在手机屏幕上拖动棋子，常常出现操作失误，因此该中国象棋软件要提供“悔棋”功能，用户走错棋或操作失误后可恢复到前一个步骤
 * @author Administrator
 *
 */
public class ZTest {
	private static int index = -1; //定义一个索引(步数)来记录当前状态所在位置
	private static MementoCaretaker mc = new MementoCaretaker();  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Chessman chess = new Chessman("车",1,1);    
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
	//下棋    
    public static void play(Chessman chess) {
    	index++;
        mc.setMemento(chess.clone(),index); //保存备忘录       
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");    
    }    
    
    //悔棋    
    public static void undo(Chessman chess) {   
    	index--;
        System.out.println("******悔棋******");   
        chess=mc.getMemento(index);//撤销到上一个备忘录    
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");    
    }    
    
    //撤销悔棋    (如果这个行为的上一个行为不是悔棋 则 这个是无效的)
    public static void redo(Chessman chess) {   
    	index++;
        System.out.println("******撤销悔棋******");        
        Chessman chess1=mc.getMemento(index); //恢复到下一个备忘录    
        if(chess1==null){
        	System.out.println("******撤销悔棋 无效******");
        }else{
        	chess=chess1;
        	System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
        }
    }    

}
