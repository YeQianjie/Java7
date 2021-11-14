package work7;

import java.util.Date;
import java.util.Random;


public class test4 {
	private static final int NUM = 0;

	public static void main(String[] args) {
	int[] num=new int[100000000];
	Random random=new Random();
	
	for(int i=0;i<100000000;i++) {
		num[i]=random.nextInt(1000000);
	}
	
	StopWatch stopwatch=new StopWatch();
	
	sort(num, 0, NUM - 1);
	stopwatch.stop();
	
	System.out.println(stopwatch.getElapsedTime() + "ms");
	
}

//将数组第一个数作为中间数，放到数组中正确的位置，并返回其位置
public static int mid(int[] a,int low,int high) {
	int middle = a[low];
	
	while (low < high) {
		for (; low < high; high--) {
			if (middle > a[high]) {
				a[low] = a[high];
				low++;
				break;
			}
		}
		
		for (; low < high; low++) {
			if (a[low] > middle) {
				a[high] = a[low];
				high--;
				break;
			}
		} 
	}
	
	a[low] = middle;
	
	return low;
}

//将数组分成两份。递归。
public static void sort(int[] a, int low, int high) {
	
	if (low >= high)
		return;
	
	int middle;
	
	middle = mid(a, low, high);
	
	sort(a, low, middle - 1);
	sort(a, middle + 1, high);


}
}