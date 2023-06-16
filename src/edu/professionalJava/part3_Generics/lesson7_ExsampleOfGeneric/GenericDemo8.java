package edu.professionalJava.part3_Generics.lesson7_ExsampleOfGeneric;

public class GenericDemo8 {
    public static void main(String[] args) {
        SchoolBoy schoolBoy1 = new SchoolBoy("Alex",12);
        SchoolBoy schoolBoy2 = new SchoolBoy("Masha",13);
        SchoolBoy schoolBoy3 = new SchoolBoy("Marina",10);
        SchoolBoy schoolBoy4 = new SchoolBoy("Oly",14);

        Student student1 = new Student("Adolf", 18);
        Student student2 = new Student("Margaret", 20);

        Employee employee1 = new Employee("Dodo", 45);
        Employee employee2 = new Employee("Rurk", 40);

        Team<SchoolBoy > schoolTeam = new Team<>("Friends");
        schoolTeam.addNewParticipants(schoolBoy1);
        schoolTeam.addNewParticipants(schoolBoy2);

        Team<SchoolBoy > schoolTeam2 = new Team<>("Runners");
        schoolTeam2.addNewParticipants(schoolBoy3);
        schoolTeam2.addNewParticipants(schoolBoy4);

        Team<Student> studentTeam = new Team<>("Books");
        studentTeam.addNewParticipants(student1);
        studentTeam.addNewParticipants(student2);

        Team<Employee> employeeTeam = new Team<>("Gears");
        employeeTeam.addNewParticipants(employee1);
        employeeTeam.addNewParticipants(employee2);

        schoolTeam.playWith(schoolTeam2);
        //schoolTeam.playWith(studentTeam);

    }
}
