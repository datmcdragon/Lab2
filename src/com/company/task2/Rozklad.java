package com.company.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rozklad {
  Map<Group, List<Subject>> groupRozklad = new HashMap<>();

  public Map<Group, List<Subject>> getGroupRozklad() {
    return groupRozklad;
  }

  public void setGroupRozklad(Map<Group, List<Subject>> groupRozklad) {
    this.groupRozklad = groupRozklad;
  }
}
