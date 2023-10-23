package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import CustomUI.MyButton;
import CustomUI.MyCombobox;
import CustomUI.MyTable;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import java.awt.SystemColor;

public class GUISanPham extends JPanel {
	private JTabbedPane tabbedPane;
	private JLabel lblMaSP;
	private JLabel lblTenSP;
	private JLabel lblNCC;
	private JLabel lblKe;
	private JLabel lblTheLoai;
	private JTextField txtTheLoai;
	private JTextField txtMaSP;
	private JTextField txtTenSP;
	private JTextField txtKe;
	private JLabel lblSoLuong;
	private JLabel lblGiaNhap;
	private JLabel lblThue;
	private JLabel lblLoiNhuan;
	private JLabel lblTacGia;
	private JLabel lblNhaXB;
	private JLabel lblNamXB;
	private JTextField txtSoLuong;
	private JTextField txtGiaNhap;
	private JTextField txtThue;
	private JTextField txtLoiNhuan;
	private JTextField txtTacGia;
	private JTextField txtNhaXB;
	private JTextField txtNamXB;
	private JPanel pnlThongTin;
	private JLabel lblPhanTramThue;
	private JLabel lblPhanTramLN;
	private JButton btnHinhAnh;
	private JPanel pnlTimKiem;
	private JLabel lblTimKiem;
	private JTextField txtTimKiem;
	private JButton btnTaoMa;
	private JTextField txtLocTheLoai;
	private JTextField txtLocNamXB;
	private JTextField txtLocTacGia;
	private DefaultTableModel model;
	private JTable table;

