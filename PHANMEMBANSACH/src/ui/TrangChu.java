package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CustomUI.CustumImage;
import CustomUI.MyButton;
import CustomUI.RoundedBorder;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class TrangChu extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrangChu() {
		this.setTitle("PHẦN MỀM QUẢN LÝ NHÀ SÁCH");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1500, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		//xét logo
		ImageIcon logoFrame = new ImageIcon(new ImageIcon("src\\image\\logodangnhap\\logo.png").getImage()
				.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
		this.setIconImage(logoFrame.getImage());

		JPanel pnlSideBar = new JPanel();
		pnlSideBar.setBackground(new Color(97, 166, 247));
		pnlSideBar.setBounds(0, 0, 250, 777);
		getContentPane().add(pnlSideBar);
		pnlSideBar.setLayout(null);

		int widthLblAvtNhanVien = 130;
		JLabel lblAvtNhanVien = new JLabel(new CustumImage().taoHinhTronAvt("src\\image\\avtemployee\\avt.jpg", widthLblAvtNhanVien));
		lblAvtNhanVien.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblAvtNhanVien.setBounds(60, 20, widthLblAvtNhanVien, widthLblAvtNhanVien);
		pnlSideBar.add(lblAvtNhanVien);

		JLabel lblNewLabel = new JLabel("Nguyễn Trọng Đạt");
		lblNewLabel.setBounds(10, 150, 230, 50);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		pnlSideBar.add(lblNewLabel);

		JButton btnTrangChu = new MyButton("Trang chủ");
		btnTrangChu.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\icontrangchu.png"));
		btnTrangChu.setBackground(new Color(255, 255, 255));
		btnTrangChu.setBounds(30, 211, 192, 39);
		pnlSideBar.add(btnTrangChu);

		MyButton btnTrangChu_1 = new MyButton("Bán hàng");
		btnTrangChu_1.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconmuahang.png"));
		btnTrangChu_1.setBackground(Color.WHITE);
		btnTrangChu_1.setBounds(30, 261, 192, 39);
		pnlSideBar.add(btnTrangChu_1);

		MyButton btnTrangChu_1_1 = new MyButton("Giao hàng");
		btnTrangChu_1_1.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\icongiaohang.png"));
		btnTrangChu_1_1.setBackground(Color.WHITE);
		btnTrangChu_1_1.setBounds(30, 310, 192, 39);
		pnlSideBar.add(btnTrangChu_1_1);

		MyButton btnTrangChu_1_2 = new MyButton("Đổi trả hàng");
		btnTrangChu_1_2.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\icondoitra.png"));
		btnTrangChu_1_2.setBackground(Color.WHITE);
		btnTrangChu_1_2.setBounds(30, 357, 192, 39);
		pnlSideBar.add(btnTrangChu_1_2);

		MyButton btnTrangChu_1_3 = new MyButton("QL Nhà Cung Cấp");
		btnTrangChu_1_3.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconncc.png"));
		btnTrangChu_1_3.setBackground(Color.WHITE);
		btnTrangChu_1_3.setBounds(30, 406, 192, 39);
		pnlSideBar.add(btnTrangChu_1_3);

		MyButton btnTrangChu_1_4 = new MyButton("QL Khuyến Mãi");
		btnTrangChu_1_4.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconkhuyenmai.png"));
		btnTrangChu_1_4.setBackground(Color.WHITE);
		btnTrangChu_1_4.setBounds(30, 455, 192, 39);
		pnlSideBar.add(btnTrangChu_1_4);

		MyButton btnTrangChu_1_5 = new MyButton("QL Sản phẩm");
		btnTrangChu_1_5.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconsanpham.png"));
		btnTrangChu_1_5.setBackground(Color.WHITE);
		btnTrangChu_1_5.setBounds(30, 504, 192, 39);
		pnlSideBar.add(btnTrangChu_1_5);

		MyButton btnTrangChu_1_6 = new MyButton("QL Khách hàng");
		btnTrangChu_1_6.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconkhachhang.png"));
		btnTrangChu_1_6.setBackground(Color.WHITE);
		btnTrangChu_1_6.setBounds(30, 553, 192, 39);
		pnlSideBar.add(btnTrangChu_1_6);

		MyButton btnTrangChu_1_7 = new MyButton("QL Nhân viên");
		btnTrangChu_1_7.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconnhanvien.png"));
		btnTrangChu_1_7.setBackground(Color.WHITE);
		btnTrangChu_1_7.setBounds(30, 602, 192, 39);
		pnlSideBar.add(btnTrangChu_1_7);

		MyButton btnTrangChu_1_8 = new MyButton("QL Thống kê");
		btnTrangChu_1_8.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconthongke.png"));
		btnTrangChu_1_8.setBackground(Color.WHITE);
		btnTrangChu_1_8.setBounds(30, 651, 192, 39);
		pnlSideBar.add(btnTrangChu_1_8);

		MyButton btnTrangChu_1_9 = new MyButton("Hỗ trợ");
		btnTrangChu_1_9.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconhotro.png"));
		btnTrangChu_1_9.setBackground(Color.WHITE);
		btnTrangChu_1_9.setBounds(30, 702, 192, 39);
		pnlSideBar.add(btnTrangChu_1_9);
	}
}
