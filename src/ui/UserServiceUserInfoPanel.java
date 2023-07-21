package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;



import hotel.user.User;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class UserServiceUserInfoPanel extends JPanel {
	private JTextField UserInfoIdTF;
	private JTextField UserInfoNameTF;
	private JTextField UserInfoEmailTF;
	private JTextField UserInfoTelTF;
	private JTextField UserInfoJuminTF;
	private JTextField UserInfoPasswordTF;

	/**
	 * Create the panel.
	 */
	public UserServiceUserInfoPanel() {
		setLayout(null);
		
		JLabel UserIdLabel = new JLabel("아이디");
		UserIdLabel.setBounds(89, 148, 72, 29);
		add(UserIdLabel);
		
		JLabel UserPasswordLabel = new JLabel("비밀번호");
		UserPasswordLabel.setBounds(89, 201, 72, 29);
		add(UserPasswordLabel);
		
		JLabel UserNameLabel = new JLabel("이름");
		UserNameLabel.setBounds(89, 261, 72, 29);
		add(UserNameLabel);
		
		JLabel UserEmailLabel = new JLabel("이메일");
		UserEmailLabel.setBounds(89, 324, 72, 29);
		add(UserEmailLabel);
		
		JLabel UserTelLabel = new JLabel("전화번호");
		UserTelLabel.setBounds(89, 376, 72, 29);
		add(UserTelLabel);
		
		JLabel UserJuminLabel = new JLabel("주민번호");
		UserJuminLabel.setBounds(89, 431, 72, 29);
		add(UserJuminLabel);
		
		UserInfoIdTF = new JTextField();
		UserInfoIdTF.setBounds(204, 152, 133, 25);
		add(UserInfoIdTF);
		UserInfoIdTF.setColumns(10);
		
		UserInfoNameTF = new JTextField();
		UserInfoNameTF.setColumns(10);
		UserInfoNameTF.setBounds(204, 265, 133, 25);
		add(UserInfoNameTF);
		
		UserInfoEmailTF = new JTextField();
		UserInfoEmailTF.setColumns(10);
		UserInfoEmailTF.setBounds(204, 328, 133, 25);
		add(UserInfoEmailTF);
		
		UserInfoTelTF = new JTextField();
		UserInfoTelTF.setColumns(10);
		UserInfoTelTF.setBounds(204, 380, 133, 25);
		add(UserInfoTelTF);
		
		JButton Juminbtn = new JButton("보기");
		Juminbtn.setBounds(394, 445, 62, 29);
		add(Juminbtn);
		
		JButton Passwordbtn = new JButton("보기");
		Passwordbtn.setBounds(394, 204, 62, 29);
		add(Passwordbtn);
		
		UserInfoJuminTF = new JTextField();
		UserInfoJuminTF.setColumns(10);
		UserInfoJuminTF.setBounds(204, 435, 133, 25);
		add(UserInfoJuminTF);
		
		UserInfoPasswordTF = new JTextField();
		UserInfoPasswordTF.setColumns(10);
		UserInfoPasswordTF.setBounds(204, 205, 133, 25);
		add(UserInfoPasswordTF);

	}
	
	private void displayMemberInfo(User user) {
		UserInfoIdTF.setText(user.getUser_Id());
		UserInfoPasswordTF.setText(user.getUser_Password());
		UserInfoNameTF.setText(user.getUser_Name());
		//UserInfoEmailTF
	}
}