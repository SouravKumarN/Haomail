import javax.mail.MessagingException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.event.*;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class draftD extends JDialog implements ActionListener{

	JLabel lb;
	JButton by,bn;
	JPanel P1,P2;

	public draftD(JFrame f)
	{
		super(f);
		setLocationRelativeTo(this);
		P1 = new JPanel();
		lb = new JLabel("Do you want to save it as Draft ?");
		lb.setBounds(85,20,200,20);
		lb.setVerticalAlignment(SwingConstants.BOTTOM);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		by = new JButton("Yes");
		bn = new JButton("No");
		by.setBounds(190,220,100,25);
	    bn.setBounds(10,220,100,25);
		by.addActionListener(this);
		bn.addActionListener(this);

		P1.add(lb);
		P1.add(by);
		P1.add(bn);
		add(P1);
		setSize(250,90);
		setVisible(true);
		setTitle("Save as Draft ..");
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object src = ae.getSource();
		if(src==by)
		{
			try {
				Haomail.saveD();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (GeneralSecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dispose();
		}
		else if(src==bn)
		{
			dispose();
		}
	}

}
