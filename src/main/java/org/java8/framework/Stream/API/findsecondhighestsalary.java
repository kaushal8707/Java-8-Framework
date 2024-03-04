package org.java8.framework.Stream.API;

import modules.Employee1;
import modules.EmployeeDatabase;

import java.util.Comparator;

public class findsecondhighestsalary {
    public static void main(String[] args) {
        Employee1 highestSal=EmployeeDatabase.getEmployees()
                .stream().sorted(Comparator.comparing(Employee1::getSalary).reversed())
                .skip(1)
                .findFirst().get();
        System.out.println("findsecondhighestsalary = "+highestSal);
    }
}
