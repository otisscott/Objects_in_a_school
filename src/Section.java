import java.util.ArrayList;
public class Section {
    String name;
    int maxSize;
    int currentSize;
    ArrayList<Student> students = new ArrayList<>();

    public Section(String teacher_first, String teacher_last, String class_name, int maxClassSize) {
        Teacher current = new Teacher(teacher_first, teacher_last, class_name);
        maxSize = maxClassSize;
        currentSize = students.size();
    }

    public void addStudent(String first, String last, int year) {
        Student add = new Student(first,last, year);
        students.add(add);
    }

    public void removeStudent(double id) {
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
            }
        }
    }

    public void seatsRemaining() {
        System.out.println(maxSize - currentSize);
    }
}
