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
		}};
		
		
		list.forEach(System.out::println);
		
		list.removeIf(new MyPredicate<Integer>() {
			
			@Override
			public boolean filter(Integer t) {
				if(t % 2 == 0) return false;
				return true; 
			}
		});
		System.out.println("----------------------------------");
		list.forEach(System.out::println);
		
	}

}
