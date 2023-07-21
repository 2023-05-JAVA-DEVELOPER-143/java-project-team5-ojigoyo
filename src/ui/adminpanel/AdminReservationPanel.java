package ui.adminpanel;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class AdminReservationPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AdminReservationPanel() {
		setLayout(null);
		
		JButton adminUserDelelteButton = new JButton("삭제");
		adminUserDelelteButton.setBounds(273, 211, 117, 29);
		add(adminUserDelelteButton);
		
		JButton adminReservationListButton = new JButton("예약리스트");
		adminReservationListButton.setBounds(145, 211, 117, 29);
		add(adminReservationListButton);
		
		JScrollPane adminMemberScrollPane = new JScrollPane();
		adminMemberScrollPane.setBounds(88, 68, 365, 131);
		add(adminMemberScrollPane);

	}

}
