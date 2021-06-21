package arraygeeks;

class update
{
	  public static void main(String[] args){
	    int arr[] = {1,2,3,4};
	    for(int b:arr) {
			   System.out.print(b+" ");
			   }
	    System.out.println();
	    System.out.println("Before update" + arr[2]);
	    arr[2] = 9;//updating the value
	    System.out.println();
	    System.out.println("After update" + arr[2]);
	   for(int a:arr) {
		   System.out.print(a+" ");

	       
	   }
	   
	  }
	}