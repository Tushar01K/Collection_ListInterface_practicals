package linkedlist;

import java.util.LinkedList;

import java.util.*;

public class iteratormethodandenumaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(5);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	Enumeration e=al.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	}

}
