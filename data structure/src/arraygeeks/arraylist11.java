
package arraygeeks;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;




class arraylist11{
  
	public static void main (String[] args) {
	
	 ArrayList<Integer> al= new ArrayList<>();
	 
	al.ensureCapacity(100);
	
    for(int i=1;i<=100;i++)
    {
        al.add(i);
    }
	 
	System.out.println(al);

	    
	    

	}
	
}