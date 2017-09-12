import java.util.ArrayList;

public class Student extends Person{
    int grade;
    public static ArrayList<Student> students = new ArrayList<>();

    public Student(String first_name, String last_name, int year) {
        super(first_name, last_name);
        grade = year;
        students.add(this);
    }
}
