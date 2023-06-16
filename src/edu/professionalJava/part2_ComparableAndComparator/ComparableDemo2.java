package edu.professionalJava.part2_ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(225, "Rozalie", "Kodovna", 1500));
        list.add(new Employee(8, "Rozalie", "Vaserman", 1750));
        list.add(new Employee(1000, "Alex", "Pushkin", 1000));
        System.out.println("Перед сортировкой");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки ");
        System.out.println(list);
    }

}

class Employee implements Comparable<Employee> {
    //int id;
    Integer id;
    String name;
    String surName;
    int salary;

    public Employee(int id, String name, String surName, int salary) {
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
            // Первый способ переписать compereTo(самый распространенный)
//    @Override
//    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }

    // Второй способ переписать compereTo
//    @Override
//    public int compareTo(Employee anotherEmp) {
//        return this.id-anotherEmp.id;
//   }
   //       Третий способ переписать compereTo(если сравниваемое поле ссылочного типа, например Integer если тип  implements Comparable
//    @Override
//   public int compareTo(Employee anotherEmp) {
//        return this.id.compareTo(anotherEmp.id);
//    }

    //Если нужно сравнить String с одинаковыми именами
    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.name.compareTo(anotherEmp.name);
        if (result==0){
            result= this.surName.compareTo(anotherEmp.surName);
        }
        return result;
    }
}
