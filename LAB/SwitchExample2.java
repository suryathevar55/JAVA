import java.util.Scanner;

class SwitchExample2{
	public void calc(int num1,int num2,String choice){
		int c;
		int a=num1;
		int b=num2;
		
		switch(choice){
		
		case "1":
		c=a+b;
		System.out.println("Sum is "+c);
		break;
		
		case "2":
		c=a-b;
		System.out.println("Difference is "+c);
		break;
		
		case "3":
		c=a*b;
		System.out.println("Product is "+c);
		break;
		
		case "4":
		c=a/b;
		System.out.println("Division is "+c);
		break;
		
	
		}
    }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("********************************************");
		System.out.println("Select the operation to perform (eg: 1 for Addition): ");
		System.out.println("1 for Addition");
		System.out.println("2 for Difference");
		System.out.println("3 for Product");
		System.out.println("4 for Division");
		System.out.println("Enter the choice: ");
		String choice=sc.next();
		SwitchExample2 se=new SwitchExample2();
		se.calc(num1,num2,choice);
	}

}