package ui.adminpanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReviewManagePanel extends JPanel {
    private JScrollPane reviewScrollPane;
    private JButton reviewListButton;
    private JButton reviewDeleteButton;

    public ReviewManagePanel() {
        setLayout(null);

        reviewScrollPane = new JScrollPane();
        reviewScrollPane.setBounds(87, 84, 365, 131);
        add(reviewScrollPane);

       
        reviewListButton = new JButton("리뷰 목록");
        reviewListButton.setBounds(129, 227, 117, 29);
        reviewListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        add(reviewListButton);

        // 리뷰 삭제 버튼 생성
        reviewDeleteButton = new JButton("리뷰 삭제");
        reviewDeleteButton.setBounds(279, 227, 117, 29);
        reviewDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        add(reviewDeleteButton);
    }
}



