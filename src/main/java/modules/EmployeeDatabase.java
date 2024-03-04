package modules;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
    public static List<Employee1> getEmployees() {
        return Stream.of(
                new Employee1(312,"john", "A",60000),
                new Employee1(771,"peter", "B",30000),
                new Employee1(981,"mak", "A",90000),
                new Employee1(481,"cisn", "A",80000),
                new Employee1(123,"kuy","C",15000)
        ).collect(Collectors.toList());
    }
}
