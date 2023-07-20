package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class real extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					real frame = new real();
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
	public real() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("메인", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("로그인", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		panel_1.add(tabbedPane_2, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		tabbedPane_2.addTab("로그인", null, panel_15, null);
		
		JPanel panel_16 = new JPanel();
		tabbedPane_2.addTab("아이디찾기", null, panel_16, null);
		
		JPanel panel_17 = new JPanel();
		tabbedPane_2.addTab("비밀번호찾기", null, panel_17, null);
		
		JPanel panel_18 = new JPanel();
		tabbedPane_2.addTab("회원가입", null, panel_18, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("마이페이지", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		panel_2.add(tabbedPane_3, BorderLayout.CENTER);
		
		JPanel panel_19 = new JPanel();
		tabbedPane_3.addTab("회원정보", null, panel_19, null);
		
		JPanel panel_26 = new JPanel();
		tabbedPane_3.addTab("New tab", null, panel_26, null);
		
		JPanel panel_20 = new JPanel();
		tabbedPane_3.addTab("회원정보변경", null, panel_20, null);
		
		JPanel panel_21 = new JPanel();
		tabbedPane_3.addTab("New tab", null, panel_21, null);
		
		JPanel panel_22 = new JPanel();
		tabbedPane_3.addTab("New tab", null, panel_22, null);
		
		JPanel panel_23 = new JPanel();
		tabbedPane_3.addTab("New tab", null, panel_23, null);
		
		JPanel panel_24 = new JPanel();
		tabbedPane_3.addTab("New tab", null, panel_24, null);
		
		JPanel panel_25 = new JPanel();
		tabbedPane_3.addTab("New tab", null, panel_25, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("예약", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("호텔소개", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("리뷰", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("고객센터", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("관리자", null, panel_7, null);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		panel_7.add(tabbedPane_1, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_8, null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_9, null);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_10, null);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_11, null);
		
		JPanel panel_12 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_12, null);
		
		JPanel panel_13 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_13, null);
		
		JPanel panel_14 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_14, null);
	}

}
