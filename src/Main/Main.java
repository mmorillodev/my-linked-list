package Main;

import classes.MyLinkedList;
import interfaces.MyPredicate;

public class Main {

	public static void main(String[] args) {

		MyLinkedList<Integer> list = new MyLinkedList<>() {{
			add(0);
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
			add(8);
		}};
		
		System.out.println(list.search(8));
		
	}
}
