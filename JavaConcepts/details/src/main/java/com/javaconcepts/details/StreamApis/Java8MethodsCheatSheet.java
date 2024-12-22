package com.javaconcepts.details.StreamApis;

import com.javaconcepts.details.StreamApis.DummyEntries.EmployeeDataBase;
import com.javaconcepts.details.StreamApis.model.Employee;
import com.javaconcepts.details.StreamApis.model.Project;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MethodsCheatSheet {
    public static void main(String[] args) throws Exception {
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        //forEach
        employeeList.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getDept()));
        //employeeList.forEach(System.out::println);

        System.out.println("filter:");
        //filter
        List<Employee> filteredEmployee = employeeList.stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("development"))
                .toList();
        System.out.println(filteredEmployee + "\n");

        System.out.println("filter and convert to map:");
        //filter and convert to map
        Map<Integer, Employee> filterEmployeeMap = employeeList.stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("development") && employee.getSalary() > 70000)
                .collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(filterEmployeeMap + "\n");

        System.out.println("Map:");
        System.out.println("Extract only dept from the List<Employee> and collect to list");
        List<String> deptList = employeeList.stream()
                .map(Employee::getDept)
                .toList();
        System.out.println(deptList);

        Set<String> deptSet = employeeList.stream()
                .map(Employee::getDept)
                .collect(Collectors.toSet());
        System.out.println(deptSet);

        System.out.println("Without set also we can avoid duplicates from the List: ");
        List<String> deptListDistinct = employeeList.stream()
                .map(Employee::getDept)
                .distinct()
                .toList();
        System.out.println(deptListDistinct);

        //flatMap
        System.out.println("Extract field from the project name (nested class): ");
        System.out.println("Trying with map: ");
        List<Stream<String>> extractProjectNameWithMap = employeeList.stream()
                .map(employee -> employee.getProjects().stream().map(Project::getName))
                .toList();
        System.out.println(extractProjectNameWithMap); // it will print the reference

        System.out.println("Trying with flatMap: ");
        List<String> extractProjectNameWithFlatMap = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .map(Project::getName)
                .toList();
        System.out.println(extractProjectNameWithFlatMap);
        List<String> extractProjectNameWithFlatMapModify = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .peek(project -> {
                    if (project.getName().equalsIgnoreCase("alpha")) {
                        project.setName("prudhvi");
                    }
                })
                .map(Project::getName)
                .toList();
        System.out.println(extractProjectNameWithFlatMapModify);

        //sorted
        List<Employee> storedByNameDesc = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .toList();
        System.out.println(storedByNameDesc);

        List<Employee> storedByNameReverseOrder = employeeList.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getName)))
                .toList();
        System.out.println(storedByNameReverseOrder);

        List<Employee> storedBySalaryAsc = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(storedBySalaryAsc);


        //min & max
        System.out.println("Min & Max:");
        Optional<Employee> employeeMinSalary = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(employeeMinSalary);

        Optional<Employee> employeeMaxSalary = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(employeeMaxSalary + "\n");

        //GroupingBy
        System.out.println("Grouping By:");
        Map<String, List<Employee>> groupByGender = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(groupByGender + " \n");

        //Gender -> [names] ***vvimp***
        Map<String, Set<String>> groupByGenderAndReturnNames = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.mapping(Employee::getName, Collectors.toSet())));
        System.out.println(groupByGenderAndReturnNames + " \n");

        //Gender -> count
        Map<String, Long> groupByGenderCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(groupByGenderCount + " \n");

        //findFirst
        Optional<Employee> employeeFindFirst = employeeList.stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("development"))
                .findFirst();
        employeeFindFirst.ifPresent(employee -> System.out.println(employee.getName()));

//        Employee employeeFindFirstException = employeeList.stream()
//                .filter(employee -> employee.getDept().equalsIgnoreCase("dev"))
//                .findFirst().orElseThrow(() -> new Exception("Employee not found"));
//        System.out.println(employeeFindFirstException.getName());

        //findAny
        Optional<Employee> employeeFindAny = employeeList.stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("development"))
                .findAny();
        employeeFindAny.ifPresent(employee -> System.out.println(employee.getName()));

        //findAny and findFirst Difference
        // There is no diff when there non-parallel process
        // Diff comes when parallel process takes place if any record found return it
        //example of parallel processing
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> result = list
                .stream().parallel()
                .filter(num -> num < 3).findAny();
        result.ifPresent(System.out::println);


        //anyMatch(predicate), allMatch(predicate), noneMatch(predicate) --> similar to filter
        boolean employeeAnyMatch = employeeList.stream()
                .anyMatch(employee -> employee.getDept().equalsIgnoreCase("development"));
        System.out.println("Any match development: " + employeeAnyMatch);

        boolean employeeAllMatch = employeeList.stream()
                .allMatch(employee -> employee.getDept().equalsIgnoreCase("development"));
        System.out.println("All match development: " + employeeAllMatch);

        boolean employeeAllMatchSalary = employeeList.stream()
                .allMatch(employee -> employee.getSalary() > 50000);
        System.out.println("All match development: " + employeeAllMatchSalary);

        boolean employeeNoneMatch = employeeList.stream()
                .noneMatch(employee -> employee.getDept().equalsIgnoreCase("dev"));
        System.out.println("none match development: " + employeeNoneMatch + " \n");

        //limit(long)
        List<String> employeeLimit = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .limit(2)
                .map(Employee::getName)
                .toList();
        System.out.println(employeeLimit);

        //skip(long)--> skip first 5 elements
        List<Employee> skipEmployees = employeeList.stream()
                .skip(5)
                .toList();
        System.out.println(skipEmployees);
    }
}
