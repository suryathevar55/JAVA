import java.util.Scanner;

class Multipleif{
	
	public void calc(int marks){
		
		if((marks >= 75)&&(marks <= 100)){
			System.out.println("Good! Keep it up");
		}
		else if((marks <= 74) && (marks >= 35)){
			System.out.println("Need to work hard!");
		}
		else if((marks <= 34) && (marks >= 0)){
			System.out.println("Failed!!!");
		}
		else{
			System.out.println("Wrong input");
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		
		Multipleif m = new Multipleif();
		m.calc(marks);
	}
}