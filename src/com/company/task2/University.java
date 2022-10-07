package com.company.task2;

import java.util.ArrayList;
import java.util.List;

public class University {
  List<Student> studentList = new ArrayList<>();
  Rozklad rozklad = new Rozklad();
  List<Group> groups = new ArrayList<>();

  public University() {}

  public University(List<Student> studentList, Rozklad rozklad, List<Group> groups) {
    this.studentList = studentList;
    this.rozklad = rozklad;
    this.groups = groups;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(List<Group> groups) {
    this.groups = groups;
  }

  public List<Student> getStudentList() {
    return studentList;
  }

  public void setStudentList(List<Student> studentList) {
    this.studentList = studentList;
  }

  public Rozklad getRozklad() {
    return rozklad;
  }

  public void setRozklad(Rozklad rozklad) {
    this.rozklad = rozklad;
  }
}
