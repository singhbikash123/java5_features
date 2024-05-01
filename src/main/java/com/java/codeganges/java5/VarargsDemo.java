package com.java.codeganges.java5;

public class VarargsDemo {
	static void table(int... a)
    {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
	
	public static void main(String args[]) {
		VarargsDemo.table(1,2,3,4,5,6,7,8,9,10);
	}

}
