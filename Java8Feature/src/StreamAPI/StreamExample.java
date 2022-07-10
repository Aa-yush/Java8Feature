package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Ayush");
	al.add("Ayush Gupta");
	al.add("Sam");
	al.add("Sakshi");
	al.add("Anup");
	al.add("fam");
	al.add("Amit sharma");
	
	Comparator<String> c = (s1,s2) -> {
		int i1 = s1.length();
		int i2 = s2.length();
		
		if(i1 < i2)
			return -1;
		else if(i1 > i2)
			return 1;
		else
			return s1.compareTo(s2);
		
	};
	
	System.out.println("Sort the names with respect to its length");
	List<String> l = al.stream().sorted(c).collect(Collectors.toList());
	System.out.println(l);
	}

}
