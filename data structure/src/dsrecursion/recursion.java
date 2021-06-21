package dsrecursion;
 class main1{
	int i=1;
	void print() {
		System.out.println(i);
		i++;
		
		if(i>10) {
			
		}
		else {
			print();
		}
	}
}
public class recursion {
	public static void main(String args[]) {
	main1 obj=new main1();
	
 obj.print();

}
}