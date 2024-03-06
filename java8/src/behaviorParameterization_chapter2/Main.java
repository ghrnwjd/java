package behaviorParameterization_chapter2;

import domain.Employee;

import java.util.*;

interface Groupable {
    public String findGroup(Employee e);
}

class GroupByExperience implements Groupable {
    @Override
    public String findGroup(Employee e) {
        return e.yearsOfExpr >= 7 ? "Expert" : e.yearsOfExpr >= 3 ? "Intermediet" : "Fresher";
    }
}

class GroupByTech implements Groupable{
    @Override
    public String findGroup(Employee e) {
        Map<String, List<String>> mapping = new HashMap<String, List<String>>() {
            {
                put("프론트엔드",Arrays.asList("Angular"));
                put("미들웨어",Arrays.asList("JAVA", "Net"));
                put("벡엔드",Arrays.asList("Oracle", "MySQL"));
            }
        };


        for(Map.Entry<String, List<String>> entry : mapping.entrySet()) {
            if(entry.getValue().contains(e.tech)) {
                return entry.getKey();
            }
        }

        return "다른 기술 사용";
    }
}

public class Main {
    public static Map<String, List<String>> group(List<Employee> list, Groupable behavior) {
        Map<String, List<String>> map = new HashMap<>();
        for(Employee e : list) {
            String group = behavior.findGroup(e);
            map.putIfAbsent(group, new ArrayList<>());
            map.get(group).add(e.name);
        }

        return map;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(10, "JAVA", "Jung");
        Employee e2 = new Employee(6, "Oracle", "Han");
        Employee e3 = new Employee(1, "React", "Kim");

        GroupByExperience groupByExperience = new GroupByExperience();
        System.out.println("e1 경력그룹: " + groupByExperience.findGroup(e1));
        System.out.println("e2 경력그룹: " + groupByExperience.findGroup(e2));
        System.out.println("e3 경력그룹: " + groupByExperience.findGroup(e3));

        GroupByTech groupByTech = new GroupByTech();
        System.out.println("e1 기술그룹: " + groupByTech.findGroup(e1));
        System.out.println("e2 기술그룹: " + groupByTech.findGroup(e2));
        System.out.println("e3 기술그룹: " + groupByTech.findGroup(e3));

        List<Employee> list = new ArrayList<>() {
            {
                add(e1);
                add(e2);
                add(e3);
            }
        };

        Map<String, List<String>> group1 = group(list, groupByExperience);
        Map<String, List<String>> group2 = group(list, groupByTech);

        for(Map.Entry<String, List<String>> entry : group1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(Map.Entry<String, List<String>> entry : group2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}