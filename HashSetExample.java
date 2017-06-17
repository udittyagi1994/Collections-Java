package coll.ex;



	import java.util.*;  
	public class HashSetExample {  
	 public static void main(String args[]){  
	   
	  HashSet<String> al=new HashSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("udit");
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  

