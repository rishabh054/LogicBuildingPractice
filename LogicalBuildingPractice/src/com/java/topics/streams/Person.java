package com.java.topics.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person implements Comparator<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Person p1 = new Person("A",22);
        Person p2 = new Person("B",10);
        Person p3 = new Person("C",30);
        List<Person> list = List.of(p1,p2,p3);

        List<Person> p =list.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).collect(Collectors.toList());

        System.out.println(p);}
}