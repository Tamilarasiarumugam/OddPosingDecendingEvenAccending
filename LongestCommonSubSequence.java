package Preparation;

import java.util.Arrays;

public class LongestCommonSubSequence {
	
	public static int common(int[] arr)
	{
		int count=1;
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[i]-1)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {2,100,5,2,3,9,4};
		System.out.println(common(arr));
	}

}
