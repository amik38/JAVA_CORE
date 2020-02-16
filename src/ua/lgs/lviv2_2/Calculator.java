package ua.lgs.lviv2_2;

import ua.lgs.lviv2_1.Numerable;

public class Calculator implements Numerable {
	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		return (double)a / b;
	}
} 