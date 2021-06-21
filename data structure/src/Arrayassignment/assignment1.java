package Arrayassignment;

/* If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
60], your program should be able to find that the
subarray lies between the indexes 3 and 8.
*/
public class assignment1 {
static int array[]= {10,12,20,30,25,40,32,31,35,50,60};
static void myArray() {
	for(int i=0;i<array.length-1;i++)
	{
		if(i>=3 &&i<=8)
			System.out.print(array[i]+" ");
	}
}
public static void main(String args[])
{
	myArray();
	}
}
