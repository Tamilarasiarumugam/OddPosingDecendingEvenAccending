package Preparation;

import java.util.Arrays;

public class MinimumHeight {
	
	public static int min(int[] arr,int n,int k)
	{
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[n-1];
		int dif=max-min;
		for(int i=1;i<n;i++)
		{
			
			
			max=Math.max(arr[i-1]+k, arr[n-1]-k);
			min=Math.min(arr[0]+k, arr[i]-k);
			dif=Math.min(dif, max-min);
				
		}
		return dif;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4};
		int n=arr.length;
		int k=2;
		System.out.println(min(arr,n,k));
		
	}

}
