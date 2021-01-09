package sorting_searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {437,483,373,363,387,38787,33};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
			int num=sc.nextInt();
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==num) 
					System.out.println(arr[i]+" Found at "+ (i+1));
				
				else 
					System.out.println(num+" Not Found");
					break;
				}
			}
		}

	


