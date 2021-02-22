public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = numbers.length;
        
  		a = a%numbers.length;
        
        if (a==0) 
        	System.out.print("Array not rotated ");
        
        for (int start=0, count=0; count < numbers.length; start++){
            int currIdx=start;
            int currNum=numbers[currIdx];

            
            do {
            	System.out.println("Iteration " + count);
                for (int i = 0; i < n; i++)
                    System.out.print(numbers[i] + " ");
                
                
                int nextIdx = (currIdx + a) % numbers.length;
                int temp = numbers[nextIdx];
                
                numbers[nextIdx] = currNum;
                currNum = temp;
                
                currIdx = nextIdx;                        
                count++;
            }  while(currIdx != start);
        
        }
        System.out.println("The rotated array is ");
        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");
	}

}