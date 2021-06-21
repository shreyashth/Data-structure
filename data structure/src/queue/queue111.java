package queue;

public class queue111 {
	int rear;
	int front;
	int size = 5;
	int arr[] = new int[size];

	void enqueue(int data) {
		if (isfull()) {
			System.out.println("overflow ");
		} else {
			arr[rear] = data;
			rear++;
			System.out.println(data);
		}
	}

	void dequeue() {
		if (isempty()) {
			System.out.println("underflow");
		} else {
			front++;
			// System.out.println(data);

		}

	}

	boolean isempty() {
		if (front == rear) {
			rear = 0;
			front = 0;
			return true;
		} else {
			return false;

		}
	}

	boolean isfull() {
//if(rear==size-1)
		if (rear == size && rear == front) {
			rear = 0;
			front = 0;
			return false;
		} else if (rear == size) {
			return true;
		} else {
			return false;
		}
	}

	void peek() {
		

			System.out.println(arr[front]);
		
	}
//void display(int data) {
	// System.out.println(data);
	/*
	 * void display() { int i; if (isempty() ) { System.out.println("Empty Queue");
	 * } else { // display the front of the queue
	 * System.out.println("\nFront index-> " + front);
	 * 
	 * // display element of the queue System.out.println("Items -> ");
	 * 
	 * 
	 * for (i = front; i <= rear; i++) System.out.print(items[i] + "  ");
	 * 
	 * 
	 * // display the rear of the queue System.out.println("front"+enqueue.data);
	 * System.out.println("\nRear index-> " + rear); } }
	 */
//}
	/*
	 * void display() {
	 * 
	 * for(a:arr) { System.out.println(a); } }
	 */

	public static void main(String[] args) {
		queue111 q = new queue111();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.peek();

		q.dequeue();
	
	}

}
