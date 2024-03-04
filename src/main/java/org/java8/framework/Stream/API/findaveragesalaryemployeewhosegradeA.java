package org.java8.framework.Stream.API;
import modules.Employee1;
import modules.EmployeeDatabase;
import java.util.Comparator;
import java.util.stream.Collectors;

public class findaveragesalaryemployeewhosegradeA {
    public static void main(String[] args) {
        //findaveragesalaryemployeewhosegradeA
        double avgSal=EmployeeDatabase.getEmployees()
                .stream().filter(emp->emp.getGrade().equals("A"))
                .mapToDouble(emp->emp.getSalary())
                .average()
                .getAsDouble();
        System.out.println(avgSal);

        //findSumOfSalaryWhoseGradeisA
        double sumSal=EmployeeDatabase.getEmployees()
                .stream().filter(emp->emp.getGrade().equals("A"))
                .mapToDouble(emp->emp.getSalary())
                .sum();
        System.out.println(sumSal);

        //findTheSecondHighestSalary
       String empNameSecondHighestSal = EmployeeDatabase.getEmployees().stream()
                .sorted(Comparator.comparing(Employee1::getSalary).reversed())
                .skip(1)
                .map(Employee1::getName)
                .findFirst().get();
        System.out.println(empNameSecondHighestSal);

        //findWhoseSalaryGreaterThan50000
        EmployeeDatabase.getEmployees().stream()
                .filter(emp->emp.getSalary()>50000)
                .map(Employee1::getName)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
