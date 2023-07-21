package hotel.reserv;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class adminReservPane extends JPanel {
	private JTextField userNameTF;
	private JTable allMemberReservtable;
	private ReservService reservService;
	private JButton cancelReservBtn;
	private JTextField adultUpdateTF;
	private JTextField childUpdateTF;
	private JTextField bedUpdateTF;

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public adminReservPane() throws Exception {
		setLayout(null);
		
		JLabel memberReserv = new JLabel("회원 예약 내역");
		memberReserv.setFont(new Font("굴림", Font.BOLD, 20));
		memberReserv.setBounds(65, 31, 147, 56);
		add(memberReserv);
		
		userNameTF = new JTextField();
		userNameTF.setBounds(240, 44, 147, 35);
		add(userNameTF);
		userNameTF.setColumns(10);
		
		JButton findByUserBtn = new JButton("검색");
		findByUserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					List<Reserv> reservList = reservService.findMyReserv(userNameTF.getText());
					Vector tableVector = new Vector();
					for(int i=0;i<reservList.size();i++) {
						Vector rowVector = new Vector();
						rowVector.add(reservList.get(i).getReservNo());
						rowVector.add(reservList.get(i).getReservCheckIn());
						rowVector.add(reservList.get(i).getReservCheckOut());
						rowVector.add(reservList.get(i).getReservAdult());
						rowVector.add(reservList.get(i).getReservChild());
						rowVector.add(reservList.get(i).isBreakfast());
						rowVector.add(reservList.get(i).getReservExtraBed());
						rowVector.add(reservList.get(i).getReservDate());
						rowVector.add(reservList.get(i).getReservPayment());
						rowVector.add(reservList.get(i).getUser().getUser_Id());
						tableVector.add(rowVector);
					}
					
					Vector columnVector = new Vector();
					columnVector.add("예약번호");
					columnVector.add("체크인");
					columnVector.add("체크아웃");
					columnVector.add("성인(명)");
					columnVector.add("영유아(명)");
					columnVector.add("조식");
					columnVector.add("베드추가");
					columnVector.add("예약일");
					columnVector.add("결제수단");
					columnVector.add("아이디");
					
					DefaultTableModel tableModel = new DefaultTableModel(tableVector,columnVector);
					
					allMemberReservtable.setModel(tableModel);
					cancelReservBtn.setEnabled(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			
		});
		findByUserBtn.setBounds(416, 50, 97, 23);
		add(findByUserBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 97, 486, 213);
		add(scrollPane);
		
		allMemberReservtable = new JTable();
		allMemberReservtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cancelReservBtn.setEnabled(true);
			}
		});
		allMemberReservtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC608\uC57D\uBC88\uD638", "\uCCB4\uD06C\uC778", "\uCCB4\uD06C\uC544\uC6C3", "\uC131\uC778(\uBA85)", "\uC601\uC720\uC544(\uBA85)", "\uC870\uC2DD", "\uBCA0\uB4DC\uCD94\uAC00", "\uC608\uC57D\uC77C", "\uACB0\uC81C\uC218\uB2E8", "\uC544\uC774\uB514"
			}
		));
		scrollPane.setViewportView(allMemberReservtable);
		
		cancelReservBtn = new JButton("예약취소");
		cancelReservBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int selectedRow = allMemberReservtable.getSelectedRow();
				String selectedId = (String)allMemberReservtable.getValueAt(selectedRow,9);
					reservService.deleteById(selectedId);
					displayReserv();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		cancelReservBtn.setBounds(389, 467, 97, 23);
		add(cancelReservBtn);
		
		adultUpdateTF = new JTextField();
		adultUpdateTF.setBounds(46, 342, 79, 23);
		add(adultUpdateTF);
		adultUpdateTF.setColumns(10);
		
		childUpdateTF = new JTextField();
		childUpdateTF.setBounds(152, 343, 85, 23);
		add(childUpdateTF);
		childUpdateTF.setColumns(10);
		
		bedUpdateTF = new JTextField();
		bedUpdateTF.setBounds(249, 343, 97, 23);
		add(bedUpdateTF);
		bedUpdateTF.setColumns(10);
		
		JCheckBox breakfastCheckBox = new JCheckBox("조식");
		breakfastCheckBox.setBounds(371, 342, 115, 23);
		add(breakfastCheckBox);
		
		JLabel lblNewLabel = new JLabel("성인");
		lblNewLabel.setBounds(56, 375, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("영유아");
		lblNewLabel_1.setBounds(155, 375, 57, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("베드추가");
		lblNewLabel_2.setBounds(259, 375, 57, 15);
		add(lblNewLabel_2);
		
		JButton reservUpdateBtn = new JButton("예약변경");
		reservUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row =allMemberReservtable.getSelectedRow();
//				allMemberReservtable.
//				reservService.updateOption()
			}
		});
		reservUpdateBtn.setBounds(249, 467, 97, 23);
		add(reservUpdateBtn);

		reservService = new ReservService();
	}
	public void displayReserv() throws Exception {
		List<Reserv> reservList = reservService.selectReserv();
		Vector tableVector = new Vector();
		for(int i=0;i<reservList.size();i++) {
			Vector rowVector = new Vector();
			rowVector.add(reservList.get(i).getReservNo());
			rowVector.add(reservList.get(i).getReservCheckIn());
			rowVector.add(reservList.get(i).getReservCheckOut());
			rowVector.add(reservList.get(i).getReservAdult());
			rowVector.add(reservList.get(i).getReservChild());
			rowVector.add(reservList.get(i).isBreakfast());
			rowVector.add(reservList.get(i).getReservExtraBed());
			rowVector.add(reservList.get(i).getReservDate());
			rowVector.add(reservList.get(i).getReservPayment());
			rowVector.add(reservList.get(i).getUser().getUser_Id());
			tableVector.add(rowVector);
		}
		
		Vector columnVector = new Vector();
		columnVector.add("예약번호");
		columnVector.add("체크인");
		columnVector.add("체크아웃");
		columnVector.add("성인(명)");
		columnVector.add("영유아(명)");
		columnVector.add("조식");
		columnVector.add("베드추가");
		columnVector.add("예약일");
		columnVector.add("결제수단");
		columnVector.add("아이디");
		
		DefaultTableModel tableModel = new DefaultTableModel(tableVector,columnVector);
		
		allMemberReservtable.setModel(tableModel);
		cancelReservBtn.setEnabled(false);
	}
}
