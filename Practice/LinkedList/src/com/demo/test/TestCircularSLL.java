package com.demo.test;

import com.demo.beans.CircularSLL;

public class TestCircularSLL {
	public static void main(String[] args) {
		CircularSLL ob=new CircularSLL();
		ob.addByPos(1,10);
		ob.addByPos(2,20);
		ob.addByPos(3,30);
		ob.addByPos(4,50);
		ob.DeleteByVal(50);
		ob.Display();
		
	}
}
