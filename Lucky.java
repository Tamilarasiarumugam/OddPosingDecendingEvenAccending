package Preparation;
import java.util.*;

public class Lucky {
	
	public static void lucky(int[][] matrix)
	{
		 int n=matrix.length;
		 int m=matrix[0].length;
	     boolean found = false;
         for (int i = 0; i < n; i++) {
        
        int rowMin = matrix[i][0];
        int colIndex = 0;
        for (int j = 1; j < m; j++) {
            if (matrix[i][j] < rowMin) {      //{{3,7,8}
            	                              //,{9,11,13},
            	rowMin = matrix[i][j];
                colIndex = j;	              //{15,16,17}};
                
            }
        }

        
        boolean isLucky = true;
        for (int k = 0; k < n; k++) {
            if (matrix[k][colIndex] > rowMin) {
                isLucky = false;
                break;
            }
        }

        if (isLucky) {
            System.out.println("Lucky number: " + rowMin);
            found = true;
            break; 
        }
    }

    if (!found) {
        System.out.println("No lucky number found.");
    }
		
	}
	
	public static void main(String[] args)
	{
		 int[][] matrix= {{3,7,8},{9,11,13},{15,16,17}};
		 lucky(matrix);
		
}

}
