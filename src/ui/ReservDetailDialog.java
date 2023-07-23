package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hotel.reserv.Reserv;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class ReservDetailDialog extends JDialog {

	private static Reserv reserv;
	private final JPanel contentPanel = new JPanel();
	private JTextArea reservDetailTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReservDetailDialog dialog = new ReservDetailDialog(reserv);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws Exception 
	 */
	public ReservDetailDialog(Reserv reserv) throws Exception {
		setTitle("예약 상세 정보");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		reservDetailTA = new JTextArea();
		reservDetailTA.setBounds(12, 21, 412, 199);
		contentPanel.add(reservDetailTA);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		reservDetailTA.setText(reserv.toString());
	}
}
