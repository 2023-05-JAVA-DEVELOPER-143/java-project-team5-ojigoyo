package uiTest;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Rectangle;

public class hotelByTypePanel extends JPanel {
	private JLabel roomType1Info;
	private JPanel type4Panel;
	private JPanel type3Panel;
	private JPanel type2Panel;
	private JPanel type1Panel;

	public hotelByTypePanel() {
		setLayout(new CardLayout(0, 0));
		
		type1Panel = new JPanel();
		add(type1Panel, "name_2442334822737000");
		type1Panel.setLayout(null);
		
		JLabel type1RoomImg = new JLabel("");
		type1RoomImg.setIcon(new ImageIcon(hotelByTypePanel.class.getResource("/uiTest/이미지/신라호텔.png")));
		type1RoomImg.setBounds(15, 35, 520, 360);
		type1Panel.add(type1RoomImg);
		
		JLabel type1NameLabel = new JLabel("디럭스");
		type1NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type1NameLabel.setBackground(SystemColor.info);
		type1NameLabel.setBounds(15, 10, 520, 20);
		type1Panel.add(type1NameLabel);
		
		roomType1Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 1,000<br>\r\n\t\t\t침대 타입 : 슈퍼싱글<br>\r\n\t\t\t객실 크기 : 20 ㎡\r\n\t\t\r\n\r\n\t\r\n\t\t\r\n </font></html>");
		roomType1Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType1Info.setBounds(15, 425, 520, 80);
		type1Panel.add(roomType1Info);
		
		type2Panel = new JPanel();
		add(type2Panel, "name_2442336546148800");
		type2Panel.setLayout(null);
		
		JLabel type2RoomImage = new JLabel("");
		type2RoomImage.setIcon(new ImageIcon(hotelByTypePanel.class.getResource("/images/타임 b 객실.jpeg")));
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
		
		type3Panel = new JPanel();
		add(type3Panel, "name_2442337720438000");
		type3Panel.setLayout(null);
		
		JLabel type3RoomImage = new JLabel("");
		type3RoomImage.setIcon(new ImageIcon(hotelByTypePanel.class.getResource("/images/타입 a 객실.jpeg")));
		type3RoomImage.setBounds(15, 35, 520, 240);
		type3Panel.add(type3RoomImage);
		
		JLabel type3NameLabel = new JLabel("로열 스위트");
		type3NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type3NameLabel.setBounds(15, 10, 520, 20);
		type3Panel.add(type3NameLabel);
		
		JLabel roomType3Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 3,000<br>\r\n\t\t\t침대 타입 : 더블<br>\r\n\t\t\t객실 크기 : 40 ㎡\r\n\t\t\r\n </font></html>");
		roomType3Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType3Info.setBounds(15, 425, 520, 80);
		type3Panel.add(roomType3Info);
		
		type4Panel = new JPanel();
		add(type4Panel, "name_2442338986781800");
		type4Panel.setLayout(null);
		
		JLabel type4RoomImage = new JLabel("");
		type4RoomImage.setBounds(new Rectangle(15, 30, 520, 360));
		type4RoomImage.setIcon(new ImageIcon(hotelByTypePanel.class.getResource("/images/타입 c 객실.jpeg")));
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
