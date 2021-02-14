import java.util.*; 
class Program2 { 
    public static void main(String args[]) 
    { 
  
        Map<Integer, String> words = new HashMap<Integer, String>(); 
  
        words.put(new Integer(1), "Geeks");
        words.put(new Integer(2), "for");
        words.put(new Integer(3), "Geeks");
  
        for (Map.Entry mapElement : words.entrySet()) { 
            int key = (int)mapElement.getKey(); 
             String value = (String)mapElement.getValue(); 
  
            System.out.println(key + " : "
                               + value); 
        } 
    } 
} 