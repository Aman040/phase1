package dataStructures;
import java.util.*;
public class Range {
	public static int rangeSum(int arr[],int l,int u) {
		int n=arr.length;
		int sum=0;
		for(int i=l;i<=u;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= { 3, 7, 2, 5, 8, 9 };
		System.out.println("Enter lower and upper range");
		int lower=sc.nextInt();
		int upper=sc.nextInt();
		System.out.println("Sum ="+rangeSum(arr,lower,upper));

	}

}
