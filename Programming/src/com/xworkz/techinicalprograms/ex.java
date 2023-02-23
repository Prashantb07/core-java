package com.xworkz.techinicalprograms;

public class ex {
	public static void remove (int num)

	{
		int sum=0;
//		while(num>0)
//		{
			while(num>0)
			{
				sum=sum+num%10;
				num=num/10;
				
			}
			if(sum<10)
			{
				System.out.println(sum);
//				/break;
				
			}
			else
			
			{
				num=sum;
				sum=0;
			}
			
		}
//	}
	public static void main(String[] args) {
remove(301);
remove(9355);
remove(30571);
				
		}
	}


