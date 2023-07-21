package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import hotel.user.User;
import hotel.user.UserService;

public class UserServiceLoginPanel extends JPanel {

	private JTextField loginIdTF;
	private JPasswordField loginPassTF;
	private JLabel loginPasswordMessageLabel;
	private JLabel userLoginIdMessageLabel;
	private JTextField userLoginIdTF;
	private JTextField UserLoginPasswordTF;
	


	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public UserServiceLoginPanel() throws Exception {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(126, 178, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(126, 275, 57, 15);
		add(lblNewLabel_1);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(126, 203, 316, 39);
		add(loginIdTF);
		loginIdTF.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		    }
		});
		
		btnNewButton.setBounds(216, 366, 146, 53);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(UserServiceLoginPanel.class.getResource("/uiTest/이미지/ㅅㅀㅌ.png")));
		lblNewLabel_2.setBounds(79, 51, 210, 53);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1_1 = new JButton("회원가입");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			}
		});
		btnNewButton_1_1.setBounds(416, 502, 97, 23);
		add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호 찾기");
		lblNewLabel_3.setBounds(248, 429, 91, 31);
		add(lblNewLabel_3);
		
		loginPassTF = new JPasswordField();
		loginPassTF.setBounds(126, 300, 316, 42);
		add(loginPassTF);
		
		JLabel userLoginIdMessageLabel = new JLabel("");
		userLoginIdMessageLabel.setBounds(126, 244, 297, 23);
		add(userLoginIdMessageLabel);
		
		JLabel userLoginIdMessageLabel_1 = new JLabel("");
		userLoginIdMessageLabel_1.setBounds(126, 344, 297, 23);
		add(userLoginIdMessageLabel_1);
		


		
	}//생성자 끝
		

	    
	    

	}
	



	

