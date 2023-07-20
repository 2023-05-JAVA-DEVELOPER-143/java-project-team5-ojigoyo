package ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FindIdPanel extends JPanel {
	private JTextField findIdJuminTextField;
	private JTextField findIdNameTextField;

	/**
	 * Create the panel.
	 */
	public FindIdPanel() {
		setLayout(null);
		
		JLabel findIdNameLabel = new JLabel("이름");
		findIdNameLabel.setBounds(114, 146, 57, 15);
		add(findIdNameLabel);
		
		JLabel findIdJuminLabel = new JLabel("주민등록번호");
		findIdJuminLabel.setBounds(115, 192, 80, 15);
		add(findIdJuminLabel);
		
		findIdJuminTextField = new JTextField();
		findIdJuminTextField.setBounds(286, 189, 116, 21);
		findIdJuminTextField.setColumns(10);
		add(findIdJuminTextField);
		
		findIdNameTextField = new JTextField();
		findIdNameTextField.setBounds(286, 143, 116, 21);
		findIdNameTextField.setColumns(10);
		add(findIdNameTextField);
		
		JButton findIdButton = new JButton("아이디 찾기");
		findIdButton.setBounds(124, 297, 109, 23);
		add(findIdButton);
		
		JButton findIdCancelButton = new JButton("취소");
		findIdCancelButton.setBounds(268, 297, 97, 23);
		add(findIdCancelButton);

	}

}
