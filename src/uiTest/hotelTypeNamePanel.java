package uiTest;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import ui.HotelServiceMainFrame;

public class hotelTypeNamePanel extends JPanel {
	private hotelByTypePanel hotelByTypePanel;

	private JLabel hotelNameLabel;
	private JButton type1Room;
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public hotelTypeNamePanel() throws Exception {
		setLayout(null);
		
		hotelNameLabel = new JLabel("\t\t\t           \t객실소개\t\t                                                    \t\t");
		hotelNameLabel.setBounds(81, 58, 300, 15);
		hotelNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(hotelNameLabel);
		     
		type1Room = new JButton("다음");
		type1Room.setBounds(393, 54, 57, 23);
		type1Room.setFont(new Font("HY엽서M", Font.PLAIN, 12));
		type1Room.setBorderPainted(false);
		type1Room.setAlignmentY(Component.TOP_ALIGNMENT);
		type1Room.setBackground(SystemColor.info);
		type1Room.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout =(CardLayout)hotelByTypePanel.getLayout();
				cardLayout.show(hotelByTypePanel, "1번 타입");
				cardLayout.next(hotelByTypePanel);
			}
		});
		add(type1Room);
hotelByTypePanel = new hotelByTypePanel();
	}

}
