/**
 * QuickSort类中包含了快速排序算法，支持升序和降序
 */
public class QuickSort {
	//asc和desc是两个final变量，用于外部指定规则
	public static final boolean asc = true;
	public static final boolean desc = false;
	
	private boolean order;
	/**
	 * 空参构造默认规则为<span style = "background-color: 333333;" >升序</span>
	 */
	public QuickSort() {
		this.order = true;
	}
	/**
	 * 带参构造可以指定排序规则
	 * @param rule 是外部指定的规则，承载asc或desc
	 */
	public QuickSort(boolean rule) {
		this.order = rule;
	}
	/**
	 * @param arr   待排序的数组
	 * @param i     起始索引
	 * @param j     终止索引
	 * @param rules 排序规则，一般情况下不允许外部调用
	 */
	public void quickSort(int[] arr, int i, int j, boolean rules) {
		//start和end指向开头和结尾
		int start = i;
		int end = j;
		
		//本方法存在递归，此为递归结束条件，即起始索引大于结束索引时，所有基准数都全部归位
		if (start >= end) {
			return;
		}
		
		//基准数，该方法每次执行都会把基准数放在正确的位置，且基准数两侧保持基本有序
		int base = arr[i];
		
		while (start < end) {
			//排序规则指定
			if (rules) {
				//用于从数组结尾向前找到一个小于基准数的数字，并把end放在上面
				while (start < end && arr[end] >= base) {
					end--;
				}
				//用于从数组开头向后找到一个大于基准数的数字，并把start放在上面
				while (start < end && arr[start] <= base) {
					start++;
				}
			} else {
				while (start < end && arr[end] <= base) {
					end--;
				}
				while (start < end && arr[start] >= base) {
					start++;
				}
			}
			//将大于基准数的数和小于基准数的数交换位置
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		//此时数组基本有序，start和end在同一位置，同时也是基准数应该在的位置
		//把基准数归位
		int temp = arr[i];
		arr[i] = arr[start];
		arr[start] = temp;
		//递归调用，给数组左侧排序
		quickSort(arr, i, start - 1, rules);
		//递归调用，给数组右侧排序
		quickSort(arr, start + 1, j, rules);
	}
	
	/**
	 * 向外界提供的排序算法，根据构造时指定的规则排序
	 * @param arr 待排序的数组
	 */
	public void sort(int arr[]) {
		quickSort(arr, 0, arr.length - 1, order);
	}
	
}
