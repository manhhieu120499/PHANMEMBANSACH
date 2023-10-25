package ui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import CustomUI.MyButton;
import CustomUI.MyTable;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;

public class GUINhaCungCap extends JPanel {
	private JTextField txtMaNCC;
	private JTextField txtTenNCC;
	private JTextField txtDiaChi;
	private JTextField txtSdt;
	private JTextField txtEmail;
	private MyButton btnTaoMa;
	private JTextField textField;
	private MyButton btnTenNCC;
	private MyButton btnCapNhat;
	private MyButton btnXoaTrang;
	private MyTable table;
	private MyButton btnXoa;

	public GUINhaCungCap() {
		this.setBackground(new Color(255, 255, 255));
//		this.setBounds(250, 0, 1250, 800);
		setLayout(null);

		JPanel pnl1 = new JPanel();
		pnl1.setBackground(new Color(255, 255, 255));
		pnl1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnl1.setBounds(20, 10, 1200, 750);
		add(pnl1);
		pnl1.setLayout(null);

		JPanel pnl2 = new JPanel();
		pnl2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnl2.setBounds(20, 20, 1162, 710);
		pnl1.add(pnl2);
		pnl2.setLayout(null);

		JPanel pnlTongTinNCC = new JPanel();
		pnlTongTinNCC.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Thông Tin Nhà Cung Cấp", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlTongTinNCC.setBackground(new Color(255, 255, 255));
		pnlTongTinNCC.setBounds(30, 30, 1090, 279);
		pnl2.add(pnlTongTinNCC);
		pnlTongTinNCC.setLayout(null);

		JLabel lblMaNCC = new JLabel("Mã nhà cung cấp");
		lblMaNCC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaNCC.setBounds(25, 35, 110, 15);
		pnlTongTinNCC.add(lblMaNCC);

		JLabel lblTenNCC = new JLabel("Tên nhà cung cấp");
		lblTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTenNCC.setBounds(25, 79, 110, 15);
		pnlTongTinNCC.add(lblTenNCC);

		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDiaChi.setBounds(25, 123, 110, 15);
		pnlTongTinNCC.add(lblDiaChi);

		JLabel lblSdt = new JLabel("Số điện thoại");
		lblSdt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSdt.setBounds(622, 35, 110, 15);
		pnlTongTinNCC.add(lblSdt);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(622, 79, 110, 15);
		pnlTongTinNCC.add(lblEmail);

		txtMaNCC = new JTextField();
		txtMaNCC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMaNCC.setEditable(false);
		txtMaNCC.setBounds(143, 30, 300, 25);
		pnlTongTinNCC.add(txtMaNCC);
		txtMaNCC.setColumns(10);

		txtTenNCC = new JTextField();
		txtTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTenNCC.setBounds(143, 74, 300, 25);
		pnlTongTinNCC.add(txtTenNCC);
		txtTenNCC.setColumns(10);

		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDiaChi.setBounds(143, 118, 899, 25);
		pnlTongTinNCC.add(txtDiaChi);
		txtDiaChi.setColumns(10);

		txtSdt = new JTextField();
		txtSdt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSdt.setBounds(742, 30, 300, 25);
		pnlTongTinNCC.add(txtSdt);
		txtSdt.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setBounds(742, 78, 300, 25);
		pnlTongTinNCC.add(txtEmail);
		txtEmail.setColumns(10);

		btnTaoMa = new MyButton("Tạo Mã");
		btnTaoMa.setBounds(466, 33, 96, 21);
		pnlTongTinNCC.add(btnTaoMa);

		// chức năng
		JPanel pnlChucNang = new JPanel();
		pnlChucNang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Chức Năng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlChucNang.setBounds(187, 171, 705, 80);
		pnlTongTinNCC.add(pnlChucNang);
		pnlChucNang.setLayout(null);

		btnTenNCC = new MyButton("THÊM NHÀ CUNG CẤP");
		btnTenNCC.setBounds(40, 25, 155, 35);
		pnlChucNang.add(btnTenNCC);

		btnCapNhat = new MyButton("CẬP NHẬT");
		btnCapNhat.setBounds(268, 25, 150, 35);
		pnlChucNang.add(btnCapNhat);

		btnXoaTrang = new MyButton("XÓA TRẮNG");
		btnXoaTrang.setBounds(483, 25, 150, 35);
		pnlChucNang.add(btnXoaTrang);

		// tìm kiếm
		JPanel pnlTimKiemNCC = new JPanel();
		pnlTimKiemNCC.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Tìm Kiếm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlTimKiemNCC.setBackground(new Color(255, 255, 255));
		pnlTimKiemNCC.setBounds(30, 334, 1090, 101);
		pnl2.add(pnlTimKiemNCC);
		pnlTimKiemNCC.setLayout(null);

		JLabel lblTimKiem = new JLabel("Nhập mã hoặc số điện thoại hoặc tên nhà cung cấp");
		lblTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTimKiem.setBounds(25, 22, 400, 15);
		pnlTimKiemNCC.add(lblTimKiem);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(25, 52, 918, 25);
		pnlTimKiemNCC.add(textField);
		textField.setColumns(10);

		btnXoa = new MyButton("Xóa");
		btnXoa.setBounds(963, 55, 85, 21);
		pnlTimKiemNCC.add(btnXoa);

		// tạo bảng
		String[] cols = { "STT", "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Email", "Địa chỉ" };
		DefaultTableModel model = new DefaultTableModel(cols, 0);
		table = new MyTable(model);
		JScrollPane scr = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scr.setLocation(32, 458);
		scr.setSize(1090, 239);
		pnl2.add(scr);
	}
}
