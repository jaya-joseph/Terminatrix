package com.studytutorials.MyStudy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveElement {

	public static void main(String[] args) {
		int size;
		HashSet <String>collection = new HashSet <>(Arrays.asList("Yellow","blue","green","red"));
		System.out.println(collection);
		size=collection.size();
		System.out.println("size of element before removal " + size);
		collection.remove("blue");
		System.out.println(collection);
		size=collection.size();
		System.out.println("size of element after removal " + size);
	}

}
