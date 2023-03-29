package main.java.com.xworkz.demo.config;


import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.com.xworkz.demo.FoodStall;
import main.java.com.xworkz.demo.Glass;
import main.java.com.xworkz.demo.Kitchen;
import main.java.com.xworkz.demo.Laptop;
import main.java.com.xworkz.demo.Person;
import main.java.com.xworkz.demo.Train;
import main.java.com.xworkz.demo.Wire;

@Configuration
public class SpringConfiguration {

	@Bean(name = "Person")
	public Person getPerson() {
		Person person = new Person();
		
		person.setId(1);
		person.setName("Manju");
		person.setAge(35);
		
		return person;
	}
	
	@Bean(name = "Person1")
	public Person getPerson1() {
		Person person = new Person();
		person.setAge(23);
		person.setName("Prashant");
		person.setId(2);
		return person;
	}
	
	@Bean(name = "Person2")
	public Person getPerson2() {
		Person person = new Person();
		person.setAge(32);
		person.setName("Vithal");
		person.setId(3);
		return person;
	}
	
	@Bean(name = "Person3")
	public Person getPerson3() {
		Person person = new Person();
		person.setAge(24);
		person.setName("Abhi");
		person.setId(3);
		return person;
	}
	
	@Bean(name = "Person4")
	public Person getPerson4() {
		Person person = new Person();
		person.setAge(25);
		person.setName("Omkar");
		person.setId(4);
		return person;
	}
	
	@Bean(name = "Person5")
	public Person getPerson5() {
		Person person = new Person();
		person.setAge(26);
		person.setName("Shiva");
		person.setId(5);
		return person;
	}




	

	
	@Bean(name = "FoodStall")
	public FoodStall getFoodStall() {
		
		FoodStall stall = new FoodStall();
		
		stall.setId(1);
		stall.setFood_name("panipuri");
		stall.setLocation("VVPuram");
		return stall;		
	}
	
	@Bean(name = "FoodStall1")
	public FoodStall getFoodStall1() {
		
		FoodStall stall = new FoodStall();
		
		stall.setId(2);
		stall.setFood_name("malbar biriyani");
		stall.setLocation("hennu cross");
		return stall;		
	}
	
	@Bean(name = "FoodStall2")
	public FoodStall getFoodStall2() {
		
		FoodStall stall = new FoodStall();
		
		stall.setId(3);
		stall.setFood_name("CTR Dosa");
		stall.setLocation("Malleshwarm");
		return stall;		
	}
	
	@Bean(name = "FoodStall3")
	public FoodStall getFoodStall3() {
		
		FoodStall stall = new FoodStall();
		
		stall.setId(4);
		stall.setFood_name("Donne briryani");
		stall.setLocation("Yelanaka");
		return stall;		
	}
	
	@Bean(name = "FoodStall4")
	public FoodStall getFoodStall4() {
		
		FoodStall stall = new FoodStall();
		
		stall.setId(5);
		stall.setFood_name("manni's biriyani");
		stall.setLocation("Hoskote");
		return stall;		
	}
	
	@Bean(name = "FoodStall5")
	public FoodStall getFoodStall5() {
		
		FoodStall stall = new FoodStall();
		
		stall.setId(6);
		stall.setFood_name("Meghana's biriyani");
		stall.setLocation("Btm layout");
		return stall;		
	}
	
	@Bean(name = "Glass")
	public Glass getGlass() {
		
		Glass gs = new Glass();
		
		gs.setId(1);
		gs.setName("Laminated glass");
		gs.setPrice(200);
		return gs;
	}
	
	@Bean(name = "Glass1")
	public Glass getGlass1() {
		
		Glass gs = new Glass();
		
		gs.setId(2);
		gs.setName("Tempered glass");
		gs.setPrice(150);
		return gs;
	}
	@Bean(name = "Glass2")
	public Glass getGlass2() {
		
		Glass gs = new Glass();
		
		gs.setId(3);
		gs.setName("silica glass");
		gs.setPrice(900);
		return gs;
	}
	
	@Bean(name = "Glass3")
	public Glass getGlass3() {
		
		Glass gs = new Glass();
		
		gs.setId(4);
		gs.setName("Annealed glass");
		gs.setPrice(440);
		return gs;
	}
	
