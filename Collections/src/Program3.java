import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program3 {

	public static void main(String[] args) {
		//Linked Hash Set
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set1.add("ABCDEFG");  
		set1.add("ABCDE");  
		set1.add("ABC");  
	
		Iterator<String> hashset=set1.iterator();  
		while(hashset.hasNext()){  
		System.out.println(hashset.next());  
		}
		
		//TREE SET
		TreeSet<String> set2=new TreeSet<String>();  
		set2.add("ABCDEFGH");  
		set2.add("AB"); 
		set2.add("A");
		set2.add("ABC");  
		set2.add("DEF"); 
		set2.add("A"); 
		//traversing elements  
		Iterator<String> itr8=set2.iterator();  
		while(itr8.hasNext()){  
			System.out.println(itr8.next());  
		} 
	}

}
