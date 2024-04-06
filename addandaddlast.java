package linkedlist;

import java.util.LinkedList;

public class addandaddlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(67);
		list.add(48);
		list.add(null);
		System.out.println(list);
		list.addLast(100);
		System.out.println(list);
		list.clone();
		System.out.println(list);
		

	}

}
