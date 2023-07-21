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
	
	private JTable reviewListTable;
	private JButton reviewListButton;
	private JButton reviewWriteButton;
	private JTextField reviewTitleTextField;
	private JTextField reviewContentTextField;

	/**
	 * Create the panel.
	 */
	public ReviewPanel() {
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
		});
		reviewListButton.setBounds(413, 451, 97, 23);
		reviewListPanel.add(reviewListButton);
		
		reviewWriteButton = new JButton("리뷰 쓰기");
		reviewWriteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*********** 리뷰쓰기 버튼 클릭 **********/
				/*
				if (loginUser == null) {
					JOptionPane.showMessageDialog(null, "로그인시 작성 가능합니다.");
				} else {
					CardLayout cardLayout = (CardLayout)parentPanel.getLayout();
					cardLayout.show(parentPanel, "reviewWritePanel");
				}
				*/
				CardLayout cardLayout = (CardLayout)parentPanel.getLayout();
				cardLayout.show(parentPanel, "reviewWrite");
			}
		});
		reviewWriteButton.setBounds(304, 451, 97, 23);
		reviewListPanel.add(reviewWriteButton);
		
		JPanel reviewWritePanel = new JPanel();
		parentPanel.add(reviewWritePanel, "reviewWrite");
		reviewWritePanel.setLayout(null);
		
		JLabel reviewTitleLabel = new JLabel("제목");
		reviewTitleLabel.setBounds(105, 161, 57, 15);
		reviewWritePanel.add(reviewTitleLabel);
		
		JLabel reviewContentLabel = new JLabel("내용");
		reviewContentLabel.setBounds(105, 261, 57, 15);
		reviewWritePanel.add(reviewContentLabel);
		
		reviewTitleTextField = new JTextField();
		reviewTitleTextField.setBounds(217, 158, 243, 21);
		reviewWritePanel.add(reviewTitleTextField);
		reviewTitleTextField.setColumns(10);
		
		reviewContentTextField = new JTextField();
		reviewContentTextField.setBounds(217, 258, 243, 227);
		reviewWritePanel.add(reviewContentTextField);
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
						CardLayout cardLayout = (CardLayout) parentPanel.getLayout();
						cardLayout.show(parentPanel, "reviewList");
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		reviewInsertButton.setBounds(222, 533, 97, 23);
		reviewWritePanel.add(reviewInsertButton);
		
		/***** 2. ReviewService 멤버필드객체생성 *****/
		try {
			this.reviewService = new ReviewService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		loginUser = new User();
		loginUser.setUser_Id("user1");
	} // 생성자 끝
}
	
