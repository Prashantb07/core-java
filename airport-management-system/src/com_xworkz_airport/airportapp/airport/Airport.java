package com_xworkz_airport.airportapp.airport;

import com_xworkz_airport.airportapp.terminal.Terminal;

public class Airport {

	Terminal terminal[] =new Terminal[1];
	int i;
		public Airport() {
			
		}
			public String trip(Terminal terminal) {
				if(terminal.terminalID != null) {
					this.terminal[i++]=terminal;
					
				}
		return "abcd";	}
				public void getdisplay() {
					for(int i=0;i<terminal.length;i++) {
						System.out.println(terminal[i].terminalID+"-"+terminal[i].terminalName+"-"+terminal[i].city+"-"+terminal[i].noOfTerminals);
						
					}
				}
}
