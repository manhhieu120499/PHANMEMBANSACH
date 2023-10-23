package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GUISanPham extends JPanel {
	public GUISanPham() {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(250, 0, 1250, 800);
		this.setLayout(new BorderLayout(0, 0));
		JButton btnNewButton = new JButton("Đây là sản phẩm");
		this.add(btnNewButton, BorderLayout.CENTER);
	}
}
