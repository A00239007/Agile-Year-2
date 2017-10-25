package person;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p = new Person("Jeffery","UNT","The hill",12,4,1900,213,"Male");
        System.out.println(p);
        
        Student s = new Student("Fei","Wang","Carboard Box",42,3,1500,890213213, "Male",120397,"Maths","Gay");
    	System.out.println(s);

        Lecturer l = new  Lecturer("Davino","Polo", "IRAQ", 12, 12, 1200, 42134124, "Female", 23471234,"Room Number 1","Room Nuber 2");
        System.out.println(l);
    }
}
