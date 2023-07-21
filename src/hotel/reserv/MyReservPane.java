package hotel.reserv;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyReservPane extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public MyReservPane() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 예약 확인");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(208, 107, 141, 45);
		panel.add(lblNewLabel);
		
		JButton myReservBtn = new JButton("검색");
		myReservBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		myReservBtn.setBounds(393, 155, 102, 45);
		panel.add(myReservBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 310, 417, 226);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("예약취소");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(376, 246, 97, 23);
		panel.add(btnNewButton);

	}
}
