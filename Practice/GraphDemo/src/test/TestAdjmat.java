package test;

import beans.AdjescencyMatrix;

public class TestAdjmat {
	public static void main(String[] args) {
		AdjescencyMatrix ob=new AdjescencyMatrix(5);
		ob.addedge(0, 1);
		ob.addedge(0,2);
		ob.addedge(1, 3);
		ob.addedge(2,3);
		ob.addedge(2, 4);
		System.out.println(ob.toString());
	}
}
