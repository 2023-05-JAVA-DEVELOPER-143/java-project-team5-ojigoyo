package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FindPasswordPanel extends JPanel {
	private JTextField findPassJuminTextField;
	private JTextField findPassNameTextField;
	private JTextField findPassIdTextField;

	/**
	 * Create the panel.
	 */
	public FindPasswordPanel() {
		setLayout(null);
		
		JLabel findPassNameLabel = new JLabel("이름");
		findPassNameLabel.setBounds(114, 195, 57, 15);
		add(findPassNameLabel);
		
		JLabel findPassJuminLabel = new JLabel("주민등록번호");
		findPassJuminLabel.setBounds(114, 241, 80, 15);
		add(findPassJuminLabel);
		
		findPassJuminTextField = new JTextField();
		findPassJuminTextField.setBounds(285, 238, 116, 21);
		findPassJuminTextField.setColumns(10);
		add(findPassJuminTextField);
		
		findPassNameTextField = new JTextField();
		findPassNameTextField.setBounds(285, 192, 116, 21);
		findPassNameTextField.setColumns(10);
		add(findPassNameTextField);
		
		JButton findPassButton = new JButton("비밀번호 찾기");
		findPassButton.setBounds(124, 297, 109, 23);
		add(findPassButton);
		
		JButton findPassCancelButton = new JButton("취소");
		findPassCancelButton.setBounds(268, 297, 97, 23);
		add(findPassCancelButton);
		
		JLabel findPassIdLabel = new JLabel("아이디");
		findPassIdLabel.setBounds(114, 149, 57, 15);
		add(findPassIdLabel);
		
		findPassIdTextField = new JTextField();
		findPassIdTextField.setBounds(285, 146, 116, 21);
		add(findPassIdTextField);
		findPassIdTextField.setColumns(10);

	}

}
