package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class convertlinkedlisttoarraylist {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(19);
		list.add(39);
		list.add(57);
		list.add(34);
	
// manual way
		ArrayList<Integer> al = new ArrayList<>();
		for (int data : list) {
			al.add(data);
		}
		System.out.println(al);

// java logic
		ArrayList<Integer> al2 = new ArrayList<>(list);
		System.out.println(al2);
		
	}

}
