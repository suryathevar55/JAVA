//Write a program to print an diamond star pattern using loop
/*  *
   ***
  *****
 *******
  *****
   ***
    *  */
class Diamond{ 
	
	public void display(){  
		int n=6;
		for(int i=1; i<=n; i++){   
			for(int k=n-i; k>=1; --k){  
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){  
				System.out.print("*");
			}
		System.out.println("");
		}
		for(int i=n-1; i>=1; --i){  
			for(int k=n-i; k>=1; --k){ 
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){   
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	public static void main(String args[]){ 
		Diamond obj = new Diamond(); 
		obj.display();  
	}
}