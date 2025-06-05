package Preparation;

public class JumpGame {
	
	public static int jump(int [] arr)
	{
		int step=arr[0];
		int count=1;
		for(int i=1;i<arr.length-1;i++)
		{
			step--;
			if(step<0)
				return 0;
			if(i==arr.length)
				return 0;
			if(step<arr[i])
			{
				step=arr[i];
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int arr[] = { 2,3,1,0,4 };
		System.out.println(jump(arr));
//		boolean ans=jump(arr);
//		if(ans)
//		{
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("no");
//		}
	}

}
