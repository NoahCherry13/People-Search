import javax.swing.JFrame;
import BreezySwing.*;
public class PeopleGUI extends GBFrame{

	Sort d = new Sort();
	
	public PeopleGUI() {
		
	}
	public static void main(String[] args) {
		JFrame frm = new PeopleGUI();
		frm.setTitle("Ace Program");
		frm.setSize(500, 425);
		frm.setVisible(true);
	}
	
}
