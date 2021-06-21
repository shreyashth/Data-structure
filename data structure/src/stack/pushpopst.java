package stack;

public class pushpopst {
int top;
int arr[];
int cap;
public pushpopst(int size)
{
top=-1;	
arr=new int[size];
cap=size;
}
public boolean isEmpty()
{
return top==-1;	
}
public boolean isFull()
{
	return top==cap-1;
	}

public void push(int data) {
	if (isFull()){
		System.out.println("stackisfull");
		System.exit(0);
	}
	System.out.println(data);
	arr[++top]=data;
	//top++;
	//arr[top]=data;
}
public int pop() {
if(isEmpty()) {
	System.out.println("stackisempty");
	System.exit(0);
}	

System.out.println(arr[top]);
return arr[top--];
//top--;
}
public void peek() {
	if (isEmpty()) {
		System.out.println("únder flow");

	}
	else
	{
		System.out.println(arr[top]);
	}
}
public static void main(String args[]) {
	pushpopst st=new pushpopst(4);
	System.out.println("push the data");
	st.push(10);
	st.push(20);
	st.push(30);
	System.out.println("pop the data");
	st.pop();
	st.pop();
	System.out.println("peek");
	st.peek();
}
}