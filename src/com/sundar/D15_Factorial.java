package com.sundar;

public class D15_Factorial {
	public static void main(String[] args) {
		int a=5;
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println("total= "+fact);
	}

}
