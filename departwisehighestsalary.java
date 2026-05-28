package com.java8.String;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentFilteredSalary {
	
	public static void main(String[] args) {
		
	
		List<Employee> le = new ArrayList<>();
		le.add(new Employee(1,100,"A"));
		le.add(new Employee(2,100,"B"));
		le.add(new Employee(3,300,"C"));
		le.add(new Employee(4,800,"A"));
		le.add(new Employee(5,350,"C"));
		le.add(new Employee(6,550,"B"));
		le.add(new Employee(7,400,"C"));
		
		
		System.out.println(le);
		
		// department wise max salary
		Map<String, Employee> me=le.stream().collect(Collectors.groupingBy(e->e.depart,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(e->e.sal)),Optional::get)));
	
		
		
		for(Entry<String, Employee> e : me.entrySet()) {
			
			System.out.println(e.getKey()+"---------"+e.getValue());
			

}
		
		
le.stream().collect(Collectors.groupingBy(e->e.depart,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(e->e.sal)),Optional::get))).
				forEach((k,v)->System.out.println(k +" --"+v.sal));
		
		
		}
	}
