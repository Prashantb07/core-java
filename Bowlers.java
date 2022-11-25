class Bowlers{

  static String topBowlersInOdi [] = {"Rashid Khan" , "glenn McGrath" ,"Trent Boult" , "Mitchell Starc" ,"Shakib Al Hassan " ,
  "Shaun POllock" , "Jasprit Bumrah" , "kagiso Rabada" , "Ravindra Jadeja" , " Chris Woakes"};
  
  public static void odiBowlersList(){
  System.out.println("inside the odiBowlersList method");
  System.out.println(topBowlersInOdi.length);
  for (int w=0 ; w<topBowlersInOdi.length ; w++){
    System.out.println(topBowlersInOdi[w]);
  }
  System.out.println("odiBowlersList method ended");
  }
  
  
     public static void main (String a[]){
	 System.out.println("inside the main method");
	 odiBowlersList();
	 System.out.println("main method ended");}
}