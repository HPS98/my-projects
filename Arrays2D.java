package Basics;

public class Arrays2D {

	public static void main(String[] args) {

		System.out.println();

		int[][] Arrays = new int[][] { { 1, 2, 3 }, { 4, 5, 6}, { 7, 8, 9 } };

		for (int i = 0; i < Arrays.length; i++) {

			for (int j = 0; j < Arrays[i].length; j++) {

				System.out.print(Arrays[i][j] + " ");

			}

			System.out.println();

		}
	}
}
