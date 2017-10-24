package person;

public class Person implements Day, Month, Year, PhoneNumber{

    private String firstName;
    private String lastName;
    private String address;
    private int day;
    private int month;
    private int year;
    private int phoneNumber;
    private String gender;

    public Person()
    {
        day = DEFAULT_DAYS;
        month = DEFAULT_MONTH;
        year = DEFAULT_YEAR;
        phoneNumber = DEFAULT_PHONE;
    }

    public Person(int d, int m, int y, int pN)
    {
        day = d;
        month = m;
        year = y;
        phoneNumber = pN;
    }

	@Override
	public void setPhone(int p) {
		// TODO Auto-generated method stub
		phoneNumber = p;
	}

	@Override
	public int getPhone() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public void setYear(int y) {
		// TODO Auto-generated method stub
		year = y;
	}

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}

	@Override
	public void setMonth(int m) {
		// TODO Auto-generated method stub
		month = m;
	}

	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return month;
	}

	@Override
	public void setDays(int d) {
		// TODO Auto-generated method stub
		day = d;
	}

	@Override
	public int getDays() {
		// TODO Auto-generated method stub
		return day;
	}
	
	public String toString()
    {
        return firstName + lastName + " \nHe lives at: " + address + " \nThe day he was pushed out ";
    }
}
