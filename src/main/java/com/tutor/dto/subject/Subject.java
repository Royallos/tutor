package com.tutor.dto.subject;

import java.util.List;

public class Subject{

    private int id;
    private SubjectName subjectName;
    private List<Lesson> lessons;

    public Subject() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public SubjectName getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(SubjectName subjectName) {
        this.subjectName = subjectName;
    }
    public List<Lesson> getLessons() {
        return lessons;
    }
    public void addLesson(Lesson lesson) {this.lessons.add(lesson);}
    public void removeLesson(Lesson lesson) {this.lessons.remove(lesson);}
}
