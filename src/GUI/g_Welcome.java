package GUI;

import javax.swing.*;
import java.awt.*;

public class g_Welcome {
    JFrame mainFrame = new JFrame("Welcome to our Zoo!");

    JPanel mainPanel = new JPanel();

    JPanel rightPanel = new JPanel();

    g_Button loginButton = new g_Button("Login", 50, 50, 200, 50);
    g_Button registerButton = new g_Button("Register", 50, 150, 200, 50);

    public g_Welcome() {
        // Main panel
        mainPanel.setBounds(0, 0, 700, 500);
        mainPanel.setBackground(Color.red);

        // Sidebar
        rightPanel.setBounds(700, 0, 300, 500);
        rightPanel.setBackground(Color.blue);
        rightPanel.setLayout(null);

        rightPanel.add(loginButton.getButton());
        rightPanel.add(registerButton.getButton());

        mainFrame.add(mainPanel);
        mainFrame.add(rightPanel);

        mainFrame.setResizable(false); // Prevents the user from resizing the window
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the program when the window is closed
        mainFrame.setSize(1000, 500); // Sets the size of the window
        mainFrame.setLayout(null); // Allows us to use absolute positioning
        mainFrame.setVisible(true); // Makes the window visible

        addRegisterListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_Register register = new g_Register();
                // make mainFrame invisible until register is closed
                mainFrame.setVisible(false);

                // add event listener to register frame
                register.mainFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent evt) {
                        mainFrame.setVisible(true);
                    }
                });
            }
        });
    }

    // add event listener to register button
    public void addRegisterListener(java.awt.event.ActionListener listener) {
        registerButton.getButton().addActionListener(listener);
    }

}
