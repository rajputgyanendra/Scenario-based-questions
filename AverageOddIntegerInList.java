package com.java8.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class TestProgram {
	
	public static void main(String[] args) {
		
		
	           
	             List<Integer> nums = new ArrayList<>();
	             nums.add(11);	   
	             nums.add(22);	
	             nums.add(30);	
	             nums.add(42);	
	             nums.add(51);	
	             
	             Map<Boolean, List<Integer>> response = nums.stream()
	            	        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
	             
	             response.forEach((k,v)->System.out.println(k+"---"+v));
	             
	            OptionalDouble ave= nums.stream().filter(s->s%2!=0).mapToInt(Integer::intValue).average();
	            System.out.println(ave);
	            
	            
	            
	          
	            
	            
	         
	            
	            
	            
	            
	            
	            
	            
}
}
