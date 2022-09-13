package com.microsoft;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList=new ArrayList<String>();
		
		nameList.add("Sachin");
		nameList.add("Virat");
		nameList.add("Rohit");
		
		//using iterator
          
	   Iterator<String> itr = nameList.iterator();
		
	   while(itr.hasNext()) {
		   
		   System.out.println(itr.next());
		   
	   }
	   
	   //using for each loop
	   for(String name : nameList) {
		   
		   System.out.println(name);
	   }
	   
	}

}
