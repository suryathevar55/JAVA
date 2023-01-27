class LogicalOperator{
	
	public void Logical(){
		int a=2;
		int b=6;
		int c=4;
	    System.out.println(a>b && a<c);
		System.out.println(a>b || a<c);
		System.out.println(a>b && a<c);
		if ((a>b) & (a<c)){
			System.out.println("C has the biggest value");
		}
		else{
			System.out.println("C don't have biggest value");
		}
	}
	
	public void Comparision(){
		int a=69;
		int b=72;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	
	public static void main(String args[]){
		LogicalOperator Log=new LogicalOperator();
		Log.Logical();
		Log.Comparision();
	}
}