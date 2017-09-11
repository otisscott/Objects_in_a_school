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
            if (school.nextLine().toLowerCase() == "create a student") {
                System.out.println("Please enter the student's first name, last name, and grade separated by commas.");
                String new_student = school.nextLine();
                String[] var = new_student.split(",");
                Student student = new Student(var[0], var[1], Integer.parseInt(var[2]));
                input = 0;
            } else if (school.nextLine().toLowerCase() == "create a teacher") {
                System.out.println("Please enter the teacher's first name, last name, and subject separated by commas.");
                String new_teacher = school.nextLine();
                String[] var = new_teacher.split(",");
                Teacher teacher = new Teacher(var[0], var[1], var[2]);
                input = 0;
            } else if (school.nextLine().toLowerCase() == "create a section") {

                input = 0;
            } else if (school.nextLine().toLowerCase() == "add a student to a section") {

                input = 0;
            } else if (school.nextLine().toLowerCase() == "remove a student from a section") {

                input = 0;
            } else {
                System.out.println("Sorry, I didn't recognize that input, please try again.");
            }
        }
    }
}
