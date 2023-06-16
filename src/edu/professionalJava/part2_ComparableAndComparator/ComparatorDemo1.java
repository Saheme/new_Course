package edu.professionalJava.part2_ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo1 {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1(225, "Rozalie", "Kodovna", 1500));
        list.add(new Employee1(8, "Rozalie", "Vaserman", 1750));
        list.add(new Employee1(1000, "Alex", "Pushkin", 1000));
        System.out.println("Перед сортировкой");
        System.out.println(list);
        Collections.sort(list);
       // Collections.sort(list, new IdComparator());
        //Collections.sort(list,new NameComparator());
        //Collections.sort(list,new SalaryComparator());
        System.out.println("После сортировки ");
        System.out.println(list);
    }

}


class Employee1 implements Comparable<Employee1> {
    //int id;
    Integer id;
    String name;
    String surName;
    int salary;

    public Employee1(int id, String name, String surName, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee1 anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

//class IdComparator implements Comparator<Employee1> {
//
//    @Override
//    public int compare(Employee1 emp1, Employee1 emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return emp1.salary-(emp2.salary);
    }
}



