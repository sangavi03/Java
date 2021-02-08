
public class Program1 {

	public static void main(String[] args) {

		String a = "Sangavi";
		String b = "Gunukuntla";
		
		//Length of string
		System.out.println("Lenght of the String a: "+ a.length());
		
		//Upper Case and Lower Case
		System.out.println(a.toUpperCase());   
		System.out.println(b.toLowerCase());  
		
		//IndexOf 
		String txt = "Lexi is being Lexi and acting up!";
		System.out.println(txt.indexOf("Lexi")); 
		
		//Concatenate
		System.out.println("My name is " +a + " "+b);
		
		//trim
		String s = " Lexi loves eating peanut butter.  ";  
	    System.out.println(s.trim()); 
	    
		//String Buffer
	    // appends
	    StringBuffer string =new StringBuffer("Hello ");  
	    string.append("Lexi");  
	    System.out.println(string);
	    //insert
	    StringBuffer string1 =new StringBuffer("Hello ");  
	    string1.insert(1,"Lexi");  
	    System.out.println(string1);//prints HJavaello  
		
		//split
	    String Str = new String("Welcome-To-India");
	      System.out.println("Print:" );      
	      
	      for (String split1: Str.split("-")) {
	         System.out.println(split1);
	      }
	      
		//charAt
	      String s1 = "Strings are immutable";
	      char result = s1.charAt(8);
	      System.out.println(result);
		
		//equals 
	      String string4 = "Hi";
	      String string2 = "Hi";
	      String string3 = "one String";
	      System.out.println(string4.equals(string2)); 
	      System.out.println(string4.equals(string3));
	}

}
