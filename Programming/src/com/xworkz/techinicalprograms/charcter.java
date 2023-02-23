package com.xworkz.techinicalprograms;

public class charcter {
	public static void prime( char[] num)
	{ 
	int count1=0;
	for(int i=0;i<=num.length-1;i++)
	{
		int count=0;
		int x=num[i]-48;
		for(int j=2;j<=x-1;j++)
		{
			if(x%j==0)
			{
				count++;

			}
		}
		if(count==0)
		{
			//			System.out.println(" prime");
			count1++;
			System.out.println(num[i]);
		}

	}

	System.out.println(count1);
	}

	//		System.out.println(count1);




	public static void main(String[] args) {
		System.out.println("java");
		System.out.println("hello");
		//	prime(3);
		//	prime(15);
		//	int []num= {23,45,13,344,222,2,3,4,5,6,7,123,906,334,711};
		char[]num= { '1','2','3','4','5','6','7','8','9'};
		prime(num);
	}
}
