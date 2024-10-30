import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		QuickSort qs1 = new QuickSort(QuickSort.asc);
		QuickSort qs2 = new QuickSort(QuickSort.desc);
		
		int arr1[] = {45, 57, 78, 41, 5, 1, 5, 66, 41, 10, 969, 51, 150, 415, 77};
		int arr2[] = {45, 57, 78, 41, 5, 1, 5, 66, 41, 10, 969, 51, 150, 415, 77};
		
		qs1.sort(arr1);
		qs2.sort(arr2);
		
		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr2:" + Arrays.toString(arr2));
	}
}
