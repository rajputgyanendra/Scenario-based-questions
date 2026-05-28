package com.java8.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeSort {
	
public static void main(String[] args) {
	
	Employee e1 = new Employee(10, 2234,"IT");
	Employee e2 = new Employee(111, 334,"CS");
	Employee e3 = new Employee(12, 4334,"EE");
	Employee e4 = new Employee(13, 4834,"EE");
	Employee e5 = new Employee(132, 34,"CS");
	Employee e6 = new Employee(15, 234,"IT");
	
	
	
	ArrayList<Employee> al = new ArrayList<>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	al.add(e6);
	Collections.sort(al);
	
	System.out.println(al);
	// department wise employee count
	Map<String, Long> maps=al.stream().collect(Collectors.groupingBy(Employee::getDepart, Collectors.counting()));
	
	maps.forEach((k,v)->System.out.println("Key"+k +"- value is "+v));
	
	//department wise employee highest salary
	Map<String, Optional<Employee>> mapd=al.stream().collect(Collectors.groupingBy(Employee::getDepart, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSal)))));
	
	
	
		mapd.forEach((k,v)->System.out.println("KEY :-"+k+ "Value:-"+ v));
		
		
	}
}	


