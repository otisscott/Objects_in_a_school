import java.util.ArrayList;

public class Teacher extends Person{
    String subject;
    public static ArrayList<Teacher> teachers = new ArrayList<>();

    public Teacher(String first_name, String last_name, String sub) {
        super(first_name, last_name);
        subject = sub;
        teachers.add(this);
    }
}
