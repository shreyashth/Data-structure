package Arrayassignment;


public class assignment22 {
	
	public static void main(String[] args)
	{
		int inArray[] = {2, 4, 7, 6, 5, 1, 3, 10};
		int arraySize = inArray.length;
		findSmallestlargestElement(inArray, arraySize);
	}

	private static void findSmallestlargestElement(int[] inArray, int arraySize) {
		
		//initialize max and min numbers to some random numbers in array, let's say inArray[0]
		int min = inArray[0];
		int max = inArray[0];
		
		//Traverse through the array
		for (int i=0; i< arraySize; i++)
		{			
			//if the current element is greater than the max, then set max to current element
			if (inArray[i] > max)
			{
				max = inArray[i];
			}
			//if the current element is lesser than the min, then set min to current element
			if (inArray[i] < min)
			{
				min = inArray[i];
			}
		}
		
		//print smallest and largest numbers in the input array
		System.out.println("The smallest number in the input array is: " + min);
		System.out.println("The largest number in the input array is: " + max);		
	}

}