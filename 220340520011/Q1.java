  import java.util.Scanner;
  
  class Q1{
	  
	  static void sort(int arr[],int size){
		 for(int i = size-1;i>=0;i--){
		  int temp = arr[i];
		  int index = i;
		  while(index<=i && arr[index-1]>temp){
			  arr[index]  = arr[index-1];
			  index++;
			  
		  }
		  arr[index] = temp;
				 
				  
			  }
			  
	  }
		  
	  
	  
	  static void display(int arr[],int size){
		  for(int i = 0;i<size;i++){
			  System.out.print(arr[i]+" ");
		  }
	  }
  
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   

   System.out.println("Enter the Size of array");
   int size = sc.nextInt();
  int a1[] = new int [size];
  System.out.println("Enter the elements in array");
  for(int i =0;i<a1.length;i++){
	  a1[i] = sc.nextInt();
  }
  
  sort(a1,size);
   
   
   }
  }