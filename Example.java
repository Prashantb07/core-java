class Example {

	public static void main (String a[]) {
	
	System.out.println("main started");
	
	//invoking a method / calling a method
	// arguments are 54 and 97
	multiply (54,97);
	
	//invoking a method
	multiply(95,6);
	
	
	System.out.println("main ended");
	
	
	}

	public static void multiply(int num,int num1){
	System.out.println("multiply started");
	
	System.out.println(num * num1);
	
	System.out.println("multiply ended");
	
	}


}