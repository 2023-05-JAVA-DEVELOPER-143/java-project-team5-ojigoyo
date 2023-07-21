package uiTest;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inquiriesUitest extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public inquiriesUitest() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("제목");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 98, 57, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("문의 내용");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(41, 163, 57, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("성명");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(41, 280, 57, 25);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이메일");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(41, 332, 57, 25);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("전화번호");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(41, 383, 57, 18);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(157, 97, 243, 28);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 163, 335, 87);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(157, 280, 148, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(157, 331, 148, 28);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(157, 382, 148, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("문의 답변");
		lblNewLabel_5.setBounds(41, 423, 57, 15);
		add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(157, 423, 335, 63);
		add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.menuText);
		separator.setBackground(SystemColor.windowText);
		separator.setBounds(41, 411, 451, 2);
		add(separator);
		
		JButton btnNewButton = new JButton("제출하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				
				
				
				
				
				
				
				
				
			} catch (Exception e2) {

			
			}
			
			
			
			}
		});
		btnNewButton.setBounds(125, 517, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(397, 517, 105, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(247, 517, 97, 23);
		add(btnNewButton_2);

	}
}
