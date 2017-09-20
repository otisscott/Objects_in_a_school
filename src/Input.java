import java.util.Scanner;
public class Input {
    public static void main(String args[]) {
        Scanner school = new Scanner(System.in);
        int input = 1;
        while (input == 1) {
            System.out.println("Welcome to your school management system. Would you like to: Create a Student (1), Create a Teacher (2), Create a Section (3), Add a Student to a Section (4), Add a Teacher to a Section (5)");
            System.out.println("Remove a Student from a Section (6), Check Awesomeness Levels (7), or Search for a Student (8)?");
            String new_input1 = school.nextLine();
            if (Integer.parseInt(new_input1) == 1) {
                System.out.println("Please enter the student's first name, last name, and grade separated by commas.");
                String new_student = school.nextLine();
                String[] var = new_student.split(", ");
                if (var.length == 3) {
                    Student student = new Student(var[0], var[1], Integer.parseInt(var[2]));
                    System.out.println("Created an entry for " + var[0] + " " + var[1]);
                }
                else {
                    System.out.println("Sorry, I didn't recognize that input please try again");
                }
            } else if (Integer.parseInt(new_input1) == 2) {
                System.out.println("Please enter the teacher's first name, last name, and subject separated by commas.");
                String new_teacher = school.nextLine();
                String[] var = new_teacher.split(", ");
                if (var.length == 3) {
                    Teacher teacher = new Teacher(var[0], var[1], var[2]);
                    System.out.println("Created an entry for " + var[0] + " " + var[1]);
                }
                else {
                    System.out.println("Sorry, I didn't recognize that input please try again");
                }
            } else if (Integer.parseInt(new_input1) == 3){
                System.out.println("Please enter the section teachers first name and last name, the subject, and the max occupancy separated by commas or just the subject and max occupancy if there is no specific teacher.");
                String new_section = school.nextLine();
                String[] var = new_section.split(", ");
                if(var.length == 2) {
                    Section section = new Section(var[0], Integer.parseInt(var[1]));
                    System.out.println("Created an entry for " + var[0]);
                } else if (var.length == 4) {
                    Section section = new Section(var[2], Integer.parseInt(var[3]));
                    System.out.println("Created an entry for " + var[2]);
                    for (int i = 0; i < Teacher.teachers.size(); i++) {
                        if(Teacher.teachers.get(i).first.toLowerCase().equals(var[0].toLowerCase()) && Teacher.teachers.get(i).last.toLowerCase().equals(var[1].toLowerCase())) {
                            for(int j = 0; j < Section.sections.size(); j++) {
                                if(Section.sections.get(j).className.toLowerCase().equals(var[2].toLowerCase())) {
                                    Section.sections.get(j).addTeacher(Teacher.teachers.get(i));
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Sorry, I didn't recognize that input please try again");
                }

            } else if (Integer.parseInt(new_input1) == 4) {
                System.out.println("Please enter the student's first and last name, followed by the section name");
                String new_student = school.nextLine();
                String[] var = new_student.split(", ");
                String first = var[0];
                String last = var[1];
                int work = 0;
                for (int i = 0; i < Student.students.size(); i++) {
                    if(Student.students.get(i).first.toLowerCase().equals(first.toLowerCase()) && Student.students.get(i).last.toLowerCase().equals(last.toLowerCase())) {
                        for(int j = 0; j < Section.sections.size(); j++) {
                            if(Section.sections.get(j).className.toLowerCase().equals(var[2].toLowerCase())) {
                                Section.sections.get(j).addStudent(Student.students.get(i));
                                work = 1;
                            }
                        }
                    }
                }
                if (work == 0) {
                    System.out.println("Sorry, I didn't recognize that input, please try again.");
                }
            } else if (Integer.parseInt(new_input1) == 5) {
                System.out.println("Please enter the teacher's first and last name, followed by the section name");
                String new_teacher = school.nextLine();
                String[] var = new_teacher.split(", ");
                String first = var[0];
                String last = var[1];
                int work = 0;
                for (int i = 0; i < Teacher.teachers.size(); i++) {
                    if(Teacher.teachers.get(i).first.toLowerCase().equals(first.toLowerCase()) && Teacher.teachers.get(i).last.toLowerCase().equals(last.toLowerCase())) {
                        for(int j = 0; j < Section.sections.size(); j++) {
                            if(Section.sections.get(j).className.toLowerCase().equals(var[2].toLowerCase())) {
                                Section.sections.get(j).addTeacher(Teacher.teachers.get(i));
                                work = 1;
                            }
                        }
                    }
                }
                if (work == 0) {
                    System.out.println("Sorry, I didn't recognize that input, please try again.");
                }
            } else if (Integer.parseInt(new_input1) == 6) {
                System.out.println("Please enter the ID number and section for the student you want to remove.");
                String rem_stu = school.nextLine();
                String[] var = rem_stu.split(", ");
                Double id = Double.parseDouble(var[0]);
                int work = 0;
                for(int j = 0; j < Section.sections.size(); j++) {
                    if(Section.sections.get(j).className.equals(var[1])) {
                        Section.sections.get(j).removeStudent(id);
                        work = 1;
                    }
                }
                if(work == 0) {
                    System.out.println("Sorry, I didn't recognize that input, please try again.");
                }
            } else if(Integer.parseInt(new_input1) == 7) {
                System.out.println("Please enter the name of the section that you want to check the awesomeness of.");
                String name = school.nextLine();
                int work = 0;
                for(int i = 0; i < Section.sections.size(); i++) {
                    if(Section.sections.get(i).className.equals(name)) {
                        Section.sections.get(i).awesomeness();
                        work = 1;
                    }
                }
                if(work == 0) {
                    System.out.println("Sorry, I didn't recognize that input, please try again.");
                }
            } else if(Integer.parseInt(new_input1) == 8) {
              System.out.println("Please enter the first and last name of the student");
                String name = school.nextLine();
                String[] var = name.split(" ");
                for (int i = 0; i < Student.students.size(); i++) {
                    if (Student.students.get(i).first.equals(var[0]) && Student.students.get(i).last.equals(var[1])) {
                        System.out.println("Student successfully found, returning object ID and Awesomeness");
                        System.out.println(Student.students.get(i).id);
                        System.out.println(Student.students.get(i).awesomeness);
                    }
                }
            } else {
                System.out.println("Sorry, I didn't recognize that input, please try again.");
            }
        }
    }
}