	@Bean(name = "Glass4")
	public Glass getGlass4() {
		
		Glass gs = new Glass();
		
		gs.setId(5);
		gs.setName("Lead glass");
		gs.setPrice(790);
		return gs;
	}
	
	@Bean(name = "Glass5")
	public Glass getGlass5() {
		
		Glass gs = new Glass();
		
		gs.setId(6);
		gs.setName("Toughened glass");
		gs.setPrice(320);
		return gs;
	}
	
	@Bean(name = "Glass6")
	public Glass getGlass6() {
		
		Glass gs = new Glass();
		
		gs.setId(7);
		gs.setName("lime glass");
		gs.setPrice(765);
		return gs;
	}
	
	@Bean(name = "Kitchen")
	public Kitchen  getKitchen() {	
	Kitchen kt = new Kitchen();
	kt.setId(1);
	kt.setType("Gallery Kitchen");
	kt.setItem("Knife");
	return kt;
	}
	
	@Bean(name = "Kitchen1")
	public Kitchen  getKitchen2() {	
	Kitchen kt = new Kitchen();
	kt.setId(2);
	kt.setType("L-shaped Kitchen");
	kt.setItem("Spice Grinder");
	return kt;
	}
	
	@Bean(name = "Kitchen2")
	public Kitchen  getKitchen3() {	
	Kitchen kt = new Kitchen();
	
	kt.setId(3);
	kt.setType("U-shaped Kitchen");
	kt.setItem("Micro Oven");
	return kt;
	}
	
	@Bean(name = "Kitchen3")
	public Kitchen  getKitchen4() {	
	Kitchen kt = new Kitchen();
	
	kt.setId(4);
	kt.setType("Island Kitchen");
	kt.setItem("Plate");
	return kt;
	}
	@Bean(name = "Kitchen4")
	public Kitchen  getKitchen5() {	
	Kitchen kt = new Kitchen();
	
	kt.setId(5);
	kt.setType("Island Kitchen");
	kt.setItem("Spoon");
	return kt;
	}
	
	@Bean(name = "Laptop")
	public Laptop getLaptop() {
		Laptop lp = new Laptop();
		
		lp.setId(1);
		lp.setLaptop_name("ThinkPad");
		lp.setBrand("Lenovo");
		lp.setPrice(45000);
		return lp;
	}
	
	@Bean(name = "Laptop1")
	public Laptop getLaptop1() {
		Laptop lp = new Laptop();
		
		lp.setId(2);
		lp.setLaptop_name("ThinkPad");
		lp.setBrand("Lenovo");
		lp.setPrice(45000);
		return lp;
	}
	
	@Bean(name = "Laptop2")
	public Laptop getLaptop2() {
		Laptop lp = new Laptop();
		
		lp.setId(3);
		lp.setLaptop_name("Hp");
		lp.setBrand("HP");
		lp.setPrice(35000);
		return lp;
	}
	
	@Bean(name = "Laptop3")
	public Laptop getLaptop3() {
		Laptop lp = new Laptop();
		
		lp.setId(4);
		lp.setLaptop_name("Dell");
		lp.setBrand("Dell");
		lp.setPrice(55000);
		return lp;
	}
	
	@Bean(name = "Laptop4")
	public Laptop getLaptop4() {
		Laptop lp = new Laptop();
		
		lp.setId(5);
		lp.setLaptop_name("VivoBook");
		lp.setBrand("ASUS");
		lp.setPrice(75000);
		return lp;
	}
	
	@Bean(name = "Laptop5")
	public Laptop getLaptop5() {
		Laptop lp = new Laptop();
		
		lp.setId(6);
		lp.setLaptop_name("Acer");
		lp.setBrand("Acer");
		lp.setPrice(60000);
		return lp;
	}
	
	@Bean(name = "Laptop6")
	public Laptop getLaptop6() {
		Laptop lp = new Laptop();
		
		lp.setId(7);
		lp.setLaptop_name("MacBook");
		lp.setBrand("Apple");
		lp.setPrice(145000);
		return lp;
	}
	
	
	@Bean(name = "Train")
	public Train getTrain() {	
		Train trn = new Train();
		trn.setId(9);
		trn.setTrain_name("Karwar Express");
		trn.setSource_city("Bangalore");
		trn.setDestination_city("Darmasthala");
		trn.setTicket_price(840);
		
		return trn;	
	}
	
