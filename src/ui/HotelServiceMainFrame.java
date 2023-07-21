package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

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
import hotel.reserv.Reserv;
import hotel.reserv.ReservService;
import hotel.reserv.adminReservPane;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeEvent;
import hotel.reserv.MyReservPane;
import ui.reviewPanel.ReviewPanel;
import ui.reviewPanel.reviewWritePanel;
import uiTest.RoomPanel;


public class HotelServiceMainFrame extends JFrame {
	
	private UserService userService;
	
	private ReservService reservService;
	private JPanel contentPane;
	private adminReservPane adminReservPane;
	private User loginUser;


	/**
	 * 
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
		

		UserServiceLoginPanel userServiceLoginPanel = new UserServiceLoginPanel();
		loginTab.addTab("로그인", null, userServiceLoginPanel, null);
		
		UserServiceCreateAccount userServiceCreateAccount = new UserServiceCreateAccount();
		loginTab.addTab("회원가입", null, userServiceCreateAccount, null);
		
		
		
		UserServiceFindIdPasswordPanel userServiceFindIdPasswordPanel = new UserServiceFindIdPasswordPanel();
		loginTab.addTab("아이디/비밀번호 찾기", null, userServiceFindIdPasswordPanel, null);
		
		JTabbedPane myPagePanel = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("마이페이지", null, myPagePanel, null);
		
		UserServiceUserInfoPanel userServiceUserInfoPanel = new UserServiceUserInfoPanel();
		myPagePanel.addTab("회원정보변경", null, userServiceUserInfoPanel, null);
		
		MyReservPane myReservPane = new MyReservPane();
		myPagePanel.addTab("예약 내역", null, myReservPane, null);
		
		RoomPanel roomPanel = new RoomPanel();
		tabbedPane.addTab("호텔소개", null, roomPanel, null);
		
		JTabbedPane reservPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("예약", null, reservPanel, null);
		
		ReservSearchMainPain reservSearchMainPain = new ReservSearchMainPain();
		reservPanel.addTab("예약하기", null, reservSearchMainPain, null);
		
		JTabbedPane inqPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("고객센터", null, inqPanel, null);
		
		JPanel inquiriesPanel = new JPanel();
		inqPanel.addTab("문의", null, inquiriesPanel, null);
		
		ReviewPanel reviewPanel_1 = new ReviewPanel();
		inqPanel.addTab("리뷰", null, reviewPanel_1, null);
		
		reviewWritePanel reviewWritePanel_ = new reviewWritePanel();
		inqPanel.addTab("리뷰 작성", null, reviewWritePanel_, null);
		
		JTabbedPane adminPanel = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addChangeListener(new ChangeListener() {
			

			public void stateChanged(ChangeEvent e) {
				int selectedTabIndex = adminPanel.getSelectedIndex();
				try {
				if(selectedTabIndex ==3) {
						adminReservPane.displayReserv();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		tabbedPane.addTab("관리자", null, adminPanel, null);
		
		JTabbedPane tabbedPane_18 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("회원관리", null, tabbedPane_18, null);
		
		JTabbedPane tabbedPane_20 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("리뷰관리", null, tabbedPane_20, null);
		
		JTabbedPane tabbedPane_21 = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addTab("문의글관리", null, tabbedPane_21, null);
		
		adminReservPane = new adminReservPane();
		adminPanel.addTab("예약 관리", null, adminReservPane, null);
		
		
	}
	
	
		private void loginProcess(User localLoginUser) {
		this.loginUser =localLoginUser;
		setTitle(loginUser.getUser_Id()+"님 접속");
		
		}
	}
