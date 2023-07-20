package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class UserInfoPanel extends JPanel {
	private JTextField UserInfoJuminTextField;
	private JTextField UserInfoEmailTextField;
	private JTextField UserInfoTelTextField;
	private JTextField UserInfoNameTextField;
	private JPasswordField UserInfoPassTextField;
	private JTextField UserInfoIdTextField;

	/**
	 * Create the panel.
	 */
	public UserInfoPanel() {
		setLayout(null);
		
		JLabel UserInfoIdLabel = new JLabel("아이디");
		UserInfoIdLabel.setBounds(112, 116, 57, 15);
		add(UserInfoIdLabel);
		
		JLabel UserInfoPasswordLabel = new JLabel("패스워드");
		UserInfoPasswordLabel.setBounds(112, 173, 57, 15);
		add(UserInfoPasswordLabel);
		
		JLabel UserInfoNameLabel = new JLabel("이름");
		UserInfoNameLabel.setBounds(112, 249, 57, 15);
		add(UserInfoNameLabel);
		
		JLabel UserInfoTelLabel = new JLabel("전화번호");
		UserInfoTelLabel.setBounds(112, 321, 57, 15);
		add(UserInfoTelLabel);
		
		JLabel UserInfoEmailLabel = new JLabel("이메일");
		UserInfoEmailLabel.setBounds(112, 379, 57, 15);
		add(UserInfoEmailLabel);
		
		JLabel UserInfoJuminLabel = new JLabel("주민등록번호");
		UserInfoJuminLabel.setBounds(112, 435, 80, 15);
		add(UserInfoJuminLabel);
		
		UserInfoJuminTextField = new JTextField();
		UserInfoJuminTextField.setColumns(10);
		UserInfoJuminTextField.setBounds(285, 432, 116, 21);
		add(UserInfoJuminTextField);
		
		UserInfoEmailTextField = new JTextField();
		UserInfoEmailTextField.setColumns(10);
		UserInfoEmailTextField.setBounds(285, 376, 116, 21);
		add(UserInfoEmailTextField);
		
		UserInfoTelTextField = new JTextField();
		UserInfoTelTextField.setColumns(10);
		UserInfoTelTextField.setBounds(285, 318, 116, 21);
		add(UserInfoTelTextField);
		
		UserInfoNameTextField = new JTextField();
		UserInfoNameTextField.setColumns(10);
		UserInfoNameTextField.setBounds(285, 246, 116, 21);
		add(UserInfoNameTextField);
		
		UserInfoPassTextField = new JPasswordField();
		UserInfoPassTextField.setBounds(285, 171, 116, 18);
		add(UserInfoPassTextField);
		
		UserInfoIdTextField = new JTextField();
		UserInfoIdTextField.setColumns(10);
		UserInfoIdTextField.setBounds(285, 113, 116, 21);
		add(UserInfoIdTextField);
		
		JButton UserInfoCheckButton = new JButton("회원정보");
		UserInfoCheckButton.setBounds(136, 516, 97, 23);
		add(UserInfoCheckButton);
		
		JButton UserInfoCancelButton = new JButton("취소");
		UserInfoCancelButton.setBounds(273, 516, 97, 23);
		add(UserInfoCancelButton);

	}

}
