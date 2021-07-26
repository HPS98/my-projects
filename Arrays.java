package Basics;

public class Arrays {
	static void Print() {

		int[] Scores = new int[5];                 // int[] Scores=new int[]{99,90,85,95,98};
		Scores[0] = 99;                           // Alternate Way to Declare Elements of an Array
		Scores[1] = 90;
		Scores[2] = 85;
		Scores[3] = 95;
		Scores[4] = 98;
		

		for (int i = 0; i < Scores.length; i++) {                       // Printing Through 'for' Loop

			System.out.println(Scores[i]);

		}

		System.out.println();

		for (int j = 0; j < Scores.length; j++) {

			System.out.print(Scores[j] + " ");

		}

		System.out.println();

		System.out.println("\nPhysics:" + Scores[0]);                         // General Printing
		System.out.println("Chemistry:" + Scores[1]);
		System.out.println("Mathematics:" + Scores[2]);
		System.out.println("English:" + Scores[3]);
		System.out.println("Physical Education:" + Scores[4] + "\n");

		System.out.print("Physics:" + Scores[0] + " ");
		System.out.print("Chemistry:" + Scores[1] + " ");
		System.out.print("Mathematics:" + Scores[2] + " ");
		System.out.print("English:" + Scores[3] + " ");
		System.out.print("Physical Education:" + Scores[4] + "\n");
	}

	public static void main(String[] args) {

		Print();
	}
}
