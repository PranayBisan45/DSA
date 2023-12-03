package com.demo.test;

import com.demo.beans.ArrayStack;

public class TestArrayStack {
	public static void main(String[] args) {
		ArrayStack ob=new ArrayStack(5);
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);
		int n=ob.pop();
		System.out.println("No is deleted "+n);
		ob.push(60);
		
	}
	
}
