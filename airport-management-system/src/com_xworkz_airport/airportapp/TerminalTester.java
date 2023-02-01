package com_xworkz_airport.airportapp;

import com_xworkz_airport.airportapp.terminal.Terminal;

public class TerminalTester {

	public static void main(String[] args) {
		//Airport airport =new Airport();
		KIA kia = new KIA();
		Terminal terminal =new Terminal("ter 1","xyz","bagalkot",5);
		kia.trip(terminal);
		kia.getdisplay();
	}
	
	
	
}
