//this class represents a Person
class Person implements Payable, Comparable<Person> {
    private static int nextId = 1;
    private int id;
    private String name;
    private String surname;

    //default constructor for Person class
    //automatically sets the id using the helper static variable
    public Person() {
        this.id = nextId++;
    }

    //parametrized constructor for Person class
    //automatically sets the id using the helper static variable
    public Person(String name, String surname) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
    }

    //getter for the id field
    public int getId() {
        return id;
    }

    //getter for the name field
    public String getName() {
        return name;
    }

    //setter for the name field
    public void setName(String name) {
        this.name = name;
    }

    //getter for the surname field
    public String getSurname() {
        return surname;
    }

    //setter for the surname field
    public void setSurname(String surname) {
        this.surname = surname;
    }

    //returns a string representation of the person
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    //returns the position of the person
    public String getPosition() {
        return "Student";
    }

    //compares this person with the specified person based on the amount of money they make
    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    //returns the amount of money the person could get in the form of either salary or stipend
    @Override
    public double getPaymentAmount() {
        return 0.00;
    }
}