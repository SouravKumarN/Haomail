import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class lbtest extends JPanel implements ActionListener{

	JRadioButton inb, sent, draf, spam, tras;
	ButtonGroup bg;
	JPanel p1,p2,p3,p4,p5;
	public lbtest()
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
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
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
				Haomail.fetchm("STARRED");
			} catch (Exception e) {}
			mainB chk = new mainB();
			chk.setVisible(false);
			new mainB().setVisible(true);
		
		}
		else if(src==sent)
		{
			mainB chk = new mainB();
			chk.dispose();
			new checpane();

		}
		validate();

	}
}
