import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter First Side");
		System.out.println("");
		a=reader.nextInt();
		System.out.print("Enter Second Side");
		System.out.println("");
		b=reader.nextInt();
		System.out.print("Enter Third Side");
		System.out.println("");
		c=reader.nextInt();
double h=(a+b+c);
		double s=h/2;
		double ans=(s)*((s-a)*(s-b)*(s-c));
		double fin=Math.sqrt(ans);
		System.out.println(fin);
		
	}

}
