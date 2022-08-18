package com;

public class test {

	public static void main(String[] args) {
		int a=10112111,rem=0;int b=0;
		while(a>0) {
			rem=a%2;
			
			b=b+(int) Math.pow(rem, b++);
			a=a/2;
		}System.out.println(b);

	}

}
