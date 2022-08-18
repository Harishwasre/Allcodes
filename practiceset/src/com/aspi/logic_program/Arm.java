package com.aspi.logic_program;

public class Arm {
	public static void main(String[] args) {

		int num = 153, temp = num, len = 0;
		double arm = 0;
		while (temp > 0) {
			temp = temp / 10;
			len++;
		}
		temp = num;
		while (temp > 0) {
			int a = temp % 10;
			arm = arm + (Math.pow(a, len));
			temp = temp / 10;
		}
		System.out.println(arm);
		
		if (num == arm) {
			System.out.println(arm + " is aramastrong number");
		} else {
			System.out.println(arm + " not an armstrong number");
		}
	}
}
