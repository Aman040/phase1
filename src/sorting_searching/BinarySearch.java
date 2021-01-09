package sorting_searching;

import java.util.Scanner;

public class BinarySearch {
		public boolean binary(int x,int arr[]) {
			int end=arr.length-1;
			int start=0;
			while(start<=end) {
				int mid=(end-start)/2+start;
				if(arr[mid]==x) {
					return true;
				}else if(arr[mid]>x) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
			return false;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinarySearch bs=new BinarySearch();
		System.out.println("enter the element to be searched");
		
		System.out.println(bs.binary(sc.nextInt(),new int[] {1,2,3,4,5,}));

	}

}
