package com.java.topics.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
    String name;
    Integer age;
    String gender;
    Integer salary;
    String city;

    public Employee(String name, Integer age, String gender, Integer salary, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("rishabh", 24, "M", 500,  "Ara");
        Employee e2 = new Employee("Ram", 25, "M", 600,  "Ara");
        Employee e4 = new Employee("z", 30, "F",700,  "Buxar");
        Employee e5 = new Employee("tt", 42, "F", 500,  "Patna");
        Employee e3 = new Employee("Samu", 22, "M",800,  "Buxar");
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

        Employee secHig = list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().get(2);
        System.out.println(secHig);
        Map<Object,Long> secHig1 = list.stream().collect(Collectors.groupingBy(e -> e.getCity(),
                Collectors.counting()));
        System.out.println(secHig1);
        Map<Object,List<Employee>> secHig2 = list.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        System.out.println(secHig2);
    }


}
