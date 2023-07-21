package ui.reviewPanel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import hotel.user.User;
import ui.HotelServiceMainFrame;

import javax.swing.JButton;

public class reviewWritePanel extends JPanel {
	private JTextField reviewTitleTextField;
	private JTextField reviewContentTextField;
	private HotelServiceMainFrame hotelServiceMainFrame;
	private User loginUser;

	/**
	 * Create the panel.
	 * @param hotelServiceMainFrame 
	 * @throws Exception 
	 */
	public reviewWritePanel(HotelServiceMainFrame hotelServiceMainFrame) throws Exception {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel reviewTitleLabel = new JLabel("제목");
		reviewTitleLabel.setBounds(92, 184, 57, 15);
		panel.add(reviewTitleLabel);
		
		reviewTitleTextField = new JTextField();
		reviewTitleTextField.setBounds(205, 181, 275, 21);
		panel.add(reviewTitleTextField);
		reviewTitleTextField.setColumns(10);
		
		JLabel reviewContentLabel = new JLabel("내용");
		reviewContentLabel.setBounds(92, 266, 57, 15);
		panel.add(reviewContentLabel);
		
		reviewContentTextField = new JTextField();
		reviewContentTextField.setBounds(205, 266, 275, 226);
		panel.add(reviewContentTextField);
		reviewContentTextField.setColumns(10);
		
		JButton reviewInsertButton = new JButton("등록");
		reviewInsertButton.setBounds(236, 535, 97, 23);
		panel.add(reviewInsertButton);

		this.hotelServiceMainFrame=hotelServiceMainFrame;
		this.loginUser =hotelServiceMainFrame.getLoginUser();
	}
}
