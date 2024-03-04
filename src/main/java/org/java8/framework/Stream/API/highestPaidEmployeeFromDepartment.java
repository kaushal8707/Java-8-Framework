package org.java8.framework.Stream.API;

import modules.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class highestPaidEmployeeFromDepartment {
    public static void main(String[] args) {
        List<Employee> list = Stream.of(
                        new Employee(1, "Basant", "DEV", 50000),
                        new Employee(8, "santhosh", "DEV", 80000),
                        new Employee(3, "pratik", "QA", 60000),
                        new Employee(9, "Dipak", "QA", 90000),
                        new Employee(4, "Bikash", "DEVOPS", 40000))
                .collect(Collectors.toList());
        list.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                              Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
                .entrySet()
                .stream()
                .forEach(entry->{
                    System.out.println(entry.getKey()+"   --  "+entry.getValue().get().getName());
                });

    }
}
