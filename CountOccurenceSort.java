package Preparation;

public class CountOccurenceSort {
	
	public static int countOccurrences(int num, int K) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == K) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=5;
        int arr[]={12,33,4332,1333,3};
        int K=3;
          
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                int count1 = countOccurrences(arr[j], K);
                int count2 = countOccurrences(arr[j + 1], K);

                if (count1 > count2 || (count1 == count2 && arr[j] > arr[j + 1])) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
    }

}
