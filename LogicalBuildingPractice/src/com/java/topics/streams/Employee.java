package com.java.topics.streams;

import java.util.Comparator;
import java.util.List;

public class Employee {
    String name;
    Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        Employee e1 = new Employee("rishabh", 24);
        Employee e2 = new Employee("Ram", 25);
        Employee e4 = new Employee("z", 30);
        Employee e5 = new Employee("tt", 42);
        Employee e3 = new Employee("Samu", 22);
        List<Employee> list = List.of(e1, e2, e3, e4, e5);
        List<Employee> sortedByAge = list.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        System.out.println("sortedByAge = " + sortedByAge);

        List<Employee> sortdByname = list.stream().sorted((o1, o2) -> {
            if (o1.getName().length() > o2.getName().length())
                return 1;
            else if (o1.getName().length() < o2.getName().length())
                return -1;
            return 0;
        }).toList();
        System.out.println("sortdByname = " + sortdByname);
    }


}
