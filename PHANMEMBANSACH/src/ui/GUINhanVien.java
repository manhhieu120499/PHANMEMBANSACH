package ui;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import CustomUI.MyButton;
import CustomUI.MyCombobox;
import CustomUI.MyTable;

import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class GUINhanVien extends JPanel {
	private JTextField txtMaNV;
	private JTextField txtTenNV;
	private JTextField txtSdt;
	private JTextField txtCCCD;
	private JTextField txtEmail;
	private JTextField txtDiaChi;
	private JRadioButton radNam;
	private JRadioButton radNu;
	private MyCombobox cboChucVu;
	private MyButton btnHinhAnh;
	private MyButton btnTaoMa;
	private JTextField textField;
	private JButton btnLocGioiTinh;
	private JButton btnLocChucVu;
	private JButton btnTaoTK;
	private JButton btnThemNV;
	private JButton btnCapNhatNV;
	private JButton btnXoaTrang;
	private JButton btnTaiLai;
	private DefaultTableModel model;
	private MyTable table;
	private JScrollPane scr;

	public GUINhanVien() {
		this.setBackground(new Color(240, 240, 240));
		this.setBounds(250, 0, 1250, 800);
		setLayout(null);

		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(240, 240, 240));
		pnl.setBounds(10, 10, 1200, 750);
		this.add(pnl);
		pnl.setLayout(null);
		
		JPanel pnlThongTinNV = new JPanel();
		pnlThongTinNV.setBackground(new Color(255, 255, 255));
		pnlThongTinNV.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Th\u00F4ng Tin Nh\u00E2n Vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlThongTinNV.setBounds(21, 12, 633, 332);
		pnl.add(pnlThongTinNV);
		pnlThongTinNV.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(30, 30, 150, 200);
		pnlThongTinNV.add(panel_1);

		btnHinhAnh = new MyButton("Chọn ảnh");
		btnHinhAnh.setBounds(56, 240, 90, 21);
		pnlThongTinNV.add(btnHinhAnh);

		JLabel lblMaNV = new JLabel("Mã nhân viên");
		lblMaNV.setBounds(217, 33, 90, 13);
		pnlThongTinNV.add(lblMaNV);

		JLabel lblTenNV = new JLabel("Tên nhân viên");
		lblTenNV.setBounds(217, 69, 90, 13);
		pnlThongTinNV.add(lblTenNV);

		JLabel lblSdt = new JLabel("Số điện thoại");
		lblSdt.setBounds(217, 105, 90, 13);
		pnlThongTinNV.add(lblSdt);

		JLabel lblGioiTinh = new JLabel("Giới tính");
		lblGioiTinh.setBounds(217, 141, 90, 13);
		pnlThongTinNV.add(lblGioiTinh);

		JLabel lblCCCD = new JLabel("CCCD");
		lblCCCD.setBounds(217, 179, 90, 13);
		pnlThongTinNV.add(lblCCCD);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(217, 215, 90, 13);
		pnlThongTinNV.add(lblEmail);

		JLabel lblChucVu = new JLabel("Chức vụ");
		lblChucVu.setBounds(217, 252, 90, 13);
		pnlThongTinNV.add(lblChucVu);

		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setBounds(30, 287, 45, 13);
		pnlThongTinNV.add(lblDiaChi);

		txtMaNV = new JTextField();
		txtMaNV.setEditable(false);
		txtMaNV.setEnabled(false);
		txtMaNV.setBounds(307, 30, 191, 19);
		pnlThongTinNV.add(txtMaNV);
		txtMaNV.setColumns(10);

		txtTenNV = new JTextField();
		txtTenNV.setBounds(307, 66, 300, 19);
		pnlThongTinNV.add(txtTenNV);
		txtTenNV.setColumns(10);

		txtSdt = new JTextField();
		txtSdt.setBounds(307, 102, 300, 19);
		pnlThongTinNV.add(txtSdt);
		txtSdt.setColumns(10);

		txtCCCD = new JTextField();
		txtCCCD.setBounds(307, 176, 300, 19);
		pnlThongTinNV.add(txtCCCD);
		txtCCCD.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(307, 212, 300, 19);
		pnlThongTinNV.add(txtEmail);
		txtEmail.setColumns(10);

		txtDiaChi = new JTextField();
		txtDiaChi.setBounds(95, 284, 512, 19);
		pnlThongTinNV.add(txtDiaChi);
		txtDiaChi.setColumns(10);

		radNam = new JRadioButton("Nam");
		radNam.setSelected(true);
		radNam.setBounds(307, 138, 90, 21);
		pnlThongTinNV.add(radNam);

		radNu = new JRadioButton("Nữ");
		radNu.setBounds(399, 138, 90, 21);
		pnlThongTinNV.add(radNu);

		ButtonGroup gr = new ButtonGroup();
		gr.add(radNu);
		gr.add(radNam);

		cboChucVu = new MyCombobox();
		cboChucVu.setBounds(307, 248, 300, 21);
		pnlThongTinNV.add(cboChucVu);

		btnTaoMa = new MyButton("Tạo mã");
		btnTaoMa.setBounds(511, 29, 96, 21);
		pnlThongTinNV.add(btnTaoMa);

		// tìm kiếm
		JPanel pnlTimKiemNV = new JPanel();
		pnlTimKiemNV.setBackground(new Color(255, 255, 255));
		pnlTimKiemNV.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlTimKiemNV.setBounds(677, 12, 499, 332);
		pnl.add(pnlTimKiemNV);
		pnlTimKiemNV.setLayout(null);

		JLabel lblTimKiem = new JLabel("Nhập mã hoặc số điện thoại hoặc tên nhân viên cần tìm");
		lblTimKiem.setBounds(20, 33, 320, 13);
		pnlTimKiemNV.add(lblTimKiem);

		textField = new JTextField();
		textField.setBounds(20, 66, 460, 19);
		pnlTimKiemNV.add(textField);
		textField.setColumns(10);

		JPanel pnlLocNV = new JPanel();
		pnlLocNV.setBorder(new TitledBorder(null, "Lọc Nhân Viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlLocNV.setBackground(new Color(255, 255, 255));
		pnlLocNV.setBounds(20, 115, 460, 95);
		pnlTimKiemNV.add(pnlLocNV);
		pnlLocNV.setLayout(null);

		btnLocGioiTinh = new MyButton("Lọc theo giới tính");
		btnLocGioiTinh.setBounds(48, 34, 150, 30);
		pnlLocNV.add(btnLocGioiTinh);

		btnLocChucVu = new MyButton("Lọc theo chức vụ");
		btnLocChucVu.setBounds(266, 34, 150, 30);
		pnlLocNV.add(btnLocChucVu);

		btnTaoTK = new MyButton("TẠO TÀI KHOẢN");
		btnTaoTK.setBounds(177, 242, 150, 35);
		pnlTimKiemNV.add(btnTaoTK);

		// chức năng
		JPanel pnlChucNang = new JPanel();
		pnlChucNang.setBackground(new Color(255, 255, 255));
		pnlChucNang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Ch\u1EE9c N\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlChucNang.setBounds(21, 354, 1155, 96);
		pnl.add(pnlChucNang);
		pnlChucNang.setLayout(null);

		btnThemNV = new MyButton("THÊM NHÂN VIÊN");
		btnThemNV.setBounds(120, 33, 150, 30);
		pnlChucNang.add(btnThemNV);

		btnCapNhatNV = new MyButton("CẬP NHẬT");
		btnCapNhatNV.setBounds(390, 33, 150, 30);
		pnlChucNang.add(btnCapNhatNV);

		btnXoaTrang = new MyButton("XÓA TRẮNG");
		btnXoaTrang.setBounds(660, 33, 150, 30);
		pnlChucNang.add(btnXoaTrang);

		btnTaiLai = new MyButton("XÓA TRẮNG");
		btnTaiLai.setBounds(930, 33, 150, 30);
		pnlChucNang.add(btnTaiLai);

		// tạo bảng
		String[] cols = { "STT", "Mã nhân viên", "Tên nhân viên", "Giới tính", "Số điện thoại", "Địa chỉ", "CCCD",
				"Chức vụ", "Mật khẩu" };
		model = new DefaultTableModel(cols, 0);
		table = new MyTable(model);
		scr = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scr.setLocation(21, 464);
		scr.setSize(1155, 263);
		pnl.add(scr);
	}
}
