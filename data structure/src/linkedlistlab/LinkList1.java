package linkedlistlab;


import java.util.*;
class Node{
		int data;
		Node next;
		
		Node(){
			data = -1;
			next = null;
		}
		
		Node(int data){
			this.data = data;
			this.next  = null;
		}
		
}


public class LinkList1 {
	Node head;
	
		public LinkList1() {
			head = null;
		}	


		void insertBeg(int data){
			Node node = new Node(data);
			if( head == null)
				head = node;
			else{
				node.next = head;
				head = node;
			}
			
		}

		void insertM(int dataI){

			Node newnode = new Node(dataI);
			Node temp = head;
			if( temp != null){
				newnode.next=temp.next ;
				temp.next=newnode ;
			}
		}




		void insertEnd(int data){
			Node node = new Node(data);
			if( head == null)
				head = node;
			else{
				Node temp = head;
				while( temp.next != null ){
					temp = temp.next;
				}
				temp.next = node;
			}
		}


		void print(){
			Node temp = head;
			while( temp != null ){
				System.out.print(temp.data);
				temp = temp.next;
			}
			
		}


		void deleteAfter(int data){
			Node temp = head;
			while( temp != null ){
				if( temp.data == data)
					break;
				temp = temp.next;
			}
			Node nextnode = temp.next; 
			temp.next = nextnode.next;	
			nextnode = null;
		}


	public static void main(String[] args) {
		LinkList1 ll= new LinkList1();
		
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter value for n");
	   
		
	    while(true){
	    	 int n = sc.nextInt();	
			if( n == -1)
				break;


			ll.insertBeg(n);
		}
		
		ll.print();	
		/*while(true){
			Scanner sc1 = new Scanner(System.in);  
		    System.out.println("Enter value for n");
		    int n1 = sc1.nextInt();
			ll.deleteAfter(n1);
			ll.print();
		}*/

	}	}



