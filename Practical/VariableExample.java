class VariableExample{
	static int num=2555555;//static
    long num1=125555;//instance

public void display(){//nonstatic method
	char a='M';//local
    double num2=553554366;
	System.out.println("local variable value"+a);
	System.out.println("local variable value"+num2);

}
public static void calc(){
	int a=46;
	double b=56622.2;
	double c=a+b;
	System.out.println("Sum of numbers is "+c);
}

public static void main(String args[]){
	VariableExample obj=new VariableExample();
	obj.display();
	System.out.println("local variable value"+num);
	System.out.println("local variable value"+obj.num1);
	calc();
}
}

