package com_xworkz_airport.airportapp.terminal;

public class Terminal {

	
	public String terminalID;
	public String terminalName;
	public String city;
	public int noOfTerminals;
		public Terminal(String terminalID,String terminalName,String city,int noOfTerminals) {
			this.terminalID=terminalID;
			this.terminalName=terminalName;
			this.city=city;
			this.noOfTerminals=noOfTerminals;
		}
}
