//this class represents a Student, which is a type of Person
class Student extends Person {
    private static int nextId = 1;
    private int id;
    private double gpa;

    //default constructor for Student class
    //automatically sets the id using the helper static variable
    public Student() {
        this.id = nextId++;
    }

    //parametrized constructor for Student class
    //automatically sets the id using the helper static variable
    public Student(String name, String surname, double gpa) {
        this.id = nextId++;
        setName(name);
        setSurname(surname);
        this.gpa = gpa;
    }

    //getter for the id field
    @Override
    public int getId() {
        return id;
    }

    //getter for the gpa field
    public double getGpa() {
        return gpa;
    }

    //setter for the gpa field
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //returns a string representation of the student
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    //returns the amount of money the student could get in the form of stipend
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        } else {
            return 0.00;
        }
    }
}