package Stack;

public class queue {
	int rear=0;
	int front=0;
	int size=5;
	static int number=0;
	int arr[]=new int [size];
void enque(int data)
{
	
	if(isFull())
		{
			System.out.println("overflow ="+data);
		}
		else
		{
			System.out.println("No."+number+" ="+data);
			number++;
			arr[rear]=data;
			rear++;
		}
		
}
void deque()
{System.out.println("No."+number);
number++;
	if(isEmpty())
	{
		System.out.println("Underflow");
		System.out.println("<-->>");
	}
	else
	{
		//System.out.println("--==");
		front++;
		
	}
	
}
boolean isEmpty()
{
	if(rear == front)
	{
		rear =0;
		front =0;
		return true;
	}
	else
	{
		return false;
	}
}
boolean isFull()
{
	if(rear == size && rear==front)
	{
		rear=0;
		front =0;
		return false;
	} else if(rear==size){
		return true;
	}
	else
	{
		return false;
	}
}
void peek()
{
	//System.out.println("front="+front);
	System.out.println("->>"+arr[front]);
}
	public static void main(String[] args) {
		queue q = new queue();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		q.deque();
		q.deque();
		q.deque();
		q.deque();
		q.deque();
		//q.peek();
		//q.deque();
		//q.peek();
		q.enque(60);
		q.peek();
		//q.deque();
		//q.peek();
	}

}
