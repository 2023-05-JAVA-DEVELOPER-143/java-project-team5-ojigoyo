/*
 문의사항, 문의사항 답변 임시 ui 
 월요일에 연동작업할것들 추가하기

 강사님한테 버튼 클릭조건으로 테이블 컬럼  로우마다 text 값 입력하는법 물어보기
 제출하기 버튼 : table insert service 작성하기
 userid 관리자 조건 텍스트,버튼 완성하기
 부족한 컴포넌트들 채우기 
*/

package uiTest;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.DisplayMode;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import hotel.inquiries.Inquiries;
import hotel.inquiries.InquiriesService;
import hotel.review.Review;
import hotel.user.User;
import ui.HotelServiceMainFrame;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class inquiriesUitest extends JPanel {
	/******************************/
	private InquiriesService inquiriesService;
	
	
	/****************************/
	private JPanel inquiriesCardLayOutPanel;
	private JTable table;
	private JTextField inquiriesWriterNameTextField;
	private JPanel inquiriesListPanel;
	private JPanel inquiriesWritePanel;
	private JTextField inquiriesTitleTextField;
	private JTextField inquiriesContentTextField;
	private JTextField inquiriesDetailContentTextField;
	private JTextField inquiriesCommentTextField;
	private JTextField inquiriesDetailWriterNameTextField;
	private JTextField inquiriesDetailTitleTextField;
	private JButton inquiriesCommentButton;
	private JButton inquiriesCompleteButton;
	private JScrollPane inquiriesContentScrollPane;
	private JLabel inquiriesContentLabel;
	private JPanel inquiriesDetailPanel;
	private JScrollPane scrollPane;
	private HotelServiceMainFrame hotelServiceMainFrame;
	private User loginUser;
	private InquiriesService inqService;
	private JButton inquiriesWriteMoveButton;

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public inquiriesUitest(HotelServiceMainFrame hotelServiceMainFrame) throws Exception {
		setLayout(null);
		
		inquiriesCardLayOutPanel = new JPanel();
		inquiriesCardLayOutPanel.setBounds(12, 30, 545, 560);
		add(inquiriesCardLayOutPanel);
		inquiriesCardLayOutPanel.setLayout(new CardLayout(0, 0));
		
		inquiriesListPanel = new JPanel();
		inquiriesCardLayOutPanel.add(inquiriesListPanel, "name_786795270600500");
		inquiriesListPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 86, 480, 366);
		inquiriesListPanel.add(scrollPane);
		
		table = new JTable();
		/*
		if(hotelServiceMainFrame.getLoginUser().getUser_Id().equals("admin")) {
			adminDisplayInquiriesList();
		}else {
			displayInquiriesList();
		}
		*/
		 table.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                // Get the selected row index
	                int selectedRow = table.getSelectedRow();
	                
	                if (selectedRow >= 0) {
	                	int inquiries_no=Integer.parseInt((String)table.getValueAt(selectedRow, 0));
	 	                inquiriesDetailWriterNameTextField.setText((String)(table.getValueAt(selectedRow, 1)));
	 	                inquiriesDetailTitleTextField.setText((String)(table.getValueAt(selectedRow, 2)));
	 	                inquiriesDetailContentTextField.setText((String)(table.getValueAt(selectedRow,3)));
	 	                
	 	                
	                    CardLayout cardLayout = (CardLayout)inquiriesCardLayOutPanel.getLayout();
	                	cardLayout.next(inquiriesCardLayOutPanel);
	                	try {
							table.isDisplayable();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                }
	               
	                
	            }
	        });
		
		
		
		
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", "", null, ""},
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
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uC791\uC131\uC790", "\uC81C\uBAA9", "\uB0B4\uC6A9", "\uC791\uC131\uC77C\uC790"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		inquiriesWriteMoveButton = new JButton("문의하기");
		inquiriesWriteMoveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				inquiriesWriterNameTextField.setText(hotelServiceMainFrame.getLoginUser().getUser_Id());
				CardLayout cardLayout = (CardLayout) inquiriesCardLayOutPanel.getLayout();
				cardLayout.last(inquiriesCardLayOutPanel);
			}
		});
		inquiriesWriteMoveButton.setFont(new Font("굴림", Font.BOLD, 20));
		inquiriesWriteMoveButton.setBounds(191, 477, 134, 47);
		inquiriesListPanel.add(inquiriesWriteMoveButton);
		
		JButton inquiriesViewButton = new JButton("문의내역보기");
		inquiriesViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(hotelServiceMainFrame.getLoginUser().getUser_Id().equals("admin")) {
						adminDisplayInquiriesList();
				
				}else {
					displayInquiriesList();
				}
			
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		inquiriesViewButton.setBounds(416, 40, 97, 23);
		inquiriesListPanel.add(inquiriesViewButton);
		
		inquiriesDetailPanel = new JPanel();
		inquiriesCardLayOutPanel.add(inquiriesDetailPanel, "name_786970533863700");
		inquiriesDetailPanel.setLayout(null);
		
		JLabel inquiriesWriterLabel = new JLabel("작성자");
		inquiriesWriterLabel.setBounds(30, 34, 57, 15);
		inquiriesDetailPanel.add(inquiriesWriterLabel);
		
		JLabel inquriesWriteDateLabel = new JLabel("제목");
		inquriesWriteDateLabel.setBounds(30, 100, 57, 15);
		inquiriesDetailPanel.add(inquriesWriteDateLabel);
		
		JLabel inquiriesTitleLabel = new JLabel("문의 내용");
		inquiriesTitleLabel.setBounds(30, 196, 57, 15);
		inquiriesDetailPanel.add(inquiriesTitleLabel);
		
		JLabel inquiriesCommentLabel = new JLabel("답변 내용");
		inquiriesCommentLabel.setBounds(30, 295, 57, 15);
		inquiriesDetailPanel.add(inquiriesCommentLabel);
		
		JScrollPane inquiriesDetialContentScrollPane = new JScrollPane();
		inquiriesDetialContentScrollPane.setBounds(138, 191, 284, 77);
		inquiriesDetailPanel.add(inquiriesDetialContentScrollPane);
		
		inquiriesDetailContentTextField = new JTextField();
		inquiriesDetailContentTextField.setEnabled(false);
		inquiriesDetialContentScrollPane.setViewportView(inquiriesDetailContentTextField);
		inquiriesDetailContentTextField.setColumns(10);
		
		JScrollPane inquiriesCommentScrollPane = new JScrollPane();
		inquiriesCommentScrollPane.setBounds(138, 295, 284, 101);
		inquiriesDetailPanel.add(inquiriesCommentScrollPane);
		
		inquiriesCommentTextField = new JTextField();
		inquiriesCommentTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hotelServiceMainFrame.getLoginUser().getUser_Id().equals("admin")){
					inquiriesCommentTextField.setEnabled(true);
				}
				
				
			}
		});
		inquiriesCommentTextField.setEnabled(false);
		inquiriesCommentScrollPane.setViewportView(inquiriesCommentTextField);
		inquiriesCommentTextField.setColumns(10);
		
		inquiriesDetailWriterNameTextField = new JTextField();
		inquiriesDetailWriterNameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		inquiriesDetailWriterNameTextField.setEnabled(false);
		inquiriesDetailWriterNameTextField.setBounds(138, 31, 116, 21);
		inquiriesDetailPanel.add(inquiriesDetailWriterNameTextField);
		inquiriesDetailWriterNameTextField.setColumns(10);
		
		inquiriesDetailTitleTextField = new JTextField();
		inquiriesDetailTitleTextField.setEnabled(false);
		inquiriesDetailTitleTextField.setBounds(138, 97, 116, 21);
		inquiriesDetailPanel.add(inquiriesDetailTitleTextField);
		inquiriesDetailTitleTextField.setColumns(10);
		
		JButton detailCancleButton = new JButton("이전으로");
		detailCancleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout)inquiriesCardLayOutPanel.getLayout();
				cardLayout.first(inquiriesCardLayOutPanel);
			}
		});
		detailCancleButton.setBounds(325, 471, 97, 23);
		inquiriesDetailPanel.add(detailCancleButton);
		
		
		inquiriesCommentButton = new JButton("답변하기");
		inquiriesCommentButton.setEnabled(false);
		inquiriesCommentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hotelServiceMainFrame.getLoginUser().getUser_Id().equals("admin")) {
					inquiriesCommentButton.setEnabled(true);
					CardLayout cardLayout =(CardLayout)inquiriesCardLayOutPanel.getLayout();
					cardLayout.first(inquiriesCardLayOutPanel);
				}
				
				
				// 관리자일시 답변하기 버튼활성화 및 패널 변경
				// 답변 버튼 클릭 시 답변상태 컬럼테이블 스트링으로 작성 가능한지 물어보기
				/*
				if(userid.equals("admin")) {
				inquiriesCommentButton.setEnabled(true);
				CardLayout cardLayout = (CardLayout)inquiriesCardLayOutPanel.getLayout();
				cardLayout.first(inquiriesCardLayOutPanel);
				}
				*/
			}
		});
		inquiriesCommentButton.setBounds(74, 471, 97, 23);
		inquiriesDetailPanel.add(inquiriesCommentButton);
		
		inquiriesWritePanel = new JPanel();
		inquiriesWritePanel.setToolTipText("inquiriesWrite\r\n");
		inquiriesCardLayOutPanel.add(inquiriesWritePanel, "name_786973216777300");
		inquiriesWritePanel.setLayout(null);
		
		
		inquiriesCompleteButton = new JButton("제출하기");
		inquiriesCompleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String inquiriesTitle = inquiriesTitleTextField.getText();
				String inquiriesContent=inquiriesContentTextField.getText();
				String inquiriesWriterName =hotelServiceMainFrame.getLoginUser().getUser_Id();
				
				Inquiries insertInquiries = new Inquiries(0, inquiriesTitle, inquiriesContent, new Date(10), hotelServiceMainFrame.getLoginUser(), null); 
				//new User(inquiriesWriterName,null,null,null,null,null, null)
				if(inquiriesTitle.equals("")) {
					JOptionPane.showMessageDialog(null, "제목을 입력하세요");
				
					//마우스 포커스 제목
				}else if(inquiriesContent.equals("")) {
					JOptionPane.showMessageDialog(null, "내용을 입력하세요");
					//마우스 포커스 내용
				}else {
				
					int row = inqService.insertInquiries(insertInquiries);
					CardLayout cardLayout = (CardLayout)inquiriesCardLayOutPanel.getLayout();
					cardLayout.next(inquiriesCardLayOutPanel);
				}
				}catch (Exception e2) {
					e2.printStackTrace();
				}
					
				}
				
			
		});
		inquiriesCompleteButton.setBounds(78, 481, 120, 34);
		inquiriesWritePanel.add(inquiriesCompleteButton);
		
		JButton cancleButton = new JButton("취소하기");
		cancleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout)inquiriesCardLayOutPanel.getLayout();
				cardLayout.next(inquiriesCardLayOutPanel);
			}
		});
		cancleButton.setBounds(304, 481, 110, 34);
		inquiriesWritePanel.add(cancleButton);
		
		JLabel inquiriesWriterNameLabel = new JLabel("작성자");
		inquiriesWriterNameLabel.setBounds(29, 60, 57, 15);
		inquiriesWritePanel.add(inquiriesWriterNameLabel);
		
		JLabel inquiriesTitleLable = new JLabel("제목");
		inquiriesTitleLable.setBounds(29, 125, 57, 15);
		inquiriesWritePanel.add(inquiriesTitleLable);
		
		inquiriesContentLabel = new JLabel("문의내용");
		inquiriesContentLabel.setBounds(29, 237, 57, 15);
		inquiriesWritePanel.add(inquiriesContentLabel);
		
		inquiriesWriterNameTextField = new JTextField();
		
		inquiriesWriterNameTextField.setEnabled(false);
		inquiriesWriterNameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 호텔메인프레임서비스 유저아이디 끌고오기
				inquiriesWriterNameTextField.setText(hotelServiceMainFrame.getLoginUser().getUser_Id());		    
			}
		});
		inquiriesWriterNameTextField.setBounds(156, 57, 116, 21);
		inquiriesWritePanel.add(inquiriesWriterNameTextField);
		inquiriesWriterNameTextField.setColumns(10);
		
		inquiriesTitleTextField = new JTextField();
		inquiriesTitleTextField.setBounds(156, 122, 175, 21);
		inquiriesWritePanel.add(inquiriesTitleTextField);
		inquiriesTitleTextField.setColumns(10);
		
		inquiriesContentScrollPane = new JScrollPane();
		inquiriesContentScrollPane.setBounds(158, 237, 256, 114);
		inquiriesWritePanel.add(inquiriesContentScrollPane);
		
		inquiriesContentTextField = new JTextField();
		inquiriesContentScrollPane.setViewportView(inquiriesContentTextField);
		inquiriesContentTextField.setColumns(10);
		
		this.hotelServiceMainFrame = hotelServiceMainFrame;
		inqService = new InquiriesService();
	}//생성자 끝
	/************************ 문의 리스트 **********************************/
	private void displayInquiriesList() throws Exception{
	String userId=hotelServiceMainFrame.getLoginUser().getUser_Id();
	List<Inquiries> inquiriesList =inquiriesService.findById(userId);
	
	Vector columVector = new Vector();
		columVector.add("번호");
		columVector.add("작성자");
		columVector.add("제목");
		columVector.add("내용");
		columVector.add("작성일자");
		
		Vector tableVector = new Vector();
		
		for(Inquiries inquiries : inquiriesList) {
			Vector rowVector = new Vector();
			rowVector.add(inquiries.getInquiries_no());
			rowVector.add(inquiries.getUser().getUser_Id());
			rowVector.add(inquiries.getInquiries_title());
			rowVector.add(inquiries.getInquiries_content());
			rowVector.add(inquiries.getInquiries_date());
			tableVector.add(rowVector);
		}
		DefaultTableModel talbeModel = new DefaultTableModel(tableVector , columVector);
		table.setModel(talbeModel);
	}
	
	private void adminDisplayInquiriesList() throws Exception{
		try {
		List<Inquiries> inquiriesList =inquiriesService.findByAll();
		
		Vector columVector = new Vector();
			columVector.add("번호");
			columVector.add("작성자");
			columVector.add("제목");
			columVector.add("내용");
			columVector.add("작성일자");
			
			Vector tableVector = new Vector();
			
			for(Inquiries inquiries : inquiriesList) {
				Vector rowVector = new Vector();
				rowVector.add(inquiries.getInquiries_no());
				rowVector.add(inquiries.getUser().getUser_Id());
				rowVector.add(inquiries.getInquiries_title());
				rowVector.add(inquiries.getInquiries_content());
				rowVector.add(inquiries.getInquiries_date());
				tableVector.add(rowVector);
			}
			DefaultTableModel talbeModel = new DefaultTableModel(tableVector , columVector);
			table.setModel(talbeModel);
		}finally{
		JOptionPane.showMessageDialog(null, "문의내역없음");
	}
	
}
}
