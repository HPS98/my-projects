package Basics;

public class ConstructorOverloading {
	int Id;
	String Name;
	int Age;

	ConstructorOverloading(int id, String name) {
		Id = id;
		Name = name;
	}

	ConstructorOverloading(int id, String name, int age) {
		Id = id;
		Name = name;
		Age = age;
	}

	void display() {
		System.out.println(Id + " " + Name + " " + Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading C = new ConstructorOverloading(1, "John");
		ConstructorOverloading O = new ConstructorOverloading(2, "Daisy", 22);
		C.display();
		O.display();

	}

}
