package Basics;

public class Students {

	String Name;
	String Gender;
	int Age;
	char Degree;
	int Id;
	long PhoneNo;
	double Percentage;
	boolean IntStudent;
	int TuitionFee = 50000;
	int IntTuitionFee = TuitionFee + 10000;
	static int CountObjects;

	void Print() {

		CountObjects = CountObjects + 1;

		System.out.println("\nName:" + Name);
		System.out.println("Gender:" + Gender);
		System.out.println("Age:" + Age);
		System.out.println("Degree:" + Degree);
		System.out.println("Id:" + Id);
		System.out.println("Phone No.:" + PhoneNo);
		System.out.println("Percentage:" + Percentage);
		System.out.println("IntStudent:" + IntStudent);

		if (IntStudent) {
			TuitionFee = IntTuitionFee;
		}
		System.out.println("TuitionFee:" + TuitionFee);
		System.out.println("CountObjects:" + CountObjects);
	}

	public static void main(String[] args) {

		Students Narendra = new Students();

		Narendra.Name = "Narendra Singh";
		Narendra.Gender = "Male";
		Narendra.Age = 50;
		Narendra.Degree = 'M';
		Narendra.Id = 1973;
		Narendra.PhoneNo = 9413038455L;
		Narendra.Percentage = 70;
		Narendra.IntStudent = true;

		Narendra.Print();

		Students Sunita = new Students();

		Sunita.Name = "Sunita Kanwar";
		Sunita.Gender = "Female";
		Sunita.Age = 45;
		Sunita.Degree = 'B';
		Sunita.Id = 1976;
		Sunita.PhoneNo = 7014919163L;
		Sunita.Percentage = 60;
		Sunita.IntStudent = false;

		Sunita.Print();
	}
}