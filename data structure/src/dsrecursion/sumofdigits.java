package dsrecursion;


class sumofdigits {
	static int digitsum(int n) {
		if(n<10)
			return n;
		else return digitsum(n/10)+n%10;
	}
public static void main(String args[])
{
	 int n = 21396;
     int result = digitsum(n);
     System.out.println("Sum of digits in " +
                        n + " is " + result);
}
}

