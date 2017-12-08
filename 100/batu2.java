import javax.swing.*;
import java.awt.*;

public class batu2 extends JFrame{
	batu2(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField();

		JLabel lbl = new JLabel("mail");
		JLabel lbl2 = new JLabel("password");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(lbl);
		panel.add(jtf);
		panel.add(lbl2);
		panel.add(jpf);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		batu2 window = new batu2("window");
		window.setVisible(true);
	}
}