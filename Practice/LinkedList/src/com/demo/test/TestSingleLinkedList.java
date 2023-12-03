package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
		SingleLinkedList ob=new SingleLinkedList();
		ob.addAtFirst(10);
		ob.addAtLast(20);
		ob.addAtFirst(30);
		ob.addAtPos(4, 40);
		//ob.DeleteByVal(35);
		//ob.DeleteByPos(2);
		ob.Display();
		
	}
}
