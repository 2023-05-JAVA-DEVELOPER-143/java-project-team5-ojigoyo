package hotel.reserv;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminReservPane extends JPanel {
	private JTextField userNameTF;
	private JTable allMemberReservtable;

	/**
	 * Create the panel.
	 */
	public adminReservPane() {
		setLayout(null);
		
		JLabel memberReserv = new JLabel("회원 예약 내역");
		memberReserv.setFont(new Font("굴림", Font.BOLD, 20));
		memberReserv.setBounds(67, 75, 147, 56);
		add(memberReserv);
		
		userNameTF = new JTextField();
		userNameTF.setBounds(242, 88, 147, 35);
		add(userNameTF);
		userNameTF.setColumns(10);
		
		JButton findByUserBtn = new JButton("검색");
		findByUserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		findByUserBtn.setBounds(418, 94, 97, 23);
		add(findByUserBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 163, 437, 281);
		add(scrollPane);
		
		allMemberReservtable = new JTable();
		scrollPane.setViewportView(allMemberReservtable);
		
		JButton cancelReservBtn = new JButton("예약취소");
		cancelReservBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancelReservBtn.setBounds(389, 467, 97, 23);
		add(cancelReservBtn);

	}
}
