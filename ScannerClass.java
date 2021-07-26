package Basics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		int a, b, c;

		Scanner d = new Scanner(System.in);

		System.out.print("\nEnter Number for its Table:");
		a = d.nextInt();

		System.out.print("\nStarting Multiple:");
		b = d.nextInt();

		System.out.print("\nEnd Multiple:");
		c = d.nextInt();
		d.close();

		System.out.print("\n");

		for (int i = b; i <= c; i++)

			System.out.println(a * i);
	}
}