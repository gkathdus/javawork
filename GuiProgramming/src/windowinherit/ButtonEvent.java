package windowinherit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;

public class ButtonEvent extends JFrame {
	
	public ButtonEvent() {
		
	// 프레임 생성(상속을 받으면 프레임 객체 생성 안 해도 됨)
	this.setTitle("인사하는 프로그램");
	// this.setSize(250, 100); // 프레임 크기 설정 안 함
	this.setLocation(200, 100);
	
	// 컴포넌트 생성 - 위쪽 - 입력 상자, 버튼, 아래쪽 - 레이블
	JTextField text = new JTextField();
	text.setPreferredSize(new Dimension(200, 40));
	text.setFont(new Font("함초롱돋움", Font.PLAIN, 30));
	text.setForeground(new Color(0x00ff00)); // (255, 255, 255)
	text.setBackground(Color.PINK);
	
	JButton button = new JButton("확인");
	
	JLabel label = new JLabel("hello");
	label.setPreferredSize(new Dimension(200, 50));
	label.setFont(new Font("함초롱돋움", Font.PLAIN, 25));
	
	// 객체 프레임에 추가 - BorderLayout 배치
	this.add(text, BorderLayout.CENTER);
	this.add(button, BorderLayout.EAST);
	this.add(label, BorderLayout.SOUTH);
	
	// 액션 이벤트
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String username = text.getText();
			label.setText("hello" + username);
			
		}
	};
	button.addActionListener(listener);
	
	// 디스플레이
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
    
		
	}
	
	public static void main(String[] args) {
		// 생성자를 통해 구현
		ButtonEvent event = new ButtonEvent();

	}

}
