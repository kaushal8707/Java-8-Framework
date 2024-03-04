package org.java8.framework.Stream.API;
import modules.User;

import java.util.*;

public class findPersonWhoseSalaryIsHighest {
    public static void main(String[] args) {
        List<User> list= Arrays.asList(
                new User("kaushal",33,11423.22f),
                new User("nagraju",77, 657113.22f),
                new User("columbus",82,44171.11f),
                new User("Monto",52,445615.112f)
        );
        //findPersonWhoseSalaryIsHighest - Way 1
        String res1 = list.stream()
                .max(Comparator.comparing(User::getSalary))
                .map(User::getUserName)
                .get();
        System.out.println("findPersonWhoseSalaryIsHighest = "+res1);

        String res2 = list.stream()
                .sorted(Comparator.comparing(User::getSalary).reversed())
                .findFirst().get().getUserName();
        System.out.println("findPersonWhoseSalaryIsHighest = "+res2);

        //findPersonNameSmallestAge
        String res3 = list.stream()
                .min(Comparator.comparing(User::getAge))
                .map(User::getUserName)
                .get();
        System.out.println("findPersonNameSmallestAge = "+res3);

        String res4 = list.stream()
                .sorted(Comparator.comparing(User::getAge))
                .findFirst().get().getUserName();
        System.out.println("findPersonNameSmallestAge = "+res4);


        Map<User, Integer> map=new HashMap<User, Integer>();
        map.put(new User("kaushal",33,11423.22f), 55);
        map.put(new User("nagraju",77, 657113.22f), 33);
        map.put(new User("columbus",82,44171.11f), 44);
        map.put(new User("Monto",52,445615.112f), 11);

        //find the person name who is highest in age  - way 1
        String personName=map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getAge).reversed()))
                .map(entry->entry.getKey().getUserName())
                .findFirst().get();
        System.out.println("personName = "+personName);

        //find the person name who is highest in age  - way 2
        String personName1=map.entrySet()
                .stream()
                .max(Map.Entry.comparingByKey(Comparator.comparing(User::getAge)))
                .map(entry->entry.getKey().getUserName())
                        .get();
        System.out.println("personName1 = "+personName1);

        //find the person name whose salary is lowest - way 1
        String personName3=map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(User::getSalary)))
                .map(entry->entry.getKey().getUserName())
                .findFirst().get();
        System.out.println("personName3 = "+personName3);

        //find the person name whose salary is lowest - way 2
        String personName4=map.entrySet()
                .stream()
                .min(Map.Entry.comparingByKey(Comparator.comparing(User::getSalary)))
                .map(entry->entry.getKey().getUserName())
                .get();
        System.out.println("personName4 = "+personName4);

    }
}
