import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import java.util.Stack;

public class Program2 {

	public static void main(String[] args) {
		//STACK
		Stack<String> people = new Stack<String>();  
		people.push("ABC");  
		people.push("ABCD");  
		people.push("ABCDE");  
		people.push("ABCDEF");  
		people.push("ABCDEFG");  
		people.pop();  
		Iterator<String> itr=people.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		//Array Deque
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Sangavi");  
		deque.add("Lexi");  
		deque.add("Ashish");  
		for (String str : deque) {  
		System.out.println(str);  
		}  
	}
}
