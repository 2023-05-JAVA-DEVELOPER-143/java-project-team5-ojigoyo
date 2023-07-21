package uiTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class RoomInfo extends JFrame {

	private JPanel contentPane;
	private JPanel hotelByTypePanel;
	private JPanel hotelTypeNamePanel;

	
	public void nextType() {
		JButton nextTypePanelButton = new JButton("다음");
		nextTypePanelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout =(CardLayout)hotelByTypePanel.getLayout();
				cardLayout.show(hotelByTypePanel, "1번 타입");
				cardLayout.next(hotelByTypePanel);
			}
		});
	}
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomInfo frame = new RoomInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RoomInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		hotelTypeNamePanel = new JPanel();
		hotelTypeNamePanel.setBackground(SystemColor.info);
		contentPane.add(hotelTypeNamePanel, BorderLayout.NORTH);
		hotelTypeNamePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JLabel hotelNameLabel = new JLabel("\t\t\t           \t객실소개\t\t                                                    \t\t\r\n");
		hotelNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hotelTypeNamePanel.add(hotelNameLabel);
		
		JButton type1Room = new JButton("다음");
		type1Room.setFont(new Font("HY엽서M", Font.PLAIN, 12));
		type1Room.setBorderPainted(false);
		type1Room.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		type1Room.setBackground(SystemColor.info);
		type1Room.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout =(CardLayout)hotelByTypePanel.getLayout();
				cardLayout.show(hotelByTypePanel, "1번 타입");
				cardLayout.next(hotelByTypePanel);
			}
		});
		hotelTypeNamePanel.add(type1Room);
		
		hotelByTypePanel = new JPanel();
		contentPane.add(hotelByTypePanel, BorderLayout.CENTER);
		hotelByTypePanel.setLayout(new CardLayout(0, 0));
		
		JPanel type1Panel = new JPanel();
		type1Panel.setBackground(SystemColor.info);
		hotelByTypePanel.add(type1Panel, "name_2420029485635000");
		type1Panel.setLayout(null);
		
		JLabel type1RoomImg = new JLabel("");
		type1RoomImg.setIcon(new ImageIcon(RoomInfo.class.getResource("/uiTest/이미지/신라호텔.png")));
		type1RoomImg.setBounds(15, 35, 520, 360);
		type1Panel.add(type1RoomImg);
		
		JLabel type1NameLabel = new JLabel("1번 타입 객실 ");
		type1NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type1NameLabel.setForeground(Color.BLACK);
		type1NameLabel.setBackground(SystemColor.info);
		type1NameLabel.setBounds(15, 10, 520, 20);
		type1Panel.add(type1NameLabel);
		
		JLabel roomType1Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 1,000<br>\r\n\t\t\t침대 타입 : 슈퍼싱글<br>\r\n\t\t\t객실 크기 : 20 ㎡\r\n\t\t\r\n </font></html>");
		roomType1Info.setFont(new Font("굴림", Font.BOLD, 20));
		roomType1Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType1Info.setBounds(15, 425, 520, 80);
		type1Panel.add(roomType1Info);
		
		JPanel type2Panel = new JPanel();
		type2Panel.setBackground(SystemColor.info);
		hotelByTypePanel.add(type2Panel, "name_2420030468526700");
		type2Panel.setLayout(null);
		
		JLabel type2RoomImage = new JLabel("");
		type2RoomImage.setIcon(new ImageIcon(RoomInfo.class.getResource("/uiTest/이미지/타임 b 객실.jpeg")));
		type2RoomImage.setBounds(15, 35, 520, 360);
		type2Panel.add(type2RoomImage);
		
		JLabel type2NameLabel = new JLabel("2번 타입 객실");
		type2NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type2NameLabel.setBounds(15, 10, 520, 20);
		type2Panel.add(type2NameLabel);
		
		JLabel roomType2Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 2,000<br>\r\n\t\t\t침대 타입 : 퀸<br>\r\n\t\t\t객실 크기 : 30 ㎡\r\n\t\t\r\n </font></html>");
		roomType2Info.setFont(new Font("굴림", Font.BOLD, 20));
		roomType2Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType2Info.setBounds(15, 425, 520, 80);
		type2Panel.add(roomType2Info);
		
		
		
		JPanel type3Panel = new JPanel();
		type3Panel.setBackground(SystemColor.info);
		hotelByTypePanel.add(type3Panel, "name_2420031555246500");
		type3Panel.setLayout(null);
		
		JLabel type3RoomImage = new JLabel("");
		type3RoomImage.setIcon(new ImageIcon(RoomInfo.class.getResource("/uiTest/이미지/타입 a 객실.jpeg")));
		type3RoomImage.setBounds(15, 35, 520, 360);
		type3Panel.add(type3RoomImage);
		
		JLabel type3NameLabel = new JLabel("3번 타입 객실");
		type3NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type3NameLabel.setBounds(15, 10, 520, 20);
		type3Panel.add(type3NameLabel);
		
		JLabel roomType3Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 3,000<br>\r\n\t\t\t침대 타입 : 더블<br>\r\n\t\t\t객실 크기 : 40 ㎡\r\n\t\t\r\n </font></html>");
		roomType3Info.setFont(new Font("굴림", Font.BOLD, 20));
		roomType3Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType3Info.setBounds(15, 425, 520, 80);
		type3Panel.add(roomType3Info);
		
	
		
		JPanel type4Panel = new JPanel();
		type4Panel.setBackground(SystemColor.info);
		hotelByTypePanel.add(type4Panel, "name_2420032556234400");
		type4Panel.setLayout(null);
		
		JLabel type4RoomImage = new JLabel("");
		type4RoomImage.setIcon(new ImageIcon(RoomInfo.class.getResource("/uiTest/이미지/타입 c 객실.jpeg")));
		type4RoomImage.setBounds(15, 30, 520, 360);
		type4Panel.add(type4RoomImage);
		
		JLabel type4NameLabel = new JLabel("4번 타입 객실");
		type4NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		type4NameLabel.setBounds(15, 10, 520, 20);
		type4Panel.add(type4NameLabel);
		
		JLabel roomType4Info = new JLabel("<html>\r\n\t<font size='5'>\r\n\t\r\n\t\t\t가격        : 4,000<br>\r\n\t\t\t침대 타입 : 더블 , 트윈<br>\r\n\t\t\t객실 크기 : 50 ㎡\r\n\t\t\r\n </font></html>");
		roomType4Info.setFont(new Font("굴림", Font.BOLD, 20));
		roomType4Info.setHorizontalAlignment(SwingConstants.CENTER);
		roomType4Info.setBounds(15, 420, 520, 80);
		type4Panel.add(roomType4Info);
	}
}

