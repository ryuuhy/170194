//メールアドレスとパスワードを入力するウィンドウをつくる
//入力欄を２つ
//  JTextField
//  JPasswordField
//入力欄の左側に、説明を書く
//  mail
//  password
//  JLabel


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

//import javax.swing.*;
//import java.awt.*;

public class UserReg extends JFrame{
	UserReg(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));

		JPasswordField jpf = new JPasswordField();
		JLabel lbl = new JLabel("mail");
		JLabel lbl2 = new JLabel("password");
		JTextField jtf = new JTextField("",20);

		panel.add(lbl);
		panel.add(lbl2);
		panel.add(jtf);
		panel.add(jpf);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}

	public static void main(String[] args){
		UserReg window = new UserReg("window");
		window.setVisible(true);
	}
}