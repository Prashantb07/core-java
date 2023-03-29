package main.java.com.xworkz.demo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.com.xworkz.demo.config.SpringConfiguration;


public class Tester {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Person person = applicationContext.getBean("Person",Person.class);
		System.out.println(person);
		Person person1 = applicationContext.getBean("Person1",Person.class);
		System.out.println(person1);
		Person person2 = applicationContext.getBean("Person2",Person.class);
		System.out.println(person2);
		Person person3 = applicationContext.getBean("Person3",Person.class);
		System.out.println(person3);
		Person person4 = applicationContext.getBean("Person4",Person.class);
		System.out.println(person4);
		Person person5 = applicationContext.getBean("Person5",Person.class);
		System.out.println(person5);
		
		
		
		FoodStall stall = applicationContext.getBean("FoodStall",FoodStall.class);
		System.out.println(stall);
		FoodStall stall1 = applicationContext.getBean("FoodStall1",FoodStall.class);
		System.out.println(stall1);
		FoodStall stall2 = applicationContext.getBean("FoodStall2",FoodStall.class);
		System.out.println(stall2);
		FoodStall stall3 = applicationContext.getBean("FoodStall3",FoodStall.class);
		System.out.println(stall3);
		FoodStall stall4 = applicationContext.getBean("FoodStall4",FoodStall.class);
		System.out.println(stall4);
		FoodStall stall5 = applicationContext.getBean("FoodStall5",FoodStall.class);
		System.out.println(stall5);
		
		Glass gls = applicationContext.getBean("Glass",Glass.class);
		System.out.println(gls);
		Glass gls1 = applicationContext.getBean("Glass1",Glass.class);
		System.out.println(gls1);
		Glass gls2 = applicationContext.getBean("Glass2",Glass.class);
		System.out.println(gls2);
		Glass gls3 = applicationContext.getBean("Glass3",Glass.class);
		System.out.println(gls3);
		Glass gls4 = applicationContext.getBean("Glass4",Glass.class);
		System.out.println(gls4);
		Glass gls5 = applicationContext.getBean("Glass5",Glass.class);
		System.out.println(gls5);
		Glass gls6 = applicationContext.getBean("Glass6",Glass.class);
		System.out.println(gls6);
		
		Kitchen kct  = applicationContext.getBean("Kitchen",Kitchen.class);
		System.out.println(kct);
		Kitchen kct1 = applicationContext.getBean("Kitchen1",Kitchen.class);
		System.out.println(kct1);
		Kitchen kct2 = applicationContext.getBean("Kitchen2",Kitchen.class);
		System.out.println(kct2);
		Kitchen kct3  = applicationContext.getBean("Kitchen3",Kitchen.class);
		System.out.println(kct3);
		Kitchen kct4  = applicationContext.getBean("Kitchen4",Kitchen.class);
		System.out.println(kct4);
		
		
		
		
		Laptop lap = applicationContext.getBean("Laptop",Laptop.class);
		System.out.println(lap);
		Laptop lap1 = applicationContext.getBean("Laptop1",Laptop.class);
		System.out.println(lap1);
		Laptop lap2 = applicationContext.getBean("Laptop2",Laptop.class);
		System.out.println(lap2);
		Laptop lap3 = applicationContext.getBean("Laptop3",Laptop.class);
		System.out.println(lap3);
		Laptop lap4 = applicationContext.getBean("Laptop4",Laptop.class);
		System.out.println(lap4);
		Laptop lap5 = applicationContext.getBean("Laptop5",Laptop.class);
		System.out.println(lap5);
		Laptop lap6 = applicationContext.getBean("Laptop6",Laptop.class);
		System.out.println(lap6);


		
		Train tn = applicationContext.getBean("Train",Train.class);
		System.out.println(tn);
		Train tn1 = applicationContext.getBean("Train1",Train.class);
		System.out.println(tn1);
		Train tn2 = applicationContext.getBean("Train2",Train.class);
		System.out.println(tn2);
		Train tn3 = applicationContext.getBean("Train3",Train.class);
		System.out.println(tn3);
		Train tn4 = applicationContext.getBean("Train4",Train.class);
		System.out.println(tn4);
		Train tn5 = applicationContext.getBean("Train5",Train.class);
		System.out.println(tn5);
		Train tn6 = applicationContext.getBean("Train6",Train.class);
		System.out.println(tn6);
		
		Wire wr = applicationContext.getBean("Wire",Wire.class);
		System.out.println(wr);
		Wire wr1 = applicationContext.getBean("Wire1",Wire.class);
		System.out.println(wr1);
		Wire wr2 = applicationContext.getBean("Wire2",Wire.class);
		System.out.println(wr2);
		Wire wr3 = applicationContext.getBean("Wire3",Wire.class);
		System.out.println(wr3);
		Wire wr4 = applicationContext.getBean("Wire4",Wire.class);
		System.out.println(wr4);
		Wire wr5 = applicationContext.getBean("Wire5",Wire.class);
		System.out.println(wr5);
		Wire wr6 = applicationContext.getBean("Wire6",Wire.class);
		System.out.println(wr6);
		
		
		Integer nt = applicationContext.getBean("Integer",Integer.class);
		System.out.println(nt);
		Integer nt1 = applicationContext.getBean("Integer1",Integer.class);
		System.out.println(nt1);
		Integer nt2 = applicationContext.getBean("Integer2",Integer.class);
		System.out.println(nt2);
		Integer nt3 = applicationContext.getBean("Integer3",Integer.class);
		System.out.println(nt3);
		Integer nt4 = applicationContext.getBean("Integer4",Integer.class);
		System.out.println(nt4);
		Integer nt5 = applicationContext.getBean("Integer5",Integer.class);
		System.out.println(nt5);
		
