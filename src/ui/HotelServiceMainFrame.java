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
import hotel.review.ReviewService;
import hotel.room.RoomService;
import hotel.room_type.RoomTypeService;

import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeEvent;

import hotel.comment.InquiriesCommentService;
import hotel.inquiries.InquiriesService;
import ui.reviewPanel.ReviewPanel;
import uiTest.RoomPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import ui.adminpanel.ReviewManagePanel;
import uiTest.inquiriesUitest;


public class HotelServiceMainFrame extends JFrame {
	
	private UserService userService;
	private RoomTypeService roomTypeService;
	private RoomService roomService;
	private ReviewService reviewService;
	private InquiriesService inquiriesService;
	private InquiriesCommentService inquiriesCommentService;
	private ReservService reservService;
	private JPanel contentPane;
	private adminReservPane adminReservPane;
	private User loginUser;
	private JTabbedPane adminPanel;
	private JTabbedPane mainTabbedPane;
	private JTabbedPane loginTab;
	private JTabbedPane myPagePanel;
	private ReservDetailDialog reservDetailDialog ;
	private InquiryMainPane adminInquiryMainPane;
	private MyReservPane myReservPane;
	private UserServiceUserInfoPanel userServiceUserInfoPanel;


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
		
		mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int selectedIndex = mainTabbedPane.getSelectedIndex();
				switch (selectedIndex) {
				case 0:
					break;
				case 1:
					if(mainTabbedPane.getTitleAt(1).equals("로그아웃")) {
						logoutProcess();
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					break;
				}
			}
		});
		mainTabbedPane.setBounds(5, 5, 576, 603);
		contentPane.add(mainTabbedPane);
		
		JPanel mainPanel = new JPanel();
		mainTabbedPane.addTab("메인", null, mainPanel, null);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사진");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainTabbedPane.setSelectedIndex(1);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(HotelServiceMainFrame.class.getResource("/uiTest/이미지/ㅅㅀㅌ2.jpg")));
		lblNewLabel.setBounds(0, 0, 571, 564);
		mainPanel.add(lblNewLabel);
		
		
		JTabbedPane loginTab = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.addTab("로그인", null, loginTab, null);
		

		UserServiceLoginPanel userServiceLoginPanel = new UserServiceLoginPanel(this);
		loginTab.addTab("로그인", null, userServiceLoginPanel, null);
		
		UserServiceCreateAccount userServiceCreateAccount = new UserServiceCreateAccount(this);
		loginTab.addTab("회원가입", null, userServiceCreateAccount, null);
		
		
		
		UserServiceFindIdPasswordPanel userServiceFindIdPasswordPanel = new UserServiceFindIdPasswordPanel(this);
		loginTab.addTab("아이디/비밀번호 찾기", null, userServiceFindIdPasswordPanel, null);
		
		myPagePanel = new JTabbedPane(JTabbedPane.TOP);
		myPagePanel.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int selectedIndex = myPagePanel.getSelectedIndex();
				if(selectedIndex==1) {
					try {
						myReservPane.displayDefaultList();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		mainTabbedPane.addTab("마이페이지", null, myPagePanel, null);
		
		userServiceUserInfoPanel = new UserServiceUserInfoPanel(this);
		myPagePanel.addTab("회원정보", null, userServiceUserInfoPanel, null);
		
		myReservPane = new MyReservPane(this);
		myPagePanel.addTab("예약 내역", null, myReservPane, null);
		
		RoomPanel roomPanel = new RoomPanel(this);
		mainTabbedPane.addTab("호텔소개", null, roomPanel, null);
		
		ReservSearchMainPain reservSearchMainPain = new ReservSearchMainPain(this);
		mainTabbedPane.addTab("예약하기", null, reservSearchMainPain, null);
		
		JTabbedPane inqPanel = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.addTab("고객센터", null, inqPanel, null);
		
		InquiryMainPane inquiryMainPane = new InquiryMainPane(this);
		inqPanel.addTab("문의", null, inquiryMainPane, null);
		
		ReviewPanel reviewPanel_1 = new ReviewPanel(this);
		inqPanel.addTab("리뷰", null, reviewPanel_1, null);
		
		inquiriesUitest inquiriesUitest__1 = new inquiriesUitest();
		inqPanel.addTab("문의2", null, inquiriesUitest__1, null);
		
		adminPanel = new JTabbedPane(JTabbedPane.TOP);
		adminPanel.addChangeListener(new ChangeListener() {
			

			

			public void stateChanged(ChangeEvent e) {
				int selectedTabIndex = adminPanel.getSelectedIndex();
					switch (selectedTabIndex) {
					case 0:
						break;
					case 1:
						try {
							adminInquiryMainPane.displayInquiries();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					case 2:
						try {
							adminReservPane.displayReserv();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					case 3:
						break;
					default:
						break;
					}
			}
		});
		mainTabbedPane.addTab("관리자", null, adminPanel, null);
		
		UserServiceManagePanel userServiceManagePanel = new UserServiceManagePanel();
		adminPanel.addTab("회원관리", null, userServiceManagePanel, null);
		
		AdminInquiryMainPane adminInquiryMainPane = new AdminInquiryMainPane(this);
		adminPanel.addTab("문의관리", null, adminInquiryMainPane, null);
		
		adminReservPane = new adminReservPane(this);
		adminPanel.addTab("예약 관리", null, adminReservPane, null);
		
		inquiriesUitest inquiriesUitest_ = new inquiriesUitest();
		adminPanel.addTab("문의관린", null, inquiriesUitest_, null);
		mainTabbedPane.setEnabledAt(2, false);
		mainTabbedPane.setEnabledAt(3, false);
		mainTabbedPane.setEnabledAt(4, false);
		mainTabbedPane.setEnabledAt(5, false);
		mainTabbedPane.setEnabledAt(6, false);
		
		
	}
	
	
		public User getLoginUser() {
		return loginUser;
	}

		void loginProcess(User localLoginUser) {
		this.loginUser =localLoginUser;
		setTitle(loginUser.getUser_Id()+"님 접속");
		mainTabbedPane.setEnabledAt(2,true);
		mainTabbedPane.setEnabledAt(3,true);
		mainTabbedPane.setEnabledAt(4,true);
		mainTabbedPane.setEnabledAt(5,true);
		mainTabbedPane.setEnabledAt(1, true);
		mainTabbedPane.setSelectedIndex(2);
		mainTabbedPane.setTitleAt(1, "로그아웃");
		userServiceUserInfoPanel.setEmptyTF();
		}
		void adminLogin(User localLoginUser) {
			this.loginUser = localLoginUser;
			mainTabbedPane.setEnabledAt(6,true);
			mainTabbedPane.setSelectedIndex(6);
			mainTabbedPane.setEnabledAt(1, true);
			setTitle("관리자모드");
			mainTabbedPane.setTitleAt(1, "로그아웃");
		}
		void logoutProcess() {
			mainTabbedPane.setEnabledAt(2, false);
			mainTabbedPane.setEnabledAt(3, false);
			mainTabbedPane.setEnabledAt(4, false);
			mainTabbedPane.setEnabledAt(5, false);
			mainTabbedPane.setEnabledAt(6, false);
			mainTabbedPane.setTitleAt(1, "로그인");
			mainTabbedPane.setSelectedIndex(1);
			JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");
			
			this.loginUser = null;
		}
		void goToMyReserv() {
			mainTabbedPane.setSelectedIndex(2);
			myPagePanel.setSelectedIndex(1);
		}
		void callReservDetailDialog(Reserv reserv) throws Exception {
			ReservDetailDialog reservDetailDialog = new ReservDetailDialog(reserv);
			reservDetailDialog.setModal(false);
			reservDetailDialog.setVisible(true);
		}
		void callPassCheckDialog(User loginUser) throws Exception{
			UserWithdrawalPassCheckDialog passCheckDialog = new UserWithdrawalPassCheckDialog(loginUser);
			passCheckDialog.setModal(true);
			passCheckDialog.setVisible(true);
		}
	}