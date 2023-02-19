class Member {
	String Name;
	int Age;
	long Phonenumber;
	String Address;
	int Salary;

	public void printsalary() {
		System.out.println(Salary);
	}
}

public class Members {
	public static void main(String[] args) {
		Member obj = new Member();
		obj.Name = "Darshan";
		obj.Age = 23;
		obj.Phonenumber = 9624360699L;
		obj.Address = "BHavanagar";
		obj.Salary = 20000;

		obj.printsalary();
	}
}