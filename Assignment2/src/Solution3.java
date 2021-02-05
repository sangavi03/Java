public class Solution3 {
	static String firstLetterWord(String word) 
    {
        String output = ""; 
        boolean abc = true;
        for (int i = 0; i < word.length(); i++) 
        {
  
            if (word.charAt(i) == ' ') 
            {
                abc = true;
            } 
          
            else if (word.charAt(i) != ' ' && abc == true) 
            {
                output += (word.charAt(i));
                abc = false;
            }
        }
 
        return output;
    }

	public static void main(String[] args) {
		String output = "geeks for geeks";
        System.out.println(firstLetterWord(output));

	}

}
