import java.util.LinkedList;
import java.util.List;

public class Solution3 {
	public static void main(String args[]) {
        int[] array = new int[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 }; 
        int n = array.length; 
          
        if (n==0 || n==1) 
            System.out.println("No duplicates"); 
       
        int[] a = new int[n]; 
        
        int j = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            Integer currentnum = array[i];
             
            if (currentnum != array[i+1]) {
                a[j++] = currentnum;
            }
        }
         
        
        a[j++] = array[n-1];   
          
   
        for (int i=0; i<a.length; i++) 
           System.out.print(a[i]+" "); 
		
		
	}

}