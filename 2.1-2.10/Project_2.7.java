import java.util.Scanner;
	public class program2_7 {

		public static void main(String[] args) {
	      // write a program hat will find the average of three values
	      Scanner reader = new Scanner(System.in);
	      int hours, minutes, seconds, add;
	      System.out.println(" Enter the amount of seconds");
	      seconds= reader.nextInt(); 
	      System.out.println("hours = " + (seconds/3600));
	      System.out.println("minutes = " + (seconds%3600/60));
	      System.out.println("seconds = " + (seconds%3600%60/1));
}}