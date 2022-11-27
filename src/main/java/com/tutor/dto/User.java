package com.tutor.dto;

import com.tutor.dto.subject.Subject;

import java.util.Collections;
import java.util.List;

public abstract class User {
    private Role role;
    private UserDetail details;
    private Schedule schedule;
    private List<Subject> subjects;
    private List<ClassFormat> classFormats;

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public UserDetail getDetails() {
        return details;
    }
    public void setDetails(UserDetail details) {
        this.details = details;
    }
    public Schedule getSchedule() {
        return schedule;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    public List<Subject> getSubjects() {
        return Collections.unmodifiableList(subjects);
    }
    public void addSchedule(Subject subject) {this.subjects.add(subject);}
    public void removeSchedule(Subject subject) {this.subjects.remove(subject);}
    public List<ClassFormat> getClassFormats() {
        return Collections.unmodifiableList(classFormats);
    }
    public void addClassFormat(ClassFormat classFormat) {this.classFormats.add(classFormat);}
    public void removeClassFormat(ClassFormat classFormat) {this.classFormats.remove(classFormat);}

}
