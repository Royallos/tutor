package com.tutor.dto.subject;

import com.tutor.dto.subject.resource.Homework;
import com.tutor.dto.subject.resource.Resource;
import com.tutor.dto.subject.resource.Resourced;

import java.util.Collections;
import java.util.List;

public class Lesson  extends Resourced {

    private int id;
    private List<Resource<Homework>> homework;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Resource<Homework>> getHomework() {
        return Collections.unmodifiableList(homework);
    }
    public void addHomework(Resource<Homework> homework) {this.homework.add(homework);}
    public void removeHomework(Resource<Homework> homework) {this.homework.remove(homework);}
}
