class UnaryExample{
public void Increment(){
	int x=10;
	System.out.println(x++); //10
    System.out.println(x++);//11
    System.out.println(++x); //13
    System.out.println(x++); //13
    System.out.println(x);//14
}

public void Decrement(){
	int x=10;
	System.out.println("Decrement : ");
	System.out.println(x--);//10
	System.out.println(x--);//9
	System.out.println(--x);//7
	System.out.println(--x);//6
	System.out.println(x--);//6
	System.out.println(x);//5
}


public static void main(String args[]){
	UnaryExample Un =new UnaryExample();
    Un.Increment();
	Un.Decrement();
}
}