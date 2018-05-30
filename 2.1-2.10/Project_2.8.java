

	import java.util.Scanner;
	public class Thing {

		public static void main(String[] args) {
	      // write a program hat will find the average of three values
	      Scanner reader = new Scanner(System.in);
	      int x2, x1, y1, y2;
	      System.out.println(" Enter the X value of the first point");
	      x1= reader.nextInt(); 
	      System.out.println(" Enter the Y value of the first point");
	      x2= reader.nextInt(); 
	      System.out.println(" Enter the X value of the second point ");
	      y1= reader.nextInt(); 
	      System.out.println(" Enter the Y value of second point");
	      y2= reader.nextInt(); 
	      double F = Math.pow((x2-x1), 2);
	      double G = Math.pow((y2-y1), 2);
	      double value = Math.sqrt(F+G);
	      
	      System.out.println("distance = " + value);
		}}