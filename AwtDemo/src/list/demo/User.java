package list.demo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User {

public static	Button b,b1,b2,b3,b4;
public static	Label l,l1,l2,l3,l4;
public static	TextField t,t1,t2;
public static Frame f=null;
void action()
{
	Boolean a=null;
	
}
	public static void main(String[] args) {
		WListener act=new WListener();
		
				f=new Frame();
		
		DataBase db=new DataBase();
		l3=new Label();
		//l4=new Label();
	//	l3.setBounds(70, 400, 100, 40);
			l=new Label("eid");
			l.setBounds(20, 100, 100, 30);
			t=new TextField("");
			t.setEditable(true);
			t.setBounds(150, 100, 100, 30);
			b=new Button("insert");
			b.setBounds(20, 250, 80, 30);
			f.add(l);
			f.add(t);
			f.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eve) {
					//db.insertstm();
					
					Insertstm in=new Insertstm();
					
				}
			});
			l1=new Label("ename");
			l1.setBounds(20, 150, 100, 30);
			t1=new TextField("");
			t1.setEditable(true);
			t1.setBounds(150, 150, 100, 30);
			b1=new Button("update");
			b1.setBounds(120, 250, 80, 30);
			f.add(l1);
			f.add(t1);
			f.add(b1);
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eve) {
				 // db.updatestm();	
					Updatestm us=new Updatestm();
					
				}
			});
			l2=new Label("salary");
			l2.setBounds(20, 200, 100, 30);
			t2=new TextField("");
			t2.setEditable(true);
			t2.setBounds(150, 200, 100, 30);
			b2=new Button("delete"); 
			b2.setBounds(210, 250, 80, 30);
			f.add(l2);
			f.add(t2);
			f.add(b2);
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent eve) {
					//db.deletestm();
					Deletestm ds=new Deletestm();
					
					}
			});
			b3=new Button("create std tabel");// here we are creating std table with three columns eid, ename, sal. 
			b3.setBounds(300, 250, 120, 30);
			//f.add(b3);
			b3.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent e) {
						//db.Createstm();
						//Createstm cs=new Createstm();
					}	
					});
			b4=new Button("");
			f.add(b4);
			
			
			//l4.setBounds(0, 0, 0, 0);
			f.add(l3);	
			f.add(l4);
			f.addWindowListener(act);
			
			f.setVisible(true);
			f.setSize(450, 450);
			

	}


}
