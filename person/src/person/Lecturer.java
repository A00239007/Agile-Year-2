package person;

public class Lecturer extends Person{

    private String firstName;
    private String lastName;

    public Lecturer(String fN, String lN)
    {
        this.firstName = fN;
        this.lastName = lN;
    }

    public String toString()
    {
        return firstName + lastName + " has " + super.toString();
    }
}
