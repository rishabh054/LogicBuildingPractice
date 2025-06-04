package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
    private final String name;
    private final int rollNumber;
    List<String> subject;

    public ImmutableClass(String name, int rollNumber, List<String> subject) {
        this.name = name;
        this.rollNumber = rollNumber;
        ArrayList<String> temp = new ArrayList<>(subject);
        this.subject = new ArrayList<>(subject);
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public List<String> getSubject() {
        return new ArrayList<>(subject);
    }

}
