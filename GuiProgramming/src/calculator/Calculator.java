package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	
	// 필드
	String[] operator = {"+", "-", "*", "/"};
	JComboBox<String> comboBox;
	
	// 생성자
	public Calculator() {
		// 윈도우(프레임) 생성
		this.setTitle("사칙연산 프로그램");
		this.setSize(300, 120);
		this.setLocation(200, 100);
		
		// 패널 2개 생성 - BorderLayout
		JPanel pane1 = new JPanel(); 
		JPanel pane2 = new JPanel();
		
		this.add(pane1, BorderLayout.NORTH);
		this.add(pane2, BorderLayout.CENTER);
		
		// 컴포넌트 객체 생성 - FlowLayout
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		
		// 콤보 박스
		comboBox = new JComboBox<>(operator);
		JTextField text2 = new JTextField(5);
		
		// 레이블
		JLabel label = new JLabel("=");
		JTextField text3 = new JTextField(5);
		
		// 버튼 객체
		pane2.setLayout(new FlowLayout());
		JButton calcBtn = new JButton("계산");
		JButton resetBtn = new JButton("취소");
		
		pane1.add(text1);
		pane1.add(comboBox);
		pane1.add(text2);
		pane1.add(label);
		pane1.add(text3);
		
		
		// pane2에 배치하고 올리기
		pane1.add(text1);
		pane1.add(comboBox);
		pane1.add(text2);
		pane1.add(label);
		pane1.add(text3);
		
		pane2.add(calcBtn);
		pane2.add(resetBtn);
		
		// 이벤트
		ActionListener listener1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());
				String op = (String)comboBox.getSelectedItem();
				int num2 = Integer.parseInt(text2.getText());
				
				switch(op) {
				case "+":
					int result = num1 + num2;
					text3.setText(String.valueOf(result)); break;
				case "-":
					result = num1 - num2;
					text3.setText(String.valueOf(result)); break;
				case "*":
					result = num1 * num2;
					text3.setText(String.valueOf(result)); break;
				case "/":
					double result2 = (double)num1 / num2;
					text3.setText(String.valueOf(result2)); break;
				}
			}
		};
		calcBtn.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {
			// 취소 버튼 눌렀을 때 입력 초기화 구현
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				text3.setText("");
				
			}
		};
		resetBtn.addActionListener(listener2);
		
		/*calcBtn.addActionListener(this);
		resetBtn.addActionListener(this);*/
		
		
		
		// 디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	}


}
