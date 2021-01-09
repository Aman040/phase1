package sorting_searching;

public class SelectionSort {
	public static int[] selectionSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_index=i;
		
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min_index]) {
				min_index=j;
			}
		}
		int temp=arr[min_index];
		arr[min_index]=arr[i];
		arr[i]=temp;	
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {4,9,2,7,3,6,8};
		int sort[]=selectionSort(arr);
		for(int i:sort) {
			System.out.print(i+" ");
		}
	}

}
