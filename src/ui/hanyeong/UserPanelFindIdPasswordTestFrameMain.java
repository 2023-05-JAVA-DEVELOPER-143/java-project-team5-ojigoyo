package ui.hanyeong;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import ui.UserServiceFindIdPasswordPanel;

public class UserPanelFindIdPasswordTestFrameMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPanelFindIdPasswordTestFrameMain frame = new UserPanelFindIdPasswordTestFrameMain();
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
	public UserPanelFindIdPasswordTestFrameMain() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		UserServiceFindIdPasswordPanel userServiceFindIdPasswordPanel = new UserServiceFindIdPasswordPanel();
		contentPane.add(userServiceFindIdPasswordPanel, BorderLayout.CENTER);
	}

}
