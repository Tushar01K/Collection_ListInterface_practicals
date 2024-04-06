package linkedlist;

import java.util.LinkedList;

public class pollgetfirstgetlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		int a=ll.getFirst();
		int b=ll.getLast();
		System.out.println(a +" "+b);
		
		
	}

}
