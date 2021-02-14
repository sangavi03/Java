import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		Map people = new HashMap();
		people.put(1, "Sangavi");
		people.put(4, "Lexi");
		people.put(2, "Shiksha");
		people.put(6, "Zarin");
		people.put(5, "Reshma");
		people.put(3, "Sakshi");
		Set set = people.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}