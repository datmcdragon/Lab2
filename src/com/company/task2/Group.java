package com.company.task2;

import java.util.List;

public class Group {
  private String groupName;
  private List<Student> students;

  public Group(String groupName, List<Student> students) {
    this.groupName = groupName;
    this.students = students;
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }
}
