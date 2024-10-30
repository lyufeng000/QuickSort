public class QuickSort {
	public static final boolean asc = true;
	public static final boolean desc = false;
	
	private boolean order;
	
	/**
	 * 空参构造默认规则为<span style = "background-color: 333333; font-size: 13px" >升序</span>
	 */
	public QuickSort() {
		this.order = true;
	}
	
	public QuickSort(boolean rule) {
		this.order = rule;
	}
	
	
	/**
	 *
	 * @param arr 待排序的数组
	 * @param i 起始索引
	 * @param j 终止索引
	 * @param rules <span>排序规则</span>
	 */
	public void sort(int[] arr, int i, int j, boolean rules) {
		int start = i;
		int end = j;
		
		if (start >= end) {
			return;
		}
		
		int base = arr[i];
		
		while (start < end) {
			while (start < end && arr[end] >= base) {
				end--;
			}
			while (start < end && arr[start] <= base) {
				start++;
			}
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		
		
		int temp = arr[i];
		arr[i] = arr[start];
		arr[start] = temp;
		
		sort(arr, i, start - 1, rules);
		
		sort(arr, start + 1, j, rules);
	}
	
	public void sort(int arr[]) {
		sort(arr, 0, arr.length - 1, order);
	}
	
}
