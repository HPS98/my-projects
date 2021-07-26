package Basics;

public class This2 {
	int A;
	String B;
	char C;
	double D;
	String E;

	public This2(int a, String b, char c, double d) {
		// TODO Auto-generated constructor stub
		A = a;
		B = b.toUpperCase();
		C = c;
		D = d;
	}

	public This2(int a, String b, char c, double d, String e) {
		// TODO Auto-generated constructor stub
		this(a, b, c, d);
		E = e;
	}

	void print() {
		System.out.println(A + " " + B + " " + C + " " + D + " " + E);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This2 t = new This2(1, "Hemant", 'H', 0.2d);
		t.print();
		This2 T = new This2(2, "Mukul", 'M', 0.4d,
				"Using 'this' Invocation Statement in Constructor Having More Parameters");
		T.print();

	}

}
