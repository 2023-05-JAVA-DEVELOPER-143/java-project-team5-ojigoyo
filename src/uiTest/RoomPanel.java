package uiTest;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RoomPanel extends JPanel {
private hotelByTypePanel hotelByTypePanel;
	/**
	 * Create the panel.
	 */
	public RoomPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel hotelTypeNamePanel = new JPanel();
		add(hotelTypeNamePanel, BorderLayout.NORTH);
		hotelTypeNamePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JLabel hotelNameLabel = new JLabel("객실소개\r\n");
		hotelNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hotelTypeNamePanel.add(hotelNameLabel);
		
		JButton type1Room = new JButton("다음");
		type1Room.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout =(CardLayout)hotelByTypePanel.getLayout();
				cardLayout.show(hotelByTypePanel, "다음");
				cardLayout.next(hotelByTypePanel);
			}
		});
		hotelTypeNamePanel.add(type1Room);
		
		
		
		JPanel hotelByTypePanel = new JPanel();
		add(hotelByTypePanel, BorderLayout.CENTER);
		hotelByTypePanel.setLayout(new CardLayout(0, 0));
		
		JPanel type1Panel = new JPanel();
		hotelByTypePanel.add(type1Panel, "name_2454150340765100");
		type1Panel.setLayout(null);
		
		JLabel type1RoomImg = new JLabel("");
		type1RoomImg.setIcon(new ImageIcon(RoomPanel.class.getResource("/uiTest/이미지/신라호텔.png")));
		type1RoomImg.setBounds(15, 35, 520, 360);
		type1Panel.add(type1RoomImg);
		
		JLabel type1NameLabel = new JLabel("디럭스");
		type1NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type1NameLabel.setBounds(15, 10, 520, 20);
		type1Panel.add(type1NameLabel);
		
		JLabel roomType1Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 1,000<br>\r\n\t\t\t침대 타입 : 슈퍼싱글<br>\r\n\t\t\t객실 크기 : 20 ㎡\r\n\t\t\r\n\r\n\t\r\n\t\t\r\n </font></html>");
		roomType1Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType1Info.setBounds(15, 425, 520, 80);
		type1Panel.add(roomType1Info);
		
		
		
		JPanel type2Panel = new JPanel();
		hotelByTypePanel.add(type2Panel, "name_2454152891215300");
		type2Panel.setLayout(null);
		
		JLabel type2RoomImage = new JLabel("");
		type2RoomImage.setIcon(new ImageIcon(RoomPanel.class.getResource("/uiTest/이미지/타임 b 객실.jpeg")));
		type2RoomImage.setBounds(15, 35, 520, 360);
		type2Panel.add(type2RoomImage);
		
		JLabel type2NameLabel = new JLabel("비즈니스 디럭스");
		type2NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type2NameLabel.setBounds(15, 10, 520, 20);
		type2Panel.add(type2NameLabel);
		
		JLabel roomType2Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 2,000<br>\r\n\t\t\t침대 타입 : 퀸<br>\r\n\t\t\t객실 크기 : 30 ㎡\r\n\t\t\r\n </font></html>");
		roomType2Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType2Info.setBounds(15, 425, 520, 80);
		type2Panel.add(roomType2Info);
		
		JPanel type3Panel = new JPanel();
		hotelByTypePanel.add(type3Panel, "name_2454154017618700");
		type3Panel.setLayout(null);
		
		JLabel type3RoomImage = new JLabel("");
		type3RoomImage.setIcon(new ImageIcon(RoomPanel.class.getResource("/uiTest/이미지/타입 a 객실.jpeg")));
		type3RoomImage.setBounds(15, 35, 520, 360);
		type3Panel.add(type3RoomImage);
		
		JLabel type3NameLabel = new JLabel("로열 스위트");
		type3NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type3NameLabel.setBounds(15, 10, 520, 20);
		type3Panel.add(type3NameLabel);
		
		JLabel roomType3Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 3,000<br>\r\n\t\t\t침대 타입 : 더블<br>\r\n\t\t\t객실 크기 : 40 ㎡\r\n\t\t\r\n </font></html>");
		roomType3Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType3Info.setBounds(15, 425, 520, 80);
		type3Panel.add(roomType3Info);
		
		JPanel type4Panel = new JPanel();
		hotelByTypePanel.add(type4Panel, "name_2454155204166900");
		type4Panel.setLayout(null);
		
		JLabel type4RoomImage = new JLabel("");
		type4RoomImage.setIcon(new ImageIcon(RoomPanel.class.getResource("/uiTest/이미지/타입 c 객실.jpeg")));
		type4RoomImage.setBounds(15, 30, 520, 360);
		type4Panel.add(type4RoomImage);
		
		JLabel type4NameLabel = new JLabel("신라 스위트");
		type4NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type4NameLabel.setBounds(15, 10, 520, 20);
		type4Panel.add(type4NameLabel);
		
		JLabel roomType4Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 4,000<br>\r\n\t\t\t침대 타입 : 더블 , 트윈<br>\r\n\t\t\t객실 크기 : 50 ㎡\r\n\t\t\r\n </font></html>");
		roomType4Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType4Info.setBounds(15, 420, 520, 80);
		type4Panel.add(roomType4Info);

	}

}
