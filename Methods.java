package Basics;

public class Methods {

	static double Sum(double a, double b) {

		return a + b;

	}

	static double avg(double c, double d) {

		double e = Sum(c, d);

		return e / 2;

	}

	public static void main(String[] args) {

		

			double x = Sum(2.0d, 2.5d);

			System.out.println(x);

			

			double y = avg(10.0d, 2.0d);

			System.out.println(y);

		
	}

}