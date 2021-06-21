package arraypractice;

public class array1 {
static int search(int arr[],int n,int key) {
	for(int i=0;i<n;i++)
		if(arr[i]==key)
			return i;
	return -1;

}
public static void main(String args[]) {
int arr[]= {1,2,3,4,5,6,10,8,9,11};
int n=arr.length;
int key =10;
int pos=search( arr,n,key);
if (pos==-1)
	System.out.println("not found");
else
	System.out.println("found "+"key+"+key+"@"+(pos+1));


}
}

