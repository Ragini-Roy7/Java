package src.Static_Non_Static.Packages.AWT;

import javax.swing.*;
import java.awt.*;

public class BeautifulSwingUI {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}

        JFrame frame = new JFrame("Login");
        frame.setSize(420, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 245));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font titleFont = new Font("Segoe UI", Font.BOLD, 20);
        Font labelFont = new Font("Segoe UI", Font.PLAIN, 14);
        Font btnFont   = new Font("Segoe UI", Font.BOLD, 14);

        // Title
        JLabel title = new JLabel("Welcome Back", JLabel.CENTER);
        title.setFont(titleFont);
        title.setForeground(new Color(44, 62, 80));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(title, gbc);

        // Username
        gbc.gridwidth = 1;
        gbc.gridy++;
        panel.add(new JLabel("Username"), gbc);

        gbc.gridx = 1;
        JTextField userField = new JTextField(15);
        panel.add(userField, gbc);

        // Password
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Password"), gbc);

        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField(15);
        panel.add(passField, gbc);

        // Button
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;

        JButton loginBtn = new JButton("Login");
        loginBtn.setFont(btnFont);
        loginBtn.setBackground(new Color(100, 178, 33));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFocusPainted(false);

        panel.add(loginBtn, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}