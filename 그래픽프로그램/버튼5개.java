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

public class 버튼5개 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("나의 버튼 5개");
		f.setVisible(true);
		f.setSize(500,500);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(f, "북쪽입니다");
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("NanumSquare", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("NanumSquare", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("중간");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setFont(new Font("NanumSquare", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setFont(new Font("NanumSquare", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "남쪽입니다");
			}
		});
		btnNewButton_4.setBackground(Color.BLUE);
		btnNewButton_4.setFont(new Font("NanumSquare", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		
		

	}
}
