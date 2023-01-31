import java.util.Scanner;
class Iteration{
	public void calcTable(int num){
		for(int i=1;i<=20;i++){
			System.out.println(+ num +"x" + i +" = "+ (num*i));
		}
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		Iteration it=new Iteration();
		it.calcTable(num);
	}
}