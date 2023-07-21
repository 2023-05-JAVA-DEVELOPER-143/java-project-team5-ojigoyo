package hotel.reserv;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import hotel.room.Room;
import hotel.user.User;

public class MyReservPane extends JPanel {
	private JTable table;
	private ReservService reservService;
	private JDateChooser firstDateChooser;
	private JDateChooser lastDateChooser;
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public MyReservPane() throws Exception {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 예약 확인");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(207, 53, 166, 45);
		panel.add(lblNewLabel);
		
		JButton myReservBtn = new JButton("검색");
		myReservBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User loginMember = new User();
				
				try {
					List<Reserv> reservList=reservService.findMyReservByDate(loginMember.getUser_Id(),firstDateChooser.getDate(), lastDateChooser.getDate());
					Vector tableVector = new Vector();
					for(int i=0;i<reservList.size();i++) {
						Vector rowVector = new Vector();
						rowVector.add(reservList.get(i).getRoomNo());
						rowVector.add(reservList.get(i).getRoomType().getRoomTypeName());
						rowVector.add(reservList.get(i).getRoomType().getRoomTypePrice());
						rowVector.add(reservList.get(i).getRoomType().getRoomTypePool());
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
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		myReservBtn.setBounds(392, 101, 102, 45);
		panel.add(myReservBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 256, 417, 226);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("예약취소");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(375, 192, 97, 23);
		panel.add(btnNewButton);
		
		firstDateChooser = new JDateChooser();
		firstDateChooser.setBounds(125, 117, 73, 21);
		panel.add(firstDateChooser);
		
		lastDateChooser = new JDateChooser();
		lastDateChooser.setBounds(275, 117, 73, 21);
		panel.add(lastDateChooser);

		reservService = new ReservService();
	}
}
