import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
<applet code=ex height=400 width=700>
</applet>
*/
public class ex extends Applet implements MouseMotionListener, MouseListener
{
	int x,y,x1,y1,x2,y2;
	Graphics g;
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);	
		g=getGraphics();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(30,30,50,50);
		g.setColor(Color.GREEN);
		g.fillRect(90,30,50,50);
		g.setColor(Color.BLUE);
		g.fillRect(150,30,50,50);
	}
	public void mouseMoved(MouseEvent me)
	{
		
	}
	public void mouseClicked(MouseEvent me)
	{	
		x=me.getX();
		y=me.getY();
	}	
	public void mouseDragged(MouseEvent me)
	{
		
	}
	public void mouseEntered(MouseEvent me)
	{
		
	}
	public void mouseExited(MouseEvent me)
	{
		
	}
	public void mousePressed(MouseEvent me)
	{
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
}