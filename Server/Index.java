import java.applet.*;
import javax.swing.*;
import java.awt.*;
public class Index extends Applet
{
	JTextArea tf;
	Panel p;
	public void init()
	{
		this.setSize(400,400);
		this.setBackground(Color.yellow);
		p=new Panel();
		this.add(p);
		this.setVisible(true);
		tf=new JTextArea(10,20);
		p.add(tf);
	}

	public void start()
	{
	}

	public void paint(Graphics g)
	{
		g.drawRect(200,200,150,150);
	}

	public void stop()
	{
	}

	public void destroy()
	{

	}

}

/*<applet code=
Index.class height='400' width='400'></applet>*/