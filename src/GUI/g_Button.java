package GUI;
import javax.swing.*;

public class g_Button {
    JButton btn = new JButton();

    public g_Button(String btnText, int x, int y, int width, int height) {
        btn.setText(btnText);
        btn.setBounds(x, y, width, height);


        //add hover effect
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(new java.awt.Color(255, 255, 255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(new java.awt.Color(240, 240, 240));
            }
        });

        btn.setBackground(new java.awt.Color(240, 240, 240));

        //add click effect
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn.setBackground(new java.awt.Color(200, 200, 200));
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn.setBackground(new java.awt.Color(255, 255, 255));
            }
        });

        btn.setForeground(new java.awt.Color(0, 0, 0));
        btn.setFont(new java.awt.Font("Segoe UI", 0, 14));
    }

    public JButton getButton() {
        return btn;
    }
}
