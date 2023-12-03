package com.demo.beans;

import java.util.Arrays;

public class ArrayStack {
	private int size;
	private int top;
	private int[]arr;
	public ArrayStack(int n){
	 size=n;	
	 arr=new int[size];
	 top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public boolean push(int value) {
		if(!isFull()) {
			top++;
			arr[top]=value;
			return true;
		}
		else {
			System.out.println("Stack Overflow!!");
			return false;
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int num=arr[top];
			top--;
			return num;
		}
		else {
			System.out.println("Stack Underflow!!");
			return -1;
		}
	}
	@Override
	public String toString() {
		return "ArrayStack [arr=" + Arrays.toString(arr) + "]";
	}
	
}
