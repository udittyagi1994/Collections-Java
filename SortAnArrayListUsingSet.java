package coll.ex;

import java.util.*;

public class SortAnArrayListUsingSet {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>() {
			{
				add(4);
				add(3);
				add(2);
				add(5);
				add(1);
			}
		};
		
		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(list);
		for (int a : set) {
			System.out.println(a);
		}
	}
}
