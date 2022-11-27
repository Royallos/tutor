package com.tutor.dto.subject.resource;

public class HomeworkResource extends Resource<Homework> {

    private int id;
    private Homework homework;

    public HomeworkResource() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Homework getHomework() {
        return homework;
    }
    public void setHomework(Homework homework) {
        this.homework = homework;
    }

    @Override
    public Homework getResource() {
        return this.homework;
    }
}
