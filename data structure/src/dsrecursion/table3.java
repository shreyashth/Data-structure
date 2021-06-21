package dsrecursion;

class main11{
	int i=1;
	void print() {
		System.out.println(i*3);
		
		
		i++;
		if(i>10) {
			
		}
		else {
			print();
		}
	}
}
public class table3 {
	public static void main(String args[]) {
	main11 obj=new main11();
	System.out.println("main");
obj.print();

}
	}
