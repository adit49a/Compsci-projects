import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent {
	
	private int dy = 0, dx = 0;
	
	public Ball(int x, int y)
	{
		setLocation(x,y);
		setSize(20,40);
	}
	public void paintComponent (Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ball = new Ellipse2D.Double(10,0,10,10);
		g2.fill(ball);
		g2.setColor(Color.BLUE);
	}
	public void setDY(int y)
	{
		dy = y;
	}
	public void setDX(int x)
	{
		dx = x;
	}
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
	


	
		
	

}
