package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GUIBanHang extends JPanel {
	public GUIBanHang() {
		this.setBackground(new Color(255, 255, 255));
//		this.setBounds(250, 0, 1250, 800);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1250, 800);
		add(tabbedPane);
		
		JPanel pnlBanHang = new JPanel();
		tabbedPane.addTab("Bán hàng", null, pnlBanHang, null);
		pnlBanHang.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 1250, 773);
		pnlBanHang.add(tabbedPane_1);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("HD1", null, panel, null);
		
		JPanel pnlQlHoaDon = new JPanel();
		tabbedPane.addTab("Quản lý hóa đơn", null, pnlQlHoaDon, null);
	}
}
