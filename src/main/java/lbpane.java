import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class lbpane extends JPanel implements ActionListener{

	JRadioButton inb, sent, draf, spam, tras;
	ButtonGroup bg;
	JPanel p0,p1,p2,p3,p4,p5;
	static JFrame jc = new JFrame();
	public lbpane()
	{
		inb = new JRadioButton("INBOX");
		sent = new JRadioButton("SENT");
		draf = new JRadioButton("DRAFTS");
		spam = new JRadioButton("SPAM");
		tras = new JRadioButton("TRASH");
		
		bg = new ButtonGroup();
		bg.add(inb);
		bg.add(sent);
		bg.add(draf);
		bg.add(spam);
		bg.add(tras);
		
		p0 = new JPanel();
		p1 = new JPanel();
	    p2 = new JPanel();
	    p3 = new JPanel();
	    p4 = new JPanel();
	    p5 = new JPanel();
	    
		setLayout(new FlowLayout(FlowLayout.CENTER));  
		p1.add(inb);
		p2.add(sent);
		p3.add(draf);
		p4.add(spam);
		p5.add(tras);
		
		p0.add(p1);
		p0.add(p2);
		p0.add(p3);
		p0.add(p4);
		p0.add(p5);
		
		add(p0);
		
		inb.addActionListener(this);
		sent.addActionListener(this);
		draf.addActionListener(this);
		spam.addActionListener(this);
		tras.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object src = ae.getSource();
		if(src==inb)
		{
			try {
				Haomail.fetchm("UNREAD");
			} catch (Exception e) {}
			Haomail.jm.dispose();
			jc.dispose();
			//SwingUtilities.updateComponentTreeUI(Haomail.jm);
			jc = new mainB();
			//Haomail.jm.setVisible(true);
		}
		if(src==sent)
		{
			try {
				Haomail.fetchm("STARRED");
			} catch (Exception e) {}
			Haomail.jm.dispose();
			jc.dispose();
			jc = new mainB();
		
		}
		if(src==draf)
		{
			try {
				Haomail.fetchm("DRAFT");
			} catch (Exception e) {}
			Haomail.jm.dispose();
			jc.dispose();
			jc = new mainB();
		
		}
		if(src==spam)
		{
			try {
				Haomail.fetchm("SPAM");
			} catch (Exception e) {}
			Haomail.jm.dispose();
			jc.dispose();
			jc = new mainB();
		
		}
		if(src==tras)
		{
			try {
				Haomail.fetchm("TRASH");
			} catch (Exception e) {}
			Haomail.jm.dispose();
			jc.dispose();
			jc = new mainB();
		
		}
		validate();

	}
}
