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
import com.toedter.calendar.JDateChooser;

import hotel.user.User;

public class MyReservPane extends JPanel {
	private JTable table;
	private ReservService reservService;
	private JDateChooser firstDateChooser;
	private JDateChooser lastDateChooser;
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public MyReservPane() throws Exception {
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
				User loginMember = new User();
				
				try {
					reservService.findMyReservByDate(loginMember.getUser_Id(),firstDateChooser.getDate(), lastDateChooser.getDate());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
		
		firstDateChooser = new JDateChooser();
		firstDateChooser.setBounds(126, 171, 73, 21);
		panel.add(firstDateChooser);
		
		lastDateChooser = new JDateChooser();
		lastDateChooser.setBounds(276, 171, 73, 21);
		panel.add(lastDateChooser);

		reservService = new ReservService();
	}
}
