package com.tutor.dto.subject.resource;

import java.util.Collections;
import java.util.List;

public class Homework extends Resourced{

    private int id;
    private List<Resource<TestWork>> testWorks;
    private boolean completed;

    public Homework() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTestWorks(List<Resource<TestWork>> testWorks) {
        this.testWorks = testWorks;
    }
    public List<Resource<TestWork>> getTestWorks() {
        return Collections.unmodifiableList(testWorks);
    }
    public void addTestWork(Resource<TestWork> testWork) {this.testWorks.add(testWork);}
    public void removeTestWork(Resource<TestWork> testWork) {this.testWorks.remove(testWork);}
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
