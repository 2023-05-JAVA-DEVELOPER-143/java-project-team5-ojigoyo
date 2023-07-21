package ui.hanyeong;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import ui.UserServiceCreateAccount;

public class UserPanelCreateAccountTestFrameMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPanelCreateAccountTestFrameMain frame = new UserPanelCreateAccountTestFrameMain();
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
	public UserPanelCreateAccountTestFrameMain() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
//		UserServiceCreateAccount createAccount = new UserServiceCreateAccount();
//		contentPane.add(createAccount, BorderLayout.CENTER);
	}

}
