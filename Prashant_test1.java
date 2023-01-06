Explain:
1).
	1.public static void main(String args[])

public is access specifier -> it is use to call JVM
static is a keywork -> it is use to call class name without creating a object class
void is a Return type -> It doest not return value 
main is a method name -> it is used to call JVM
String is a String of the class 
args[] is a array of String object 

it is mainly used to execute the Program


	2.class and object

Anything which is present in the real world and physically existing can be termed as an Object i s called object.

Class is the Blue print of the project and Class also act datatype.


	3.JVM,JRE,JDK

JVM -> Java virtual machine provide run time enivorment to excute the program

JRE -> Java runtime enivorment it is combination of JVM and set of librabies

JDK -> Java Developement Kit is combination of Java Runtime enivorment and librabies files



4). Explain the Constructor and it's Types?

-> Constructor is a special type of method default it is use to intilize object
	in Constructor two types 
	1.Default Constructor -> this constructor doesnot contain any parameter list is Known as default constructor
		example:- class Airport(){
			//defaultconstructor	
			}
	
	2.Parameterized Constructor -> in this which contain Paramerter list is known as parameterized Constructor.
			example:- class Airport(){
					public Airport(String name, int platfornNo){
					}
				} 


5). Difference b/w this keyword and this() ?

->  this Keyword is used in install server




7). Write a program to get the number from 1 to 100 which is multiplies of 5 and 10?

	
11). Write a program to find the length of the array is present in an given array?
	input: [12,3,2,45,6,7,6]
->Program
		public class Length {
	

		public static void main(String args[]){
		int num[]={12,3,2,45,6,7,6};
		
		System.out.println("Length of the array:"+num.length);
		}
		}
	OutPut:- 7

2). write a reverse program ?
	input :- 1234

->ans:	class ReverseString {
	public static void main(String args[]){
																																			
	int num[]={1,2,3,4};
	for(int i=num.length-1;i>=0;i--){
	System.out.println(num[i]);
			}
		}
	}

output:-4321



3). Write a program to reverse a given String?
	input:- Program



ans:- class ReverseProgram {
		public static void main(String args[]){

		String name = "Program";
		char ch[] =name.toCharArray();

		for (int i=ch.length-1;i>=0;i--){
		System.out.println(ch[i]);
			}
		}
		}

	Output:- margorP