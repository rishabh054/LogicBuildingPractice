package com.java.topics.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
    String name;
    Integer age;
    String gender;

    public Employee(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


    public static void main(String[] args) {
        Employee e1 = new Employee("rishabh", 24, "M");
        Employee e2 = new Employee("Ram", 25, "M");
        Employee e4 = new Employee("z", 30, "F");
        Employee e5 = new Employee("tt", 42, "F");
        Employee e3 = new Employee("Samu", 22, "M");
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

        Map<Object, Long> groupByGender = list.stream()
                .collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
        System.out.println(groupByGender);
        list.stream().max(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
        List<Employee> topthreeAge = list.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed()).limit(3).toList();
        System.out.println(topthreeAge);


    }


}
