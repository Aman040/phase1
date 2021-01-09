package sorting_searching;

public class BubbleSort {
public static int[] bubbleSort(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}
	public static void main(String[] args) {
		int arr[]={4,9,2,7,3,6,8};
		int bubble[]=bubbleSort(arr);
		for(int i:bubble) {
			System.out.print(i+" ");
		}

	}

}
