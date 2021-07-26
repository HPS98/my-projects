package Basics;

public class Constructors {                       // Creating Multiple Objects Using Constructors
	int Id;                                      // Using "System.out.printf()" To Print Values
	String Name;
	char Gender;
	char Degree;
	int Age;
	long PhoneNo;

	public Constructors(int id, String name, char gender, char degree, int age, long phoneno) {
		Id = id;
		Name = name;
		Gender = gender;
		Degree = degree;
		Age = age;
		PhoneNo = phoneno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors c = new Constructors(1, "John", 'M', 'B', 23, 9876543210L);
		Constructors s = new Constructors(2, "Daisy", 'F', 'M', 21, 9945432689L);
		System.out.printf("%d\n%s\n%c\n%c\n%d\n%d", c.Id, c.Name, c.Gender, c.Degree, c.Age, c.PhoneNo);
		System.out.printf("\n\n%d\n%s\n%c\n%c\n%d\n%d", s.Id, s.Name, s.Gender, s.Degree, s.Age, s.PhoneNo);
	}

}
