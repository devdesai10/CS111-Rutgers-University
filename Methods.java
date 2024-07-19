public class MethodsStu{

	public static void main(String[] args){
		



		//System.out.println(isPower3(9) + "=?true");
		//System.out.println(isPower3(7) + "=?false");
// printTable test
		//printTable(5);

		/* 
		output shoud be:
			1   2   3   4   5
			2   4   6   8  	10
			3   6   9  	12 	15
			4   8  	12 	16 	20
			5  	10 	15 	20 	25
		*/

		//GCF 
		//System.out.println(gcf(18,24)); //should output 6
		// Now in a separate program called SimplifyFraction.java, take 2 numbers as input from 
		// the user (numerator and denominator) via the StdIn, and use the method you just wrote
		// to simply the fraction and output it. Ex: numerator = 9, denominator = 12; output: “3/4”
		
		// ------------------------------------------------------------------------------------------

		// isPrime 
		//System.out.println(isPrime(8)); //should output false
		//System.out.println(isPrime(13)); //should output true


	}

	//METHODS HERE


	//public static double avg(double a, double b){
	//}

	//public static String name(String firstName, String lastName){
	//}

	//public static int add(int a, int b, int c){
	//		return a + b + c;
	//}

	/*public static boolean isPower3(int num){
		if(num == 0)return false;
		while( num != 1){
		if(n%3 !=0) return false;
		n= n/3;

		}
	return true;
	}*/

	public static void printTable(int a){
		for(int r=1; r<=a; r++){
			for(int c=1; c<=a; c++){
				System.out.print(r*c +"\t"); // "\t" is a tab
											//  "\n" is a new line
			}
			System.out.println();
		}
	}

}

