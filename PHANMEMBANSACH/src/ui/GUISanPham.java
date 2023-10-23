package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import CustomUI.MyButton;
import CustomUI.MyCombobox;

import javax.swing.border.BevelBorder;

public class GUISanPham extends JPanel {
	private JTabbedPane tabbedPane;
	private JLabel lblMaSanPham;
	private JLabel lblTenSanPham;
	private JLabel lblNhaCungCap;
	private JLabel lblKe;
	private JLabel lblTheLoai;
	private JTextField txtTheLoai;
	private JTextField txtMaSanPham;
	private JTextField txtTenSanPham;
	private JTextField txtKe;
	private JLabel lblSoLuong;
	private JLabel lblGiaNhap;
	private JLabel lblThue;
	private JLabel lblLoiNhuan;
	private JLabel lblTacGia;
	private JLabel lblNhaXuatBan;
	private JLabel lblNamXuatBan;
	private JTextField txtSoLuong;
	private JTextField txtGiaNhap;
	private JTextField txtThue;
	private JTextField txtLoiNhuan;
	private JTextField txtTacGia;
	private JTextField txtNhaXuatBan;
	private JTextField txtxNamXuatBan;
	private JPanel pnlThongTin;
	private JLabel lblPhanTramThue;
	private JLabel lblPhanTramLN;
	private JButton btnHinhAnh;
	private JPanel panel;
	private JLabel lblTimKiem;
	private JTextField textField;
	private JButton btnTaoMa;

