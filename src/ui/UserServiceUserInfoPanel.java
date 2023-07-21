package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;



import hotel.user.User;
import hotel.user.UserService;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserServiceUserInfoPanel extends JPanel {
	private UserService userservice;
	private User loginUser=null;
	private JTextField UserInfoIdTF;
	private JTextField UserInfoNameTF;
	private JTextField UserInfoEmailTF;
	private JTextField UserInfoTelTF;
	private JTextField UserInfoJuminTF;
	private JTextField UserInfoPasswordTF;

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public UserServiceUserInfoPanel() throws Exception {
		setLayout(null);
		
		JLabel UserIdLabel = new JLabel("아이디");
		UserIdLabel.setBounds(89, 122, 72, 29);
		add(UserIdLabel);
		
		JLabel UserPasswordLabel = new JLabel("비밀번호");
		UserPasswordLabel.setBounds(89, 189, 72, 29);
		add(UserPasswordLabel);
		
		JLabel UserNameLabel = new JLabel("이름");
		UserNameLabel.setBounds(89, 249, 72, 29);
		add(UserNameLabel);
		
		JLabel UserEmailLabel = new JLabel("이메일");
		UserEmailLabel.setBounds(89, 311, 72, 29);
		add(UserEmailLabel);
		
		JLabel UserTelLabel = new JLabel("전화번호");
		UserTelLabel.setBounds(89, 365, 72, 29);
		add(UserTelLabel);
		
		JLabel UserJuminLabel = new JLabel("주민번호");
		UserJuminLabel.setBounds(89, 433, 72, 29);
		add(UserJuminLabel);
		
		UserInfoIdTF = new JTextField();
		UserInfoIdTF.setBounds(204, 124, 133, 25);
		add(UserInfoIdTF);
		UserInfoIdTF.setColumns(10);
		
		UserInfoNameTF = new JTextField();
		UserInfoNameTF.setColumns(10);
		UserInfoNameTF.setBounds(204, 251, 133, 25);
		add(UserInfoNameTF);
		
		UserInfoEmailTF = new JTextField();
		UserInfoEmailTF.setColumns(10);
		UserInfoEmailTF.setBounds(204, 313, 133, 25);
		add(UserInfoEmailTF);
		
		UserInfoTelTF = new JTextField();
		UserInfoTelTF.setColumns(10);
		UserInfoTelTF.setBounds(204, 367, 133, 25);
		add(UserInfoTelTF);
		
		JButton Juminbtn = new JButton("회원정보수정");
		Juminbtn.setBounds(295, 523, 118, 29);
		add(Juminbtn);
		
		JButton Passwordbtn = new JButton("회원정보확인");
		Passwordbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		Passwordbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/************회원정보확인*******************/
				displayUserInfo(loginUser);
			}
		});
		Passwordbtn.setBounds(75, 523, 118, 29);
		add(Passwordbtn);
		
		UserInfoJuminTF = new JTextField();
		UserInfoJuminTF.setColumns(10);
		UserInfoJuminTF.setBounds(204, 435, 133, 25);
		add(UserInfoJuminTF);
		
		UserInfoPasswordTF = new JTextField();
		UserInfoPasswordTF.setColumns(10);
		UserInfoPasswordTF.setBounds(204, 191, 133, 25);
		add(UserInfoPasswordTF);
		
		this.userservice=new UserService();
	}
	
	private void displayUserInfo(User user) {
		UserInfoIdTF.setText(user.getUser_Id());
		UserInfoPasswordTF.setText(user.getUser_Password());
		UserInfoNameTF.setText(user.getUser_Name());
		UserInfoEmailTF.setText(user.getUser_Email());
		UserInfoTelTF.setText(user.getUser_Tel());
		UserInfoJuminTF.setText(user.getUser_Jumin());
	}
}