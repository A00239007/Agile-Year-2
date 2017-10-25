package person;

public class Lecturer extends Person{
	private int staffNumber;
	private String office1;
	private String office2;
    public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String fN, String lN, String ad, int d, int m, int y,
			int pN, String g, int sN,String room1, String room2) {
		super(fN, lN, ad, d, m, y, pN, g);
		staffNumber = sN;
		office1= room1;
		office2 = room2;
		// TODO Auto-generated constructor stub
	}
	public int getStaffNumber()
	{
		return staffNumber;
	}

	public String toString()
    {
        return super.toString()+"\nStaff Number: "+staffNumber+"\nOffices: "+office1+" and "+office2;
    }
}
