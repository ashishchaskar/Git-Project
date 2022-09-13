package com.microsoft;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		
		for(Integer i : hashSet) {
			
			System.out.println(i);
		}
		
		
	}

}
