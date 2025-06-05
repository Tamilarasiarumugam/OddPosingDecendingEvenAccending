package Preparation;
import java.util.Arrays;

public class OddDecendingEvenAccending {
	
	public static void sort(int[] arr,int num)
	{
		int i,j,temp;
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(i%2==0 && j%2==0)
				{
					if(arr[i]<arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				else if(i%2==1 && j%2==1)
				{
					if(arr[i]>arr[j])
					{
					    temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;	
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		sort(arr,n);
	}

}
