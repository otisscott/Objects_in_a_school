public class Teacher extends Person{
    String subject;
    public Teacher(String first_name, String last_name, String sub) {
        super(first_name, last_name);
        subject = sub;
    }
}
