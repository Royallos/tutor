package com.tutor.dto;

import java.util.List;

public class Student extends User {

    private int id;
    private List<Tutor> tutors;

    public Student() {
        super();
        super.setRole(Role.STUDENT);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Tutor> getTutors() {
        return tutors;
    }
    public void addTutor(Tutor tutor) {this.tutors.add(tutor);}
    public void removeTutor(Tutor tutor) {this.tutors.remove(tutor);}
}