	@Bean(name = "Train1")
	public Train getTrain1() {	
		Train trn = new Train();
		trn.setId(1);
		trn.setTrain_name("Golgumbaz Express");
		trn.setSource_city("Bangalore");
		trn.setDestination_city("Bagalkot");
		trn.setTicket_price(840);
		
		return trn;	
	}
	
	@Bean(name = "Train2")
	public Train getTrain2() {	
		Train trn = new Train();
		trn.setId(2);
		trn.setTrain_name("Rani Chennamma Express");
		trn.setSource_city("Bangalore");
		trn.setDestination_city("Hubli");
		trn.setTicket_price(600);
		
		return trn;	
	}
	
	@Bean(name = "Train3")
	public Train getTrain3() {	
		Train trn = new Train();
		trn.setId(3);
		trn.setTrain_name("Kannur Express");
		trn.setSource_city("Bangalore");
		trn.setDestination_city("Mangalore");
		trn.setTicket_price(300);
		
		return trn;	
	}
	
	@Bean(name = "Train4")
	public Train getTrain4() {	
		Train trn = new Train();
		trn.setId(4);
		trn.setTrain_name("Vasco da Gama Express");
		trn.setSource_city("Bangalore");
		trn.setDestination_city("Goa");
		trn.setTicket_price(800);
		
		return trn;	
	}
	
	@Bean(name = "Train5")
	public Train getTrain5() {	
		Train trn = new Train();
		trn.setId(9);
		trn.setTrain_name("Kannur Express");
		trn.setSource_city("Bangalore");
		trn.setDestination_city("Udapi");
		trn.setTicket_price(700);
		
		return trn;	
	}
	
	@Bean(name = "Train6")
	public Train getTrain6() {	
		Train trn = new Train();
		trn.setId(5);
		trn.setTrain_name("Mangalore Express");
		trn.setSource_city("Bangalore");
		trn.setDestination_city("Kukke");
		trn.setTicket_price(900);
		
		return trn;	
	}
	
	
	@Bean(name = "Wire")
	public Wire getWire() {
		Wire wre = new Wire();
		wre.setId(1);
		wre.setBrand("Havells");
		wre.setPrice(1400);
		
		return wre;
		}
	
	@Bean(name = "Wire1")
	public Wire getWire1() {
		Wire wre = new Wire();
		wre.setId(2);
		wre.setBrand("Finolex");
		wre.setPrice(1400);
		
		return wre;
		}
	
	@Bean(name = "Wire2")
	public Wire getWire2() {
		Wire wre = new Wire();
		wre.setId(3);
		wre.setBrand("Polycab");
		wre.setPrice(3000);
		
		return wre;
		}
	
	@Bean(name = "Wire3")
	public Wire getWire3() {
		Wire wre = new Wire();
		wre.setId(4);
		wre.setBrand("V-Guard");
		wre.setPrice(4000);
		
		return wre;
		}
	
	@Bean(name = "Wire4")
	public Wire getWire4() {
		Wire wre = new Wire();
		wre.setId(5);
		wre.setBrand("Sterlite cables");
		wre.setPrice(3500);
		
		return wre;
		}
	
	@Bean(name = "Wire5")
	public Wire getWire5() {
		Wire wre = new Wire();
		wre.setId(6);
		wre.setBrand("KEI");
		wre.setPrice(2400);
		
		return wre;
		}
	
	@Bean(name = "Wire6")
	public Wire getWire6() {
		Wire wre = new Wire();
		wre.setId(7);
		wre.setBrand("Uniflex");
		wre.setPrice(1900);
		
		return wre;
		}
	
