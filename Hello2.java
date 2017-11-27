import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;


public class Hello2 extends JFrame{

	Hello2(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Hello!");

		JPanel panel = new JPanel();
		panel.add(btn);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.CENTER);
	}

	public static void main(String[] args){
		Hello2 hello2 = new Hello2("aaaaa");
		hello2.setVisible(true);
	}
}