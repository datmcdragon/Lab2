package com.company.task4;

import com.company.task1.MyQueue;
import com.company.task2.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magazine {
  private Map<Student, Integer> gradePerSemestr = new HashMap<>();

  public Magazine(Map<Student, Integer> gradePerSemestr) {
    this.gradePerSemestr = gradePerSemestr;
  }

  public static void showAllGrades(University university) {
    List<Group> groups = university.getGroups();
    Rozklad rozklad = university.getRozklad();
    for (int i = 0; i < groups.size(); i++) {
      Group group = groups.get(i);
      List<Subject> subjects = rozklad.getGroupRozklad().get(group);
      if (subjects.contains(subjects)) {
        for (int j = 0; j < group.getStudents().size(); j++) {
          System.out.println("Student " + group.getStudents().get(i).getName());
          System.out.print("Grades: ");
          Map<Subject, Integer> grades = group.getStudents().get(i).getStudentGrades();
          for (var entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
          }
        }
        System.out.println();
      }
    }
  }

  public static void showAllGradesByStudent(University university, Student student) {
    List<Group> groups = university.getGroups();
    Rozklad rozklad = university.getRozklad();
    for (int i = 0; i < groups.size(); i++) {
      Group group = groups.get(i);
      List<Subject> subjects = rozklad.getGroupRozklad().get(group);
      if (subjects.contains(subjects)) {
        for (int j = 0; j < group.getStudents().size(); j++) {
          if (group.getStudents().get(i).equals(student.getName())) {
            System.out.println("Student " + group.getStudents().get(i).getName());
            System.out.print("Grades: ");
            Map<Subject, Integer> grades = group.getStudents().get(i).getStudentGrades();
            for (var entry : grades.entrySet()) {
              System.out.println(entry.getKey() + ":" + entry.getValue());
            }
            break;
          }
        }
        System.out.println();
      }
    }
  }

  public static void showAllGradesBySubject(University university, Subject subject) {
    MyQueue queue = new MyQueue();
    List<Group> groups = university.getGroups();
    Rozklad rozklad = university.getRozklad();
    for (int i = 0; i < groups.size(); i++) {
      Group group = groups.get(i);
      List<Subject> subjects = rozklad.getGroupRozklad().get(group);
      if (subjects.contains(subjects)) {
        for (int j = 0; j < group.getStudents().size(); j++) {
          System.out.println("Student " + group.getStudents().get(i).getName());
          System.out.print("Grades: ");
          Map<Subject, Integer> grades = group.getStudents().get(i).getStudentGrades();
          for (var entry : grades.entrySet()) {
            if (entry.getKey().equals(subject)) {
              // Using MyQueue.class
              queue = queue.insert(queue, entry.getValue());
              System.out.println(entry.getKey() + ":" + entry.getValue());
            }
          }
        }
        System.out.println();
      }
    }
  }

  public Map<Student, Integer> getGradePerSemestr() {
    return gradePerSemestr;
  }

  public void setGradePerSemestr(Map<Student, Integer> gradePerSemestr) {
    this.gradePerSemestr = gradePerSemestr;
  }
}
