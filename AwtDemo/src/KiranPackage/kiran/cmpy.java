package KiranPackage.kiran;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class cmpy{

public static	Button b,b1,b2,b3,b4;
public static	Label l,l1,l2,l3; 
public static	TextField t,t1,t2;
public static String s;
public static Frame f;
public static void main(String[] args) {
	WListener W=new WListener();
	Frame f=new Frame();
	
	
			l=new Label("Employe ID");
			l.setBounds(20, 100, 100, 30);
			t=new TextField("");
			t.setEditable(true);
			t.setBounds(150, 100, 100, 30);
			b=new Button("Insert");
			b.setBounds(20, 250, 80, 30);
			f.add(l);
			f.add(t);
			f.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eve) {
					
				Insert in=new Insert();
				boolean y=in.i;
				if(y==true)
				{
				s="Inserted";	
				}
				else
				{
					s="not Inserted";
				}
				
				JPanel sp = new JPanel();
				sp.setBorder((Border) new BevelBorder(BevelBorder.LOWERED));
				f.add(sp, BorderLayout.SOUTH);
				sp.setPreferredSize(new Dimension(f.getWidth(), 22));
				sp.setLayout((LayoutManager) new BoxLayout(sp, BoxLayout.X_AXIS));
				JLabel sl = new JLabel("status:"+ s);
				sl.setHorizontalAlignment(SwingConstants.LEFT);
				sp.add(sl);
				
				f.setVisible(true);
				}
			});
			l1=new Label("EmployeName");
			l1.setBounds(20, 150, 100, 30);
			t1=new TextField("");
			t1.setEditable(true);
			t1.setBounds(150, 150, 100, 30);
			b1=new Button("Update");
			b1.setBounds(120, 250, 80, 30);
			f.add(l1);
			f.add(t1);
			f.add(b1);
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eve) {
		
					Update u=new Update();
					boolean y=u.i;
					if(y==true)
					{
					s="updated";	
					}
					else
					{
					s="not updated";
					}
					
					JPanel sp = new JPanel();
					sp.setBorder((Border) new BevelBorder(BevelBorder.LOWERED));
					f.add(sp, BorderLayout.SOUTH);
					sp.setPreferredSize(new Dimension(f.getWidth(), 22));
					sp.setLayout((LayoutManager) new BoxLayout(sp, BoxLayout.X_AXIS));
					JLabel sl = new JLabel("status:"+ s);
					sl.setHorizontalAlignment(SwingConstants.LEFT);
					sp.add(sl);
					f.setVisible(true);
				}
			});
			l2=new Label("salary");
			l2.setBounds(20, 200, 100, 30);
			t2=new TextField("");
			t2.setEditable(true);
			t2.setBounds(150, 200, 100, 30);
			b2=new Button("Delete");
			b2.setBounds(210, 250, 80, 30);
			f.add(l2);
			f.add(t2);
			f.add(b2);
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eve) {
					
					delete d=new delete();
					boolean y=d.i;
					if(y==true)
					{
					s="deleted";	
					}
					else
					{
					s="not deleted";
					}
					
						JPanel sp = new JPanel();
						sp.setBorder((Border) new BevelBorder(BevelBorder.LOWERED));
						f.add(sp, BorderLayout.SOUTH);
						sp.setPreferredSize(new Dimension(f.getWidth(), 22));
						sp.setLayout((LayoutManager) new BoxLayout(sp, BoxLayout.X_AXIS));
						JLabel sl = new JLabel("status:"+ s);
						sl.setHorizontalAlignment(SwingConstants.LEFT);
						sp.add(sl);
						f.setVisible(true);
						}
			});

			b4=new Button("");
			f.add(b4);
			b4.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						System.out.println("Enter");
					}	
					});
			
			f.addWindowListener(W);
			f.setVisible(true);
			f.setSize(400, 400);
			

	}

}
