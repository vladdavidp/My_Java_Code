import java.util.Scanner;
public class Somthing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
double x, y, q, w, e, r;
System.out.println("Enter fisrt number");
x= reader.nextInt();
System.out.println("Enter Second number");
y= reader.nextInt();

q=x+y;
w=x-y;
e=y-x;
r=y*x;
System.out.println("X + Y =" + q);
System.out.println("X - Y =" + w);
System.out.println("Y - X =" + e);
System.out.println("X * Y =" + r);

	}

}
