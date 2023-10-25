package ui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
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

public class GUISanPham extends JPanel {
	private JTextField txtTheLoaiS;
	private JTextField txtMaSP;
	private JTextField txtMaSach;
	private JTextField txtTenSP;
	private JTextField txtTenSach;
	private JTextField txtKe;
	private JTextField txtKeS;
	private JTextField txtSoLuong;
	private JTextField txtSoLuongS;
	private JTextField txtGiaNhap;
	private JTextField txtGiaNhapS;
	private JTextField txtThue;
	private JTextField txtThueS;
	private JTextField txtLoiNhuan;
	private JTextField txtLoiNhuanS;
	private JTextField txtTacGia;
	private JTextField txtTheLoai;
	private JTextField txtNhaXB;
	private JTextField txtChatLieu;
	private JTextField txtNamXB;
	private JButton btnHinhAnh;
	private JButton btnHinhAnhS;
	private JButton btnTaoMaSP;
	private JButton btnTaoMaS;
	private JLabel lblTimKiem;
	private JTextField txtTimKiem;
	private JTextField txtTimKiemS;
	private JTextField txtLocTheLoai;
	private JTextField txtLocTheLoaiS;
	private JTextField txtLocNamXB;
	private JTextField txtLocTacGia;
	private DefaultTableModel model;
	private JTable tableSach;
	private JScrollPane scrSach;
	private MyCombobox cboLocNCC;
	private MyCombobox cboLocNCCS;
	private MyCombobox cboNhaCungCap;
	private MyCombobox cboNhaCungCapS;
	private MyCombobox cboDanhMuc;
	private JPanel pnlThongTin;
	private JLabel lblLocDanhMuc;
	private MyCombobox cboLocDanhMuc;
	private JButton btnThemSach;
	private JButton btnCapNhatS;
	private JButton btnXoaTrangS;
	private JButton btnTaiLaiS;
	private MyButton btnThemSP;
	private MyButton btnCapNhat;
	private MyButton btnXoaTrang;
	private MyButton btnTaiLai;
	private MyTable table;
	private JScrollPane scr;
	private JPanel pnlTimKiem_1;
	private JPanel pnlChucNang_1;

