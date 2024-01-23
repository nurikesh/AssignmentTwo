import java.util.ArrayList;
import java.util.Collections;

//this class represents the main class
public class Main {
    //prints the data of each Payable object in the given Iterable
    public static void printData(Iterable<Person> payableList) {
        for (Person person : payableList) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    //the main method
    public static void main(String[] args) {
        //create employees and students
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Engineer", 50000.00);
        Student student1 = new Student("Ringo", "Starr", 3.5);
        Student student2 = new Student("Paul", "McCartney", 2.0);

        //create ArrayList and add employees and students
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(employee1);
        personList.add(employee2);
        personList.add(student1);
        personList.add(student2);

        //sort the personList based on the amount of money they make
        Collections.sort(personList);

        //print the data
        printData(personList);
    }
}