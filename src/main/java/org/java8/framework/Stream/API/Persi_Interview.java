package org.java8.framework.Stream.API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names.(Java 8 APIs only)
//Given the list of employees, count number of employees with age 25?
//Given the list of employees, find the employee with name “Mary”.
//Given a list of employee, find maximum age of employee?
//Given a list of employees, sort all the employee on the basis of age?
public class Persi_Interview {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee("Mary",22,9182),
                       new Employee("John",25,1234),
                       new Employee("William",12,2345),
                        new Employee("Kina",28,3456),
                       new Employee("Kary",25,8712));
        //Q 1
        System.out.println("all the employee whose age is greater than 20");
        list.stream()
                .filter(emp->emp.getAge()>20)
                .map(emp->emp.getName())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //Q 2
        long count=list.stream()
                .filter(emp->emp.getAge()==25)
                .collect(Collectors.counting());
        System.out.println("count number of employees with age 25 = "+count);

        //Q 3
        System.out.println("the employee with name “Mary”.");
        list.stream()
                .filter(emp->emp.getName().startsWith("Mary"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Q 4
        System.out.println("find maximum age of employee");
        Employee emp=list.stream()
                .max(Comparator.comparing(Employee::getAge))
                .get();
        System.out.println("maximum age of employee ="+emp);

        //Q 5
        System.out.println("sort all the employee on the basis of age");
        list.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("second highest salary of employee");
        Employee emp2=list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(emp2);
    }
}
