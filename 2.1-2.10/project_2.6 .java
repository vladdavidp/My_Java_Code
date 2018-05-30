import java.util.Scanner;
	public class program2_6 {

		public static void main(String[] args) {
	      
	      Scanner reader = new Scanner(System.in);
	      double hrs, min, sec, add;
	      System.out.print("Enter the amount of hours");
	      System.out.println("");
	      hrs= reader.nextInt();
	      
	      System.out.print("Enter the amount of minutes");
	      System.out.println("");
	      min= reader.nextInt();
	      
	      System.out.print("Enter the amount of seconds");
	      System.out.println("");
	      sec= reader.nextInt();
	      double Tot;
	      Tot = ((hrs*3600) + (min*60) + sec);
	       
	      System.out.println( "Seconds = " +Tot);
}
	}


