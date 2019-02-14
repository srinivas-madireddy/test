package KiranPackage.kiran;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WListener implements WindowListener {


	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println(" open");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("closed");

	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Activated");		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("DeActivated");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Maximized");		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Minimised");
	}
	
}

