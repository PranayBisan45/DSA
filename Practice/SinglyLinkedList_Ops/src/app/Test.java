package app;

import core.Employee;

public class Test {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.addAtEnd(new Employee(1,"Smit",100000));
		list.addAtEnd(new Employee(2,"Bappu",100000));
		list.addAtEnd(new Employee(3,"MAyur",100000));
		list.addAtEnd(new Employee(4,"DSP",100000));
		list.addAtEnd(new Employee(5,"Danny",100000));
		
		list.display();
		list.deleteById(2);
		System.out.println();
		list.display();
		
		System.out.println(list.toString());
	}
}
