package com.demo.test;

import com.demo.beans.ArrayQueue;

public class TestArrayCircularQueue {
	public static void main(String[] args) {
		ArrayQueue ob=new ArrayQueue(5);
		ob.enqueue(10);
		ob.enqueue(20);
		ob.enqueue(30);
		ob.enqueue(40);
		ob.enqueue(50);
		ob.dequeue();
		ob.enqueue(60);
		System.out.println(ob);
	}
	
}
