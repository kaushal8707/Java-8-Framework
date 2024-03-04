package org.java8.framework.Stream.API;

import org.example.model.Employee;
import org.example.model.EmployeeDB;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortinglistcustomobject {
    public static void main(String[] args) {
        //sort employee object based on salary and get lowest salary employee object
        Employee emp=EmployeeDB.getEmployees()
                .stream().sorted(Comparator.comparing(Employee::getSalary))
                .findFirst()
                .get();
        System.out.println("lowest salary employee = "+emp);

        //sort employee object based on name
        EmployeeDB.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //find second highest salary employee
        String secondHighestSalary=EmployeeDB.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .map(Employee::getName)
                .get();
        System.out.println("second highest salary employee "+secondHighestSalary);


        //sort based on lambda expression or using Comparator
        List<Employee> list=EmployeeDB.getEmployees();
        Collections.sort(list, (emp1, emp2)->emp1.getDept().compareTo(emp2.getDept()));
        for(Employee employee:list){
            System.out.println("Sort Based on Name Using Lambda Expression"+employee);
        }

    }
}
