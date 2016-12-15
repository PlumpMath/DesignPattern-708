/**
 * 
 */
package com.skingz.designpattern.action.template;

/**
 * Title:    SortQuick
 * Description: øÏÀŸ≈≈–Ú
 * @author Elizaber
 * @date 2016-12-13
 */
public class SortQuick extends AbsSort {
	public SortQuick(){this.sortName="quick_Sort"; }
	
	protected void sort(int[] arr) {
		sort(arr,0,arr.length-1);
	}
	
	private void sort(int[] arr,int leftSite,int rightSite){
		if(leftSite<rightSite){
			int baseItem=arr[leftSite];
			int low=leftSite,hight=rightSite;
			while(low<hight){
				while(baseItem <= arr[hight] && hight>low){
					hight --;
				}
				while(baseItem >= arr[low] && hight>low){
					low ++;
				}
				if(low<hight){
					int tmp=arr[low];
					arr[low]=arr[hight];
					arr[hight]=tmp;
				}
				
			}
			arr[leftSite]=arr[low];
			arr[low]=baseItem;
			sort(arr,leftSite,low-1);
			sort(arr,hight+1,rightSite);
		}
	}
}
