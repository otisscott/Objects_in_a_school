import com.sun.tools.doclets.formats.html.SectionName;

import java.util.ArrayList;
public class Section {
    String name;
    int maxSize;
    int currentSize;
    String className;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();
    public static ArrayList<Section> sections = new ArrayList<>();

    public Section(String class_name, int maxClassSize) {
        this.maxSize = maxClassSize;
        this.currentSize = students.size();
        sections.add(this);
        this.className = class_name;
    }

    public void addStudent(Student name) {
        students.add(name);
    }

    public void addTeacher(Teacher name) { teachers.add(name); }

    public void removeStudent(double id) {
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
            }
        }
    }

    public void awesomeness() {
        double awesomeness = 0;
        for(int i = 0; i < students.size(); i++) {
            awesomeness += students.get(i).awesomeness;
        }
        awesomeness = awesomeness / students.size();
        System.out.println("The section has an average awesomeness level of " + awesomeness);
    }

    public void sectionSeatsRemaining() {
        System.out.println(maxSize - currentSize);
    }
}
