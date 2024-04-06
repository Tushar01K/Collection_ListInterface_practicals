package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class reverselinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> ll = new LinkedList<>();
ll.add(12);
ll.add(46);
ll.add(67);
ll.add(56);
Collections.reverse(ll);
System.out.println(ll);

ll.subList(3, ll.size());
System.out.println(ll);



Iterator<Integer> it=ll.descendingIterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
	}

}
