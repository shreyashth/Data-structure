package arraygeeks;

import java.util.*;
import java.io.*;
import java.lang.*;
class Op1OnArrayinsert
{ 
    static int insert(int arr[], int n, int x, int cap, int pos)//method 5 para
    {
    	if(n == cap)
    		return n;//for only 1 element

    	int idx = pos - 1;

    	for(int i = n - 1; i >= idx; i--)
    	{
    		arr[i + 1] = arr[i];
    	}

    	arr[idx] = x;

    	return n + 1;
    } 
//display
    public static void main(String args[]) 
    { 
       int arr[] = new int[5];
    		   int  cap = 5 ; 
    		   int n = 3;

       arr[0] = 5; 
       arr[1] = 10; 
       arr[2] = 20;

       System.out.println("Before Insertion");

       for(int i=0; i < n; i++)//print array
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       int x = 7, pos = 2;//user defined values
       

       n = insert(arr, n, x, cap, pos);//(5,3,7,5,2)

       System.out.println("After Insertion");//print after insertion

       for(int i=0; i < n; i++)////print array
       {
       		System.out.print(arr[i]+" ");
       }
    } 
}