	@Bean(name = "Integer")
	public Integer getInteger() {
		return 123;
	}
	@Bean(name = "Integer1")
	public Integer getInteger1() {
		return 456;
	}
	@Bean(name = "Integer2")
	public Integer getInteger2() {
		return 789;
	}
	@Bean(name = "Integer3")
	public Integer getInteger3() {
		return 198;
	}
	@Bean(name = "Integer4")
	public Integer getInteger4() {
		return 765;
	}
	@Bean(name = "Integer5")
	public Integer getInteger5() {
		return 432;
	}


@Bean(name = "Scanner")
public Scanner getScanner() {
	return new Scanner(System.in);
}

@Bean(name = "Scanner1")
public Scanner getScanner1() {
	return new Scanner(System.in);
}

@Bean(name = "Scanner2")
public Scanner getScanner2() {
	return new Scanner(System.in);
}

@Bean(name = "Scanner3")
public Scanner getScanner3() {
	return new Scanner(System.in);
}

@Bean(name = "Scanner4")
public Scanner getScanner4() {
	return new Scanner(System.in);
}

@Bean(name = "Scanner5")
public Scanner getScanner5() {
	return new Scanner(System.in);
}

@Bean(name = "String")
public String getString() {
	return "Prashant";
}
@Bean(name = "String1")
public String getString1() {
	return "Vithal";
}
@Bean(name = "String2")
public String getString2() {
	return "Abhi";
}
@Bean(name = "String3")
public String getString3() {
	return "Chida";
}
@Bean(name = "String4")
public String getString4() {
	return "Puni";
}
@Bean(name = "String5")
public String getString5() {
	return "Kiran";
}

@Bean(name = "Character")
public Character getCharacter() {
	return 'P';
}
@Bean(name = "Character1")
public Character getCharacter1() {
	return 'V';
}
@Bean(name = "Character2")
public Character getCharacter2() {
	return 'A';
}
@Bean(name = "Character3")
public Character getCharacter3() {
	return 'C';
}
@Bean(name = "Character4")
public Character getCharacter4() {
	return 'P';
}
@Bean(name = "Character5")
public Character getCharacter5() {
	return 'K';
}

@Bean(name = "Short")
public Short getShort() {
	return 2;
}
@Bean(name = "Short1")
public Short getShort1() {
	return 4;
}
@Bean(name = "Short2")
public Short getShort2() {
	return 6;
}
@Bean(name = "Short3")
public Short getShort3() {
	return 8;
}
@Bean(name = "Short4")
public Short getShort4() {
	return 10;
}
@Bean(name = "Short5")
public Short getShort5() {
	return 12;
}
	
@Bean(name = "Long")
public Long getLong() {
	return 7406050101l;
}
@Bean(name = "Long1")
public Long getLong1() {
	return 7338059822l;
}
@Bean(name = "Long2")
public Long getLong2() {
	return 8088565885l;
}
@Bean(name = "Long3")
public Long getLong3() {
	return 7795390544l;
}
@Bean(name = "Long4")
public Long getLong4() {
	return 9036240718l;
}
@Bean(name = "Long5")
public Long getLong5() {
	return 8482824432l;
}

@Bean(name = "Boolean")
public Boolean getBoolean() {
	return true;
}
@Bean(name = "Boolean1")
public Boolean getBoolean1() {
	return false;
}

@Bean(name = "Boolean2")
public Boolean getBoolean2() {
	return true;
}

@Bean(name = "Boolean3")
public Boolean getBoolean3() {
	return false;
}

@Bean(name = "Boolean4")
public Boolean getBoolean4() {
	return true;
}

@Bean(name = "Boolean5")
public Boolean getBoolean5() {
	return false;
}


@Bean(name = "Float")
public Float getFloat() {
	return 1.00f;
}
@Bean(name = "Float1")
public Float getFloat1() {
	return 2.02f;
}
@Bean(name = "Float2")
public Float getFloat2() {
	return 3.03f;
}
@Bean(name = "Float3")
public Float getFloat3() {
	return 4.00f;
}
@Bean(name = "Float4")
public Float getFloat4() {
	return 5.50f;
}
@Bean(name = "Float5")
public Float getFloat5() {
	return 6.90f;
}

@Bean(name = "Double")
public Double getDouble() {
	return 100.09;
}
@Bean(name = "Double1")
public Double getDouble1() {
	return 300.23;
}
@Bean(name = "Double2")
public Double getDouble2() {
	return 600.34;
}
@Bean(name = "Double3")
public Double getDouble3() {
	return 900.87;
}
@Bean(name = "Double4")
public Double getDouble4() {
	return 1200.69;
}
@Bean(name = "Double5")
public Double getDouble5() {
	return 1500.99;
}

}
//bean can be used for both .class(String) / .java()