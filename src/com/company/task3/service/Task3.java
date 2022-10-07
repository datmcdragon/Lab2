package com.company.task3.service;

import com.company.task1.MyQueue;
import com.company.task2.*;

import java.util.*;

class Task3 {
  public static void addSubject(University university, Subject subject) {
    Group group = university.getGroups().get(0);

    Rozklad rozklad = university.getRozklad();
    Map<Group, List<Subject>> groupRozklad = rozklad.getGroupRozklad();
    List<Subject> subjects = groupRozklad.get(group);
    subjects.add(subject);
    groupRozklad.replace(group, subjects);
  }

  public static void addInfoToRozklad(University university, Group group, String time) {
    MyQueue queue = new MyQueue();
    List<Subject> subjects = university.getRozklad().getGroupRozklad().get(group);
    System.out.print(group.getGroupName() + " ");
    for (int i = 0; i < subjects.size(); i++) {
      System.out.print(subjects.get(i) + " ");
    }
    System.out.println(time);
  }

  public static void showStudentsByAlphabet(University university, Group group) {
    List<Student> students = group.getStudents();
    Comparator<Student> comparator = Comparator.comparing(Student::getName);
    Collections.sort(students, comparator);
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students);
    }
  }

  public static void showStudentsBySubject(University university, Subject subject) {
    List<Group> groups = university.getGroups();
    Rozklad rozklad = university.getRozklad();
    for (int i = 0; i < groups.size(); i++) {
      Group group = groups.get(i);
      List<Subject> subjects = rozklad.getGroupRozklad().get(group);
      if (subjects.contains(subjects)) {
        for (int j = 0; j < group.getStudents().size(); j++) {
          System.out.print(group.getStudents().get(i) + " ");
        }
        System.out.println();
      }
    }
  }
}
