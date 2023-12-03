package com.demo.beans;

public class SingleLinkedList {
	
	private Node head;
	public class Node {
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public SingleLinkedList(){
		head=null;
	}
	//Add at First Position
	public void addAtFirst(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	//Add at end
	public void addAtLast(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
		}
		else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		}
	}
	//Add at Given Position
	public void addAtPos(int pos,int value) {
		Node newnode=new Node(value);
		if(head==null && pos!=1) {
			System.out.println("List is Empty!!!");
		}
		if(pos==1) {
			if(head==null) {
				head=newnode;
			}
			else {
				newnode.next=head;
				head=newnode;
			}
			//addAtFirst(value);
		}
		else {
			Node prev=head;
			for(int i=1;prev!=null&& i<=pos-2;i++) {
				prev=prev.next;
			}
			if(prev!=null) {
			newnode.next=prev.next;
			prev.next=newnode;
			}
			else {
				System.out.println("Position not found");
			}
		}
	}
	//Delete By Value
	public void DeleteByVal(int value) {
		if(head==null) {
			System.out.println("List is Empty!!!");
		}
		if(head.data==value) {
			//deletes position one
			Node temp=head;
			head=temp.next;
			temp=null;
		}
		else {
			Node prev=head;
			Node current=prev.next;
			while(current!=null && current.data!=value) {
				prev=prev.next;
				current=current.next;
			}
			if(current!=null) {
				prev=current.next;
				current.next=null;
				current=null;
			}else {
				System.out.println("Value not found");
			}
		}
	}
	//Delete By Position
	public void DeleteByPos(int pos) {
		if(head==null) {
			Node temp=head;
			head=temp.next;
			temp=null;
		}
		if(pos==1) {
			Node current=head;
			head=current.next;
			current.next=null;
			current=null;
		}
		else {
			Node prev=head;
			Node current=prev.next;
			for(int i=1;current!=null && i<=pos-2;i++) {
				prev=prev.next;
				current=current.next;
			}
			if(current!=null) {
				prev.next=current.next;
				current.next=null;
				//System.out.println(current.data+" Deleted Successfully");
				current=null;
			}
			else {
				System.out.println("In correct position");
			}
			
		}
	}
//Display Data
	public void  Display() {
		Node temp=head;
		for(int i=0;temp!=null;i++) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}