class Q3{
	int top;
	int count;
	Q3(){
		 top = -1;
	}
	
   
   void push(int arr[],int data){
	   if(top == arr.length-1){
		   return;
		  
	   }
	   top++;
	   arr[top] = data;
	   count++;
   }
   
   
   
   void pop(int arr[]){
	   if(top==-1){
		   return;
	   }
	   
	   System.out.println("Poped element is  "+ arr[top]);
	   top--;
	   count--;
   }
  public static void main(String[] args){
    int arr1[] = new int [4];
    int arr2[] = new int [4];
	Q3 q = new Q3();
	q.push(arr1,10);
	q.push(arr1,20);
	q.push(arr1,30);
	q.push(arr2,10);
	q.push(arr2,20);
	q.push(arr2,30);
	q.push(arr2,10);
	q.pop(arr2);
	
	int arr3[] = new int[arr1.length+arr2.length];
	for(int i =0;i<arr3.length;i++){
		if(i==0&&i<arr1.length)
		arr3[i] = arr1[i];
		
		}
	
	
  }
}