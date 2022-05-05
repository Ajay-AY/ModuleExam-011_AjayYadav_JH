 class Q2{
   Node head;
   
   int count = 0;
   
   static class Node{
	   int data;
	   Node next;
	   
	   Node(int data){
		   this.data = data;
		   next = null;
	   }
	   
   }
     
	 
	 void insert(int data){
		 Node newNode = new Node(data);
		 if(head==null){
			 head = newNode;
			 count++;
			 return;
		 }
		 Node temp = head;
		 while(temp.next!=null){
			 temp = temp.next;
		 }
		 temp.next = newNode;
		 count++;
	 }
	 
	 void reverse(){
		 Node trav  = null;
		 
		 if(head==null){
			 return;
		 }
		 for(Node temp = head;temp!=null;temp = temp.next){
			 trav = temp;
			Node prev = null;
			 int data = temp.data;
			 
			 while(trav.next!=null && trav.next.data!=data){
				  prev = trav;
				 trav = trav.next;
			 }
			   head.data = trav.data;
			   trav.data = temp.data;
			  
			   trav = prev;
			 
		 }
		 head = trav;
	 }
   
   void display(){
	  
	   for(Node n =head;n!=null;n=n.next){
		   System.out.print(n.data+" ");
	   }
   }
   
   int count(){
	   return count;
   }
   
   
 
 public static void main(String[] args){
  Q2 ll = new Q2();
  ll.insert(1);
  ll.insert(2);
  ll.insert(3);
  ll.insert(4);
  ll.insert(5);
 System.out.println(ll.count());
 ll.display();
 
   }
 }