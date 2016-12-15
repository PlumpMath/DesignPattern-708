/**
 * 
 */
package com.skingz.designpattern.action.template;

/**
 * Title:    SortBubble
 * Description: ц╟ещеепР
 * @author Elizaber
 * @date 2016-12-13
 */
public class SortBubble extends AbsSort {

	 public SortBubble(){this.sortName="bubble_Sort"; }
	/* (non-Javadoc)
	 * @see com.skingz.designpattern.action.template.AbsSort#sort(int[])
	 */
	@Override
	protected void sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					int tmp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}

}
