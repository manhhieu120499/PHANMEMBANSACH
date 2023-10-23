package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GUITrangChu extends JPanel {
	public GUITrangChu() {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(250, 0, 1250, 800);
		this.setLayout(new BorderLayout(0, 0));
		JButton btnNewButton = new JButton("Đây là trang chủ");
		this.add(btnNewButton, BorderLayout.CENTER);
	}
}
