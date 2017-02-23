package com.skingz.designpattern.action.memento2;

import java.util.ArrayList;
import java.util.Stack;

public class MementoCaretaker {
	//定义列表 来保存下过的每一步棋
	private ArrayList<Chessman> mementoList=new ArrayList<Chessman>();
	public Chessman getMemento(int index){
		if(index+1>mementoList.size() || index<0){return null;}
		else return mementoList.get(index);
	}
	
	public void setMemento(Object memento,int index){
		
		if(memento instanceof Chessman){
			// 如果是正常下棋
			if(index==mementoList.size()){ mementoList.add((Chessman)memento); }
			// 悔棋 过来的
			else {
				mementoList.set(index,(Chessman)memento);
				// 同时把 悔棋的那几步 都删掉(如果不是最后一步，则删除)
				for(int i=index+1;i<mementoList.size();){
					mementoList.remove(i);
				}
			}
			
		}
		else{
			System.out.println("error...");
		}
	}
}
