import Klasser.Objects.Action.Lesson;
import Klasser.Objects.Humans.Student;
import Klasser.Objects.Humans.Teacher;

public class Uppgift_3 {
    public static void main(String[] args) {
        Student s1 = new Student("Adam", "Stockholm", "19991015-3145");
        Student s2 = new Student("Nick", "New York", "20000101-0001");
        Student s3 = new Student("Ruscemp", "Unknown", "Unknown");

        Teacher t1 = new Teacher("Hermione", "London", "19790919-0000");
        Teacher t2 = new Teacher("Jean Grey", "X-Mansion", "19841027-0000");

        Lesson Java = new Lesson("Java", t1);

        Java.addStudent(s1);
        Java.addStudent(s2);
        Java.addStudent(s3);

        printLesson(Java);

        Java.setTeacher(t2);

        printLesson(Java);
    }

    public static void printLesson(Lesson lesson) {
        System.out.println("---------------------------------------------");
        System.out.println("Lessons name is: " + lesson.getName());
        System.out.println("Lessons teacher is: " + lesson.getTeacher());

        System.out.println();
        System.out.println("Lessons students:");
        for (int i = 0; i < lesson.getStudents().size(); i++) {
            System.out.println("Student " + (i+1) + ": " + lesson.getStudent(i));
        }
        System.out.println("---------------------------------------------");
    }
}