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
	private JTextField infoIdTF;
	private JTextField infoNameTF;
	private JTextField infoPhoneTF;
	private JTextField infoEmailTF;
	private JTextField infoJuminTF;
	private JPasswordField infoPassTF;
	private JTextField loginIdTF;
	private JPasswordField loginPassTF;


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
		
		
		JPanel LOGIN = new JPanel();
		loginTab.addTab("LOGIN", null, LOGIN, null);
		LOGIN.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(96, 119, 57, 15);
		LOGIN.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setBounds(96, 223, 71, 15);
		LOGIN.add(lblNewLabel_3);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(96, 162, 296, 38);
		LOGIN.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********회원로그인************/
				try {
					String id = loginIdTF.getText();
					String pass=new String(loginPassTF.getPassword());
					User localLoginMember =  userService.login(id, pass);
					if(localLoginMember!=null) {
						//로그인성공
						loginProcess(localLoginMember);
						
					}else {
						//로그인실패
						JOptionPane.showMessageDialog(null, "아이디또는 비밀번호를 확인하세요");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(id.length());
						loginIdTF.requestFocus();
					}
					
					
					
				}catch (Exception e1) {
					System.out.println("회원로그인에러-->"+e1.getMessage());
				}
			}


		});
		loginBtn.setBounds(213, 345, 97, 23);
		LOGIN.add(loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.setBounds(419, 498, 97, 23);
		LOGIN.add(joinBtn);
		
		loginPassTF = new JPasswordField();
		loginPassTF.setBounds(99, 273, 295, 39);
		LOGIN.add(loginPassTF);
		
		JPanel findIdPanel = new JPanel();
		loginTab.addTab("아이디찾기", null, findIdPanel, null);
		findIdPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(129, 152, 57, 15);
		findIdPanel.add(lblNewLabel_1);
		
		JPanel findpasswordPanel = new JPanel();
		loginTab.addTab("비밀번호찾기", null, findpasswordPanel, null);
		findpasswordPanel.setLayout(null);
		
		JPanel creatIdPanel = new JPanel();
		loginTab.addTab("회원가입", null, creatIdPanel, null);
		creatIdPanel.setLayout(new BorderLayout(0, 0));
		
		CreateAccount createAccount = new CreateAccount();
		creatIdPanel.add(createAccount, BorderLayout.CENTER);
		
		JTabbedPane myPagePanel = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("마이페이지", null, myPagePanel, null);
		
		JPanel panel_2 = new JPanel();
		myPagePanel.addTab("회원정보보기", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(90, 41, 81, 26);
		panel_2.add(lblId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(90, 99, 81, 26);
		panel_2.add(lblPassword);
		
		JLabel label_2 = new JLabel("이름");
		label_2.setBounds(90, 161, 81, 26);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("전화번호");
		label_3.setBounds(90, 224, 81, 26);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("이메일");
		label_4.setBounds(90, 293, 81, 26);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("주민등록번호");
		label_5.setBounds(90, 365, 81, 26);
		panel_2.add(label_5);
		
		infoIdTF = new JTextField();
		infoIdTF.setBounds(258, 41, 126, 24);
		panel_2.add(infoIdTF);
		infoIdTF.setColumns(10);
		
		infoNameTF = new JTextField();
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(258, 164, 126, 24);
		panel_2.add(infoNameTF);
		
		infoPhoneTF = new JTextField();
		infoPhoneTF.setColumns(10);
		infoPhoneTF.setBounds(258, 227, 126, 24);
		panel_2.add(infoPhoneTF);
		
		infoEmailTF = new JTextField();
		infoEmailTF.setColumns(10);
		infoEmailTF.setBounds(258, 296, 126, 24);
		panel_2.add(infoEmailTF);
		
		infoJuminTF = new JTextField();
		infoJuminTF.setColumns(10);
		infoJuminTF.setBounds(258, 368, 126, 24);
		panel_2.add(infoJuminTF);
		
		JButton btnNewButton_1 = new JButton("변경하기");
		btnNewButton_1.setBounds(280, 465, 118, 28);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("회원정보");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***************************/
				displayUserInfo(loginUser);
			}

		});
		btnNewButton_1_1.setBounds(72, 468, 118, 28);
		panel_2.add(btnNewButton_1_1);
		
		infoPassTF = new JPasswordField();
		infoPassTF.setBounds(258, 101, 126, 24);
		panel_2.add(infoPassTF);
		
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
		
		JTabbedPane tabbedPane_9 = new JTabbedPane(JTabbedPane.TOP);
		reservPanel.addTab("객실 검색", null, tabbedPane_9, null);
		
		JTabbedPane tabbedPane_10 = new JTabbedPane(JTabbedPane.TOP);
		reservPanel.addTab("예약 조회", null, tabbedPane_10, null);
		
		JPanel panel_6 = new JPanel();
		reservPanel.addTab("예약화면", null, panel_6, null);
		
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
		
		private void displayUserInfo(User loginUser) {
			infoIdTF.setText(loginUser.getUser_Id());
			infoPassTF.setText(loginUser.getUser_Password());
			infoNameTF.setText(loginUser.getUser_Name());
			infoPhoneTF.setText(loginUser.getUser_Tel());
			infoEmailTF.setText(loginUser.getUser_Email());
			infoJuminTF.setText(loginUser.getUser_Jumin());
			}
	

		
	}

