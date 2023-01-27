class ArithmeticOperator{
	public void add(){
		int a=456;
		int b=589;
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction "+(a-b));
		System.out.println("Multiplication "+(a*b));
		System.out.println("Division "+(a/b));
		System.out.println("Modulus  "+(a%b));
	}
	
	public static void main(String args[]){
		ArithmeticOperator Ao=new ArithmeticOperator();
		Ao.add();
	}

}