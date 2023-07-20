package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import hotel.user.User;
import hotel.user.UserService;

public class CreateAccount extends JPanel {
	/**************************************/
	private UserService userservice;
	
	private JTextField joinIdTextField;
	private JPasswordField passwordTextField;
	private JTextField joinNameTextField;
	private JTextField joinEmailTextField;
	private JTextField joinTelTextField;
	private JTextField joinJuminTextField;
	private JTabbedPane memberTabbedPane;

	/**
	 * Create the panel.
	 */
	public CreateAccount() {
		setLayout(null);

		joinIdTextField = new JTextField();
		joinIdTextField.setBounds(287, 70, 116, 21);
		add(joinIdTextField);
		joinIdTextField.setColumns(10);

		JLabel joinIdLabel = new JLabel("아이디");
		joinIdLabel.setBounds(114, 73, 57, 15);
		add(joinIdLabel);

		JLabel joinPasswordLabel = new JLabel("패스워드");
		joinPasswordLabel.setBounds(114, 140, 57, 15);
		add(joinPasswordLabel);

		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(287, 138, 116, 18);
		add(passwordTextField);

		JLabel joinNameLabel = new JLabel("이름");
		joinNameLabel.setBounds(114, 206, 57, 15);
		add(joinNameLabel);

		JLabel joinTelLabel = new JLabel("전화번호");
		joinTelLabel.setBounds(114, 275, 57, 15);
		add(joinTelLabel);

		JLabel joinEmailLabel = new JLabel("이메일");
		joinEmailLabel.setBounds(114, 336, 57, 15);
		add(joinEmailLabel);

		JLabel joinJuminLabel = new JLabel("주민등록번호");
		joinJuminLabel.setBounds(114, 392, 80, 15);
		add(joinJuminLabel);

		joinNameTextField = new JTextField();
		joinNameTextField.setBounds(287, 203, 116, 21);
		add(joinNameTextField);
		joinNameTextField.setColumns(10);

		joinEmailTextField = new JTextField();
		joinEmailTextField.setBounds(287, 333, 116, 21);
		add(joinEmailTextField);
		joinEmailTextField.setColumns(10);

		joinTelTextField = new JTextField();
		joinTelTextField.setColumns(10);
		joinTelTextField.setBounds(287, 272, 116, 21);
		add(joinTelTextField);

		joinJuminTextField = new JTextField();
		joinJuminTextField.setColumns(10);
		joinJuminTextField.setBounds(287, 389, 116, 21);
		add(joinJuminTextField);

		JButton joinButton = new JButton("가입");
		joinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***************회원가입**************/
				try {
					/******TextField로 부터 데이타얻기*****/
					String id = joinIdTextField.getText();
					String password=passwordTextField.getText();
					String name=joinNameTextField.getText();
					String tel=joinTelTextField.getText();
					String email=joinEmailTextField.getText();
					String jumin=joinJuminTextField.getText();
					
					User user =new User(id, password, name, tel, email,jumin,null);
					boolean isAdd=
							userservice.create(user);

					if(isAdd) {
						//가입성공시 -->로그인화면전환
						System.out.println("가입성공");
					}else {
						//가입실패 -->아이디중복
						JOptionPane.showMessageDialog(null, id + " 는 이미사용하고 있는 아이디입니다.");
					
					}
					
					
				}catch (Exception e1) {
					System.out.println("회원가입에러-->"+e1.getMessage());
				}
			}
		});
		
		joinButton.setBounds(133, 474, 97, 23);
		add(joinButton);

		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(284, 474, 97, 23);
		add(cancelButton);
		
		JLabel idMsgLB = new JLabel("");
		idMsgLB.setBounds(287, 101, 116, 15);
		add(idMsgLB);

	}
}
