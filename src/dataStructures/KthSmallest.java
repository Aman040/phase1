package dataStructures;

public class KthSmallest {
	public int partition(int arr[],int l,int r) {
		int x=arr[r],i=l;
		for(int j=l;j<=r-1;j++) {
			if(arr[j]<x) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		int temp=arr[i];
		arr[i]=arr[r];
		arr[r]=temp;
		return i;
	}
	
	public int kthSmallest(int arr[],int l,int r,int k) {
		if(k>0 && k>=r-l+1) {
			int pos=partition(arr,l,r);
			if(pos-l==k-1) {
				return arr[pos];
			}else if(pos-l>k-1) {
				return kthSmallest(arr, l, pos-1, k);
			}else {
				return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		KthSmallest ks=new KthSmallest();
		int arr[]= {12, 3, 5, 7, 4, 19, 26};
		int n=arr.length,k=3;
		System.out.println("Kyh smallest element is "+ks.kthSmallest(arr,0,n-1,k));

	}

}
