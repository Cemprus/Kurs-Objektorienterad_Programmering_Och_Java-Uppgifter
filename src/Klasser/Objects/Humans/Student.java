package Klasser.Objects.Humans;

import Klasser.Objects.Action.Lesson;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Lesson> lessons = new ArrayList<Lesson>();

    public List<Lesson> getLessons() {
        return lessons;
    }
    public int getIndexOfLesson(Lesson lesson) {
        return lessons.indexOf(lesson);
    }
    public Lesson getLesson(int index) {
        return lessons.get(index);
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }
    public void removeLesson(Lesson lesson) {
        lessons.remove(lesson);
    }

    public Student(){}
    public Student(String name, String adress, String personnummer){
        creatingSet(name, adress, personnummer);
    }

    @Override
    public String toString() {
        return getName();
    }
}
