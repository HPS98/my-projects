package Basics;

public class Student {
	int id = 1000;
	int nextid = id + 1;

	void compute() {
		System.out.println("id:" + id);
		System.out.println("nextid:" + nextid);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.compute();
	}
}