package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.white);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(12, 13, 475, 145);
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(14, 189, 472, 255);
		f.getContentPane().add(m);
		f.setVisible(true);
		
		
		ImageIcon pic1 = new ImageIcon("1.jpeg");
		ImageIcon pic2 = new ImageIcon("2.jpeg");
		
		b.setIcon(pic1);
		m.setIcon(pic2);
	}
}
