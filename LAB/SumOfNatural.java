
// Write a program to print even, odd, sum of natural number using for loop from 1-200
class SumOfNatural{ 
	
	public void display(){ 
		int sum=0;
		System.out.println("Even Number :");
		for(int i=1; i<=200 ; i++){  
			if(i%2==0){              //condition for even num
				System.out.print(" "+i);
			}
		}
		System.out.println("\nOdd Number :");
		for(int i=1; i<=200 ; i++){
			if(i%2!=0){             //condition for odd num
				System.out.print(" "+i);
			}
		}
		for(int i=1; i<=200 ; i++){
			sum +=i;              //sum of natural number
		}
		System.out.println("\nSum of Natural Number :"+ sum);
		
	}
	public static void main(String args[]){ 
		SumOfNatural obj = new SumOfNatural(); //create object
		obj.display(); 
	}
}