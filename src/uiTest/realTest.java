package uiTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class realTest extends JFrame {

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
					realTest frame = new realTest();
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
	public realTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 630);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.textHighlight);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("메인", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("비밀번호를 잊으셨나요?");
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_5_1.setBounds(76, 389, 155, 15);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4 = new JLabel("비밀번호");
		lblNewLabel_4.setBounds(83, 293, 57, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("로그인하세요.");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(83, 134, 148, 33);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(83, 202, 57, 15);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(83, 231, 305, 41);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("로그인");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.setBounds(147, 414, 192, 33);
		panel.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(83, 325, 305, 41);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\why31\\OneDrive\\바탕 화면\\이미지\\수정후\\연보.png"));
		lblNewLabel_3.setBackground(new Color(216, 209, 226));
		lblNewLabel_3.setBounds(29, 116, 413, 360);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(realTest.class.getResource("/uiTest/이미지/ㅅㅀㅌ.png")));
		lblNewLabel.setBounds(29, 45, 421, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("아직 회원이 아니신가요?");
		lblNewLabel_5.setBounds(117, 501, 155, 15);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setBounds(272, 497, 97, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("회원가입", null, panel_1, null);
		panel_1.setLayout(null);
	}

}
