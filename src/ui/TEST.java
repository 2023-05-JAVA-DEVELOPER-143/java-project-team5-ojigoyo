package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TEST extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TEST frame = new TEST();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TEST() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599,642);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel mianPanel = new JPanel();
		tabbedPane.addTab("", new ImageIcon("C:\\Users\\itwill\\Desktop\\이미지\\ㅎㅁ.png"), mianPanel, null);
		mianPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\11.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mianPanel.add(lblNewLabel, BorderLayout.SOUTH);
		
		JPanel loginPanel = new JPanel();
		tabbedPane.addTab("LOGIN", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(111, 304, 97, 23);
		loginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(298, 304, 97, 23);
		loginPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\itwill\\Desktop\\이미지\\size\\iloveimg-resized (2)\\images.png"));
		lblNewLabel_1.setBounds(128, 109, 57, 65);
		loginPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(128, 203, 57, 15);
		loginPanel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(241, 106, 116, 21);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 200, 116, 21);
		loginPanel.add(textField_1);
		
		JPanel roomPanel = new JPanel();
		tabbedPane.addTab("New tab", null, roomPanel, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
	}
}
