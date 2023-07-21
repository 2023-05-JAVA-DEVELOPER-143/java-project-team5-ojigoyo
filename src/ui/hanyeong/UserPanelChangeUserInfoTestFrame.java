package ui.hanyeong;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import hotel.user.User;
import hotel.user.UserService;

public class UserPanelChangeUserInfoTestFrame extends JFrame {
	private UserService userservice;
	private User loginUser=null;

	private JPanel contentPane;
	private JTextField UserInfoIdTF;
	private JTextField UserInfoPasswordTF;
	private JTextField UserInfoNameTF;
	private JTextField UserInfoTelTF;
	private JTextField UserInfoEmailTF;
	private JTextField UserInfoJuminTF;
	private JButton ChangeEndUserInfoButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPanelChangeUserInfoTestFrame frame = new UserPanelChangeUserInfoTestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public UserPanelChangeUserInfoTestFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userInfoPasswordLabel = new JLabel("패스워드");
		userInfoPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userInfoPasswordLabel.setBounds(93, 118, 83, 26);
		contentPane.add(userInfoPasswordLabel);
		
		JLabel userInfoNameLabel = new JLabel("이름");
		userInfoNameLabel.setBounds(119, 182, 57, 15);
		contentPane.add(userInfoNameLabel);
		
		JLabel userInfoTelLabel = new JLabel("전화번호");
		userInfoTelLabel.setBounds(119, 254, 57, 15);
		contentPane.add(userInfoTelLabel);
		
		JLabel userInfoEmailLabel = new JLabel("이메일");
		userInfoEmailLabel.setBounds(119, 320, 57, 15);
		contentPane.add(userInfoEmailLabel);
		
		JLabel userInfoJuminLabel = new JLabel("주민번호");
		userInfoJuminLabel.setBounds(119, 386, 57, 15);
		contentPane.add(userInfoJuminLabel);
		
		JLabel userInfoIdLabel = new JLabel("아이디");
		userInfoIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userInfoIdLabel.setBounds(93, 65, 83, 18);
		contentPane.add(userInfoIdLabel);
		
		UserInfoIdTF = new JTextField();
		UserInfoIdTF.setEnabled(false);
		UserInfoIdTF.setBounds(243, 54, 146, 29);
		contentPane.add(UserInfoIdTF);
		UserInfoIdTF.setColumns(10);
		
		UserInfoPasswordTF = new JTextField();
		UserInfoPasswordTF.setEnabled(false);
		UserInfoPasswordTF.setColumns(10);
		UserInfoPasswordTF.setBounds(243, 115, 146, 29);
		contentPane.add(UserInfoPasswordTF);
		
		UserInfoNameTF = new JTextField();
		UserInfoNameTF.setEnabled(false);
		UserInfoNameTF.setColumns(10);
		UserInfoNameTF.setBounds(243, 179, 146, 29);
		contentPane.add(UserInfoNameTF);
		
		UserInfoTelTF = new JTextField();
		UserInfoTelTF.setEnabled(false);
		UserInfoTelTF.setColumns(10);
		UserInfoTelTF.setBounds(243, 251, 146, 29);
		contentPane.add(UserInfoTelTF);
		
		UserInfoEmailTF = new JTextField();
		UserInfoEmailTF.setEnabled(false);
		UserInfoEmailTF.setColumns(10);
		UserInfoEmailTF.setBounds(243, 317, 146, 29);
		contentPane.add(UserInfoEmailTF);
		
		UserInfoJuminTF = new JTextField();
		UserInfoJuminTF.setEnabled(false);
		UserInfoJuminTF.setColumns(10);
		UserInfoJuminTF.setBounds(243, 383, 146, 29);
		contentPane.add(UserInfoJuminTF);
		
		JButton ChangeUserInfoButton = new JButton("수정하기");
		ChangeUserInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		ChangeUserInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/****************수정**************/
			updateFormEnable(true);
			}
		});
		ChangeUserInfoButton.setBounds(93, 462, 117, 36);
		contentPane.add(ChangeUserInfoButton);
		
		JButton ChangeEndUserInfoButton = new JButton("수정!");
		ChangeEndUserInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ChangeEndUserInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/************회원수정****************/
				String id = UserInfoIdTF.getText();
				String password = UserInfoPasswordTF.getText();
				String name = UserInfoNameTF.getText();
				String tel = UserInfoTelTF.getText();
				String email=UserInfoEmailTF.getText();
				String jumin=UserInfoJuminTF.getText();
				
				User updateUser = new User(id,password,name,tel,email,jumin,null);
				//userservice.up=
			}
		});
		ChangeEndUserInfoButton.setBounds(319, 462, 117, 36);
		contentPane.add(ChangeEndUserInfoButton);
		
		this.userservice =new UserService();
		
	}
	private  void updateFormEnable(boolean a) {
		if(a) {
			//활성화
			UserInfoIdTF.setEnabled(true);
			UserInfoPasswordTF.setEnabled(true);
			UserInfoNameTF.setEnabled(true);
			UserInfoTelTF.setEnabled(true);
			UserInfoEmailTF.setEnabled(true);
			UserInfoJuminTF.setEnabled(true);
			
			ChangeEndUserInfoButton.setEnabled(true);
			System.out.println("수정시작");
		}else {
			
		}
	}
}
