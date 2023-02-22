package GUI;
import javax.swing.*;
import java.awt.*;

public class g_Register {
    JFrame mainFrame = new JFrame("Register");
    JLabel lblUsername = new JLabel("Username");
    JLabel lblPassword = new JLabel("Password");
    JLabel lblEmail = new JLabel("Email");

    JLabel lblRegister = new JLabel("Register");


    JTextField txtUsername = new JTextField();
    JPasswordField txtPassword = new JPasswordField();
    JTextField txtEmail = new JTextField();

    public g_Register() {
        // Labels
        lblRegister.setBounds(50, 20, 100, 50);
        lblUsername.setBounds(50, 80, 100, 50);
        lblPassword.setBounds(50, 130, 100, 50);
        lblEmail.setBounds(50, 180, 100, 50);

        // style labels to look modern
        lblUsername.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        lblEmail.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));

        //style register label to look like a title
        lblRegister.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 24));



        // Text fields
        txtUsername.setBounds(150, 90, 200, 30);
        txtPassword.setBounds(150, 140, 200, 30);
        txtEmail.setBounds(150, 200, 200, 30);

        // style text fields to look modern
        txtUsername.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        txtPassword.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));
        txtEmail.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14));



        // Register button
        mainFrame.add(new g_Button("Register", 50, 350, 300, 50).getButton());

        // Add components to the frame
        mainFrame.add(lblRegister);
        mainFrame.add(lblUsername);
        mainFrame.add(lblPassword);
        mainFrame.add(lblEmail);
        mainFrame.add(txtUsername);
        mainFrame.add(txtPassword);
        mainFrame.add(txtEmail);

        mainFrame.setResizable(false); // Prevents the user from resizing the window
        mainFrame.setSize(450, 500); // Sets the size of the window
        mainFrame.setLayout(null); // Allows us to use absolute positioning
        mainFrame.setVisible(true); // Makes the window visible
    }
}
