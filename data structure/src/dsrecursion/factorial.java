package dsrecursion;


import java.util.*;

public class factorial {
static int factorial(int n)
{
	if(n!=0)
		return n*factorial(n-1);
	else
		return 1;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt(),result;
	result=factorial(number);
	System.out.println(number+"factorial="+result);}
}
