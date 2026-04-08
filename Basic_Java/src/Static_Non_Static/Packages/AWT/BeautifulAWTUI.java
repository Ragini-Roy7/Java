package src.Static_Non_Static.Packages.AWT;

import java.awt.*;
import java.awt.event.*;

public class BeautifulAWTUI extends Frame {

    BeautifulAWTUI() {

        // Frame settings
        setTitle("Login");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setBackground(new Color(245, 245, 245));
        setLayout(new BorderLayout());

        // Fonts
        Font titleFont = new Font("Arial", Font.BOLD, 20);
        Font labelFont = new Font("Arial", Font.PLAIN, 14);
        Font btnFont   = new Font("Arial", Font.BOLD, 14);

        // Title
        Label title = new Label("Welcome Back", Label.CENTER);
        title.setFont(titleFont);
        title.setForeground(new Color(44, 62, 80));
        add(title, BorderLayout.NORTH);

        // Center panel
        Panel center = new Panel(new GridLayout(4, 1, 10, 10));
        center.setBackground(new Color(245, 245, 245));

        Label userLabel = new Label("Username");
        userLabel.setFont(labelFont);

        TextField userField = new TextField();

        Label passLabel = new Label("Password");
        passLabel.setFont(labelFont);

        TextField passField = new TextField();
        passField.setEchoChar('*');

        center.add(userLabel);
        center.add(userField);
        center.add(passLabel);
        center.add(passField);

        add(center, BorderLayout.CENTER);

        // Button panel
        Panel bottom = new Panel();
        bottom.setBackground(new Color(245, 245, 245));

        Button loginBtn = new Button("Login");
        loginBtn.setFont(btnFont);
        loginBtn.setBackground(new Color(52, 152, 219));
        loginBtn.setForeground(Color.WHITE);

        bottom.add(loginBtn);
        add(bottom, BorderLayout.SOUTH);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new BeautifulAWTUI();
    }
}