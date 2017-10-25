package person;

public class Student extends Person{
	private int studentNumber;
	private String subjects1;
	private String subjects2;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fN, String lN, String ad, int d, int m, int y,
			int pN, String g, int sN, String sub1, String sub2) {
		super(fN, lN, ad, d, m, y, pN, g);
		studentNumber = sN;
		subjects1 = sub1;
		subjects2 = sub2;
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return super.toString() + "\nStudent Number: "+studentNumber+"\nSubjects: "+subjects1+" and "+subjects2;
	}
}

