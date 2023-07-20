package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CreateAccount extends JPanel {
	private JTextField joinIdTextField;
	private JPasswordField passwordTextField;
	private JTextField joinNameTextField;
	private JTextField joinEmailTextField;
	private JTextField joinTelTextField;
	private JTextField joinJuminTextField;

	/**
	 * Create the panel.
	 */
	public CreateAccount() {
		setLayout(null);

		joinIdTextField = new JTextField();
		joinIdTextField.setBounds(305, 132, 116, 21);
		add(joinIdTextField);
		joinIdTextField.setColumns(10);

		JLabel joinIdLabel = new JLabel("아이디");
		joinIdLabel.setBounds(134, 135, 57, 15);
		add(joinIdLabel);

		JLabel joinPasswordLabel = new JLabel("패스워드");
		joinPasswordLabel.setBounds(134, 200, 57, 15);
		add(joinPasswordLabel);

		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(305, 198, 116, 18);
		add(passwordTextField);

		JLabel joinNameLabel = new JLabel("이름");
		joinNameLabel.setBounds(134, 265, 57, 15);
		add(joinNameLabel);

		JLabel joinTelLabel = new JLabel("전화번호");
		joinTelLabel.setBounds(134, 330, 57, 15);
		add(joinTelLabel);

		JLabel joinEmailLabel = new JLabel("이메일");
		joinEmailLabel.setBounds(134, 395, 57, 15);
		add(joinEmailLabel);

		JLabel joinJuminLabel = new JLabel("주민등록번호");
		joinJuminLabel.setBounds(134, 460, 80, 15);
		add(joinJuminLabel);

		joinNameTextField = new JTextField();
		joinNameTextField.setBounds(305, 262, 116, 21);
		add(joinNameTextField);
		joinNameTextField.setColumns(10);

		joinEmailTextField = new JTextField();
		joinEmailTextField.setBounds(305, 387, 116, 21);
		add(joinEmailTextField);
		joinEmailTextField.setColumns(10);

		joinTelTextField = new JTextField();
		joinTelTextField.setColumns(10);
		joinTelTextField.setBounds(305, 327, 116, 21);
		add(joinTelTextField);

		joinJuminTextField = new JTextField();
		joinJuminTextField.setColumns(10);
		joinJuminTextField.setBounds(305, 457, 116, 21);
		add(joinJuminTextField);

		JButton joinButton = new JButton("가입");
		joinButton.setBounds(143, 531, 97, 23);
		add(joinButton);

		JButton cancelButton = new JButton("취소");
		cancelButton.setBounds(278, 531, 97, 23);
		add(cancelButton);

	}
}
