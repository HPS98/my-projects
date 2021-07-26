package Basics;

public class VarArgs {

	static void print(boolean a, int b, int c) {
		System.out.println("Variable Length Arguments and Method Overloading");
	}

	static void print(boolean x, int... l) {
		System.out.println(l.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(true, 1, 2);
		print(true, 1, 2, 3, 4, 5);
		print(true);
		print(true, 0);
		print(true, new int[] {});
	}

}
