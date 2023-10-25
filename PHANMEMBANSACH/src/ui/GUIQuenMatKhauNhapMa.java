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
import javax.swing.border.EmptyBorder;

import CustomUI.CustumImage;
import CustomUI.MyButton;

import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class GUIQuenMatKhauNhapMa extends JFrame {

	private JPanel contentPane;private 
	JTextField txtTenDangNhap;
	private JTextField txtXacNhan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuenMatKhauNhapMa frame = new GUIQuenMatKhauNhapMa();
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
	public GUIQuenMatKhauNhapMa() {
		this.setTitle("QUÊN MẬT KHẨU");
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
		
		JLabel lblDangNhap = new JLabel("QUÊN MẬT KHẨU");
		lblDangNhap.setHorizontalAlignment(SwingConstants.CENTER);
		lblDangNhap.setForeground(new Color(10, 110, 227));
		lblDangNhap.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDangNhap.setBounds(364, 61, 220, 25);
		pnlContent.add(lblDangNhap);
		
		JButton btnXacNhan = new MyButton("Đăng nhập");
		btnXacNhan.setText("Xác nhận");
		btnXacNhan.setIcon(new ImageIcon("src\\image\\iconcontrolbtntrangchu\\iconcheck.png"));
		btnXacNhan.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXacNhan.setBounds(416, 315, 136, 30);
		pnlContent.add(btnXacNhan);
		
		JTextArea txtThongBao = new JTextArea();
		txtThongBao.setEnabled(false);
		txtThongBao.setDisabledTextColor(Color.black);
		txtThongBao.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtThongBao.setText("Hệ thống vừa gửi mã xác nhận gồm 4\nsố về Email: \nabc@gmail.com");
		txtThongBao.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtThongBao.setBounds(321, 126, 312, 72);
		pnlContent.add(txtThongBao);
		
		JLabel lblXacNhan = new JLabel("Nhập mã xác nhận:");
		lblXacNhan.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblXacNhan.setBounds(321, 220, 153, 19);
		pnlContent.add(lblXacNhan);
		
		txtXacNhan = new JTextField();
		txtXacNhan.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtXacNhan.setColumns(10);
		txtXacNhan.setBounds(321, 249, 317, 30);
		pnlContent.add(txtXacNhan);
		
		this.setComponentZOrder(lblBgrDangNhap, 1);
	}
}
