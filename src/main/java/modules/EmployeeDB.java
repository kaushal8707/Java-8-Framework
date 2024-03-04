package modules;

import java.util.Arrays;
import java.util.List;

public class EmployeeDB {
    public static List<Employee> getEmployees(){
        return Arrays.asList(new Employee(12,"kaushal","Software",1234500),
                new Employee(28,"prakash","Mechanical",334651),
                new Employee(65,"sohan","Electronic",912736),
                new Employee(39,"vinay","Hardware",451271),
                new Employee(81,"dipesh","HR",874651)
        );
    }
}
