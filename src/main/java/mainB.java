import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;

public class mainB extends JFrame implements ActionListener
{
	
	JSplitPane jsp, jsp2;
	JScrollPane tops, lefts , rights;
	public mainB()
	{
		tops = new JScrollPane(new lbpane());
		lefts = new JScrollPane(new checpane(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		rights = new JScrollPane(new contpane());

		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lefts,rights);
		jsp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT,tops,jsp);

		add(jsp2);
		jsp2.setEnabled(false);
		setTitle("Hǎomail");
		setSize(1200,700);//frame size 300 width and 300 height  
		//setLayout(new FlowLayout(FlowLayout.RIGHT));  
		setVisible(true);//now frame will be visible, by default not visible   
		//jpp.setLocationRelativeTo(this);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation( (screenSize.width - getWidth())/2,(screenSize.height - getHeight())/2 );
		jsp.setResizeWeight(0.2);
	}

    public void actionPerformed(ActionEvent ae)
    {
    	
    }
}
