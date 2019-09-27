package Klasser.Objects.Action;

import Klasser.Objects.Humans.Student;
import Klasser.Objects.Humans.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private String name;
    private Teacher teacher;
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
        student.addLesson(this);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.addLesson(this);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getIndexOfStudent(Student student) {
        return students.indexOf(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public String getName() {
        return name;
    }

    public Lesson(){}
    public Lesson(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }
}
