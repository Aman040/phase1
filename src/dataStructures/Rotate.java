package dataStructures;

public class Rotate {
	public static void rotate(int arr[],int d,int n) {
		for(int i=0;i<d;i++) {
			rotatetRight(arr,n);
		}
	}
	private static void rotatetRight(int[] arr, int n) {
		
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
	}


	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		rotate(arr, 2,arr.length);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