		Scanner sc = applicationContext.getBean("Scanner",Scanner.class);
		System.out.println(sc);
		Scanner sc1 = applicationContext.getBean("Scanner1",Scanner.class);
		System.out.println(sc1);
		Scanner sc2 = applicationContext.getBean("Scanner2",Scanner.class);
		System.out.println(sc2);
		Scanner sc3 = applicationContext.getBean("Scanner3",Scanner.class);
		System.out.println(sc3);
		Scanner sc4 = applicationContext.getBean("Scanner4",Scanner.class);
		System.out.println(sc4);
		Scanner sc5 = applicationContext.getBean("Scanner5",Scanner.class);
		System.out.println(sc5);
		
		
		String str = applicationContext.getBean("String",String.class);
		System.out.println(str);
		String str1 = applicationContext.getBean("String1",String.class);
		System.out.println(str1);
		String str2 = applicationContext.getBean("String2",String.class);
		System.out.println(str2);
		String str3 = applicationContext.getBean("String3",String.class);
		System.out.println(str3);
		String str4 = applicationContext.getBean("String4",String.class);
		System.out.println(str4);
		String str5 = applicationContext.getBean("String5",String.class);
		System.out.println(str5);
		
		
		Character ctr = applicationContext.getBean("Character",Character.class);
		System.out.println(ctr);
		Character ctr1 = applicationContext.getBean("Character1",Character.class);
		System.out.println(ctr1);
		Character ctr2 = applicationContext.getBean("Character2",Character.class);
		System.out.println(ctr2);
		Character ctr3 = applicationContext.getBean("Character3",Character.class);
		System.out.println(ctr3);
		Character ctr4 = applicationContext.getBean("Character4",Character.class);
		System.out.println(ctr4);
		Character ctr5 = applicationContext.getBean("Character5",Character.class);
		System.out.println(ctr5);
		
		Short sort = applicationContext.getBean("Short",Short.class);
		System.out.println(sort);
		Short sort1 = applicationContext.getBean("Short1",Short.class);
		System.out.println(sort1);
		Short sort2 = applicationContext.getBean("Short2",Short.class);
		System.out.println(sort2);
		Short sort3 = applicationContext.getBean("Short3",Short.class);
		System.out.println(sort3);
		Short sort4 = applicationContext.getBean("Short4",Short.class);
		System.out.println(sort4);
		Short sort5 = applicationContext.getBean("Short5",Short.class);
		System.out.println(sort5);
		
		Long lng = applicationContext.getBean("Long",Long.class);
		System.out.println(lng);
		Long lng1 = applicationContext.getBean("Long1",Long.class);
		System.out.println(lng1);
		Long lng2 = applicationContext.getBean("Long2",Long.class);
		System.out.println(lng2);
		Long lng3 = applicationContext.getBean("Long3",Long.class);
		System.out.println(lng3);
		Long lng4 = applicationContext.getBean("Long4",Long.class);
		System.out.println(lng4);
		Long lng5 = applicationContext.getBean("Long5",Long.class);
		System.out.println(lng5);
		
		Boolean blen = applicationContext.getBean("Boolean",Boolean.class);
		System.out.println(blen);
		Boolean blen1 = applicationContext.getBean("Boolean1",Boolean.class);
		System.out.println(blen1);
		Boolean blen2 = applicationContext.getBean("Boolean2",Boolean.class);
		System.out.println(blen2);
		Boolean blen3 = applicationContext.getBean("Boolean3",Boolean.class);
		System.out.println(blen3);
		Boolean blen4 = applicationContext.getBean("Boolean4",Boolean.class);
		System.out.println(blen4);
		Boolean blen5 = applicationContext.getBean("Boolean5",Boolean.class);
		System.out.println(blen5);
		
		Float flt = applicationContext.getBean("Float",Float.class);
		System.out.println(flt);
		Float flt1 = applicationContext.getBean("Float1",Float.class);
		System.out.println(flt1);
		Float flt2 = applicationContext.getBean("Float2",Float.class);
		System.out.println(flt2);
		Float flt3 = applicationContext.getBean("Float3",Float.class);
		System.out.println(flt3);
		Float flt4 = applicationContext.getBean("Float4",Float.class);
		System.out.println(flt4);
		Float flt5 = applicationContext.getBean("Float5",Float.class);
		System.out.println(flt5);
		
		
		
		Double dubl = applicationContext.getBean("Double",Double.class);
		System.out.println(dubl);
		Double dubl1 = applicationContext.getBean("Double2",Double.class);
		System.out.println(dubl1);
		Double dubl2 = applicationContext.getBean("Double2",Double.class);
		System.out.println(dubl2);
		Double dubl3 = applicationContext.getBean("Double3",Double.class);
		System.out.println(dubl3);
		Double dubl4 = applicationContext.getBean("Double4",Double.class);
		System.out.println(dubl4);
		Double dubl5 = applicationContext.getBean("Double5",Double.class);
		System.out.println(dubl5);
			}
 
}
