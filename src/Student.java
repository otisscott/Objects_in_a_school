public class Student extends Person{
    int grade;
    public Student(String first_name, String last_name, int year) {
        super(first_name, last_name);
        grade = year;
    }
}
