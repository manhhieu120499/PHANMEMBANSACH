package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import CustomUI.CustumImage;
import CustomUI.MyButton;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUIDangNhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIDangNhap frame = new GUIDangNhap();
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
	public GUIDangNhap() {
		this.setTitle("ĐĂNG NHẬP PHẦN MỀM");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 994, 684);
		this.setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setContentPane(contentPane);
		//xét logo
		ImageIcon logoFrame = new ImageIcon(new ImageIcon("src\\image\\logodangnhap\\logo.png").getImage()
				.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
		this.setIconImage(logoFrame.getImage());
		JLabel lblBgrDangNhap = new JLabel();
		lblBgrDangNhap.setBounds(0, 0, 994, 684);
		lblBgrDangNhap.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
//		lấy hình gốc
		ImageIcon iconLblBgr = new ImageIcon("src\\image\\imagepanel\\hinhnendangnhap.jpg");
//		phóng to hình
		Image scaledImage = ((ImageIcon) iconLblBgr).getImage().getScaledInstance(lblBgrDangNhap.getWidth(), lblBgrDangNhap.getHeight(), Image.SCALE_SMOOTH);
//		gán lại hình
        iconLblBgr = new ImageIcon(scaledImage);
        contentPane.setLayout(null);
        lblBgrDangNhap.setIcon(iconLblBgr);
		getContentPane().add(lblBgrDangNhap);
		
		JPanel pnlContent = new JPanel();
		pnlContent.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlContent.setBounds(160, 143, 674, 398);
		pnlContent.setBackground(new Color(240, 240, 240));
		getContentPane().add(pnlContent);
		pnlContent.setLayout(null);
//		gán hình logo vào
		JLabel lblImageUser = new JLabel(new CustumImage().taoHinhTronAvt("src\\image\\imagepanel\\hinhnenuserdangnhap.png", 200));
		lblImageUser.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblImageUser.setBounds(42, 94, 200, 200);
		pnlContent.add(lblImageUser);
		
//		add độ ưu tiên cho phần tử
		this.setComponentZOrder(pnlContent, 0);
		
		JLabel lblDangNhap = new JLabel("ĐĂNG NHẬP");
		lblDangNhap.setHorizontalAlignment(SwingConstants.CENTER);
		lblDangNhap.setForeground(new Color(10, 110, 227));
		lblDangNhap.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDangNhap.setBounds(414, 61, 143, 25);
		pnlContent.add(lblDangNhap);
		
		JLabel lblTenDangNhap = new JLabel("Tên đăng nhập:");
		lblTenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTenDangNhap.setBounds(327, 116, 121, 19);
		pnlContent.add(lblTenDangNhap);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTenDangNhap.setBounds(327, 145, 317, 30);
		pnlContent.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu:");
		lblMatKhau.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMatKhau.setBounds(327, 193, 121, 19);
		pnlContent.add(lblMatKhau);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(327, 222, 317, 30);
		pnlContent.add(txtMatKhau);
		
		JButton btnQuenMatKhau = new MyButton("Quên mật khẩu?");
		btnQuenMatKhau.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnQuenMatKhau.setBounds(508, 273, 136, 25);
		pnlContent.add(btnQuenMatKhau);
		
		JButton btnDangNhap = new MyButton("Đăng nhập");
		btnDangNhap.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\icondangnhap.png"));
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDangNhap.setBounds(417, 339, 136, 30);
		pnlContent.add(btnDangNhap);
		this.setComponentZOrder(lblBgrDangNhap, 1);
		
	}
}
