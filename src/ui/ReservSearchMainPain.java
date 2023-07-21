package ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import hotel.reserv.Reserv;
import hotel.reserv.ReservService;
import hotel.room.Room;
import hotel.user.User;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.DateModel;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReservSearchMainPain extends JPanel {

	private ReservService reservService;
	private JDateChooser checkInDateChooser;
	private JDateChooser checkOutDateChooser;
	private JTable reservSearchTable;
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public ReservSearchMainPain() throws Exception {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton reservSearchBtn = new JButton("검색");
		reservSearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User loginMember = new User();
				try {
					List<Room> roomList=reservService.emptyRoom(new java.sql.Date(checkInDateChooser.getDate().getTime()),  new java.sql.Date(checkOutDateChooser.getDate().getTime()));
					Vector tableVector = new Vector();
					for(int i=0;i<roomList.size();i++) {
						Vector rowVector = new Vector();
						rowVector.add(roomList.get(i).getRoomNo());
						rowVector.add(roomList.get(i).getRoomType().getRoomTypeName());
						rowVector.add(roomList.get(i).getRoomType().getRoomTypePrice());
						rowVector.add(roomList.get(i).getRoomType().getRoomTypePool());
						tableVector.add(rowVector);
					}
					
					Vector columnVector = new Vector();
					columnVector.add("방번호");
					columnVector.add("방종류");
					columnVector.add("가격");
					columnVector.add("수영장유무");
					
					DefaultTableModel tableModel = new DefaultTableModel(tableVector,columnVector);
					
					reservSearchTable.setModel(tableModel);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "날짜를 선택하세요");
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		reservSearchBtn.setBounds(368, 189, 139, 31);
		panel.add(reservSearchBtn);
		
		JLabel lblNewLabel = new JLabel("예약");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel.setBounds(252, 51, 54, 71);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(59, 243, 448, 274);
		panel.add(scrollPane);
		
		reservSearchTable = new JTable();
		reservSearchTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
			}
		});
		scrollPane.setViewportView(reservSearchTable);
		
		JLabel lblNewLabel_1 = new JLabel("체크인 날짜");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(118, 109, 106, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("체크아웃 날짜");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(365, 109, 113, 25);
		panel.add(lblNewLabel_2);
		
		checkInDateChooser = new JDateChooser();
		checkInDateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		checkInDateChooser.setBounds(128, 144, 73, 21);
		panel.add(checkInDateChooser);
		
		checkOutDateChooser = new JDateChooser();
		checkOutDateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		checkOutDateChooser.setBounds(375, 144, 73, 21);
		panel.add(checkOutDateChooser);
		
		reservService = new ReservService();
	}
}