	public GUISanPham() {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(250, 0, 1250, 800);
//		this.setLayout(new BorderLayout(0, 0));
		this.setLayout(null);

//		JButton btnNewButton = new JButton("Đây là sản phẩm");
//		btnNewButton.setBounds(0, 513, 1034, -513);
//		this.add(btnNewButton, BorderLayout.CENTER);

		// Tạo tab
		tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(0, 0, 1230, 800);

		// Tab sách
		JPanel pnlSach = new JPanel();
		pnlSach.setBackground(new Color(255, 255, 255));
		pnlSach.setBounds(0, 0, 1230, 800);
		pnlSach.setLayout(null);

		pnlThongTin = new JPanel();
		pnlThongTin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnlThongTin.setBounds(10, 10, 995, 231);
		pnlSach.add(pnlThongTin);
		pnlThongTin.setLayout(null);

		lblMaSanPham = new JLabel("Mã sản phẩm");
		lblMaSanPham.setBounds(25, 23, 90, 13);
		pnlThongTin.add(lblMaSanPham);

		lblTenSanPham = new JLabel("Tên sản phẩm");
		lblTenSanPham.setBounds(25, 58, 90, 13);
		pnlThongTin.add(lblTenSanPham);

		lblNhaCungCap = new JLabel("Nhà cung cấp");
		lblNhaCungCap.setBounds(25, 96, 90, 13);
		pnlThongTin.add(lblNhaCungCap);

		lblTheLoai = new JLabel("Thể loại");
		lblTheLoai.setBounds(25, 132, 90, 13);
		pnlThongTin.add(lblTheLoai);

		lblKe = new JLabel("Kệ");
		lblKe.setBounds(25, 169, 90, 13);
		pnlThongTin.add(lblKe);

		btnTaoMa = new MyButton("Tạo mã");
		btnTaoMa.setBounds(357, 19, 96, 21);
		pnlThongTin.add(btnTaoMa);

		txtMaSanPham = new JTextField();
		txtMaSanPham.setEnabled(false);
		txtMaSanPham.setColumns(10);
		txtMaSanPham.setBounds(116, 20, 215, 19);
		pnlThongTin.add(txtMaSanPham);

		txtTenSanPham = new JTextField();
		txtTenSanPham.setColumns(10);
		txtTenSanPham.setBounds(116, 56, 337, 19);
		pnlThongTin.add(txtTenSanPham);

		JComboBox cboNhaCungCap = new MyCombobox();
		cboNhaCungCap.setBounds(116, 92, 337, 21);
		pnlThongTin.add(cboNhaCungCap);

		txtTheLoai = new JTextField();
		txtTheLoai.setBounds(116, 130, 337, 19);
		pnlThongTin.add(txtTheLoai);
		txtTheLoai.setColumns(10);

		txtKe = new JTextField();
		txtKe.setBounds(116, 166, 337, 19);
		pnlThongTin.add(txtKe);
		txtKe.setColumns(10);

		lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setBounds(528, 23, 90, 13);
		pnlThongTin.add(lblSoLuong);

		lblGiaNhap = new JLabel("Giá nhập");
		lblGiaNhap.setBounds(528, 58, 90, 13);
		pnlThongTin.add(lblGiaNhap);

		lblThue = new JLabel("Thuế");
		lblThue.setBounds(795, 23, 45, 13);
		pnlThongTin.add(lblThue);

		lblLoiNhuan = new JLabel("Lợi nhuận ");
		lblLoiNhuan.setBounds(775, 58, 68, 13);
		pnlThongTin.add(lblLoiNhuan);

		lblTacGia = new JLabel("Tác giả");
		lblTacGia.setBounds(528, 96, 90, 13);
		pnlThongTin.add(lblTacGia);

		lblNhaXuatBan = new JLabel("Nhà xuất bản");
		lblNhaXuatBan.setBounds(528, 132, 90, 13);
		pnlThongTin.add(lblNhaXuatBan);

		lblNamXuatBan = new JLabel("Năm xuất bản");
		lblNamXuatBan.setBounds(528, 169, 90, 13);
		pnlThongTin.add(lblNamXuatBan);

		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(618, 20, 120, 19);
		pnlThongTin.add(txtSoLuong);
		txtSoLuong.setColumns(10);

		txtGiaNhap = new JTextField();
		txtGiaNhap.setBounds(618, 55, 120, 19);
		pnlThongTin.add(txtGiaNhap);
		txtGiaNhap.setColumns(10);

		txtThue = new JTextField();
		txtThue.setBounds(834, 20, 120, 19);
		pnlThongTin.add(txtThue);
		txtThue.setColumns(10);

		txtLoiNhuan = new JTextField();
		txtLoiNhuan.setBounds(834, 55, 120, 19);
		pnlThongTin.add(txtLoiNhuan);
		txtLoiNhuan.setColumns(10);

		txtTacGia = new JTextField();
		txtTacGia.setBounds(618, 93, 336, 19);
		pnlThongTin.add(txtTacGia);
		txtTacGia.setColumns(10);

		txtNhaXuatBan = new JTextField();
		txtNhaXuatBan.setBounds(618, 129, 337, 19);
		pnlThongTin.add(txtNhaXuatBan);
		txtNhaXuatBan.setColumns(10);

		txtxNamXuatBan = new JTextField();
		txtxNamXuatBan.setBounds(618, 166, 337, 19);
		pnlThongTin.add(txtxNamXuatBan);
		txtxNamXuatBan.setColumns(10);

		lblPhanTramThue = new JLabel("%");
		lblPhanTramThue.setBounds(965, 23, 30, 13);
		pnlThongTin.add(lblPhanTramThue);

		lblPhanTramLN = new JLabel("%");
		lblPhanTramLN.setBounds(965, 58, 30, 13);
		pnlThongTin.add(lblPhanTramLN);

		JPanel pnHinhAnh = new JPanel();
		pnHinhAnh.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		pnHinhAnh.setForeground(new Color(255, 255, 255));
		pnHinhAnh.setBounds(1040, 10, 150, 200);
		pnlSach.add(pnHinhAnh);
		pnHinhAnh.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// Tab sách
		JPanel pnVPP = new JPanel();
		pnVPP.setBounds(0, 0, 1230, 800);
		pnVPP.setLayout(null);

		tabbedPane.addTab("Sách", pnlSach);
		
		btnHinhAnh = new MyButton("Chọn ảnh ");
		btnHinhAnh.setForeground(new Color(0, 0, 0));
		btnHinhAnh.setBounds(1067, 220, 100, 21);
		pnlSach.add(btnHinhAnh);
		
		panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setToolTipText("");
		panel.setBounds(10, 275, 995, 237);
		pnlSach.add(panel);
		panel.setLayout(null);
		
		lblTimKiem = new JLabel("Tìm kiếm ");
		lblTimKiem.setBounds(25, 25, 60, 13);
		panel.add(lblTimKiem);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(116, 22, 838, 19);
		panel.add(textField);
		textField.setColumns(10);
		tabbedPane.addTab("Văn phòng phẩm", pnVPP);
		add(tabbedPane);

	}
}