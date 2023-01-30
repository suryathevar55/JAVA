import java.util.Scanner;
class whileExample{
	public void Cond(int x){
		while(x>0){
			if(x%2==0){
				System.out.println("It is divisible by 2");
				break;
		}
		else{
			System.out.println("It is not divisible by 2");
			break;
		}
		
	}
	}
	
	public static void main(String args[]){
		Scanner sc =new Scanner();
		System.out.println("Enter the number: ");
		int x=nextInt();
		whileExample Condition =new whileExample();
		Condition.Cond(x);
	}
}