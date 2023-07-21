package hotel.reserv;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

import hotel.user.User;
import ui.HotelServiceMainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ReservDetailPane extends JPanel {
	private HotelServiceMainFrame hotelServiceMainFrame;
	private User loginUser;
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public ReservDetailPane(HotelServiceMainFrame hotelServiceMainFrame) throws Exception {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("예약정보");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel.setBounds(229, 48, 98, 59);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 145, 474, 354);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		this.hotelServiceMainFrame=hotelServiceMainFrame;
	}
}
