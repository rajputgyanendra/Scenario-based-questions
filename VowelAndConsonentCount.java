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
		
		
		String str = "ManmohanSingh";
		int vowelPointer=0;
		int consoPointer=0;
		/*
		 * for (int i=0;i<str.length();i++) {
		 * 
		 * if(str.charAt(i)=='a') { vowelPointer++; } else if(str.charAt(i)=='e') {
		 * vowelPointer++;
		 * 
		 * } else if(str.charAt(i)=='i') { vowelPointer++;
		 * 
		 * }else if(str.charAt(i)=='o') { vowelPointer++;
		 * 
		 * }else if(str.charAt(i)=='u') { vowelPointer++;
		 * 
		 * } else { consoPointer++; System.out.println("consonent -->"+consoPointer); }
		 * 
		 * }
		 */
		
		  Set set = new HashSet<>();
		  //str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting())).forEach((k,v)->System.out.println("key ->"+k +"--"+"Value "+v));
		  str.chars().mapToObj(c->(char)c).distinct().collect(Collectors.groupingBy(c->c, Collectors.counting())).forEach((k,v)->System.out.println("key ->"+k +"--"+"Value "+v));
		  Map<Object, Long> map=str.chars().mapToObj(c->(char)c).distinct().collect(Collectors.groupingBy(c->c, Collectors.counting()));

	
	// find vowel then no. of count and else
	
	             for (Map.Entry entry :map.entrySet()) {
	            	 
	                        if(entry.getKey()==Character.valueOf('a')||entry.getKey()==Character.valueOf('e')||entry.getKey()==Character.valueOf('i')||entry.getKey()==Character.valueOf('o')||entry.getKey()==Character.valueOf('u')) {
	                        	vowelPointer++;
	                        }else {
	                        	consoPointer++;
	                        }	 
	                         
	             }
	             System.out.println("vowel -->"+vowelPointer);
	             System.out.println("consonent -->"+consoPointer);

	             
	             
	            
	           
	            
	            
	            
	         
	            
	            
	            
	            
	            
	            
	            
}
}
