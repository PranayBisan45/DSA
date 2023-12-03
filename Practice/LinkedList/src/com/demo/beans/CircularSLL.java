package com.demo.beans;

public class CircularSLL {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	public void CircularSLL() {
		head=null;
	}
	public void addByPos(int pos,int value) {
		Node newnode=new Node(value);
		if(pos==1) {
			if(head==null) {
				head=newnode;
				newnode.next=head;
			}
			else {
				Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
				}
				newnode.next=head;
				head=newnode;
				temp.next=head;
			}
		}
		else {
			Node temp=head;
			int i;
			for( i=1;temp.next!=head && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(i>=pos-1) {
				newnode.next=temp.next;
				temp.next=newnode;
			}
			if(pos==i+1) {
				newnode.next=temp.next.next;
			}
			else {
				System.out.println("Incorrect Position!!");
			}
		}
	}
	public void DeleteByVal(int val) {
		Node prev=null;
		Node current=head;
		while(current.next!=head && current.data!=val){
			prev=current;
			current=current.next;
		}
		if(current.data==val) {
			if(current==head) {
				Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
				}
				temp.next=current.next;
				head=current.next;
				current.next=null;
				current=null;
			}
			else {
				prev.next=current.next;
				current.next=null;
				current=null;
			}
		}
	}
	public void Display() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(temp.data+"->");
	}
	
}
