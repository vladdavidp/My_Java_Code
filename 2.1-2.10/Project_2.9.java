import java.util.Scanner;
	public class thing2 {

		public static void main(String[] args) {
	      // write a program hat will find the average of three values
	      Scanner reader = new Scanner(System.in);
	      int radius;
	      System.out.println(" Enter the Radius");
	      radius= reader.nextInt(); 
	      double F = Math.PI*radius;
	      double G = (F*4/3);
	      double H = Math.pow((G),3);
	      double J = (F*4);
	      double K = Math.pow((J),2);
	      
	      System.out.println("volume = " + H);
	      System.out.println("Area = " + K);	      
}}
