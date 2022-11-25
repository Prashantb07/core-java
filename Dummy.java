class Dummy {

	static int size[] = {123,456,654,678,876};
	
	// index always return reference(variable) of a particular(specific) type
	
	public static void main (String args[]) {
	
	for (int i= 0 ; i < size.length ; i++) {
		// reference
	  int data  = size[i] ;
	  System.out.println(data);
	}
	
	
	}

}