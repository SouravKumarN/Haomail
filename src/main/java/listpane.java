import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

public class listpane extends JPanel implements ItemListener{
	
	listpane()
	{
		JPanel jp = new JPanel();
		DefaultListModel<String> l1 = new DefaultListModel<>();  
		 for(int i=0;i<9;i++)
		{
		l1.addElement(Haomail.subb[i]+"");  
		}
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  

        JList<String> list = new JList<>(l1); 
        list.setBounds(100,200, 75,75);  

		setLayout(new FlowLayout(FlowLayout.LEFT));  
        //list.setBounds(100,100, 75,75);  
        jp.add(list);  
        add(jp);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		
	}
}
