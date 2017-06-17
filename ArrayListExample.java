package coll.ex;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {

		LinkedList<String> obj = new LinkedList<String>();
		String a = "udit";
		String b = "Ankit";
		String c = "Ankit";
		String d = "Ankita";
		obj.add(a);
		obj.add(b);
		obj.add(c);
		obj.add(d);

		System.out.println("access via iterator");
		Iterator itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		LinkedList<String> obj2 = new LinkedList<String>();

		for (int i = 0; i < obj.size(); i++) {
			obj2.add(obj.peekLast());
			obj.pollLast();
			i--;
		}
		for (String string : obj2) {
			System.out.println(":" + string);

		}
	}
}
