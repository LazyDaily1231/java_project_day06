package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼3개 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.red);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);//레이아웃을 지정하지 않으면 내가 넣고 싶은 위치에 넣을 수 있다.
		
		JButton btnNewButton = new JButton("별10개");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i <10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		btnNewButton.setFont(new Font("NanumSquare", Font.BOLD, 40));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(99, 11, 299, 104);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});
		btnNewButton_1.setFont(new Font("NanumSquare", Font.BOLD, 40));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(99, 126, 299, 104);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("커피*우유3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
				System.out.println();
			}
		});
		btnNewButton_1_1.setFont(new Font("NanumSquare", Font.BOLD, 40));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(99, 241, 299, 104);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("1:짱!");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				for (int i = 1; i < 4; i++) {
					System.out.println(i +".짱!");
				}
			}
			
		});
		btnNewButton_1_1_1.setFont(new Font("NanumSquare", Font.BOLD, 40));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(99, 356, 299, 104);
		f.getContentPane().add(btnNewButton_1_1_1);
		
		
		
		
		
		f.setVisible(true);
	}
}
