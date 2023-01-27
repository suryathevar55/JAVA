class ConditionalOperator{
	
	public void Cond(){
		int a=2;
		int b=6;
		int c=4;
	    
		if ((a>b) & (a<c)){
			System.out.println("C has the biggest value");
		}
		else{
			System.out.println("C don't have biggest value");
		}
	}
	
	
	
	public static void main(String args[]){
		ConditionalOperator Log=new ConditionalOperator();
		Log.Cond();
	}
}