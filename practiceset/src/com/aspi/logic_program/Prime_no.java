package com.aspi.logic_program;

public class Prime_no {

	public static void main(String[] args) {
		int number = 154, len = 0, temp = number;
		int arm = 0;
		while (temp > 0) {
			temp = temp / 10;
			len++;
//			System.out.println(len);
		}
		temp = number;
//		System.out.println(number);
		while (temp > 0) {
			int rec = temp % 10;
			System.out.println(rec);
			arm += Math.pow(rec, len);
			temp = temp / 10;
		}
		if (number == arm) {
			System.out.println("arm no. : " + arm);

		} else {
			System.out.println("not arm : " + arm);
		}
	}

}
