import javax.swing.*;
import java.awt.*;

public class TestGui extends JFrame{
	public static void main(String[] args){
		TestGui tg = new TestGui("HELLO");
		tg.setVisible(true);
	}
	TestGui(String title){
		setTitle(title);
		setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField("ALOHA");

		pnl.add(jtf,BorderLayout.NORTH);
		pnl.add(jtf.BorderLayout.NORTH);

		Container cp = getCntentPane();
		cp.add(pnl,BorderLayout.NORTH);

	}
}



