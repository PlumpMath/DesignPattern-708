package com.skingz.designpattern.action.memento2;

import java.util.ArrayList;
import java.util.Stack;

public class MementoCaretaker {
	//�����б� �������¹���ÿһ����
	private ArrayList<Chessman> mementoList=new ArrayList<Chessman>();
	public Chessman getMemento(int index){
		if(index+1>mementoList.size() || index<0){return null;}
		else return mementoList.get(index);
	}
	
	public void setMemento(Object memento,int index){
		
		if(memento instanceof Chessman){
			// �������������
			if(index==mementoList.size()){ mementoList.add((Chessman)memento); }
			// ���� ������
			else {
				mementoList.set(index,(Chessman)memento);
				// ͬʱ�� ������Ǽ��� ��ɾ��(����������һ������ɾ��)
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
