package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class iteratealinkedlistusingvarioustypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(35);
		ll.add(57);
		ll.add(78);
	
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
			
		}
		for(int data :ll) {
			System.out.println(data);
		}
	Iterator<Integer> it = ll.iterator();
	while(it.hasNext()==true) {
		System.out.println(it.next());
	}
		

	}

}
