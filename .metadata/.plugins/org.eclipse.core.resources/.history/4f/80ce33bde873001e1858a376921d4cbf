package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import CustomUI.CustumImage;

public class GUITrangChu extends JPanel {
	public GUITrangChu() {
		this.setBackground(new Color(255, 255, 255));
//		this.setBounds(250, 0, 1250, 800);
		this.setLayout(null);
		JLabel lblBgr = new JLabel(new ImageIcon("src\\image\\imagepanel\\hinhnentrangchu.jpg"));
		lblBgr.setBounds(0, 0, 1250, 800);
		this.add(lblBgr);
		JLabel lblBgrTrangChu = new JLabel();
		lblBgrTrangChu.setBounds(29, 22, 1183, 625);
		lblBgrTrangChu.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
//		lấy hình gốc
		ImageIcon iconLblBgr = new ImageIcon("src\\image\\imagepanel\\hinhnentrangchu.jpg");
//		phóng to hình
		Image scaledImage = ((ImageIcon) iconLblBgr).getImage().getScaledInstance(lblBgrTrangChu.getWidth(), lblBgrTrangChu.getHeight(), Image.SCALE_SMOOTH);
//		gán lại hình
        iconLblBgr = new ImageIcon(scaledImage);
        lblBgrTrangChu.setIcon(iconLblBgr);
		this.add(lblBgrTrangChu);
//		gán hình logo vào
		JLabel lblImgBrand = new JLabel(new CustumImage().taoHinhTronAvt("src\\image\\imagepanel\\logobrand.jpg", 100));
		lblImgBrand.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblImgBrand.setBounds(1088, 53, 100, 100);
		this.add(lblImgBrand);
//		xét thứ tự hiển thị
		this.setComponentZOrder(lblImgBrand, 0);
		
		JLabel lblNameBookStore = new JLabel("PHẦN MỀM QUẢN LÝ NHÀ SÁCH HBDK");
		lblNameBookStore.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNameBookStore.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameBookStore.setBounds(29, 672, 1183, 35);
		this.add(lblNameBookStore);
		
		JLabel lblSlogan = new JLabel("CHẤT LƯỢNG TẠO NÊN THƯƠNG HIỆU");
		lblSlogan.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlogan.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSlogan.setBounds(29, 712, 1183, 35);
		this.add(lblSlogan);
	}
}
