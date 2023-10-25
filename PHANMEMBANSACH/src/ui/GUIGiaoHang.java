package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import CustomUI.MyTable;

public class GUIGiaoHang extends JPanel {
		private JTextField txtMaDonHang;
		private JTextField txtMaHoaDon;
		private JTextField txtNgayLap;
		private JTextField txtTenKhachHang;
		private JTextField txtDiaChi;
		private JTextField txtSDT;
		private JTextField txtPhuongThucThanhToan;
		private JTextField txtSoKG;
		private JTextField txtTienVanChuyen;
		private JTextField txtTKMaDonHang;
		private JTextField txtTKTenNhanVienGH;
		private JTextField txtTKTenKhachHang;
		private DefaultTableModel model;
		private MyTable tbDonHang;
		private JTextField txtChaHonThnh;
		private JTextField txtSoKm;
		public GUIGiaoHang() {
			this.setBackground(new Color(255, 255, 255));
			this.setBounds(250, 0, 1250, 800);
			this.setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane();
			tabbedPane.setBounds(20, 0, 1195, 800);
			
			// tab giao hàng
			JPanel pnlGiaoHang = new JPanel();
			pnlGiaoHang.setBackground(new Color(255, 255, 255));
			pnlGiaoHang.setBounds(20, 0, 1195, 800);
			
			
			
			
			// tab quản lý giao hàng
			JPanel pnlQuanLyGiaoHang = new JPanel();
			pnlQuanLyGiaoHang.setBackground(Color.blue);
			pnlGiaoHang.setBounds(20, 0, 1195, 800);
			
			tabbedPane.add("Giao Hàng", pnlGiaoHang);
			pnlGiaoHang.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel.setBounds(10, 11, 1170, 219);
			pnlGiaoHang.add(panel);
			panel.setLayout(null);
			
			JLabel lblMaDonHang = new JLabel("Mã đơn hàng");
			lblMaDonHang.setBounds(29, 24, 76, 14);
			panel.add(lblMaDonHang);
			
			JLabel lblMaHoaDon = new JLabel("Mã hóa đơn");
			lblMaHoaDon.setBounds(29, 49, 76, 14);
			panel.add(lblMaHoaDon);
			
			JLabel lblNgayLap = new JLabel("Ngày lập");
			lblNgayLap.setBounds(29, 74, 76, 14);
			panel.add(lblNgayLap);
			
			JLabel lblTenNhanVien = new JLabel("Tên nhân viên giao hàng");
			lblTenNhanVien.setBounds(29, 99, 136, 14);
			panel.add(lblTenNhanVien);
			
			JLabel lblTenKhachHang = new JLabel("Tên khách hàng");
			lblTenKhachHang.setBounds(29, 124, 103, 14);
			panel.add(lblTenKhachHang);
			
			JLabel lblDiaChi = new JLabel("Địa chỉ");
			lblDiaChi.setBounds(29, 149, 46, 14);
			panel.add(lblDiaChi);
			
			txtMaDonHang = new JTextField();
			txtMaDonHang.setEnabled(false);
			txtMaDonHang.setBounds(183, 21, 352, 20);
			panel.add(txtMaDonHang);
			txtMaDonHang.setColumns(10);
			
			txtMaHoaDon = new JTextField();
			txtMaHoaDon.setBounds(183, 46, 352, 20);
			panel.add(txtMaHoaDon);
			txtMaHoaDon.setColumns(10);
			
			txtNgayLap = new JTextField();
			txtNgayLap.setBounds(183, 71, 352, 20);
			panel.add(txtNgayLap);
			txtNgayLap.setColumns(10);
			
			txtTenKhachHang = new JTextField();
			txtTenKhachHang.setBounds(183, 121, 352, 20);
			panel.add(txtTenKhachHang);
			txtTenKhachHang.setColumns(10);
			
			txtDiaChi = new JTextField();
			txtDiaChi.setBounds(183, 146, 352, 20);
			panel.add(txtDiaChi);
			txtDiaChi.setColumns(10);
			
			JComboBox cbbTenNhanVienGH = new JComboBox();
			cbbTenNhanVienGH.setBounds(183, 95, 352, 22);
			panel.add(cbbTenNhanVienGH);
			
			JLabel lblNewLabel_6 = new JLabel("SĐT");
			lblNewLabel_6.setBounds(615, 24, 46, 14);
			panel.add(lblNewLabel_6);
			
			txtSDT = new JTextField();
			txtSDT.setBounds(782, 21, 352, 20);
			panel.add(txtSDT);
			txtSDT.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("Phương thức thanh toán");
			lblNewLabel_7.setBounds(615, 49, 156, 14);
			panel.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel("Số KG");
			lblNewLabel_8.setBounds(615, 74, 46, 14);
			panel.add(lblNewLabel_8);
			
			JLabel lblNewLabel_9 = new JLabel("Số KM");
			lblNewLabel_9.setBounds(615, 99, 46, 14);
			panel.add(lblNewLabel_9);
			
			JLabel lblNewLabel_10 = new JLabel("Tiền vận chuyển");
			lblNewLabel_10.setBounds(615, 124, 103, 14);
			panel.add(lblNewLabel_10);
			
			JLabel lblNewLabel_11 = new JLabel("Trạng thái");
			lblNewLabel_11.setBounds(615, 149, 82, 14);
			panel.add(lblNewLabel_11);
			
			JLabel lblNewLabel_12 = new JLabel("Ghi chú");
			lblNewLabel_12.setBounds(615, 174, 46, 14);
			panel.add(lblNewLabel_12);
			
			txtPhuongThucThanhToan = new JTextField();
			txtPhuongThucThanhToan.setBounds(782, 46, 352, 20);
			panel.add(txtPhuongThucThanhToan);
			txtPhuongThucThanhToan.setColumns(10);
			
			txtSoKG = new JTextField();
			txtSoKG.setBounds(782, 71, 352, 20);
			panel.add(txtSoKG);
			txtSoKG.setColumns(10);
			
			
			JButton btnNewButton = new JButton("Khoảng cách");
			btnNewButton.setBackground(new Color(255, 0, 0));
			btnNewButton.setBounds(992, 95, 142, 23);
			panel.add(btnNewButton);
			
			txtTienVanChuyen = new JTextField();
			txtTienVanChuyen.setBounds(782, 121, 352, 20);
			panel.add(txtTienVanChuyen);
			txtTienVanChuyen.setColumns(10);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(782, 175, 352, 33);
			panel.add(textArea);
			
			txtChaHonThnh = new JTextField();
			txtChaHonThnh.setText("chưa hoàn thành");
			txtChaHonThnh.setEditable(false);
			txtChaHonThnh.setBounds(782, 146, 352, 20);
			panel.add(txtChaHonThnh);
			txtChaHonThnh.setColumns(10);
			
			
			txtSoKm = new JTextField();
			txtSoKm.setEditable(false);
			txtSoKm.setBounds(782, 96, 185, 20);
			panel.add(txtSoKm);
			txtSoKm.setColumns(10);
			
			JButton btnTaoDonHang = new JButton("Tạo đơn hàng");
			btnTaoDonHang.setBackground(new Color(97, 166, 247));
			btnTaoDonHang.setBounds(1040, 247, 140, 30);
			pnlGiaoHang.add(btnTaoDonHang);
			
			JButton btnTaoMaDonHang = new JButton("Tạo mã đơn hàng");
			btnTaoMaDonHang.setBackground(new Color(97, 166, 247));
			btnTaoMaDonHang.setBounds(872, 247, 140, 30);
			pnlGiaoHang.add(btnTaoMaDonHang);
			
			JButton btnInPhieuDonHang = new JButton("In phiếu đơn hàng");
			btnInPhieuDonHang.setBackground(new Color(97, 166, 247));
			btnInPhieuDonHang.setBounds(702, 247, 140, 30);
			pnlGiaoHang.add(btnInPhieuDonHang);
			
			JLabel lblTìmKiem = new JLabel("Tìm kiếm");
			lblTìmKiem.setBounds(10, 290, 72, 14);
			pnlGiaoHang.add(lblTìmKiem);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_1.setBounds(10, 315, 1170, 70);
			pnlGiaoHang.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblMaDonHangTK = new JLabel("Mã đơn hàng");
			lblMaDonHangTK.setBounds(39, 29, 91, 14);
			panel_1.add(lblMaDonHangTK);
			
			txtTKMaDonHang = new JTextField();
			txtTKMaDonHang.setBounds(139, 26, 142, 20);
			panel_1.add(txtTKMaDonHang);
			txtTKMaDonHang.setColumns(10);
			
			JLabel lblTenNhanVienGHTK = new JLabel("Tên nhân viên giao hàng");
			lblTenNhanVienGHTK.setBounds(429, 29, 142, 14);
			panel_1.add(lblTenNhanVienGHTK);
			
			txtTKTenNhanVienGH = new JTextField();
			txtTKTenNhanVienGH.setBounds(602, 26, 142, 20);
			panel_1.add(txtTKTenNhanVienGH);
			txtTKTenNhanVienGH.setColumns(10);
			
			JLabel lblTenKhachHangTK = new JLabel("Tên khách hàng");
			lblTenKhachHangTK.setBounds(872, 29, 91, 14);
			panel_1.add(lblTenKhachHangTK);
			
			txtTKTenKhachHang = new JTextField();
			txtTKTenKhachHang.setBounds(984, 26, 142, 20);
			panel_1.add(txtTKTenKhachHang);
			txtTKTenKhachHang.setColumns(10);
			
			JLabel lblDSDonGiaoHang = new JLabel("Danh sách đơn hàng đang giao ");
			lblDSDonGiaoHang.setBounds(10, 404, 199, 14);
			pnlGiaoHang.add(lblDSDonGiaoHang);
			
			
			model = new DefaultTableModel(new Object[] {"Mã đơn hàng", "Tên nhân viên giao hàng", "Ngày lập", "Tên khách hàng", "Địa chỉ", "SĐT", "Trọng lượng", "Tiền vận chuyển", "Trạng thái"}, 0);
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			model.addRow(new Object[] {"DGH1", "Nguyễn Văn Sang", "18/10/2023", "Trần Hữu Danh", "Tây Thạnh Tân Phú Tp.Hồ Chí Minh", "0332966175", "5","25.000", "Chưa hoàn thành"});
			tbDonHang = new MyTable(model);
			
			JScrollPane scrollPane = new JScrollPane(tbDonHang);
			scrollPane.setBounds(10, 429, 1170, 248);
			pnlGiaoHang.add(scrollPane);
			
			JButton btnNewButton_4 = new JButton("Thành công");
			btnNewButton_4.setBackground(new Color(0, 255, 128));
			
			btnNewButton_4.setBounds(645, 698, 163, 30);
			pnlGiaoHang.add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("Bị hủy");
			btnNewButton_5.setBackground(new Color(255, 128, 128));
			btnNewButton_5.setBounds(391, 698, 163, 30);
			pnlGiaoHang.add(btnNewButton_5);
			
			
			
			tabbedPane.add("Quản Lý Giao Hàng",pnlQuanLyGiaoHang);
			add(tabbedPane);

	}
}
