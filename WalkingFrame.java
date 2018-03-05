import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingFrame extends JFrame implements ActionListener
{
	private Man man;
	private Ball ball;
	ArrayList<Ball> newBalls = new ArrayList<Ball>();
	
	
	public WalkingFrame()
	{
		setBounds(100,100,600,400);
		setLayout(null);
		man = new Man(100,50);
		add(man);
		ball = new Ball(0,0);
		Timer timer = new Timer(10, this);
		timer.start();
		addKeyListener(new KeyListener() 
		{
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==e.VK_W)
				{
					man.setDY(-2);
				}
				if(e.getKeyCode()==e.VK_S)
				{
					man.setDY(2);
				}
				if(e.getKeyCode()==e.VK_A)
				{
					man.setDX(-2);
					
				}
				if(e.getKeyCode()==e.VK_D)
				{
					man.setDX(2);
					
				}
				if(e.getKeyCode()==e.VK_1)
				{
					
					Ball balls = new Ball(man.getX(), man.getY());
					add(balls);
					newBalls.add(balls);
					balls.setLocation(man.getX(), man.getY());
					balls.setDX(3);
				}
				
			}
			
			public void keyReleased(KeyEvent e) 
			{
				if(e.getKeyCode()==e.VK_W)
				{
					man.setDY(0);
				}
				if(e.getKeyCode()==e.VK_S)
				{
					man.setDY(0);
				}
				if(e.getKeyCode()==e.VK_A)
				{
					man.setDX(0);
				}
				if(e.getKeyCode()==e.VK_D)
				{
					man.setDX(0);
				}
								
			}

			
			public void keyTyped(KeyEvent arg0)
			{
				
				
			}
		
			
		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) 
	{
		new WalkingFrame();
			
	}

	public void actionPerformed(ActionEvent e) 
	{
		man.update();
		for (Ball b : newBalls)
		{
			b.update();
		}
		repaint();
		
	}
		
	

}
