package Basics;

public class MethodOverloading {
	int Id;
	String Name;
	int Age;
	String Gender;

	void print(int id, String name) {
		Id = id;
		Name = name;
	}

	void print(int id, String name, int age) {
		Id = id;
		Name = name;
		Age = age;
	}

	void display() {
		System.out.println(Id + " " + Name + " " + Age + " " + Gender);
	}                                                            // Printing More Variables Than Present Method Parameters
		                                                        // Method Variables Can Be Printed Separately For Perfect Values

	public static void main(String args[]) {
		MethodOverloading M = new MethodOverloading();
		M.print(1, "John");
		M.display();
		M.print(2, "Daisy", 22);
		M.display();
	}
}