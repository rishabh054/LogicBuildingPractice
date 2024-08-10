package com.java.topics.streams;

import java.util.*;
import java.util.stream.Collectors;


public class Student {

    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String departmantName;

    private int joinedYear;

    private String city;

    private int rank;

    public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
                   int joinedYear, String city, int rank) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmantName = departmantName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
                + city + ", rank=" + rank + "]";
    }

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        List<Student> l1 = list.stream().filter(s -> s.getFirstName().startsWith("A")).toList();
        System.out.println(l1);

        Map<String, List<Student>> l2 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println(l2);

        Long countOfstudent = list.stream().count();
        System.out.println("Total student = " + countOfstudent);

        OptionalInt maxAge = list.stream().mapToInt(s -> s.getAge()).max();
        System.out.println("maxAge= " + maxAge.getAsInt());

        List<String> listOfDepartmant = list.stream().map(s -> s.getDepartmantName()).toList();
        System.out.println("listOfDepartmant = " + listOfDepartmant);

        Map<String, Long> listOfStudInEachDep = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        System.out.println("listOfStudInEachDep = " + listOfStudInEachDep);

        List<String> studentLessThan30 = list.stream().filter(s -> s.getAge() < 30).map(s -> s.getFirstName()).toList();
        System.out.println("studentLessThan30 = " + studentLessThan30);

        List<String> basedOnRank = list.stream().
                filter(student -> student.getRank() > 50 && student.getRank() < 100)
                .map(s -> s.getFirstName())
                .toList();

        System.out.println("basedOnRank = " + basedOnRank);

        Map<String, Double> l = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingLong(Student::getAge)));
        System.out.println(l);

        List<Student> depWithMaxStudent = list.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
        System.out.println("depWithMaxStudent = " + depWithMaxStudent);

        Student st = list.stream().sorted(Comparator.comparing(Student::getRank).reversed()).skip(1).findFirst().get();
        System.out.println(st);

        List<String> listOfNameStartWithR = list.stream().filter(n -> n.getFirstName().charAt(0) == 'R')
                .map(x -> (String) x.getFirstName())
                .collect(Collectors.toList());
        System.out.println("List of name start with R =" + listOfNameStartWithR);


    }
}