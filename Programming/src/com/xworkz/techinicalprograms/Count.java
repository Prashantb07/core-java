package com.xworkz.techinicalprograms;

public class Count extends Object {

	public static void main(String[] args) {
     
		int evenCount=0, oddCount=0;
		for(int i=0;i<100;i++) {
			if(i%2 == 0) {
				evenCount+=1; //evenCount=evenCount+1;
			} else {
				oddCount+=1;
			}
		}
		 System.out.println("even count:" +evenCount);
		 System.out.println("odd count:" +oddCount);
	}

}
