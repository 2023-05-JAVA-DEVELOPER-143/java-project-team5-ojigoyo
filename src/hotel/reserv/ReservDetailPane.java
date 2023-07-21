package hotel.reserv;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservDetailPane extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReservDetailPane() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("예약정보");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel.setBounds(231, 87, 98, 59);
		add(lblNewLabel);
		
		JButton updateReservFormBtn = new JButton("수정폼");
		updateReservFormBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		updateReservFormBtn.setBounds(82, 486, 97, 23);
		add(updateReservFormBtn);
		
		JButton updateReservBtn = new JButton("수정하기");
		updateReservBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		updateReservBtn.setBounds(231, 486, 97, 23);
		add(updateReservBtn);
		
		JButton reservCancelDetailBtn = new JButton("취소");
		reservCancelDetailBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reservCancelDetailBtn.setBounds(382, 486, 97, 23);
		add(reservCancelDetailBtn);

	}
}
