package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HotelServiceMainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	private JTextField textField_2;

	private JTable table;
	private JTable table_1;
	private JTable table_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelServiceMainFrame frame = new HotelServiceMainFrame();
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
	public HotelServiceMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 576, 603);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("로그인", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(103, 111, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호");
		lblNewLabel_3.setBounds(103, 163, 57, 15);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(314, 108, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(314, 163, 116, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(225, 214, 97, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("비밀번호찾기");
		btnNewButton_1.setBounds(134, 502, 116, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("회원가입");
		btnNewButton_2.setBounds(314, 502, 97, 23);
		panel.add(btnNewButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("리얼?");
		chckbxNewCheckBox.setBounds(207, 447, 115, 23);
		panel.add(chckbxNewCheckBox);
		
		textField_2 = new JTextField();
		textField_2.setText("회원가입 인정하십니까?");
		textField_2.setBounds(47, 296, 373, 123);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("마이페이지", null, tabbedPane_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("회원정보보기", null, panel_2, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("회원정보변경", null, panel_1, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("이용내역조회", null, panel_3, null);
		panel_3.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(331, 62, 32, 23);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(201, 62, 32, 23);
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("조회기간");
		lblNewLabel_1.setBounds(72, 66, 50, 15);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("~");
		lblNewLabel_4.setBounds(263, 66, 50, 15);
		panel_3.add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("검색");
		btnNewButton_3.setBounds(412, 62, 91, 23);
		panel_3.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 120, 482, 344);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("예약내역", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("예약취소");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(384, 89, 91, 23);
		panel_4.add(btnNewButton_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(52, 177, 453, 296);
		panel_4.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("쿠폰", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(77, 125, 419, 376);
		panel_5.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("예약", null, tabbedPane_2, null);
		
		JTabbedPane tabbedPane_9 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.addTab("객실 검색", null, tabbedPane_9, null);
		
		JTabbedPane tabbedPane_10 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.addTab("예약 조회", null, tabbedPane_10, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("예약화면", null, panel_6, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("호텔 소개", null, tabbedPane_3, null);
		
		JTabbedPane tabbedPane_11 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.addTab("호텔소개", null, tabbedPane_11, null);
		
		JTabbedPane tabbedPane_12 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.addTab("오시는길", null, tabbedPane_12, null);
		
		JTabbedPane tabbedPane_13 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.addTab("객실 소개", null, tabbedPane_13, null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("리뷰", null, tabbedPane_4, null);
		
		JTabbedPane tabbedPane_14 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.addTab("리뷰목록", null, tabbedPane_14, null);
		
		JTabbedPane tabbedPane_15 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.addTab("리뷰작성", null, tabbedPane_15, null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("고객센터", null, tabbedPane_5, null);
		
		JLabel lblNewLabel = new JLabel("New label");
		tabbedPane_5.addTab("고객센터", null, lblNewLabel, null);
		
		JTabbedPane tabbedPane_16 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.addTab("1:1문의", null, tabbedPane_16, null);
		
		JTabbedPane tabbedPane_17 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("관리자", null, tabbedPane_17, null);
		
		JTabbedPane tabbedPane_18 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_17.addTab("회원관리", null, tabbedPane_18, null);
		
		JTabbedPane tabbedPane_19 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_17.addTab("예약관리", null, tabbedPane_19, null);
		
		JTabbedPane tabbedPane_20 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_17.addTab("리뷰관리", null, tabbedPane_20, null);
		
		JTabbedPane tabbedPane_21 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_17.addTab("문의글관리", null, tabbedPane_21, null);
		
		JTabbedPane tabbedPane_22 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_17.addTab("객실관리", null, tabbedPane_22, null);
	}
}
