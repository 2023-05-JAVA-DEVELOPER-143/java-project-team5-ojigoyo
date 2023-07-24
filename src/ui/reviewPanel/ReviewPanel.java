package ui.reviewPanel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import hotel.review.Review;
import hotel.review.ReviewService;
import hotel.user.User;
import ui.HotelServiceMainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ReviewPanel extends JPanel {
	
	/***** 1.ReviewService 멤버필드 선언*****/
	private ReviewService reviewService;
	
	/***** 로그인한User객체저장할 User객체선언 **********/
	private User loginUser;
	private Review review;

	private JTable reviewListTable;
	private JButton reviewListButton;
	private JButton reviewWriteButton;
	private JTextField reviewTitleTextField;
	private JTextField reviewContentTextField;
	private JTextField reviewContentTextField2;
	private JTextField reviewTitleTextField2;
	private HotelServiceMainFrame hotelServiceMainFrame;
	private JButton reviewDeleteButton;
	private JButton reviewUpdateFormButton;
	private JButton reviewUpdateButton;
	private JTextField reviewWriterTextField;
	private JTextField reviewWriterTextField2;
	private JTextField reviewUseRoomTextField;

	/**
	 * Create the panel.
	 * @param hotelServiceMainFrame
	 */
	public ReviewPanel(HotelServiceMainFrame hotelServiceMainFrame) throws Exception {
		setLayout(new BorderLayout(0, 0));
		
		JPanel reviewPanel = new JPanel();
		reviewPanel.setBackground(new Color(255, 255, 255));
		add(reviewPanel, BorderLayout.CENTER);
		reviewPanel.setLayout(null);
		
		JPanel parentPanel = new JPanel();
		parentPanel.setBounds(0, 0, 570, 600);
		reviewPanel.add(parentPanel);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		JPanel reviewListPanel = new JPanel();
		reviewListPanel.setBackground(new Color(255, 255, 255));
		parentPanel.add(reviewListPanel, "reviewList");
		reviewListPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		scrollPane.setBounds(58, 155, 452, 270);
		reviewListPanel.add(scrollPane);
		
		reviewListTable = new JTable();
		reviewListTable.setGridColor(new Color(231, 231, 231));
		reviewListTable.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewListTable.setSelectionBackground(new Color(235, 235, 235));
		reviewListTable.setRowHeight(25);
		reviewListTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*************** 리뷰내용 보기 ***************/
				try {
					CardLayout cardLayout = (CardLayout)parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewUpdateDelete");
			
					int row = reviewListTable.getSelectedRow();
					review = reviewService.findByReviewNo((Integer)reviewListTable.getValueAt(row, 0));
					reviewUseRoomTextField.setText(review.getReserv().getRoom().getRoomType().getRoomTypeName());
					reviewTitleTextField2.setText(review.getReview_title());
					reviewContentTextField2.setText(review.getReview_content());
					reviewWriterTextField2.setText(review.getUser().getUser_Id());
					
					reviewUseRoomTextField.setEditable(false);
					reviewTitleTextField2.setEditable(false);
					reviewContentTextField2.setEditable(false);
					reviewUpdateButton.setEnabled(false);
					
					if (review.getUser().getUser_Id().equals(hotelServiceMainFrame.getLoginUser().getUser_Id())) {
						reviewUpdateFormButton.setEnabled(true);
						reviewDeleteButton.setEnabled(true);
					} else {
						reviewUpdateFormButton.setEnabled(false);
						reviewDeleteButton.setEnabled(false);
					}
					
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		reviewListTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uB8F8\uD0C0\uC785", "\uC81C\uBAA9", "\uC791\uC131\uC790", "\uC791\uC131\uC77C"
			}
		));
		scrollPane.setViewportView(reviewListTable);
		
		reviewListButton = new JButton("리뷰 리스트");
		reviewListButton.setBackground(new Color(255, 255, 255));
		reviewListButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reviewListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*************** 리뷰 리스트 보기 ***************/
				try {
					displayReviewList();
					reviewListButton.setEnabled(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		reviewListButton.setBounds(410, 461, 100, 23);
		reviewListPanel.add(reviewListButton);
		
		reviewWriteButton = new JButton("리뷰 쓰기");
		reviewWriteButton.setBackground(new Color(255, 255, 255));
		reviewWriteButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reviewWriteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**************** 리뷰쓰기 버튼 클릭시 로그인 체크 ***************/
				if (hotelServiceMainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(null, "로그인시 작성 가능합니다.");
				} else {
					CardLayout cardLayout = (CardLayout)parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewWrite");
					reviewTitleTextField.setText("");
					reviewContentTextField.setText("");
					String reviewWriter = hotelServiceMainFrame.getLoginUser().getUser_Id();
					reviewWriterTextField.setText(reviewWriter);
					reviewTitleTextField.requestFocus();
				}
			}
		});
		reviewWriteButton.setBounds(301, 461, 100, 23);
		reviewListPanel.add(reviewWriteButton);
		
		JLabel mainTextLabel = new JLabel("고객리뷰");
		mainTextLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		mainTextLabel.setBounds(58, 48, 106, 43);
		reviewListPanel.add(mainTextLabel);
		
		JLabel lineLabel = new JLabel("");
		lineLabel.setIcon(new ImageIcon(ReviewPanel.class.getResource("/uiTest/이미지/substract (2).png")));
		lineLabel.setBounds(58, 111, 452, 1);
		reviewListPanel.add(lineLabel);
		
		JPanel reviewWritePanel = new JPanel();
		reviewWritePanel.setBackground(new Color(255, 255, 255));
		parentPanel.add(reviewWritePanel, "reviewWrite");
		reviewWritePanel.setLayout(null);
		
		JLabel reviewTitleLabel = new JLabel("제목");
		reviewTitleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		reviewTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reviewTitleLabel.setBounds(105, 99, 57, 15);
		reviewWritePanel.add(reviewTitleLabel);
		
		JLabel reviewContentLabel = new JLabel("내용");
		reviewContentLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		reviewContentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reviewContentLabel.setBounds(105, 171, 57, 15);
		reviewWritePanel.add(reviewContentLabel);
		
		reviewTitleTextField = new JTextField();
		reviewTitleTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewTitleTextField.setDisabledTextColor(new Color(109, 109, 109));
		reviewTitleTextField.setBounds(228, 99, 243, 25);
		reviewWritePanel.add(reviewTitleTextField);
		reviewTitleTextField.setColumns(10);
		
		reviewContentTextField = new JTextField();
		reviewContentTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewContentTextField.setBounds(228, 171, 243, 227);
		reviewWritePanel.add(reviewContentTextField);
		reviewContentTextField.setColumns(10);
		
		JButton reviewInsertButton = new JButton("등록");
		reviewInsertButton.setBackground(new Color(255, 255, 255));
		reviewInsertButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reviewInsertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*************** 리뷰작성 및 등록 **************/
				try {
					String reviewTitle = reviewTitleTextField.getText();
					String reviewContent = reviewContentTextField.getText();
					String reviewWriter = hotelServiceMainFrame.getLoginUser().getUser_Id();
					Review insertReview = new Review(0, null, reviewTitle, reviewContent, new User(reviewWriter, null, null, null, null, null, null), null);
					
					if (reviewTitle.equals("") && reviewContent.equals("")) {
						JOptionPane.showMessageDialog(null, "제목과 내용을 입력하세요.");
					} else if (reviewTitle.equals("")) {
						JOptionPane.showMessageDialog(null, "제목을 입력하세요.");
					} else if (reviewContent.equals("")) {
						JOptionPane.showMessageDialog(null, "내용을 입력하세요.");
					} else {
						reviewService.insertReview(insertReview);
						JOptionPane.showMessageDialog(null, "등록되었습니다.");
						CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
						cardLayout.show(parentPanel, "reviewUpdateDelete");
						reviewTitleTextField2.setText(reviewTitle);
						reviewContentTextField2.setText(reviewContent);
						reviewWriterTextField2.setText(reviewWriter);
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		reviewInsertButton.setBounds(240, 492, 97, 23);
		reviewWritePanel.add(reviewInsertButton);
		
		JButton reviewListHomeButton = new JButton("");
		reviewListHomeButton.setIcon(new ImageIcon(ReviewPanel.class.getResource("/uiTest/이미지/left-chevron (1).png")));
		reviewListHomeButton.setBorder(null);
		reviewListHomeButton.setBackground(new Color(255, 255, 255));
		reviewListHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/************ 리뷰 메인 화면으로 돌아가기 ***********/
				CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
				cardLayout.show(parentPanel, "reviewList");
				reviewListButton.setEnabled(true);
			}
		});
		reviewListHomeButton.setBounds(22, 22, 20, 20);
		reviewWritePanel.add(reviewListHomeButton);
		
		reviewWriterTextField = new JTextField();
		reviewWriterTextField.setBackground(new Color(255, 255, 255));
		reviewWriterTextField.setEditable(false);
		reviewWriterTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewWriterTextField.setBounds(228, 426, 106, 25);
		reviewWritePanel.add(reviewWriterTextField);
		reviewWriterTextField.setColumns(10);
		
		JLabel reviewWriterLabel = new JLabel("작성자");
		reviewWriterLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		reviewWriterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reviewWriterLabel.setBounds(121, 429, 52, 15);
		reviewWritePanel.add(reviewWriterLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(132, 51, 331, 25);
		reviewWritePanel.add(comboBox);
		
		JPanel reviewUpdateDeletePanel = new JPanel();
		reviewUpdateDeletePanel.setBackground(new Color(255, 255, 255));
		parentPanel.add(reviewUpdateDeletePanel, "reviewUpdateDelete");
		reviewUpdateDeletePanel.setLayout(null);
		
		JLabel reviewTitleLabel_1 = new JLabel("제목");
		reviewTitleLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		reviewTitleLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		reviewTitleLabel_1.setBounds(105, 118, 57, 15);
		reviewUpdateDeletePanel.add(reviewTitleLabel_1);
		
		reviewTitleTextField2 = new JTextField();
		reviewTitleTextField2.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewTitleTextField2.setBackground(new Color(255, 255, 255));
		reviewTitleTextField2.setEditable(false);
		reviewTitleTextField2.setColumns(10);
		reviewTitleTextField2.setBounds(228, 118, 243, 25);
		reviewUpdateDeletePanel.add(reviewTitleTextField2);
		
		JLabel reviewContentLabel_1 = new JLabel("내용");
		reviewContentLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		reviewContentLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		reviewContentLabel_1.setBounds(105, 171, 57, 15);
		reviewUpdateDeletePanel.add(reviewContentLabel_1);
		
		reviewContentTextField2 = new JTextField();
		reviewContentTextField2.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewContentTextField2.setBackground(new Color(255, 255, 255));
		reviewContentTextField2.setEditable(false);
		reviewContentTextField2.setColumns(10);
		reviewContentTextField2.setBounds(228, 171, 243, 227);
		reviewUpdateDeletePanel.add(reviewContentTextField2);
		
		reviewDeleteButton = new JButton("삭제");
		reviewDeleteButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reviewDeleteButton.setBackground(new Color(255, 255, 255));
		reviewDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					/*************** 리뷰삭제 ***************/
					reviewService.deleteReview(review.getReview_no());
					JOptionPane.showMessageDialog(null, "삭제되었습니다.");
					CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewList");
					displayReviewList();
					reviewListButton.setEnabled(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		reviewDeleteButton.setBounds(131, 492, 97, 23);
		reviewUpdateDeletePanel.add(reviewDeleteButton);
		
		reviewUpdateFormButton = new JButton("수정폼");
		reviewUpdateFormButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reviewUpdateFormButton.setBackground(new Color(255, 255, 255));
		reviewUpdateFormButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reviewUpdateFormButton.setEnabled(false);
				reviewUpdateButton.setEnabled(true);
				reviewUseRoomTextField.setEditable(false);
				reviewTitleTextField2.setEditable(true);
				reviewContentTextField2.setEditable(true);
				reviewWriterTextField2.setEnabled(false);
			}
		});
		reviewUpdateFormButton.setBounds(240, 492, 97, 23);
		reviewUpdateDeletePanel.add(reviewUpdateFormButton);
		
		reviewUpdateButton = new JButton("수정");
		reviewUpdateButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		reviewUpdateButton.setBackground(new Color(255, 255, 255));
		reviewUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					/*************** 리뷰수정 ***************/
					String reviewTitle = reviewTitleTextField2.getText();
					String reviewContent = reviewContentTextField2.getText();
					String reviewWriter = hotelServiceMainFrame.getLoginUser().getUser_Id();
					
					review = new Review(review.getReview_no(), null, reviewTitle, reviewContent, new User(reviewWriter, null, null, null, null, null, null), null);
					reviewService.updateReview(review);
					
					reviewTitleTextField2.setText(review.getReview_title());
					reviewContentTextField2.setText(review.getReview_content());
					JOptionPane.showMessageDialog(null, "수정되었습니다.");
					
					CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewList");
					displayReviewList();
					reviewListButton.setEnabled(true);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		reviewUpdateButton.setBounds(349, 492, 97, 23);
		reviewUpdateDeletePanel.add(reviewUpdateButton);
		
		JButton reviewListHomeButton2 = new JButton("");
		reviewListHomeButton2.setIcon(new ImageIcon(ReviewPanel.class.getResource("/uiTest/이미지/left-chevron (1).png")));
		reviewListHomeButton2.setBackground(new Color(255, 255, 255));
		reviewListHomeButton2.setBorder(null);
		reviewListHomeButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					/*************** 리뷰메인 화면으로 돌아가기 ***************/
					CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewList");
					displayReviewList();
					reviewListButton.setEnabled(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		reviewListHomeButton2.setBounds(22, 22, 20, 20);
		reviewUpdateDeletePanel.add(reviewListHomeButton2);
		
		reviewWriterTextField2 = new JTextField();
		reviewWriterTextField2.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewWriterTextField2.setBackground(new Color(255, 255, 255));
		reviewWriterTextField2.setDisabledTextColor(new Color(57, 57, 57));
		reviewWriterTextField2.setEditable(false);
		reviewWriterTextField2.setColumns(10);
		reviewWriterTextField2.setBounds(228, 426, 106, 25);
		reviewUpdateDeletePanel.add(reviewWriterTextField2);
		
		JLabel reviewWriterLabel2 = new JLabel("작성자");
		reviewWriterLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		reviewWriterLabel2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		reviewWriterLabel2.setBounds(121, 429, 52, 15);
		reviewUpdateDeletePanel.add(reviewWriterLabel2);
		
		reviewUseRoomTextField = new JTextField();
		reviewUseRoomTextField.setBackground(new Color(255, 255, 255));
		reviewUseRoomTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		reviewUseRoomTextField.setBounds(228, 72, 106, 21);
		reviewUpdateDeletePanel.add(reviewUseRoomTextField);
		reviewUseRoomTextField.setColumns(10);
		
		JLabel useRoomTypeLabel = new JLabel("룸타입");
		useRoomTypeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		useRoomTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		useRoomTypeLabel.setBounds(113, 75, 52, 15);
		reviewUpdateDeletePanel.add(useRoomTypeLabel);
		
		/***** 2. ReviewService 멤버필드객체생성 *****/
	
		this.reviewService = new ReviewService();
		review = new Review();
		this.hotelServiceMainFrame=hotelServiceMainFrame;
		
	} // 생성자 끝
	
	/************** 리뷰리스트 보기 ***************/
	private void displayReviewList() throws Exception {
		try {
			List<Review> reviewList = reviewService.findByAll();
			
			Vector columVector = new Vector();
			columVector.add("번호");
			columVector.add("룸타입");
			columVector.add("제목");
			columVector.add("작성자");
			columVector.add("작성일");
			
			Vector tableVector = new Vector();
			
			for (Review review : reviewList) {
				Vector rowVector = new Vector();
				rowVector.add(review.getReview_no());
				rowVector.add(review.getReserv().getRoom().getRoomType().getRoomTypeName());
				rowVector.add(review.getReview_title());
				rowVector.add(review.getUser().getUser_Id());
				rowVector.add(review.getReview_date());
				tableVector.add(rowVector);
			}
			DefaultTableModel tableModel = new DefaultTableModel(tableVector, columVector);
			reviewListTable.setModel(tableModel);
			reviewListButton.setEnabled(false);
		} catch (Exception e1) {
			System.out.println("리뷰리스트 보기 에러 --> " + e1.getMessage());
		}
			
	}
}
	
