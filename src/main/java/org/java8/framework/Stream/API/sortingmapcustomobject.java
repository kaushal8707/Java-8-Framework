package org.java8.framework.Stream.API;
import org.example.model.Employee;
import java.util.*;
import java.util.stream.Collectors;
public class sortingmapcustomobject {
    public static void main(String[] args) {
        Map<Employee, Integer> map = new HashMap<Employee, Integer>();
        map.put(new Employee(28,"prakash","Mechanical",334651) , 2);
        map.put(new Employee(65,"sohan","Electronic",912736), 4);
        map.put(new Employee(39,"vinay","HArdware",451271), 6);
        map.put(new Employee(81,"dipesh","HR",874651), 8);

        //sort map based on name of Employee
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
                .map(entry->entry.getKey().getDept())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //sort based on name of Employee In Reversed Order
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //sort map based on value in reveresd order
        map.entrySet()
            .stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Integer::intValue).reversed()))
             .map(entry->entry.getKey())
             .collect(Collectors.toList())
             .forEach(System.out::println);

        //find the name of employee whose salary is highest  -->> this is an alternate way ...otw u can see stream().max().....map()...
        System.out.println("----------------------------");
        String highestSalEmployee=map.entrySet()
                .stream()
                .max(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .map(entry->entry.getKey().getName())
                .get();
        System.out.println("highestSalEmployee "+highestSalEmployee);

        //find Name of the Person who is in HR Department
        map.entrySet()
                .stream().filter(entry->entry.getKey().getDept().equals("HR"))
                .map(entry->entry.getKey().getName())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //Using Lambda Expression
        List<Map.Entry<Employee,Integer>> list=new ArrayList(map.entrySet());
        Collections.sort(list, (entry1,entry2)->entry1.getKey().getName().compareTo(entry2.getKey().getName()));
        list.forEach(System.out::println);
    }
}
