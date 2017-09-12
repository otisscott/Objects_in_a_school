import com.sun.tools.doclets.formats.html.SectionName;

import java.util.ArrayList;
public class Section {
    String name;
    int maxSize;
    int currentSize;
    ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Section> sections = new ArrayList<>();

    public Section(String teacher_first, String teacher_last, String class_name, int maxClassSize) {
        Teacher current = new Teacher(teacher_first, teacher_last, class_name);
        maxSize = maxClassSize;
        currentSize = students.size();
        sections.add(this);
    }

    public void addStudent(Student name) {
        students.add(name);
    }

    public void removeStudent(double id) {
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
            }
        }
    }

    public void sectionSeatsRemaining() {
        System.out.println(maxSize - currentSize);
    }
}
