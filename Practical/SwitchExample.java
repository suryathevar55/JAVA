import java.util.Scanner;

class SwitchExample{
	public void calc_grade(String grade){
		switch(grade){
		case "A":
		System.out.println("Marks between 90-100");
		break;
		
		case "B":
		System.out.println("Marks between 80-90");
		break;
		
		case "C":
		System.out.println("Marks between 60-80");
		break;
		
		case "D":
		System.out.println("Marks between 50-60");
		break;
		
		case "E":
		System.out.println("Marks between 35-50");
		break;
		
		case "F":
		System.out.println("Failed marks below 35");
		break;
		}
    }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter grade: ");
		String grade=sc.next();
		grade=grade.toUpperCase();
		SwitchExample se=new SwitchExample();
		se.calc_grade(grade);
	}

}