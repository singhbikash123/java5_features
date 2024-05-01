package com.java.codeganges.java5;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	
	public static void main(String args[]) {
		
		List<String> listString = new ArrayList<>();
		listString.add("A");
		listString.add("B");
		listString.add("C");
		listString.add("D");
		
		for(String s: listString) {
			System.out.println(s);
		}
		
	}

}
