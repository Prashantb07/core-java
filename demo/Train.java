package main.java.com.xworkz.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data

public class Train {

	private int id;
	private String train_name;
	private String Source_city;
	private String Destination_city;
	private int ticket_price;
	
}
