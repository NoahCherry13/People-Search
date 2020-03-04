import javax.swing.*;
import BreezySwing.*;

public class SearchDialog extends GBDialog {

	JButton bsButton = addButton("Search", 2, 1, 1, 1);
	JButton removeButton = addButton("Remove", 2, 2, 1, 1);
	JTextField nmField = addTextField("", 1, 2, 1, 1);
	JLabel nmLabel = addLabel("Name: ", 1, 1, 1, 1);
	JButton lsButton = addButton("Fuck", 4, 1, 1, 1);
	NoahList<People> list;
	int idx;

	public SearchDialog(JFrame parent, NoahList<People> arr) {
		super(parent);
		list = arr;
		this.setSize(400, 500);
		this.setVisible(true);
	}

	public void buttonClicked(JButton b) {
		if (b == removeButton) {
			Sort s = new Sort(list);
			list = s.sort();
			Search<People> bs = new Search<People>(list);
			People found = bs.binarySearch(new People(nmField.getText(), 0));
			list.remove(list.indexOf(found));
			messageBox("You have removed \nName: " + found.getName() + "\nAge: " + found.getAge());

		} else if (b == bsButton) {
			Sort s = new Sort(list);
			list = s.sort();
			Search<People> bs = new Search<People>(list);
			try {
			People found = bs.binarySearch(new People(nmField.getText(), 0));
			messageBox("Found:" + '\n' + "Name: " + found.getName() + "\nAge: " + found.getAge() + "\nIt took "
					+ bs.getCount() + " Iterations");
		}catch(Exception e) {
			messageBox(e.getMessage());
		}
		
		
		} else if (b == lsButton) {
			People found = null;
			Search<People> bs = new Search<People>(list);
			for (int i = 0; i < list.size(); i++) {
				found = bs.linearSearch(new People(nmField.getText(), 0));

			}
			messageBox("Found:" + '\n' + "Name: " + found.getName() + "\nAge: " + found.getAge() + "\nIt took "
					+ bs.getCount() + " Iterations");
		}
	}
}
