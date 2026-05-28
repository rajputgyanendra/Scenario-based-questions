package com.java8.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringExample {
	
	public static void main(String[] args) {
		String inputString = "My Name is Gyanendra Singh Rajput and li am Java developer";
		
		
		Map<Character, Long>  mape=inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        mape.forEach((k,v)->System.out.println("KEY->"+k+","+"Value->"+v)); 
        
        Set set = new HashSet<>();
	    inputString.chars().mapToObj(c->(char)c).filter(s->!set.add(s)).forEach(System.out::println);
        //mape.forEach((k,v)->System.out.println("KEY->"+k+","+"Value->"+v)); 
        
        
        
	}

}