	public GUISanPham() {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(250, 0, 1250, 800);
		this.setLayout(null);

		// tạo tab
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setBounds(0, 0, 1230, 800);

		// tab sách
		JPanel pnlSach = new JPanel();
		pnlSach.setBackground(new Color(240, 240, 240));
		pnlSach.setBounds(0, 0, 1230, 800);
		pnlSach.setLayout(null);

		// thông tin sách
		JPanel pnlThongTinS = new JPanel();
		pnlThongTinS.setBackground(new Color(255, 255, 255));
		pnlThongTinS.setBounds(20, 10, 1183, 255);
		pnlThongTinS.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Thông Tin Sản Phẩm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSach.add(pnlThongTinS);
		pnlThongTinS.setLayout(null);

		JLabel lblMaSach = new JLabel("Mã sách");
		lblMaSach.setBounds(25, 33, 90, 13);
		pnlThongTinS.add(lblMaSach);

		JLabel lblTenSach = new JLabel("Tên sách");
		lblTenSach.setBounds(25, 68, 90, 13);
		pnlThongTinS.add(lblTenSach);

		JLabel lblNCC = new JLabel("Nhà cung cấp");
		lblNCC.setBounds(25, 106, 90, 13);
		pnlThongTinS.add(lblNCC);

		JLabel lblTheLoai = new JLabel("Thể loại");
		lblTheLoai.setBounds(25, 142, 90, 13);
		pnlThongTinS.add(lblTheLoai);

		JLabel lblKe = new JLabel("Kệ");
		lblKe.setBounds(25, 179, 90, 13);
		pnlThongTinS.add(lblKe);

		btnTaoMaS = new MyButton("Tạo mã");
		btnTaoMaS.setBounds(357, 29, 96, 21);
		pnlThongTinS.add(btnTaoMaS);

		txtMaSach = new JTextField();
		txtMaSach.setEnabled(false);
		txtMaSach.setColumns(10);
		txtMaSach.setBounds(116, 30, 215, 19);
		pnlThongTinS.add(txtMaSach);

		txtTenSach = new JTextField();
		txtTenSach.setColumns(10);
		txtTenSach.setBounds(116, 66, 337, 19);
		pnlThongTinS.add(txtTenSach);

		cboNhaCungCapS = new MyCombobox();
		cboNhaCungCapS.setBounds(116, 102, 337, 21);
		pnlThongTinS.add(cboNhaCungCapS);

		txtTheLoaiS = new JTextField();
		txtTheLoaiS.setBounds(116, 140, 337, 19);
		pnlThongTinS.add(txtTheLoaiS);
		txtTheLoaiS.setColumns(10);

		txtKeS = new JTextField();
		txtKeS.setBounds(116, 176, 337, 19);
		pnlThongTinS.add(txtKeS);
		txtKeS.setColumns(10);

		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setBounds(493, 33, 90, 13);
		pnlThongTinS.add(lblSoLuong);

		JLabel lblGiaNhap = new JLabel("Giá nhập");
		lblGiaNhap.setBounds(493, 68, 90, 13);
		pnlThongTinS.add(lblGiaNhap);

		JLabel lblThue = new JLabel("Thuế");
		lblThue.setBounds(735, 33, 68, 13);
		pnlThongTinS.add(lblThue);

		JLabel lblLoiNhuan = new JLabel("Lợi nhuận ");
		lblLoiNhuan.setBounds(735, 68, 68, 13);
		pnlThongTinS.add(lblLoiNhuan);

		JLabel lblTacGia = new JLabel("Tác giả");
		lblTacGia.setBounds(493, 106, 90, 13);
		pnlThongTinS.add(lblTacGia);

		JLabel lblNhaXB = new JLabel("Nhà xuất bản");
		lblNhaXB.setBounds(493, 142, 90, 13);
		pnlThongTinS.add(lblNhaXB);

		JLabel lblNamXB = new JLabel("Năm xuất bản");
		lblNamXB.setBounds(493, 179, 90, 13);
		pnlThongTinS.add(lblNamXB);

		txtSoLuongS = new JTextField();
		txtSoLuongS.setBounds(583, 30, 120, 19);
		pnlThongTinS.add(txtSoLuongS);
		txtSoLuongS.setColumns(10);

		txtGiaNhapS = new JTextField();
		txtGiaNhapS.setBounds(583, 65, 120, 19);
		pnlThongTinS.add(txtGiaNhapS);
		txtGiaNhapS.setColumns(10);

		txtThueS = new JTextField();
		txtThueS.setBounds(799, 30, 120, 19);
		pnlThongTinS.add(txtThueS);
		txtThueS.setColumns(10);

		txtLoiNhuanS = new JTextField();
		txtLoiNhuanS.setBounds(799, 65, 120, 19);
		pnlThongTinS.add(txtLoiNhuanS);
		txtLoiNhuanS.setColumns(10);

		txtTacGia = new JTextField();
		txtTacGia.setBounds(583, 103, 336, 19);
		pnlThongTinS.add(txtTacGia);
		txtTacGia.setColumns(10);

		txtNhaXB = new JTextField();
		txtNhaXB.setBounds(583, 139, 337, 19);
		pnlThongTinS.add(txtNhaXB);
		txtNhaXB.setColumns(10);

		txtNamXB = new JTextField();
		txtNamXB.setBounds(583, 176, 337, 19);
		pnlThongTinS.add(txtNamXB);
		txtNamXB.setColumns(10);

		JLabel lblPhanTramThue = new JLabel("%");
		lblPhanTramThue.setBounds(930, 33, 30, 13);
		pnlThongTinS.add(lblPhanTramThue);

		JLabel lblPhanTramLN = new JLabel("%");
		lblPhanTramLN.setBounds(930, 68, 30, 13);
		pnlThongTinS.add(lblPhanTramLN);

		JPanel pnlHinhAnh = new JPanel();
		pnlHinhAnh.setBounds(1025, 30, 135, 180);
		pnlHinhAnh.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlHinhAnh.setForeground(new Color(255, 255, 255));
		pnlThongTinS.add(pnlHinhAnh);
		pnlHinhAnh.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnHinhAnhS = new MyButton("Chọn ảnh ");
		btnHinhAnhS.setBounds(1047, 220, 100, 21);
		btnHinhAnhS.setForeground(new Color(0, 0, 0));
		pnlThongTinS.add(btnHinhAnhS);

		// tìm kiếm
		JPanel pnlTimKiem = new JPanel();
		pnlTimKiem.setBackground(new Color(255, 255, 255));
		pnlTimKiem.setBounds(20, 288, 910, 196);
		pnlTimKiem.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Tìm Kiếm",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSach.add(pnlTimKiem);
		pnlTimKiem.setLayout(null);

		lblTimKiem = new JLabel("Nhập mã hoặc tên sản phẩm cần tìm");
		lblTimKiem.setBounds(25, 25, 201, 13);
		pnlTimKiem.add(lblTimKiem);

		txtTimKiemS = new JTextField();
		txtTimKiemS.setForeground(Color.BLACK);
		txtTimKiemS.setBounds(234, 22, 651, 19);
		pnlTimKiem.add(txtTimKiemS);
		txtTimKiemS.setColumns(10);

		JPanel pnlLocS = new JPanel();
		pnlLocS.setBorder(new TitledBorder(new LineBorder(new Color(171, 173, 179)), "Lọc Sản Phẩm",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlLocS.setBackground(new Color(240, 240, 240));
		pnlLocS.setBounds(25, 61, 863, 115);
		pnlTimKiem.add(pnlLocS);
		pnlLocS.setLayout(null);

		JLabel lblLocNCC = new JLabel("Nhà cung cấp");
		lblLocNCC.setBounds(25, 29, 90, 13);
		pnlLocS.add(lblLocNCC);

		JLabel lblLocTheLoai = new JLabel("Thể loại");
		lblLocTheLoai.setBounds(468, 29, 70, 13);
		pnlLocS.add(lblLocTheLoai);

		JLabel lblLocNamXB = new JLabel("Năm xuất bản");
		lblLocNamXB.setBounds(25, 72, 90, 13);
		pnlLocS.add(lblLocNamXB);

		JLabel lblLocTacGia = new JLabel("Tác giả");
		lblLocTacGia.setBounds(468, 69, 70, 13);
		pnlLocS.add(lblLocTacGia);

		txtLocTheLoaiS = new JTextField();
		txtLocTheLoaiS.setBounds(534, 26, 300, 19);
		pnlLocS.add(txtLocTheLoaiS);
		txtLocTheLoaiS.setColumns(10);

		txtLocNamXB = new JTextField();
		txtLocNamXB.setBounds(120, 69, 300, 19);
		pnlLocS.add(txtLocNamXB);
		txtLocNamXB.setColumns(10);

		txtLocTacGia = new JTextField();
		txtLocTacGia.setBounds(534, 66, 300, 19);
		pnlLocS.add(txtLocTacGia);
		txtLocTacGia.setColumns(10);

		cboLocNCCS = new MyCombobox();
		cboLocNCCS.setBounds(120, 25, 300, 21);
		pnlLocS.add(cboLocNCCS);

		// chức năng
		JPanel pnlChucNang = new JPanel();
		pnlChucNang.setBackground(new Color(255, 255, 255));
		pnlChucNang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Chức Năng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlChucNang.setBounds(944, 288, 258, 196);
		pnlSach.add(pnlChucNang);
		pnlChucNang.setLayout(null);

		btnThemSach = new MyButton("THÊM SẢN PHẨM");
		btnThemSach.setText("THÊM SÁCH");
		btnThemSach.setBounds(60, 23, 150, 35);
		pnlChucNang.add(btnThemSach);

		btnCapNhatS = new MyButton("CẬP NHẬT ");
		btnCapNhatS.setBounds(60, 78, 150, 35);
		pnlChucNang.add(btnCapNhatS);

		btnXoaTrangS = new MyButton("XÓA TRẮNG");
		btnXoaTrangS.setBounds(10, 136, 100, 35);
		pnlChucNang.add(btnXoaTrangS);

		btnTaiLaiS = new MyButton("TẢI LẠI");
		btnTaiLaiS.setBounds(148, 136, 100, 35);
		pnlChucNang.add(btnTaiLaiS);

		// tạo bảng sách
		JPanel pnlTableS = new JPanel();
		pnlTableS.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Danh Sách Sanr Phẩm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlTableS.setBackground(new Color(255, 255, 255));
		pnlTableS.setBounds(20, 501, 1183, 249);
		pnlSach.add(pnlTableS);
		String[] colsSach = { "STT", "Mã SP", "Tên sản phẩm", "Nhà cung cấp", "Tác giả", "Thể loại", "Nhà xuất bản",
				"Năm xuất bản", "Kệ", "Số lượng", "Giá nhập" };
		model = new DefaultTableModel(colsSach, 0);
		pnlTableS.setLayout(null);
		tableSach = new MyTable(model);
		scrSach = new JScrollPane(tableSach, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrSach.setLocation(25, 21);
		scrSach.setSize(1133, 200);
		pnlTableS.add(scrSach);

		// Tab văn phòng phẩm
		JPanel pnlVPP = new JPanel();
		pnlVPP.setBackground(new Color(240, 240, 240));
		pnlVPP.setBounds(0, 0, 1230, 800);
		pnlVPP.setLayout(null);

		// thông tin văn phòng phẩm
		pnlThongTin = new JPanel();
		pnlThongTin.setBackground(new Color(255, 255, 255));
		pnlThongTin.setBounds(20, 10, 1183, 255);
		pnlThongTin.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Thông Tin Sản Phẩm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlVPP.add(pnlThongTin);
		pnlThongTin.setLayout(null);

		JLabel lblMaSP = new JLabel("Mã sản phẩm");
		lblMaSP.setBounds(25, 33, 90, 13);
		pnlThongTin.add(lblMaSP);

		JLabel lblTenSP = new JLabel("Tên sản phẩm");
		lblTenSP.setBounds(25, 68, 90, 13);
		pnlThongTin.add(lblTenSP);

		lblNCC = new JLabel("Nhà cung cấp");
		lblNCC.setBounds(25, 106, 90, 13);
		pnlThongTin.add(lblNCC);

		JLabel lblDanhMuc = new JLabel("Danh mục");
		lblDanhMuc.setBounds(25, 142, 90, 13);
		pnlThongTin.add(lblDanhMuc);

		lblKe = new JLabel("Kệ");
		lblKe.setBounds(25, 179, 90, 13);
		pnlThongTin.add(lblKe);

		btnTaoMaSP = new MyButton("Tạo mã");
		btnTaoMaSP.setBounds(357, 29, 96, 21);
		pnlThongTin.add(btnTaoMaSP);

		txtMaSP = new JTextField();
		txtMaSP.setEnabled(false);
		txtMaSP.setColumns(10);
		txtMaSP.setBounds(116, 30, 215, 19);
		pnlThongTin.add(txtMaSP);

		txtTenSP = new JTextField();
		txtTenSP.setColumns(10);
		txtTenSP.setBounds(116, 66, 337, 19);
		pnlThongTin.add(txtTenSP);

		cboNhaCungCap = new MyCombobox();
		cboNhaCungCap.setBounds(116, 102, 337, 21);
		pnlThongTin.add(cboNhaCungCap);

		txtKe = new JTextField();
		txtKe.setBounds(116, 176, 337, 19);
		pnlThongTin.add(txtKe);
		txtKe.setColumns(10);

		lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setBounds(519, 36, 90, 13);
		pnlThongTin.add(lblSoLuong);

		lblGiaNhap = new JLabel("Giá nhập");
		lblGiaNhap.setBounds(519, 71, 90, 13);
		pnlThongTin.add(lblGiaNhap);

		lblThue = new JLabel("Thuế");
		lblThue.setBounds(761, 36, 68, 13);
		pnlThongTin.add(lblThue);

		lblLoiNhuan = new JLabel("Lợi nhuận ");
		lblLoiNhuan.setBounds(761, 71, 68, 13);
		pnlThongTin.add(lblLoiNhuan);

		lblTacGia = new JLabel("Thể loại");
		lblTacGia.setBounds(519, 109, 90, 13);
		pnlThongTin.add(lblTacGia);

		JLabel lblChatLieu = new JLabel("Chất liệu");
		lblChatLieu.setBounds(519, 145, 90, 13);
		pnlThongTin.add(lblChatLieu);

		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(609, 33, 120, 19);
		pnlThongTin.add(txtSoLuong);
		txtSoLuong.setColumns(10);

		txtGiaNhap = new JTextField();
		txtGiaNhap.setBounds(609, 68, 120, 19);
		pnlThongTin.add(txtGiaNhap);
		txtGiaNhap.setColumns(10);

		txtThue = new JTextField();
		txtThue.setBounds(825, 33, 120, 19);
		pnlThongTin.add(txtThue);
		txtThue.setColumns(10);

		txtLoiNhuan = new JTextField();
		txtLoiNhuan.setBounds(825, 68, 120, 19);
		pnlThongTin.add(txtLoiNhuan);
		txtLoiNhuan.setColumns(10);

		txtTheLoai = new JTextField();
		txtTheLoai.setBounds(609, 106, 336, 19);
		pnlThongTin.add(txtTheLoai);
		txtTheLoai.setColumns(10);

		txtChatLieu = new JTextField();
		txtChatLieu.setBounds(609, 142, 337, 19);
		pnlThongTin.add(txtChatLieu);
		txtChatLieu.setColumns(10);

		lblPhanTramThue = new JLabel("%");
		lblPhanTramThue.setBounds(956, 36, 30, 13);
		pnlThongTin.add(lblPhanTramThue);

		lblPhanTramLN = new JLabel("%");
		lblPhanTramLN.setBounds(956, 71, 30, 13);
		pnlThongTin.add(lblPhanTramLN);

		cboDanhMuc = new MyCombobox();
		cboDanhMuc.setBounds(116, 138, 337, 21);
		pnlThongTin.add(cboDanhMuc);

		pnlHinhAnh = new JPanel();
		pnlHinhAnh.setBounds(1021, 30, 135, 180);
		pnlHinhAnh.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlHinhAnh.setForeground(new Color(255, 255, 255));
		pnlThongTin.add(pnlHinhAnh);
		pnlHinhAnh.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnHinhAnh = new MyButton("Chọn ảnh ");
		btnHinhAnh.setBounds(1043, 220, 100, 21);
		btnHinhAnh.setForeground(new Color(0, 0, 0));
		pnlThongTin.add(btnHinhAnh);

		// tìm kiếm
		pnlTimKiem_1 = new JPanel();
		pnlTimKiem_1.setBackground(new Color(255, 255, 255));
		pnlTimKiem_1.setBounds(20, 288, 910, 196);
		pnlTimKiem_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Tìm Kiếm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlVPP.add(pnlTimKiem_1);
		pnlTimKiem_1.setLayout(null);

		lblTimKiem = new JLabel("Nhập mã hoặc tên sản phẩm cần tìm");
		lblTimKiem.setBounds(25, 25, 201, 13);
		pnlTimKiem_1.add(lblTimKiem);

		txtTimKiem = new JTextField();
		txtTimKiem.setForeground(Color.BLACK);
		txtTimKiem.setBounds(234, 22, 651, 19);
		pnlTimKiem_1.add(txtTimKiem);
		txtTimKiem.setColumns(10);

		JPanel pnlLoc;
		pnlLoc = new JPanel();
		pnlLoc.setBorder(new TitledBorder(new LineBorder(new Color(171, 173, 179)), "Lọc Sản Phẩm",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlLoc.setBackground(new Color(240, 240, 240));
		pnlLoc.setBounds(35, 57, 863, 115);
		pnlTimKiem_1.add(pnlLoc);
		pnlLoc.setLayout(null);

		lblLocNCC = new JLabel("Nhà cung cấp");
		lblLocNCC.setBounds(25, 29, 90, 13);
		pnlLoc.add(lblLocNCC);

		lblLocTheLoai = new JLabel("Thể loại");
		lblLocTheLoai.setBounds(468, 29, 70, 13);
		pnlLoc.add(lblLocTheLoai);

		lblLocDanhMuc = new JLabel("Danh mục");
		lblLocDanhMuc.setBounds(25, 72, 90, 13);
		pnlLoc.add(lblLocDanhMuc);

		txtLocTheLoai = new JTextField();
		txtLocTheLoai.setBounds(534, 26, 300, 19);
		pnlLoc.add(txtLocTheLoai);
		txtLocTheLoai.setColumns(10);

		cboLocNCC = new MyCombobox();
		cboLocNCC.setBounds(120, 25, 300, 21);
		pnlLoc.add(cboLocNCC);

		cboLocDanhMuc = new MyCombobox();
		cboLocDanhMuc.setBounds(120, 68, 300, 21);
		pnlLoc.add(cboLocDanhMuc);

		// chức năng
		pnlChucNang_1 = new JPanel();
		pnlChucNang_1.setBackground(new Color(255, 255, 255));
		pnlChucNang_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Chức Năng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlChucNang_1.setBounds(945, 288, 258, 196);
		pnlVPP.add(pnlChucNang_1);
		pnlChucNang_1.setLayout(null);

		btnThemSP = new MyButton("THÊM SẢN PHẨM");
		btnThemSP.setBounds(60, 23, 150, 35);
		pnlChucNang_1.add(btnThemSP);

		btnCapNhat = new MyButton("CẬP NHẬT ");
		btnCapNhat.setBounds(60, 78, 150, 35);
		pnlChucNang_1.add(btnCapNhat);

		btnXoaTrang = new MyButton("XÓA TRẮNG");
		btnXoaTrang.setBounds(10, 136, 100, 35);
		pnlChucNang_1.add(btnXoaTrang);

		btnTaiLai = new MyButton("TẢI LẠI");
		btnTaiLai.setBounds(148, 136, 100, 35);
		pnlChucNang_1.add(btnTaiLai);

		// tạo bảng vpp
		JPanel pnlTable = new JPanel();
		pnlTable.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null),
				"Danh Sách Sanr Phẩm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlTable.setBackground(new Color(255, 255, 255));
		pnlTable.setBounds(20, 501, 1183, 249);
		pnlVPP.add(pnlTable);

		String[] cols = { "STT", "Mã SP", "Tên sản phẩm", "Nhà cung cấp", "Danh mục", "Thể loại", "Chất liệu", "Kệ",
				"Số lượng", "Giá nhập" };
		model = new DefaultTableModel(cols, 0);
		pnlTable.setLayout(null);
		table = new MyTable(model);
		scr = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scr.setLocation(29, 20);
		scr.setSize(1131, 203);
		pnlTable.add(scr);

		tabbedPane.addTab("Sách", pnlSach);
		tabbedPane.addTab("Văn phòng phẩm", pnlVPP);
		this.add(tabbedPane);
	}
}