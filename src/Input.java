import java.util.Scanner;
public class Input {
    public static void main(String args[]) {
        Scanner school = new Scanner(System.in);
        int start = 1;
        if (start == 1) {
            System.out.println("Welcome to your school management system. Would you like to: Create a Student, Create a Teacher, Create a Section, Add a Student to a Section, Remove a Student from a Section?");
            start = 0;
        }
        int input = 1;
        while (input == 1) {
            String new_input1 = school.next();
            if (new_input1.toLowerCase() == "create a student") {
                System.out.println("Please enter the student's first name, last name, and grade separated by commas.");
                String new_student = school.next();
                String[] var = new_student.split(",");
                if (var.length == 3) {
                    Student student = new Student(var[0], var[1], Integer.parseInt(var[2]));
                    System.out.println("Created an entry for " + var[0] + " " + var[1]);
                    input = 0;
                }
                else {
                    System.out.println("Sorry, I didn't recognize that input please try again");
                }
            } else if (new_input1.toLowerCase() == "create a teacher") {
                System.out.println("Please enter the teacher's first name, last name, and subject separated by commas.");
                String new_teacher = school.next();
                String[] var = new_teacher.split(",");
                if (var.length == 3) {
                    Teacher teacher = new Teacher(var[0], var[1], var[2]);
                    System.out.println("Created an entry for " + var[0] + " " + var[1]);
                    input = 0;
                }
                else {
                    System.out.println("Sorry, I didn't recognize that input please try again");
                }
            } else if (new_input1.toLowerCase() == "create a section") {
                System.out.println("Please enter the section teachers first name and last name, the subject, and the max occupancy separated by commas.");
                String new_section = school.next();
                String[] var = new_section.split(",");
                if(var.length == 4) {
                    Section section = new Section(var[0], var[1], var[2], Integer.parseInt(var[3]));
                    System.out.println("Created an entry for " + var[2]);
                    input = 0;
                }
                else {
                    System.out.println("Sorry, I didn't recognize that input please try again");
                }

            } else if (new_input1.toLowerCase() == "add a student to a section") {
                System.out.println("Please enter the students first and last name, followed by the section name");
                String new_student = school.next();
                String[] var = new_student.split(",");
                String first = var[1];
                String last = var[2];
                for (int i = 0; i < Student.students.size(); i++) {
                    if(Student.students.get(i).first == first && Student.students.get(i).last == last) {
                        for(int j = 0; j < Section.sections.size(); j++) {
                            if(Section.sections.get(j).className == var[3]) {
                                Section.sections.get(j).addStudent(Student.students.get(i));
                            }
                        }
                    }
                }
                input = 0;
            } else if (new_input1.toLowerCase() == "remove a student from a section") {
                System.out.println("Please enter the ID number and section for the student you want to remove.");
                String rem_stu = school.next();
                String[] var = rem_stu.split(",");
                Double id = Double.parseDouble(var[0]);
                for(int j = 0; j < Section.sections.size(); j++) {
                    if(Section.sections.get(j).className == var[1]) {
                        Section.sections.get(j).removeStudent(id);
                    }
                }
                input = 0;
            } else {
                System.out.println("Sorry, I didn't recognize that input, please try again.");
                input = 0;
            }
        }
    }
}
