package com.java.codeganges.java5;

public class ColorDemo {
	public static void main(String args[]) {
		
		  // Calling values()
        Color arr[] = Color.values();
 
        // enum with loop
        for (Color col : arr) {
            // Calling ordinal() to find index
            // of color.
        	System.out.println("Color::"+col.name());
            System.out.println(col + " at index "
                               + col.ordinal());
        }
	}

}
