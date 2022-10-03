package com.studytutorials.MyStudy;

import java.util.HashSet;

public class CloneHashSet {

	public static void main(String args[]) {
		
		HashSet<String> h_set= new HashSet<String>();
		h_set.add("Red");
		h_set.add("Black");
		h_set.add("green");
		h_set.add("yellow");
		System.out.println("Old HashSet is " + h_set);
		
		HashSet<String> new_set=new HashSet<String>();
		new_set = (HashSet)h_set.clone();
		System.out.println("New HashSet is "+new_set);
		
		HashSet<String> h_set1=new HashSet<String>();
		h_set1.add("R");
		h_set1.add("G");
		h_set1.add("B");
		h_set1.add("green");
		System.out.println(h_set1);
		new_set.retainAll(h_set1);
		System.out.println(new_set);
	}
	
}
