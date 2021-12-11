import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class checpane extends JPanel implements ItemListener,ActionListener{
	JCheckBox[] chcb = new JCheckBox[11]; 
	String labels[] = new String[11];
	JPanel[] jp = new JPanel[11]; 
	JPanel[] jpb = new JPanel[11]; 
	static JFrame jfp = new JFrame();
	static JFrame jfc = new JFrame();

	JButton jb;
	checpane()
	{
		jb = new JButton("Compose + >");
		jb.addActionListener(this);
		add(jb);

		for(int i=0;i<Haomail.fi;i++)
		{
			jp[i] = new JPanel(); 
			jpb[i] = new JPanel(); 


			labels[i] = Haomail.frm[i]+"";
			chcb[i] = new JCheckBox(labels[i]);
			jp[i].add(chcb[i]);
			jpb[i].add(new JLabel("	"+Haomail.subb[i]));
			add(jp[i]);
			add(jpb[i]);

			chcb[i].addItemListener(this);
		}
		
		setLayout(new GridLayout(16,9));
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		for(int i=0;i<Haomail.fi;i++)
		{
		if(chcb[i].isSelected())
		{
		contpane.htmlString = Haomail.bodi[i];
		lbpane.jc.dispose();
		jfp.dispose();
		jfp = new mainB();
		}
	}
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object src = ae.getSource();
        if(src==jb)
        {
        	jfc = new compose();
        }
	}
}
