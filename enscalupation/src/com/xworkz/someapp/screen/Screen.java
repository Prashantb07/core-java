package com.xworkz.someapp.screen;

public class Screen extends Object{

	private String screenName;
	private String screenType;
	private int sizee;
	public Screen(String screenName , String screenType , int sizee ) {
		this.screenName= screenName;
		this.screenType= screenType;
		this.sizee= sizee;
		
	}

 public Screen() {
	 
 }
	
 public void setScreenName(String screenName) {
	 this.screenName = screenName;
 }
	public String getScreenName() {
		return screenName;
	}
 

	 public void setScreenType(String screenType) {
		 this.screenType = screenType;
	 }
		public String getScreenType() {
			return screenType;
		} 
		
		
		 public void setSizee(int sizee) {
			 this.sizee = sizee;
		 }
			public int getSizee() {
				return sizee;
			}
		
		
}
