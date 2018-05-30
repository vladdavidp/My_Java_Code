import java.util.Scanner;
public class Grofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Scanner reader = new Scanner(System.in);
		 double Q, D, N, P, Q1, D1, N1, P1, F;
		 System.out.println("Insert the amount of Quraters");
		 Q=reader.nextInt();
		 System.out.println("Insert the amount of Dimes");
		 D=reader.nextInt();
		 System.out.println("Insert the amount of Nickels");
		 N=reader.nextInt();
		 System.out.println("Insert the amount of Pennies");
		 P=reader.nextInt();
		 
		 Q1=Q*25;
		 D1=D*10;
		 N1=N*5;
		 P1=P*1;
		 
		 F=(Q1+D1+N1+P1)/100;
		 System.out.println("Total value= " +F +"$");
	}}