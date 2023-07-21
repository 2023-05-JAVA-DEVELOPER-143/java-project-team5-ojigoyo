package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import hotel.user.User;
import hotel.user.UserService;


public class HotelServiceMainFrame extends JFrame {
	UserService userService;
	private User loginUser=null;
	
	
	private JPanel contentPane;
	private JTable table_1;


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
	 * @throws Exception 
	 */
	public HotelServiceMainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 576, 603);
		contentPane.add(tabbedPane);
		
		JPanel mainPanel = new JPanel();
		tabbedPane.addTab("메인", null, mainPanel, null);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사진");
		lblNewLabel.setIcon(new ImageIcon(HotelServiceMainFrame.class.getResource("/uiTest/이미지/ㅅㅀㅌ2.jpg")));
		lblNewLabel.setBounds(0, 0, 571, 564);
		mainPanel.add(lblNewLabel);
		
		
		JTabbedPane loginTab = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("로그인", null, loginTab, null);
		
		JPanel loginPanel = new JPanel();
		loginTab.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(new BorderLayout(0, 0));
		

		JPanel findIdPasswordPanel = new JPanel();
		loginTab.addTab("아이디,비밀번호찾기", null, findIdPasswordPanel, null);
		findIdPasswordPanel.setLayout(null);
		
		JPanel creatIdPanel = new JPanel();
		loginTab.addTab("회원가입", null, creatIdPanel, null);
		creatIdPanel.setLayout(new BorderLayout(0, 0));
		
		UserServiceCreateAccount createAccount = new UserServiceCreateAccount();
		creatIdPanel.add(createAccount, BorderLayout.CENTER);
		
		JTabbedPane myPagePanel = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("마이페이지", null, myPagePanel, null);
		
		JPanel panel_2 = new JPanel();
		myPagePanel.addTab("회원정보보기", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		myPagePanel.addTab("회원정보변경", null, panel_1, null);
		
		JPanel panel_4 = new JPanel();
		myPagePanel.addTab("예약내역", null, panel_4, null);
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
		
		JTabbedPane hotelPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("호텔 소개", null, hotelPane, null);
		
		JTabbedPane tabbedPane_11 = new JTabbedPane(JTabbedPane.TOP);
		hotelPane.addTab("호텔소개", null, tabbedPane_11, null);
		
		JTabbedPane tabbedPane_13 = new JTabbedPane(JTabbedPane.TOP);
		hotelPane.addTab("객실 소개", null, tabbedPane_13, null);
		
		JTabbedPane reservPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("예약", null, reservPanel, null);
		
		ReservSearchMainPain reservSearchMainPain = new ReservSearchMainPain();
		reservPanel.addTab("객실 조회", null, reservSearchMainPain, null);
		
		JTabbedPane inqPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("고객센터", null, inqPanel, null);
		
		JPanel inquiriesPanel = new JPanel();
		inqPanel.addTab("문의", null, inquiriesPanel, null);
		
		JPanel reviewPanel = new JPanel();
		inqPanel.addTab("리뷰", null, reviewPanel, null);
		
		JTabbedPane adminPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("관리자", null, adminPanel, null);
		
		JTabbedPane tabbedPane_18 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("회원관리", null, tabbedPane_18, null);
		
		JTabbedPane tabbedPane_19 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("예약관리", null, tabbedPane_19, null);
		
		JTabbedPane tabbedPane_20 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("리뷰관리", null, tabbedPane_20, null);
		
		JTabbedPane tabbedPane_21 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("문의글관리", null, tabbedPane_21, null);
		
		JTabbedPane tabbedPane_22 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("객실관리", null, tabbedPane_22, null);
	}
	
	
		private void loginProcess(User localLoginUser) {
		this.loginUser =localLoginUser;
		setTitle(loginUser.getUser_Id()+"님 접속");
		
		}
	}

