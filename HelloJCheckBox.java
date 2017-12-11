import javax.swing.*;
import java.awt.*;

public class HelloJCheckBox extends JFrame{
	HelloJCheckBox(String title){
		setTitle(title);
		setLocation(500,500);
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  		JCheckBox c1 = new JCheckBox("1");
		JCheckBox c2 = new JCheckBox("2");
		JCheckBox c3 = new JCheckBox("3");
  
		JPanel panel = new JPanel();
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
  
		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}
	public static void main(String[] args){
		HelloJCheckBox frame = new HelloJCheckBox("Hello!");
		frame.setVisible(true);
	}
}