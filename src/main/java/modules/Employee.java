package modules;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public static List<Employee> getEmpList(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", "Dep1",2000));
        list.add(new Employee(2, "B", "Dep2", 3000));
        list.add(new Employee(3, "C", "Dep3",4000));
        list.add(new Employee(4, "D", "Dep4",5000));
        return list;
    }

}