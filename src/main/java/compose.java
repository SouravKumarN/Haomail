import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class compose extends JFrame implements ActionListener{
	 JFrame f =new JFrame("Compose"); 
	 static JDialog D;
     static JTextField tt;
	 static JTextField ts;
     static JTextArea txb;
     JLabel lt,ls,lb;
     JButton bc,bs,ba;
     static File file;
     JPanel p1,p2,p3,p4;
  
public compose(){  
    f.setLocationRelativeTo(this);

    tt = new JTextField(28	);
    ts = new JTextField(28);
    lt = new JLabel("To - ");
    ls = new JLabel("Subject - ");
    lb = new JLabel("Body - ");
    txb = new JTextArea(12,30);
    JScrollPane scroll = new JScrollPane(txb);
    scroll.setSize( 290, 150 );

   /* tt.setBounds(85,20,200,20);
    ts.setBounds(85,40,250,20); 
    lt.setBounds(20,20,140,20);
    ls.setBounds(20,40,140,20);
    lb.setBounds(20,60,140,20);
    txb.setBounds(88,70,290,150);*/

    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();
    p4 = new JPanel();
    
    p1.add(lt);
    p1.add(tt);
    p2.add(ls);
    p2.add(ts);
    p3.add(lb);
    //p3.add(txb);
    p3.add(scroll);
    
    f.add(p1);
    f.add(p2);
    f.add(p3);
    bs = new JButton("Send ->"); 
    bc = new JButton("Cancel"); 
    ba = new JButton("Upload..");
    bc.addActionListener(this);
    bs.addActionListener(this); 
    ba.addActionListener(this);
    p4.add(ba,FlowLayout.LEFT); 
    p4.add(bc);
    p4.add(bs);//adding button into frame 
    //f.add(scroll);
    f.add(p1);
    f.add(p2);
    f.add(p3);
    f.add(p4);
    f.setSize(450,350);//frame size 300 width and 300 height  
    f.setLayout(new FlowLayout(FlowLayout.RIGHT));  
    f.setVisible(true);//now frame will be visible, by default not visible   
}

public void actionPerformed(ActionEvent ae)
{
	if(D!=null)
		D.dispose();
        Object src = ae.getSource();
        if(src==bs)
        {
		    try {
		    	Haomail.send();
		    }
		    catch(Exception e)
		    {}
            f.setVisible(false);
        }
        else if(src==bc)
        {
            D = new draftD(this);
            f.setVisible(false);
        }	
        else if(src==ba)
        {
            JFileChooser f=new JFileChooser();
            int i=f.showOpenDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){
                 file=f.getSelectedFile();
              // String filepath=file.getPath();
            }
        }
}
}
