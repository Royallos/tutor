package com.tutor.dto;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Tutor extends User {

    private int id;
    private List<Student> students;
    private Map<ClassFormat, Integer> prices;

    public Tutor() {
        super();
        super.setRole(Role.TUTOR);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }
    public void addStudent(Student student) {this.students.add(student);}
    public void removeStudent(Student student) {this.students.remove(student);}
    public Map<ClassFormat, Integer> getPrices() {
        return Collections.unmodifiableMap(prices);
    }
    public void addPrices(ClassFormat classFormat, int price) {this.prices.put(classFormat, price);}
    public void removePrices(ClassFormat classFormat) {this.prices.remove(classFormat);}
}
