/**
 * 
 */
package com.skingz.designpattern.action.template;

/**
 * Title:    AbsSort
 * Description: 
 * @author Elizaber
 * @date 2016-12-13
 */
public abstract class AbsSort {
	protected String sortName="";
	
	protected abstract void sort(int[] arr);
	public void showSortResult(int[] arr){
		System.out.println(sortName);
		this.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.printf("%d ",arr[i]);
		}
		
		System.out.println("");
	}
}
