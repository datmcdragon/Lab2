package com.company.task2;

import java.util.Map;
import java.util.Objects;

public class Student {
  private int age;
  private String name;
  private String surname;
  private Map<Subject, Integer> studentGrades;

  public Student(int age, String name, String surname, Map<Subject, Integer> studentGrades) {
    this.age = age;
    this.name = name;
    this.surname = surname;
    this.studentGrades = studentGrades;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Map<Subject, Integer> getStudentGrades() {
    return studentGrades;
  }

  public void setStudentGrades(Map<Subject, Integer> studentGrades) {
    this.studentGrades = studentGrades;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age
        && name.equals(student.name)
        && surname.equals(student.surname)
        && studentGrades.equals(student.studentGrades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name, surname, studentGrades);
  }
}
