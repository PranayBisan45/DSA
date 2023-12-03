package com.demo.beans;

import java.util.Arrays;

public class ArrayQueue {
	private int size;
	private int front;
	private int rear;
	private int[]arr;
	public ArrayQueue(int n){
	 size=n;	
	 arr=new int[size];
	 front=0;
	 rear=-1;
	}
	public boolean isEmpty() {
		return front>rear;
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean enqueue(int value) {
		if(!isFull()) {
			rear++;
			arr[rear]=value;
			System.out.println(value+" added!!");
			return true;
		}
		else {
			System.out.println("Queue is full!!");
			return false;
		}
	}
	public int dequeue() {
		if(!isEmpty()) {
			int num=arr[front];
			front++;
			return num;
		}
		else {
			System.out.println("Queue is empty!!");
			return -1;
		}
	}
	@Override
	public String toString() {
		return "ArrayStack [arr=" + Arrays.toString(arr) +" front :"+front+" rear: "+rear+ "]";
	}
	
}