	public GUISanPham() {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(250, 0, 1250, 800);
		this.setLayout(null);

		// Tạo tab
		tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(0, 0, 1230, 800);

		// Tab sách
		JPanel pnlSach = new JPanel();
		pnlSach.setBackground(new Color(255, 255, 255));
		pnlSach.setBounds(0, 0, 1230, 800);
		pnlSach.setLayout(null);

		pnlThongTin = new JPanel();
		pnlThongTin.setBounds(20, 10, 965, 231);
		pnlThongTin.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Thông Tin Sản Phẩm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSach.add(pnlThongTin);
		pnlThongTin.setLayout(null);

		lblMaSP = new JLabel("Mã sản phẩm");
		lblMaSP.setBounds(25, 33, 90, 13);
		pnlThongTin.add(lblMaSP);

		lblTenSP = new JLabel("Tên sản phẩm");
		lblTenSP.setBounds(25, 68, 90, 13);
		pnlThongTin.add(lblTenSP);

		lblNCC = new JLabel("Nhà cung cấp");
		lblNCC.setBounds(25, 106, 90, 13);
		pnlThongTin.add(lblNCC);

		lblTheLoai = new JLabel("Thể loại");
		lblTheLoai.setBounds(25, 142, 90, 13);
		pnlThongTin.add(lblTheLoai);

		lblKe = new JLabel("Kệ");
		lblKe.setBounds(25, 179, 90, 13);
		pnlThongTin.add(lblKe);

		btnTaoMa = new MyButton("Tạo mã");
		btnTaoMa.setBounds(357, 29, 96, 21);
		pnlThongTin.add(btnTaoMa);

		txtMaSP = new JTextField();
		txtMaSP.setEnabled(false);
		txtMaSP.setColumns(10);
		txtMaSP.setBounds(116, 30, 215, 19);
		pnlThongTin.add(txtMaSP);

		txtTenSP = new JTextField();
		txtTenSP.setColumns(10);
		txtTenSP.setBounds(116, 66, 337, 19);
		pnlThongTin.add(txtTenSP);

		JComboBox cboNhaCungCap = new MyCombobox();
		cboNhaCungCap.setBounds(116, 102, 337, 21);
		pnlThongTin.add(cboNhaCungCap);

		txtTheLoai = new JTextField();
		txtTheLoai.setBounds(116, 140, 337, 19);
		pnlThongTin.add(txtTheLoai);
		txtTheLoai.setColumns(10);

		txtKe = new JTextField();
		txtKe.setBounds(116, 176, 337, 19);
		pnlThongTin.add(txtKe);
		txtKe.setColumns(10);

		lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setBounds(493, 33, 90, 13);
		pnlThongTin.add(lblSoLuong);

		lblGiaNhap = new JLabel("Giá nhập");
		lblGiaNhap.setBounds(493, 68, 90, 13);
		pnlThongTin.add(lblGiaNhap);

		lblThue = new JLabel("Thuế");
		lblThue.setBounds(760, 33, 45, 13);
		pnlThongTin.add(lblThue);

		lblLoiNhuan = new JLabel("Lợi nhuận ");
		lblLoiNhuan.setBounds(740, 68, 68, 13);
		pnlThongTin.add(lblLoiNhuan);

		lblTacGia = new JLabel("Tác giả");
		lblTacGia.setBounds(493, 106, 90, 13);
		pnlThongTin.add(lblTacGia);

		lblNhaXB = new JLabel("Nhà xuất bản");
		lblNhaXB.setBounds(493, 142, 90, 13);
		pnlThongTin.add(lblNhaXB);

		lblNamXB = new JLabel("Năm xuất bản");
		lblNamXB.setBounds(493, 179, 90, 13);
		pnlThongTin.add(lblNamXB);

		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(583, 30, 120, 19);
		pnlThongTin.add(txtSoLuong);
		txtSoLuong.setColumns(10);

		txtGiaNhap = new JTextField();
		txtGiaNhap.setBounds(583, 65, 120, 19);
		pnlThongTin.add(txtGiaNhap);
		txtGiaNhap.setColumns(10);

		txtThue = new JTextField();
		txtThue.setBounds(799, 30, 120, 19);
		pnlThongTin.add(txtThue);
		txtThue.setColumns(10);

		txtLoiNhuan = new JTextField();
		txtLoiNhuan.setBounds(799, 65, 120, 19);
		pnlThongTin.add(txtLoiNhuan);
		txtLoiNhuan.setColumns(10);

		txtTacGia = new JTextField();
		txtTacGia.setBounds(583, 103, 336, 19);
		pnlThongTin.add(txtTacGia);
		txtTacGia.setColumns(10);

		txtNhaXB = new JTextField();
		txtNhaXB.setBounds(583, 139, 337, 19);
		pnlThongTin.add(txtNhaXB);
		txtNhaXB.setColumns(10);

		txtNamXB = new JTextField();
		txtNamXB.setBounds(583, 176, 337, 19);
		pnlThongTin.add(txtNamXB);
		txtNamXB.setColumns(10);

		lblPhanTramThue = new JLabel("%");
		lblPhanTramThue.setBounds(930, 33, 30, 13);
		pnlThongTin.add(lblPhanTramThue);

		lblPhanTramLN = new JLabel("%");
		lblPhanTramLN.setBounds(930, 68, 30, 13);
		pnlThongTin.add(lblPhanTramLN);

		JPanel pnlHinhAnh = new JPanel();
		pnlHinhAnh.setBounds(1006, 10, 197, 200);
		pnlHinhAnh.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlHinhAnh.setForeground(new Color(255, 255, 255));
		pnlSach.add(pnlHinhAnh);
		pnlHinhAnh.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnHinhAnh = new MyButton("Chọn ảnh ");
		btnHinhAnh.setBounds(1067, 220, 100, 21);
		btnHinhAnh.setForeground(new Color(0, 0, 0));
		pnlSach.add(btnHinhAnh);

		pnlTimKiem = new JPanel();
		pnlTimKiem.setBounds(20, 262, 910, 211);
		pnlTimKiem.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "T\u00ECm Ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSach.add(pnlTimKiem);
		pnlTimKiem.setLayout(null);

		lblTimKiem = new JLabel("Nhập mã hoặc tên sản phẩm cần tìm");
		lblTimKiem.setBounds(25, 25, 201, 13);
		pnlTimKiem.add(lblTimKiem);

		txtTimKiem = new JTextField();
		txtTimKiem.setForeground(Color.BLACK);
		txtTimKiem.setBounds(234, 22, 651, 19);
		pnlTimKiem.add(txtTimKiem);
		txtTimKiem.setColumns(10);

		JPanel pnlLoc = new JPanel();
		pnlLoc.setBorder(new TitledBorder(new LineBorder(new Color(171, 173, 179)), "Lọc Sản Phẩm",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlLoc.setBackground(new Color(255, 255, 255));
		pnlLoc.setBounds(25, 61, 863, 129);
		pnlTimKiem.add(pnlLoc);
		pnlLoc.setLayout(null);

		JLabel lblLocNCC = new JLabel("Nhà cung cấp");
		lblLocNCC.setBounds(25, 29, 90, 13);
		pnlLoc.add(lblLocNCC);

		JLabel lblLocTheLoai = new JLabel("Thể loại");
		lblLocTheLoai.setBounds(468, 29, 70, 13);
		pnlLoc.add(lblLocTheLoai);

		JLabel lblLocNamXB = new JLabel("Năm xuất bản");
		lblLocNamXB.setBounds(25, 72, 90, 13);
		pnlLoc.add(lblLocNamXB);

		JLabel lblLocTacGia = new JLabel("Tác giả");
		lblLocTacGia.setBounds(468, 69, 70, 13);
		pnlLoc.add(lblLocTacGia);

		txtLocTheLoai = new JTextField();
		txtLocTheLoai.setBounds(534, 26, 300, 19);
		pnlLoc.add(txtLocTheLoai);
		txtLocTheLoai.setColumns(10);

		txtLocNamXB = new JTextField();
		txtLocNamXB.setBounds(120, 69, 300, 19);
		pnlLoc.add(txtLocNamXB);
		txtLocNamXB.setColumns(10);

		txtLocTacGia = new JTextField();
		txtLocTacGia.setBounds(534, 66, 300, 19);
		pnlLoc.add(txtLocTacGia);
		txtLocTacGia.setColumns(10);

		JComboBox cboLocNCC = new MyCombobox();
		cboLocNCC.setBounds(120, 25, 300, 21);
		pnlLoc.add(cboLocNCC);

		tabbedPane.addTab("Sách", pnlSach);

		JPanel pnlChucNang = new JPanel();
		pnlChucNang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Chức Năng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlChucNang.setBounds(945, 262, 258, 211);
		pnlSach.add(pnlChucNang);
		pnlChucNang.setLayout(null);

		JButton btnThemSP = new MyButton("THÊM SẢN PHẨM");
		btnThemSP.setBounds(60, 23, 150, 35);
		pnlChucNang.add(btnThemSP);

		JButton btnCapNhat = new MyButton("CẬP NHẬT ");
		btnCapNhat.setBounds(60, 78, 150, 35);
		pnlChucNang.add(btnCapNhat);

		JButton btnXoaTrang = new MyButton("XÓA TRẮNG");
		btnXoaTrang.setBounds(10, 136, 100, 35);
		pnlChucNang.add(btnXoaTrang);

		JButton btnTaiLai = new MyButton("TẢI LẠI");
		btnTaiLai.setBounds(148, 136, 100, 35);
		pnlChucNang.add(btnTaiLai);
		
		String[] cols = { "STT", "Mã SP", "Tên sản phẩm", "Nhà cung cấp", "Tác giả", "Thể loại", "Nhà xuất bản", "Năm xuất bản",
				"Kệ", "Số lượng", "Giá nhập"};
		model = new DefaultTableModel(cols, 0);
		table = new MyTable(model);
		JScrollPane scr = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scr.setLocation(20, 489);
		scr.setSize(1183, 239);
		pnlSach.add(scr);
		
		// Tab văn phòng phẩm
		JPanel pnlVPP = new JPanel();
		pnlVPP.setBounds(0, 0, 1230, 800);
		pnlVPP.setLayout(null);

		tabbedPane.addTab("Văn phòng phẩm", pnlVPP);
		add(tabbedPane);
	}
}