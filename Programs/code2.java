import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

}

public class Code2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shubham", 3.5));
        students.add(new Student("Sim", 4.5));
        students.add(new Student("Ansh", 3.7));
        students.add(new Student("Aryan", 3.5));
        students.add(new Student("Yash", 2.5));

        /*
         * The sort method in Java expects a comparator that returns an int. This is
         * because the comparator is used to determine the order of elements in a
         * collection. The comparator should:
         * 
         * Return a negative integer if the first element is less than the second.
         * Return zero if the first element is equal to the second.
         * Return a positive integer if the first element is greater than the second.
         */
        
        // students.sort((a, b) -> {
        //     if (b.getGpa() - a.getGpa() > 0) { // If b's GPA is higher than a's
        //         return 1; // Put a before b (descending order)
        //     } else if (b.getGpa() - a.getGpa() < 0) { // If b's GPA is lower than a's
        //         return -1; // Put b before a (descending order)
        //     } else { // If GPAs are equal
        //         return a.getName().compareTo(b.getName()); // Sort by name alphabetically
        //     }
        // });

        // Comparator<Student> comparator = Comparator.comparing(Student::getGpa); // for ascending // this method came from Java 8. (:: say method reference)
        // Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed(); // for descending (based on higher gpa)
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName); //based on higher gpa but if the gpa is same then based on name(like obv alphabets)
        students.sort(comparator);

        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getGpa());
        }
    }
}
