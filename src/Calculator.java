public class Calculator {
    // this method for subtraction

    public static void subtraction (int i , int j, int d){
        //int ans = i-j-d;
        System.out.println("Subtraction of "+i+", "+j+", and "+d+" = " + (i-j-d));
    }
// this method is for multiplication
    public static void multiplication (int a , int b){
        //int ans = i*j*d;
        System.out.println ("Multiplication of "+a+", "+b+" = " + (a*b));
    }

    public static void main(String[] args) { // main method - static area
        subtraction (10,2,2);
        subtraction(6,2,2);
        multiplication(2,2);
        multiplication(2,3);

          }

}
