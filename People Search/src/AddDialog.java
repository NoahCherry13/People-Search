import BreezySwing.*;
import javax.swing.*;

public class AddDialog extends GBDialog {

	JTextField nameField = addTextField("", 1, 3, 1, 1);
	IntegerField ageField = addIntegerField(0, 2, 3, 1, 1);
	JLabel nameLabel = addLabel("Enter Name", 1, 1, 1, 1);
	JLabel ageLabel = addLabel("Enter Age", 2, 1, 1, 1);
	JButton enterButton = addButton("Enter", 3, 1, 1, 1);
	NoahList<People> list;

	public AddDialog(JFrame parent, NoahList<People> arr) {
		super(parent);
		list = arr;
		this.setSize(500, 400);
		this.setVisible(true);
	}

	public boolean check() {
		if (nameField.getText().isBlank() || !ageField.isValidNumber() || ageField.getNumber() < 0) {
			return false;
		}
		return true;
	}

	public void buttonClicked(JButton b) {
		if (b == enterButton) {
			if (check()) {
				list.add(new People(nameField.getText(), ageField.getNumber()));
				messageBox("You have added: " +nameField.getText()+ "\nAge: "+ageField.getNumber());
			}else {
				messageBox("Please Enter Valid Input");
				return;
			}
		}
	}

}
