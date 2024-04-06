package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class printlindexandelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(34);
		ll.add(78);
		ll.add(57);
		ll.add(78);
		
		
		//indexandelement
	for (int i = 0; i < ll.size(); i++) {
		System.out.println(ll.get(i)+"  "+i);
		
	}
	
	
	
	
	//lastandfirst
	int firstocc=ll.indexOf(78);
	System.out.println(firstocc);
int lastocc=ll.lastIndexOf(78);
System.out.println(lastocc);

//addatindex
ll.add(2,100);
System.out.println(ll);


//addfirst la and last la
ll.addFirst(20);
ll.addLast(56);
System.out.println(ll);




	}

}
