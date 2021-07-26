package Basics;

public class This {
	int A;
	String B;
	char C;
	double D;
	String E;;

	public This(int a, String b, char c, double d) {
		// TODO Auto-generated constructor stub
		this(a, b, c, d, "Using 'this' Invocation Statement Here");
	}

	public This(int a, String b, char c, double d, String e) {
		// TODO Auto-generated constructor stub
		A = a;
		B = b.toUpperCase();                  // toUpperCase(); for uppercase letters , toLowerCase(); for lowercase letters
		C = c;
		D = d;
		E = e;
	}

	void print() {
		System.out.println(A + " " + B + " " + C + " " + D + " " + E);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t = new This(1, "Hemant", 'H', 0.2d);
		t.print();
		This T = new This(2, "Mukul", 'M', 0.4d, "Kuchaman City");
		T.print();
	}

}
