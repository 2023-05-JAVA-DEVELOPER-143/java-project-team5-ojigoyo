package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class HotelServiceMainFrame extends JFrame {

	private JPanel contentPane;

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
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("마이페이지", null, tabbedPane_1, null);
		
		JLabel lblNewLabel_1 = new JLabel("카드레이아웃으로 맨 처음 화면은 로고, 다음 로그인화면, 다음 탭페널로 이동 ");
		tabbedPane_1.addTab("회원정보보기", null, lblNewLabel_1, null);
		
		JTabbedPane tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("회원정보 변경", null, tabbedPane_6, null);
		
		JTabbedPane tabbedPane_7 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("이용내역조회", null, tabbedPane_7, null);
		
		JTabbedPane tabbedPane_8 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("예약내역 ", null, tabbedPane_8, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("예약", null, tabbedPane_2, null);
		
		JTabbedPane tabbedPane_9 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.addTab("객실 검색", null, tabbedPane_9, null);
		
		JTabbedPane tabbedPane_10 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.addTab("예약 조회", null, tabbedPane_10, null);
		
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
