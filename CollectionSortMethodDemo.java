package coll.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 
public class CollectionSortMethodDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(1);
        Collections.sort(list);
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
    }
} 