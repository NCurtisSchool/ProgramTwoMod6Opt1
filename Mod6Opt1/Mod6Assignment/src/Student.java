
public class Student {
    // Attributes
    protected int rollno;
    protected String name;
    protected String address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Getters
    protected int getRollno() {return rollno;}
    protected String getName() {return name;}
    protected String getAddress() {return address;}

    // Methods
    public String toStringRollno() {
        return String.format("%1$-15s %2$-15s %3$s", rollno, name, address); //(rollno name  address);
    }

    public String toStringName() {
        return String.format("%1$-15s %2$-15s %3$s", name, rollno, address); //name rollno address);
    }
}
