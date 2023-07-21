package ui.adminpanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class AdminUserManage extends JPanel {

	/**
	 * Create the panel.
	 */
	public AdminUserManage() {
		setLayout(null);
		
		JScrollPane adminMemberScrollPane = new JScrollPane();
		adminMemberScrollPane.setBounds(87, 84, 365, 131);
		add(adminMemberScrollPane);
		
		JButton adminUserListButton = new JButton("회원리스트");
		adminUserListButton.setBounds(129, 227, 117, 29);
		add(adminUserListButton);
		
		JButton adminUserDeleteButton = new JButton("삭제");
		adminUserDeleteButton.setBounds(279, 227, 117, 29);
		add(adminUserDeleteButton);

	}
}
