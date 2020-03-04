import javax.swing.*;
import BreezySwing.*;
public class PeopleGUI extends GBFrame{
	
	JButton EnterButton = addButton ("Enter a Person",1,1,1,1);
	JButton SearchButton = addButton ("Search for a Person",2,1,1,1);
	private NoahList<People> list;
	
	public PeopleGUI() {
		list = new NoahList<People>();
	}
	
	public static void main(String[] args) {
		
		JFrame frm = new PeopleGUI();
		frm.setTitle("Ace Program");
		frm.setSize(500, 425);
		frm.setVisible(true);
	}
	
	public void buttonClicked(JButton b) {
		if (b == EnterButton) {
			AddDialog ad = new AddDialog(this, list);
		}else if (b == SearchButton ) {
			SearchDialog sd = new SearchDialog(this, list);
		}
	}
	
}
