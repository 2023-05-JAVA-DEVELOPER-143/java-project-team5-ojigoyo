package hotel.reserv;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ReservSearchMainPain extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReservSearchMainPain() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox checkInSearchBox = new JComboBox();
		checkInSearchBox.setToolTipText("");
		checkInSearchBox.setBounds(59, 132, 199, 31);
		panel.add(checkInSearchBox);
		
		JComboBox checkOutSearchBox = new JComboBox();
		checkOutSearchBox.setBounds(308, 132, 199, 31);
		panel.add(checkOutSearchBox);
		
		JButton reservSearchBtn = new JButton("검색");
		reservSearchBtn.setBounds(212, 189, 139, 31);
		panel.add(reservSearchBtn);
		
		JLabel lblNewLabel = new JLabel("예약");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel.setBounds(252, 51, 54, 71);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 243, 448, 274);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 446, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 272, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("체크인 날짜");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(118, 109, 106, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("체크아웃 날짜");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(365, 109, 113, 25);
		panel.add(lblNewLabel_2);

	}
}
