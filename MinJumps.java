package Preparation;

public class MinJumps {
	
	public static int minJumps(int[] arr)
	{
		int jump=0;
		int start=0;
		int end=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i+arr[i]>start)
				start=i+arr[i];
			if(i==end)
			{
				jump++;
				end=start;
				
				if(end>=arr.length-1)
					return jump;
			}
		}
		return jump;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,3,5,8,9,2,6,7,6,8,9};
		System.out.print(minJumps(arr));
	}

}
