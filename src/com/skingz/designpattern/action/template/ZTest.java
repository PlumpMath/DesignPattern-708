/**
 * 
 */
package com.skingz.designpattern.action.template;

/**
 * Title:    ZTest
 * Description: 
 * @author Elizaber
 * @date 2016-12-13
 */
public class ZTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt={3,4,2,6,8,7};
		
		
		AbsSort sort=new SortQuick();
		sort.showSortResult(arrInt);
		
		AbsSort sort1=new SortBubble();
		sort1.showSortResult(arrInt);
	}

}
