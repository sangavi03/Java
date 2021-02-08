import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Program1 {

	public static void main(String[] args) {
		
		//LINKED LIST
		LinkedList<String> names2 = new LinkedList<String>();
		names2.add("Reshma");
		names2.add("Sangavi");
		names2.add("Lexi");
		names2.add("Sangavi");
		
		Iterator<String> itr1 = names2.iterator();
		while(itr1.hasNext()) {
			System.out.println("LinkedList: "+ itr1.next());
		}
		
		//Priority Queue
		PriorityQueue<String> dogs=new PriorityQueue<String>();  
		dogs.add("Golden Retriver");  
		dogs.add("Pug");  
		dogs.add("Bernard Shepard");  
		dogs.add("Poodle");  
		
		System.out.println("head:"+dogs.element());  
		System.out.println("head:"+dogs.peek()); 
		System.out.println("iterating the queue elements:");  
		Iterator itr=dogs.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		dogs.remove();  
		dogs.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=dogs.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		
	}

}
