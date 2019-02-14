package list.demo;

import javax.swing.JOptionPane;

public class OptionPanedelete {

	OptionPanedelete()
	{
		int a=JOptionPane.showConfirmDialog(User.f, "do you want to delete records");
		{
			if(a==JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(User.f,"your records are deleted","delete",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
					JOptionPane.showMessageDialog(User.f, "ufff just miss");
				}
			}
		}
		//JOptionPane.showMessageDialog(User.f,"your records are deleted","delete",JOptionPane.WARNING_MESSAGE);
	}


