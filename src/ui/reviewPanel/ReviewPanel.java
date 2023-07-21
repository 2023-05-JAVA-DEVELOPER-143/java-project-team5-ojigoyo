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

public class ReviewPanel extends JPanel {
	
	/***** 1.ReviewService 멤버필드 선언*****/
	ReviewService reviewService;
	
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

	/**
	 * Create the panel.
	 * @param hotelServiceMainFrame 
	 * @param loginUser2 
	 */
	public ReviewPanel(HotelServiceMainFrame hotelServiceMainFrame) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel InquiriesPanel = new JPanel();
		InquiriesPanel.setBackground(new Color(255, 255, 255));
		add(InquiriesPanel, BorderLayout.CENTER);
		InquiriesPanel.setLayout(null);
		
		JPanel parentPanel = new JPanel();
		parentPanel.setBounds(0, 0, 570, 600);
		InquiriesPanel.add(parentPanel);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		JPanel reviewListPanel = new JPanel();
		parentPanel.add(reviewListPanel, "reviewList");
		reviewListPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 161, 452, 270);
		reviewListPanel.add(scrollPane);
		
		reviewListTable = new JTable();
		reviewListTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					CardLayout cardLayout = (CardLayout)parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewUpdateDelte");
			
					int row = reviewListTable.getSelectedRow();
					review = reviewService.findByReviewNo((Integer)reviewListTable.getValueAt(row, 0));
					reviewTitleTextField2.setText(review.getReview_title());
					reviewContentTextField2.setText(review.getReview_content());
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		reviewListTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uC81C\uBAA9", "\uC791\uC131\uC77C"
			}
		));
		scrollPane.setViewportView(reviewListTable);
		
		reviewListButton = new JButton("리뷰 리스트");
		reviewListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*************** 리뷰 리스트 보기 **********/
				try {
					displayReviewList();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		reviewListButton.setBounds(413, 451, 97, 23);
		reviewListPanel.add(reviewListButton);
		
		reviewWriteButton = new JButton("리뷰 쓰기");
		reviewWriteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*********** 리뷰쓰기 버튼 클릭 **********/
				
				if (hotelServiceMainFrame.getLoginUser() == null) {
					JOptionPane.showMessageDialog(null, "로그인시 작성 가능합니다.");
				} else {
					CardLayout cardLayout = (CardLayout)parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewWritePanel");
				}
				
				CardLayout cardLayout = (CardLayout)parentPanel.getLayout();
				cardLayout.show(parentPanel, "review");
				reviewTitleTextField.setText("");
				reviewContentTextField.setText("");
			}
		});
		reviewWriteButton.setBounds(304, 451, 97, 23);
		reviewListPanel.add(reviewWriteButton);
		
		JPanel reviewPanel = new JPanel();
		parentPanel.add(reviewPanel, "review");
		reviewPanel.setLayout(null);
		
		JLabel reviewTitleLabel = new JLabel("제목");
		reviewTitleLabel.setBounds(105, 161, 57, 15);
		reviewPanel.add(reviewTitleLabel);
		
		JLabel reviewContentLabel = new JLabel("내용");
		reviewContentLabel.setBounds(105, 261, 57, 15);
		reviewPanel.add(reviewContentLabel);
		
		reviewTitleTextField = new JTextField();
		reviewTitleTextField.setBounds(217, 158, 243, 21);
		reviewPanel.add(reviewTitleTextField);
		reviewTitleTextField.setColumns(10);
		
		reviewContentTextField = new JTextField();
		reviewContentTextField.setBounds(217, 258, 243, 227);
		reviewPanel.add(reviewContentTextField);
		reviewContentTextField.setColumns(10);
		
		JButton reviewInsertButton = new JButton("등록");
		reviewInsertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/********** 등록 버튼 클릭 *********/
				try {
					String reviewTitle = reviewTitleTextField.getText();
					String reviewContent = reviewContentTextField.getText();
					Review insertReview = new Review(0, null, reviewTitle, reviewContent);
					
					if (reviewTitle.equals("") && reviewContent.equals("")) {
						JOptionPane.showMessageDialog(null, "제목과 내용을 입력하세요.");
					} else if (reviewTitle.equals("")) {
						JOptionPane.showMessageDialog(null, "제목을 입력하세요.");
					} else if (reviewContent.equals("")) {
						JOptionPane.showMessageDialog(null, "내용을 입력하세요.");
					} else {
						reviewService.insertReview(insertReview);
						reviewTitleTextField.setText("");
						reviewContentTextField.setText("");
						CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
						cardLayout.show(parentPanel, "reviewList");
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		reviewInsertButton.setBounds(363, 521, 97, 23);
		reviewPanel.add(reviewInsertButton);
		
		JButton reviewListHomeButton = new JButton("리뷰 리스트");
		reviewListHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/******* 리뷰 리스트 화면으로 돌아가기 ******/
				CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
				cardLayout.show(parentPanel, "reviewList");
			}
		});
		reviewListHomeButton.setBounds(28, 34, 97, 23);
		reviewPanel.add(reviewListHomeButton);
		
		JPanel reviewUpdateDeletePanel = new JPanel();
		parentPanel.add(reviewUpdateDeletePanel, "reviewUpdateDelte");
		reviewUpdateDeletePanel.setLayout(null);
		
		JLabel reviewTitleLabel_1 = new JLabel("제목");
		reviewTitleLabel_1.setBounds(98, 159, 57, 15);
		reviewUpdateDeletePanel.add(reviewTitleLabel_1);
		
		reviewTitleTextField2 = new JTextField();
		reviewTitleTextField2.setColumns(10);
		reviewTitleTextField2.setBounds(210, 156, 243, 21);
		reviewUpdateDeletePanel.add(reviewTitleTextField2);
		
		JLabel reviewContentLabel_1 = new JLabel("내용");
		reviewContentLabel_1.setBounds(98, 259, 57, 15);
		reviewUpdateDeletePanel.add(reviewContentLabel_1);
		
		reviewContentTextField2 = new JTextField();
		reviewContentTextField2.setColumns(10);
		reviewContentTextField2.setBounds(210, 256, 243, 227);
		reviewUpdateDeletePanel.add(reviewContentTextField2);
		
		JButton reviewDeleteButton_1 = new JButton("삭제");
		reviewDeleteButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					reviewService.deleteReview(review.getReview_no());
					CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewList");
					displayReviewList();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		reviewDeleteButton_1.setBounds(107, 519, 97, 23);
		reviewUpdateDeletePanel.add(reviewDeleteButton_1);
		
		JButton reviewUpdateForm_1 = new JButton("수정폼");
		reviewUpdateForm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reviewTitle = reviewTitleTextField2.getText();
				String reviewContent = reviewContentTextField2.getText();
				reviewTitleTextField2.setText("");
				reviewContentTextField2.setText("");
			}
		});
		reviewUpdateForm_1.setBounds(216, 519, 97, 23);
		reviewUpdateDeletePanel.add(reviewUpdateForm_1);
		
		JButton reviewUpdateButton_1 = new JButton("수정");
		reviewUpdateButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String reviewTitle = reviewTitleTextField2.getText();
					String reviewContent = reviewContentTextField2.getText();
					
					review = new Review(review.getReview_no(), null, reviewTitle, reviewContent);
					reviewService.updateReview(review);
					System.out.println(review);
					
					reviewTitleTextField2.setText(review.getReview_title());
					reviewContentTextField2.setText(review.getReview_content());
					
					CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewList");
					displayReviewList();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		reviewUpdateButton_1.setBounds(325, 519, 97, 23);
		reviewUpdateDeletePanel.add(reviewUpdateButton_1);
		
		/***** 2. ReviewService 멤버필드객체생성 *****/
		try {
			this.reviewService = new ReviewService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
		review = new Review();
		this.hotelServiceMainFrame=hotelServiceMainFrame;
	} // 생성자 끝
	
	public void displayReviewList() throws Exception {
		try {
			List<Review> reviewList = reviewService.findByAll();
			
			Vector columVector = new Vector();
			columVector.add("번호");
			columVector.add("제목");
			columVector.add("작성일");
			
			Vector tableVector = new Vector();
			
			for (Review review : reviewList) {
				Vector rowVector = new Vector();
				rowVector.add(review.getReview_no());
				rowVector.add(review.getReview_title());
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
	
