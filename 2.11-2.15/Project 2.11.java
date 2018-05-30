import java.util.Scanner;
public class Groft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
		 
		 double G1, G2, O, M, D, MPG, R, MPGF;
		 System.out.println("Enter the distance travled in miles");
		 D= reader.nextInt();
		 System.out.println("Enter the maximum number on the odometer");
		 O= reader.nextInt();
		 System.out.println("Enter Odometer reading at start of trip");
		 G1= reader.nextInt();
		 System.out.println("Enter Odometer reading at end of trip");
		 G2= reader.nextInt();
		 System.out.println("Enter the amount of times stopped for a refuel");
		 R= (reader.nextInt()*O);
		
		 MPG=(D/((R+G2)-(G1)));
		 MPGF= Math.abs(MPG);
		 System.out.println(MPGF +" MPG");
		 
	}

}
