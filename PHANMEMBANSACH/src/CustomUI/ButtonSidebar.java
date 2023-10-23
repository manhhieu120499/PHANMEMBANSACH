package CustomUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;

public class ButtonSidebar extends JButton implements MouseListener{
	public ButtonSidebar(String title) {
		super(title);
		this.setFocusPainted(false);
		this.addMouseListener(this);
		this.setBackground(Color.WHITE);
		this.setFont(new Font("Segoe UI", Font.BOLD, 14));
		this.setHorizontalAlignment(JButton.LEFT);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		this.setBackground(new Color(255,165,0));
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		this.setBackground(new ViewDangNhap().mauChuDao);
	}
	@Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.black);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
    }
}