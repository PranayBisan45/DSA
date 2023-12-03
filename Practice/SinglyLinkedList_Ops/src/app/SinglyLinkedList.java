package app;

import core.Employee;

class SinglyLinkedList {

	Node head = null;

	private class Node {
		Node next;
		Employee emp;

		Node(Employee emp) {
			this.emp = emp;
			this.next = null;
		}
	}

	public SinglyLinkedList() {

	}

	public void addAtEnd(Employee emp) {

		Node newNode = new Node(emp);

		if (head == null)
			head = newNode;
		else {
			Node trav = head;

			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
		System.out.println("Emp added");
	}

	public Employee deleteById(int id) {
		
		Employee emp;
		Node temp= null, trav = head;
		
		while(trav.next!= null && trav.next.emp.getId()!=id)
		{
			trav = trav.next;
		}
		temp= trav.next;
		emp = temp.emp; // return deleted emp
		trav.next = temp.next;
		temp = null;
		
		return emp;
	}
	
	public void display()
	{
		Node trav =head;
		while(trav!= null)
		{
			System.out.println(trav.emp.toString());
			trav = trav.next;
		}
			
			
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + "]";
	}	

}