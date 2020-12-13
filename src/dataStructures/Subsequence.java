package dataStructures;

public class Subsequence {
	public static  int lengthofLIS(int num[]) {
		if(num.length<=1) {
			return num.length;
		}else {
			int ans=1;
			int dp[]=new int[num.length];
			for(int i=0;i<num.length;i++) {
				dp[i]=1;
			for(int j=0;j<=i;j++) {
				if(num[j]<num[i]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
					ans=Math.max(dp[i],ans);
				}
			}
		}
			return ans;
		}
	}
	public static void main(String[] args) {
		int arr[]= {3, 10, 2, 1, 20};
		int l=lengthofLIS(arr);
		System.out.println(l);
	}

}
