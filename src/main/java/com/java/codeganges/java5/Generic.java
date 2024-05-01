package com.java.codeganges.java5;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String args[]) {

		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(4);
		integerList.add(5);
		integerList.add(6);
		integerList.add(7);
		integerList.add(8);
		
		for(int i : integerList) {
			System.out.println("integer::"+i);
		}

	}

}
