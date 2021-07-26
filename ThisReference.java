package Basics;

public class ThisReference {
	int A;
	String B;
	char C;
	double D;
	String E;

	public ThisReference(int A, String B, char C, double D) {
		// TODO Auto-generated constructor stub
		this(A, B, C, D, "Using 'this' Invocation Statement Here");
	}

	public ThisReference(int A, String B, char C, double D, String E) {
		// TODO Auto-generated constructor stub
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		this.E = E;
	}

	void Print() {
		System.out.println(A + " " + B + " " + C + " " + D + " " + E);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReference TR = new ThisReference(1, "Mukul", 'M', 0.4d);
		TR.Print();
		ThisReference tr = new ThisReference(2, "Hemant", 'H', 0.2d, "Using 'this' Reference Into This Class");
		tr.Print();
	}

}