package technicalprograms;

public class TwoDimentionalArray {

	public static void main(String[] args) {
	
		int twod[][]= {{12,54,85,96,4,7},{66,32,28,74,10,5,8}};
		//int array[][]=new int[3][5];
		
		for(int i=0;i<twod.length ;i++){
			System.out.println("length of first array" + twod[i].length);
		for(int j=0;j<6;j++){
			System.out.println(twod[i][j]);
		}
		}
	}

}

