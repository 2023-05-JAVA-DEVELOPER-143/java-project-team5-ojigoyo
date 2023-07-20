package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class UserService extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public UserService() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(126, 178, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(126, 266, 57, 15);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(126, 203, 316, 39);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(216, 366, 146, 53);
		add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 291, 316, 39);
		add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(UserService.class.getResource("/uiTest/이미지/ㅅㅀㅌ.png")));
		lblNewLabel_2.setBounds(79, 51, 210, 53);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1_1 = new JButton("회원가입");
		btnNewButton_1_1.setBounds(421, 531, 97, 23);
		add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호 찾기");
		lblNewLabel_3.setBounds(248, 429, 91, 31);
		add(lblNewLabel_3);

	}
}
