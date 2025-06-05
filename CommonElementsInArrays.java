package Preparation;

public class CommonElementsInArrays {
	
	public static void common(int[] arr1,int[] arr2,int[] arr3)
	{
		int n1=arr1.length;
		int n2=arr2.length;
		int n3=arr3.length;
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2 && k<n3)
		{
			if(arr1[i]==arr2[j] &&arr2[j]==arr3[k])
			{
				System.out.print(arr1[i]+" ");
				i++;j++;k++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else if(arr2[j]<arr3[k])
				j++;
			else 
				k++;
				
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] a1= {1,2,3,4};
		int[] a2= {1,2,3,4,5,6};
		int[] a3= {1,3,7,8};
		common(a1,a2,a3);
	}

}
