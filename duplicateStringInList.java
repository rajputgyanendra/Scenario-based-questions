package com.java8.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringExample2 {
	
	public static void main(String[] args) {
	
		
		List lt = Arrays.asList("hyd","agr","hyd","amr");
		Set set = new HashSet<>();
        
        Map<String, Long> mat=(Map<String, Long>) lt.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
        mat.forEach((k,v)->System.out.println("KEY->"+k+","+"Value->"+v)); 
        
        // print duplicate string only
        lt.stream().filter(s->!set.add(s)).forEach(System.out::println);
     
      //  lt.stream().distinct().forEach(System.out::println);
	}

}
