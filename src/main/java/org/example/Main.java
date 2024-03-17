package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame welcomeFrame = new JFrame("Welcome to PingPong!");
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setSize(400, 250);
        welcomeFrame.setLayout(new BorderLayout(10, 10));

        JPanel textPanel = new JPanel();
        textPanel.setBorder(BorderFactory.createEmptyBorder(50, 25, 20, 25));
        welcomeFrame.add(textPanel, BorderLayout.CENTER);

        JLabel welcomeText = new JLabel("Welcome to PingPong!", SwingConstants.CENTER);
        welcomeText.setFont(new Font("Arial", Font.BOLD, 18));
        textPanel.add(welcomeText);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 25, 20, 25));
        welcomeFrame.add(buttonPanel, BorderLayout.SOUTH);

        JButton startButton = new JButton("Start Game");
        startButton.setFont(new Font("Arial", Font.BOLD, 14));
        startButton.setPreferredSize(new Dimension(150, 40));
        buttonPanel.add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcomeFrame.dispose();

                GameFrame gameFrame = new GameFrame();
                gameFrame.setVisible(true);
            }
        });

        welcomeFrame.pack();
        welcomeFrame.setLocationRelativeTo(null);
        welcomeFrame.setVisible(true);
    }
}
