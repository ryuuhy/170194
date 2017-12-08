import javax.swing.*;
import java.awt.*;

public class TestCheckBox extends JFrame{
	TestCheckBox(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox c1 = new JCheckBox("A");
		JCheckBox c2 = new JCheckBox("B");
		JCheckBox c3 = new JCheckBox("C");

		JPanel panel = new JPanel();
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		TestCheckBox tx = new TestCheckBox("window");
		tx.setVisible(true);
	}
}