/*public class Test{
    public static void main(String[]args){
        int secretNumber = 1 + (int)(Math.random()*1000);
        StdOut.println("im thinking if a number between 1 and 1,000");
        int guess = 0;
        
        while(guess!= secretNumber){
            StdOut.print("whats your Guess");
            guess = StdIn.readInt();
            if(guess == secretNumber){
                StdOut.println("You Win!");
            
            }
        }
    }
}*/
//To Set the Scale
//StdDraw.setXscale(0,n);
//StdDraw.setYscale(0,n);

//StdDraw.line (0.0, 0.0, 1.0, 0.0);
//              x   y     x     y
// for the first couple of points

//To Change Color
//StdDraw.setPenColor(StdDraw.WHITE);

public class Test{
    public static void main(String[] args){
        // read data into an array for integers  
        // Can use for
        /*
        int[] intArray = StdIn.readAllInts();
        for (int i = 0; i < intArray.length; i++){
            StdOut.println(intArray[i]);

        }
        StdOut.println("The fourth item was " + intArray[3]);
        */
        StdDraw.square(.5,.5,.2);
    }

}