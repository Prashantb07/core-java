class Dmart{

  static String fruits[] = { "apple" , "graypes" , "pineaplle" , "guva" , "dragon" ,"papaya" ,
  "orange" , "Water melon" , "plum" , "rasberry" };
  static String vegetabels[] = { "potato" , "tomato" , "beans" , "chilli" , "onion" , 
  "ginger" , "garlic" ,"cabage" , "sweet potato","cucumber"};
  static String chocolates[] =  {"Diry Milk" , " kit kat " , "alpenlibe" ,  "strawberry " , 
"5 star" , " Amul" , "nestle" ,"mars" , "Parle" , "Lotous"};
  static String biscuits[] = {"dark fantasy" , "parle G" , "sunfist" , "marie gold" , "Marie Light" , "Delicious" , " Seenkes" , "Butter Milk" ,
  "Butter Cookies" , "Brandy Span"};
  static String perfumes[] = {"Dolce & Gabbana" , " Mont Blanc" , "wild stone" , "Tommy Hilfiger" ," BRUT" ,"AD. Issey Miyake." ,
  "fogg" , "Dio" ,"villan" ,"SKINN"};
  static String clothes[] = { "Sweater" , "Shirt" , " Jeans" , " T-shirt" , "Suit" , "Gloves" , 
  " Cap" ,"Hawaiian shirt." , "Singlet", "Shorts"};
  static String groceries[] = {"Meat" ,"Pasta" , " oil" , "Bakery" , " Bread" ,"Fronze Foods" , "Dairy" , "Cheese" ,"Egg","Rice"};
  static String kitchenSet[] = { "Drinking Glass" , " Spoons" , "Mugs" , "Pans" , "pots" ,
  "Bowls" ,"Plates" ,"Fork" , "baking sheet" , "Kinfes"};
  static String shampoo[] = {"Head & Shoulder" , "Dove" , "Karthika" , "Clinic Puls" , " Wow" ,
  " Sunsilk" , "Vatika" , " Himalayan" , "Patanjali" ,"Treseme"};
  static String shoes[] = {"Ankel Boots" ," Army Boots" , "Aathelet Shoes" , "Ballet" , "Boat Shoes" ,"Boots" , "Casual Shoes" ,"Beach Shoes" , 
  "Brogues", "formal Shoes" } ;
  static String dryFruits[] = { "Pista" , "Apricot" , "Dates" , "Kaju" , "Badam" , "Kismis" ,
  " Akhrot. " , "Makhana" , "Beej" , "Dry FIgs" } ;
  static String cosmetics[] = {"Eye Liner" , "Lip Stick" , "Blusher" , "Moisturizer" , "Primer" , 
  "Kajal" , "Lip Balm" , "Nail Polish" , "Lip Gloss" ,
        "Eyebrow Pencile" } ;
		
		
		
		public static void getFruits(){
		 System.out.println("inside the getFruits method");
		 System.out.println(fruits.length);
		 for (int i=0 ; i<fruits.length ; i++){
		    System.out.println(fruits[i]);
		 }
		 System.out.println("getFruits method ended");
		
		}
		
		public static void getVegitabels(){
			System.out.println("inside the getVegitabels");
			System.out.println(vegetabels.length);
			for (int j = 0 ; j<vegetabels.length;j++){
		System.out.println(vegetabels[j]);}
		
			System.out.println("get vegetables method ended ");
			
		}
		
		public static void getChocolates(){
			System.out.println("insde the getChocolates");
			System.out.println(chocolates.length);
			for (int h = 0 ; h<chocolates.length ; h++){
			System.out.println(chocolates[h]);}
			
		
		System.out.println("getChocolates method is ended");}
		
		public static void getbiscuits(){
	      System.out.println("getbiscuits method started");
		  System.out.println(biscuits.length);
		  for (int s=0 ; s<biscuits.length; s++){
			  System.out.println(biscuits[s]);
		  }
			System.out.println("get Biscuits method ended");
			
			
		}
		
		
		public static void getPerfumes(){
			System.out.println("get perfumes method ended");
			System.out.println(perfumes.length);
			for (int y = 0 ; y<perfumes.length; y++){
				System.out.println(perfumes[y]);
			}
			System.out.println("get perfumes method ended");
		}
		
		public static void getClothes(){
			System.out.println("getclothes method started");
			System.out.println(clothes.length);
			for (int u = 0 ; u<clothes.length;u++){
				System.out.println(clothes[u]);
			}
			
			System.out.println("getclothes ended");
		}
		
		public static void getgroceries(){
			System.out.println("system.out.println");
			System.out.println(groceries.length);
			for (int r = 0 ; r<groceries.length; r++){
				System.out.println(groceries[r]);
			}
			System.out.println("getgroceries method ended");
			
			
		}
		public static void getkitchenset(){
			System.out.println("inside the getkitchenset method");
			System.out.println(kitchenSet.length);
			for (int e = 0 ; e<kitchenSet.length; e++){
				System.out.println(kitchenSet[e]);
				
			}
			System.out.println("getkitchenset method ended");
			
			
			
		}
		
		public static void getShampoo(){
			System.out.println("inside the getShampoo method");
			System.out.println(shampoo.length);
			for(int i = 0 ; i<shampoo.length ; i++){
				System.out.println(shampoo[i]);
				
			}
			
			System.out.println("get shampoo method ended");
			
			
			
		}
		
		public static void getShoes(){
			System.out.println("inside the getshooes method");
			System.out.println(shoes.length);
			for (int f = 0 ; f< shoes.length ; f++){
				System.out.println(shoes[f]);
			}
			System.out.println("inside the shoes metho ended");
		}
		
		
		
		public static void getdryfruits(){
			System.out.println("inside the get dry fruits method ");
			System.out.println(dryFruits.length);
			for(int d = 0 ; d<dryFruits.length; d++){
				System.out.println(dryFruits[d]);
			}
			System.out.println("get dryFruits method ended");
			
			
		}
		
		
		public static void getCosmetic(){
			System.out.println("getCosmetic method started");
			System.out.println(cosmetics.length);
			for (int q=0; q<cosmetics.length ; q++){
				System.out.println(cosmetics[q]);
			}
			System.out.println("getCosmetic method ended");
			
			
			
		}

		
	public static void main(String a[]){
	  System.out.println("inside the main method");
	   getFruits();
	   getVegitabels();
	   getChocolates();
	   getbiscuits();
	   getPerfumes();
	   getClothes();
	   getgroceries();
	   getkitchenset();
	   getShampoo();
	   getShoes();
	   getdryfruits();
	   getCosmetic();
	  System.out.println("main method ended");
	
	}
}