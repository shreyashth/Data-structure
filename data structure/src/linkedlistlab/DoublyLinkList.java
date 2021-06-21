package linkedlistlab;


import java.util.Scanner;

class NodeCreate{
		int data;
		NodeCreate next;
		NodeCreate prev;
		
		NodeCreate(){
			data = -1;
			next = null;
			prev = null;
		}
		
		NodeCreate(int data){
			this.data = data;
			this.next  = null;
			this.prev  = null;
		}
}    

public class DoublyLinkList {
	NodeCreate head;
	
		public DoublyLinkList() {
			head = null;
		}	


		void insertBeg(int data){
			NodeCreate newnode = new NodeCreate(data);
			newnode.next = head;
		    newnode.prev = null;
		 
		    
		    if (head != null) {
		        head.prev = newnode;
		    }
			head = newnode;
			}
			
		
		public void InsertAfter( int data)
		{
		 NodeCreate newnode = new NodeCreate(data);
		 NodeCreate temp=head;
		 if (newnode.next != null)
		        newnode.next.prev = newnode;
		    
		    newnode.next = temp.next;
		    temp.next = newnode;
		    newnode.prev = temp;
		 
}

		
		void insertEnd(int data){
			NodeCreate newnode = new NodeCreate(data);
			NodeCreate temp= head;
			newnode.next=null;
			if(head==null) {
				newnode.prev=null;
				head=newnode;
			}
			
			while(temp.next!=null) {
				temp=temp.next;
				
			}
			temp.next=newnode;
			newnode.prev=temp;
		}

			





NodeCreate create_node(int data)
		{
			//to allocate memory dynamically for the node
			NodeCreate temp = new NodeCreate();
			if( temp == null ){
				System.out.println("Allocation failed !!!\n");
				System.exit(0);
			}

			temp.data = data;
			temp.next = null;

			return temp;
		}

		void InsertAtPos(int data,int poss)
		{
			int i=0;
			// to check position is valid or not
			if(poss>0){
		    NodeCreate newnode = create_node(data);
			
			NodeCreate trav= head;
			if(poss==1)
			{
					newnode.next = head;
				   head = newnode;
			}
			
			for(i=2;i<poss;i++)
				 {
				   	trav = trav.next;
				 }
			newnode.next= trav.next;
			trav.next = newnode;
		    }
		    else
			{
		    	
		    	System.out.println("Invalid position\n");
		    }
		}
		  
		  



		void print(){
			NodeCreate temp = head;
			while( temp != null ){
				System.out.println(temp.data);
				temp = temp.next;
			}
			
		}
	public static void main(String args[]) {
		DoublyLinkList ll= new DoublyLinkList();
		
		//Scanner sc = new Scanner(System.in);  
	   // System.out.println("Enter value for n");
	   
		
	    /*while(true){
	    	 int n = sc.nextInt();	
			if( n == -1)
				break;


			ll.insertBeg(n);
			
			
		}*/
	    ll.insertBeg(6);
	    ll.insertBeg(7);
	    ll.insertEnd(5);
	    ll.InsertAfter(8);
	   ll.InsertAtPos(1,9);
	    
	    //ll.insertBeg(10);
	    //ll.insertBeg(20);
		
		ll.print();	
		

	}	}





