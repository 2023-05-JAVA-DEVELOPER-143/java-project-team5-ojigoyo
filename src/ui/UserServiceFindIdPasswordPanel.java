package ui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class UserServiceFindIdPasswordPanel extends JPanel {
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public UserServiceFindIdPasswordPanel() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("아이디 찾기");
		btnNewButton.setBounds(401, 146, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("비밀번호 찾기");
		btnNewButton_1.setBounds(401, 426, 109, 23);
		add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 115, 239, 31);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel FIndIdLabel = new JLabel("아이디 찾기");
		FIndIdLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		FIndIdLabel.setBounds(50, 37, 142, 45);
		add(FIndIdLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 찾기");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(50, 285, 201, 31);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(41, 115, 37, 30);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 174, 239, 31);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 361, 239, 31);
		add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 422, 239, 31);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(113, 482, 239, 31);
		add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("주민등록번호");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(12, 174, 102, 30);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("이름");
		lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(41, 422, 37, 30);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("주민등록번호");
		lblNewLabel_2_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(12, 478, 102, 30);
		add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("아이디");
		lblNewLabel_2_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(41, 361, 60, 30);
		add(lblNewLabel_2_2_1);

	}
}
