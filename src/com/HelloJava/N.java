package com.HelloJava;

public class N {
	int x = 10;
	int y = 20;

	public void swap() {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) {

		N a = new N();

		System.out.println("x = " + a.x);
		System.out.println("y = " + a.y);

		//swap ¼öÁ¤
		a.swap();

		System.out.println("swap x = " + a.x);
		System.out.println("swap y = " + a.y);

	}
}
