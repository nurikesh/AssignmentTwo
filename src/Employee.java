//this class represents an Employee, which is a type of Person
class Employee extends Person {
    private static int nextId = 1;
    private int id;
    private String position;
    private double salary;

    //default constructor for Employee class
    //automatically sets the id using the helper static variable
    public Employee() {
        this.id = nextId++;
    }

    //parametrized constructor for Employee class
    //automatically sets the id using the helper static variable
    public Employee(String name, String surname, String position, double salary) {
        this.id = nextId++;
        setName(name);
        setSurname(surname);
        this.position = position;
        this.salary = salary;
    }

    //getter for the id field
    @Override
    public int getId() {
        return id;
    }

    //getter for the position field
    public String getPosition() {
        return position;
    }

    //setter for the position field
    public void setPosition(String position) {
        this.position = position;
    }

    //getter for the salary field
    public double getSalary() {
        return salary;
    }

    //setter for the salary field
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //returns a string representation of the employee
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    //returns the amount of money the employee could get in the form of salary
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}