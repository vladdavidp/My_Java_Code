import java.applet.Applet;
import java.awt.*;

public class AET extends Applet
{
	//MAKE TEH MOSTEST BUTIFULEST ART
	public void paint (Graphics page)
	{
		final int MID = 150;
		final int TOP = 50;
		
		page.drawString("Vlad P.", 10, 20);
		
		setBackground (Color.cyan);
		
		page.setColor(Color.blue);
		page.fillRect(0, 175, 300, 50); //Teh Ground
		
		page.setColor(Color.yellow);
		page.fillOval(160, -40, 80, 80); //Teh Sun
		
		page.setColor(Color.white);
		page.fillOval(MID, TOP, 40, 40); //Teh Head
		page.fillOval(MID-15, TOP+35, 70, 50); //Teh Upper body
		page.fillOval(MID-30, TOP+80, 100, 60); //Teh lower body
		
		page.setColor(Color.black);
		page.fillOval(MID+10, TOP+10, 5, 5); //Teh L eye
		page.fillOval(MID+25, TOP+10, 5, 5); //Teh R eye
		
		page.setColor(Color.red);
		page.fillOval(MID+15, TOP+40, 10, 10); //Teh buttons
		page.fillOval(MID+15, TOP+60, 10, 10); //Teh buttons
		
		page.setColor(Color.black);
		page.drawArc(MID+10, TOP+20, 20, 10, 190, -160); //Teh Smile
		
		page.drawLine(MID-5, TOP+60, MID-50, TOP+40); //Teh L arm
		page.drawLine(MID+45, TOP+60, MID+55, TOP+60); //Teh R arm
		
		page.drawLine(MID+45, TOP+60, MID+55, TOP+60); //Teh classines
		page.fillRect(MID+5, TOP-20, 30, 25);
				
	}
}
