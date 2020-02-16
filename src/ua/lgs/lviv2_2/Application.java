package ua.lgs.lviv2_2;

public class Application {
	public static void main(String[] args) {
		Calculator mc = new Calculator();
		
		System.out.println("A + B = " + mc.add(5, 10));
		System.out.println("A - B = " + mc.substract(5, 10));
		System.out.println("A * B = " + mc.multiply(5, 10));
		System.out.println("A / B = " + mc.divide(5, 10));
	}
}
