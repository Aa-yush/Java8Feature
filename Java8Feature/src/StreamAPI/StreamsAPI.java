package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsAPI {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(5);
		al.add(15);
		al.add(25);
		al.add(20);
		
		System.out.print("Filter Even numbers only from the list  : ");
		List<Integer> l = al.stream().filter( (i)-> i%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		System.out.print("Filter Even numbers count from the list  : ");
		long count = al.stream().filter( (i)-> i%2==0).count();
		System.out.println(count);
		
		
		System.out.print("Add five in every element from the list  : ");
		List<Integer> l1 = al.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.print("Sort Element in ascending order  : ");
		List<Integer> l2 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		
		
		System.out.print("Sort Element in descending order  : ");
		List<Integer> l3 = al.stream().sorted( (i1,i2) -> -i1.compareTo(i2) ).collect(Collectors.toList());
		System.out.println(l3);
	}

}
