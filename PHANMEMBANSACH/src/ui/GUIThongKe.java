package ui;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import CustomUI.MyTable;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
public class GUIThongKe extends JPanel {
	private DefaultTableModel modelDanhSachHoaDonCaNhan;
	private MyTable tbDanhSachHoaDonCaNhan;
	private MyTable tbDanhSachHoaDonCaNhan_1;
	private DefaultTableModel modelThongKeDoanhThuCacQuy;
	private DefaultTableModel modelHoaDonTheoThang;
	private MyTable tbThongKeDoanhThuCacQuy;
	private DefaultTableModel modelThongKeNhanVien;
	private JTable tbThongKeNhanVien;
	private DefaultTableModel modelThongKeThanhPhanTrongThang;
	private MyTable tbThongKeThanhPhanTrongThang;
	private DefaultTableModel modelDanhSachSanPhamDoiTra;
	private MyTable tbDanhSachSanPhamDoiTra;
	private DefaultTableModel modelDanhSachTop10SachTrongQuy;
	private MyTable tbDanhSachTop10SachTrongQuy;
	private DefaultTableModel modelDanhVPPTop10SachTrongQuy;
	private DefaultTableModel modelDanhSachTop10VPPTrongQuy;
	private MyTable tbDanhSachTop10VPPTrongQuy;

	public GUIThongKe() {
		this.setBackground(new Color(240, 240, 240));
		this.setBounds(250, 0, 1250, 800);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tabbedPane.setBounds(0, 0, 1230, 760);
		add(tabbedPane);
		
		JPanel pnlCaNhan = new JPanel();
		tabbedPane.addTab("Cá nhân", null, pnlCaNhan, null);
		pnlCaNhan.setLayout(null);
		
		JPanel pnlThongKeTrongNgay = new JPanel();
		pnlThongKeTrongNgay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlThongKeTrongNgay.setLayout(null);
		pnlThongKeTrongNgay.setBackground(Color.WHITE);
		pnlThongKeTrongNgay.setBounds(15, 11, 1190, 205);
		pnlCaNhan.add(pnlThongKeTrongNgay);
		
		JPanel pnlSoHoaDon = new JPanel();
		pnlSoHoaDon.setBackground(new Color(128, 128, 192));
		pnlSoHoaDon.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(192, 192, 192), null, null));
		pnlSoHoaDon.setLayout(null);
		pnlSoHoaDon.setBounds(30, 45, 260, 140);
		pnlThongKeTrongNgay.add(pnlSoHoaDon);
		
		JLabel lblThongKeSoHoaDon = new JLabel("Số hóa đơn");
		lblThongKeSoHoaDon.setForeground(Color.WHITE);
		lblThongKeSoHoaDon.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeSoHoaDon.setBounds(25, 25, 120, 25);
		pnlSoHoaDon.add(lblThongKeSoHoaDon);
		
		JLabel lblSoHoaDon = new JLabel("20");
		lblSoHoaDon.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoHoaDon.setForeground(Color.WHITE);
		lblSoHoaDon.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoHoaDon.setBounds(100, 77, 72, 40);
		pnlSoHoaDon.add(lblSoHoaDon);
		
		JLabel lblDonViSoHoaDon = new JLabel("Đơn");
		lblDonViSoHoaDon.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoHoaDon.setForeground(Color.WHITE);
		lblDonViSoHoaDon.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDonViSoHoaDon.setBounds(171, 77, 55, 40);
		pnlSoHoaDon.add(lblDonViSoHoaDon);
		
		JPanel pnlDoanhThu = new JPanel();
		pnlDoanhThu.setBackground(new Color(255, 128, 128));
		pnlDoanhThu.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(192, 192, 192), null, null));
		pnlDoanhThu.setLayout(null);
		pnlDoanhThu.setBounds(318, 45, 260, 140);
		pnlThongKeTrongNgay.add(pnlDoanhThu);
		
		JLabel lblThongKeDoanhThu = new JLabel("Doanh thu");
		lblThongKeDoanhThu.setBounds(25, 25, 120, 25);
		pnlDoanhThu.add(lblThongKeDoanhThu);
		lblThongKeDoanhThu.setForeground(new Color(255, 255, 255));
		lblThongKeDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblTDoanhThu = new JLabel("1.000.000");
		lblTDoanhThu.setBounds(10, 76, 152, 40);
		pnlDoanhThu.add(lblTDoanhThu);
		lblTDoanhThu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTDoanhThu.setForeground(new Color(255, 255, 255));
		lblTDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JLabel lblDonViDoanhThu = new JLabel("VNĐ");
		lblDonViDoanhThu.setBounds(168, 76, 55, 40);
		pnlDoanhThu.add(lblDonViDoanhThu);
		lblDonViDoanhThu.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViDoanhThu.setForeground(Color.WHITE);
		lblDonViDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel pnlSoLuongSP = new JPanel();
		pnlSoLuongSP.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(192, 192, 192), null, null));
		pnlSoLuongSP.setBackground(new Color(122, 191, 81));
		pnlSoLuongSP.setLayout(null);
		pnlSoLuongSP.setBounds(610, 45, 260, 140);
		pnlThongKeTrongNgay.add(pnlSoLuongSP);
		
		JLabel lblThongKeSoLuongSP = new JLabel("Số lượng sản phẩm");
		lblThongKeSoLuongSP.setForeground(Color.WHITE);
		lblThongKeSoLuongSP.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeSoLuongSP.setBounds(25, 25, 187, 25);
		pnlSoLuongSP.add(lblThongKeSoLuongSP);
		
		JLabel lblSoLuongSP = new JLabel("50");
		lblSoLuongSP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoLuongSP.setForeground(Color.WHITE);
		lblSoLuongSP.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoLuongSP.setBounds(46, 74, 72, 40);
		pnlSoLuongSP.add(lblSoLuongSP);
		
		JLabel lblDonViSoLuongSP = new JLabel("Sản phẩm");
		lblDonViSoLuongSP.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoLuongSP.setForeground(Color.WHITE);
		lblDonViSoLuongSP.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDonViSoLuongSP.setBounds(131, 75, 100, 40);
		pnlSoLuongSP.add(lblDonViSoLuongSP);
		
		JPanel pnlSoLuongDoiTra = new JPanel();
		pnlSoLuongDoiTra.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(192, 192, 192), null, null));
		pnlSoLuongDoiTra.setBackground(new Color(241, 169, 103));
		pnlSoLuongDoiTra.setLayout(null);
		pnlSoLuongDoiTra.setBounds(900, 45, 260, 140);
		pnlThongKeTrongNgay.add(pnlSoLuongDoiTra);
		
		JLabel lblThongKeSoLuongDDT = new JLabel("Số lượng đơn đổi trả");
		lblThongKeSoLuongDDT.setForeground(Color.WHITE);
		lblThongKeSoLuongDDT.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeSoLuongDDT.setBounds(25, 25, 203, 25);
		pnlSoLuongDoiTra.add(lblThongKeSoLuongDDT);
		
		JLabel lblSoLuongDDT = new JLabel("1");
		lblSoLuongDDT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoLuongDDT.setForeground(Color.WHITE);
		lblSoLuongDDT.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoLuongDDT.setBounds(101, 72, 72, 40);
		pnlSoLuongDoiTra.add(lblSoLuongDDT);
		
		JLabel lblDonViSoLuongDDT = new JLabel("Đơn");
		lblDonViSoLuongDDT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoLuongDDT.setForeground(Color.WHITE);
		lblDonViSoLuongDDT.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDonViSoLuongDDT.setBounds(183, 73, 45, 40);
		pnlSoLuongDoiTra.add(lblDonViSoLuongDDT);
		
		JLabel lblThongKeTrongNgay = new JLabel("Thống kê trong ngày");
		lblThongKeTrongNgay.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThongKeTrongNgay.setBounds(15, 15, 200, 20);
		pnlThongKeTrongNgay.add(lblThongKeTrongNgay);
		
		JPanel pnlThongKeTrongTuan = new JPanel();
		pnlThongKeTrongTuan.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlThongKeTrongTuan.setLayout(null);
		pnlThongKeTrongTuan.setBackground(Color.WHITE);
		pnlThongKeTrongTuan.setBounds(15, 235, 612, 474);
		pnlCaNhan.add(pnlThongKeTrongTuan);
		
		JPanel pnlBieuDoThongKeCaNhan = new JPanel();
		pnlBieuDoThongKeCaNhan.setLayout(null);
		pnlBieuDoThongKeCaNhan.setBounds(23, 55, 569, 395);
		
		JFreeChart barChart = ChartFactory.createBarChart("Biểu đồ doanh thu theo tuần", "Thứ", "VNĐ", taoBieuDoDoanhThuTuan(),PlotOrientation.VERTICAL,false,false,true);
		ChartPanel cpnlDoanhThuTheoTuan = new ChartPanel(barChart);
		
		cpnlDoanhThuTheoTuan.setSize(549, 374);
		cpnlDoanhThuTheoTuan.setLocation(10, 10);
		cpnlDoanhThuTheoTuan.setPreferredSize(new Dimension(500,400));
		pnlBieuDoThongKeCaNhan.add(cpnlDoanhThuTheoTuan);
		cpnlDoanhThuTheoTuan.setLayout(null);
		pnlThongKeTrongTuan.add(pnlBieuDoThongKeCaNhan);
		
		JComboBox cboThongKeTheoTuan = new JComboBox();
		cboThongKeTheoTuan.setModel(new DefaultComboBoxModel(new String[] {"Tuần này"}));
		cboThongKeTheoTuan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboThongKeTheoTuan.setBounds(364, 13, 228, 24);
		pnlThongKeTrongTuan.add(cboThongKeTheoTuan);
		
		JLabel lblThongKeTrongNgay_1 = new JLabel("Thống kê trong tuần");
		lblThongKeTrongNgay_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThongKeTrongNgay_1.setBounds(23, 15, 200, 20);
		pnlThongKeTrongTuan.add(lblThongKeTrongNgay_1);
		
		JPanel pnlThongKeDanhSachHoaDon = new JPanel();
		pnlThongKeDanhSachHoaDon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlThongKeDanhSachHoaDon.setLayout(null);
		pnlThongKeDanhSachHoaDon.setBackground(Color.WHITE);
		pnlThongKeDanhSachHoaDon.setBounds(645, 235, 560, 474);
		pnlCaNhan.add(pnlThongKeDanhSachHoaDon);
		
		modelDanhSachHoaDonCaNhan = new DefaultTableModel(
				new Object[] {"Ngày trong tuần" ,"Số hóa đơn","Doanh thu","Số lượng SP"}, 0);
		
		modelDanhSachHoaDonCaNhan.addRow(new Object[] {"Thứ 2","24","4000000","32"});
		modelDanhSachHoaDonCaNhan.addRow(new Object[] {"Thứ 3","10","1000000","12"});
		modelDanhSachHoaDonCaNhan.addRow(new Object[] {"Thứ 4","22","3000000","44"});
		modelDanhSachHoaDonCaNhan.addRow(new Object[] {"Thứ 5","20","7000000","60"});
		modelDanhSachHoaDonCaNhan.addRow(new Object[] {"Thứ 6","20","2000000","24"});
		modelDanhSachHoaDonCaNhan.addRow(new Object[] {"Thứ 7","20","9000000","70"});
		modelDanhSachHoaDonCaNhan.addRow(new Object[] {"Chủ nhật","20","8000000","26"});
		
		
		tbDanhSachHoaDonCaNhan = new MyTable(modelDanhSachHoaDonCaNhan);		
		tbDanhSachHoaDonCaNhan.getColumnModel().getColumn(2).setPreferredWidth(120);
		tbDanhSachHoaDonCaNhan.setRowHeight(50);
		
		JScrollPane srcDanhSachHoaDonCaNhan = new JScrollPane(tbDanhSachHoaDonCaNhan,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		srcDanhSachHoaDonCaNhan.setBounds(20, 55, 515, 380);
		pnlThongKeDanhSachHoaDon.add(srcDanhSachHoaDonCaNhan);
		
		JLabel lblDanhSachHoaDonNhanVien = new JLabel("Danh sách hóa đơn");
		lblDanhSachHoaDonNhanVien.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDanhSachHoaDonNhanVien.setBounds(10, 15, 200, 20);
		pnlThongKeDanhSachHoaDon.add(lblDanhSachHoaDonNhanVien);
		
		JComboBox cboDanhSachHoaDonCaNhan = new JComboBox();
		cboDanhSachHoaDonCaNhan.setModel(new DefaultComboBoxModel(new String[] {"Tuần này"}));
		cboDanhSachHoaDonCaNhan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboDanhSachHoaDonCaNhan.setBounds(311, 15, 228, 24);
		pnlThongKeDanhSachHoaDon.add(cboDanhSachHoaDonCaNhan);
		
		JPanel pnlCuaHang = new JPanel();
		tabbedPane.addTab("Cửa hàng", null, pnlCuaHang, null);
		pnlCuaHang.setLayout(null);
		
		JPanel pnlThongKeDoanhThuQuy = new JPanel();
		pnlThongKeDoanhThuQuy.setBackground(new Color(255, 255, 255));
		pnlThongKeDoanhThuQuy.setBounds(21, 20, 1180, 264);
		pnlCuaHang.add(pnlThongKeDoanhThuQuy);
		pnlThongKeDoanhThuQuy.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thống kê doanh thu các quý theo năm");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 290, 20);
		pnlThongKeDoanhThuQuy.add(lblNewLabel);
		
		JComboBox cboThongKeTheoTuan_1 = new JComboBox();
		cboThongKeTheoTuan_1.setModel(new DefaultComboBoxModel(new String[] {"2023"}));
		cboThongKeTheoTuan_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboThongKeTheoTuan_1.setBounds(294, 8, 171, 24);
		pnlThongKeDoanhThuQuy.add(cboThongKeTheoTuan_1);
		
		modelThongKeDoanhThuCacQuy = new DefaultTableModel(
				new Object[] {"Quý","Doanh thu","Tống số lượng SP","Tổng số hóa đơn","Tổng đơn đổi trả"}, 0);
		
		modelThongKeDoanhThuCacQuy.addRow(new Object[] {"Quý 1","100.000.000","1023","600","50"});
		modelThongKeDoanhThuCacQuy.addRow(new Object[] {"Quý 2","40.000.000","623","190","20"});
		modelThongKeDoanhThuCacQuy.addRow(new Object[] {"Quý 3","900.000.000","3030","1000","10"});
		modelThongKeDoanhThuCacQuy.addRow(new Object[] {"Quý 4","200.000.000","1093","700","20"});
		tbThongKeDoanhThuCacQuy = new MyTable(modelThongKeDoanhThuCacQuy);		
		tbThongKeDoanhThuCacQuy.setShowGrid(false);
		tbThongKeDoanhThuCacQuy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tbThongKeDoanhThuCacQuy.setRowHeight(40);
		
		JScrollPane srcThongKeDoanhThuCacQuy = new JScrollPane(tbThongKeDoanhThuCacQuy,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		srcThongKeDoanhThuCacQuy.setBounds(20, 59, 512, 184);
		pnlThongKeDoanhThuQuy.add(srcThongKeDoanhThuCacQuy);
		
		JFreeChart chart = ChartFactory.createPieChart("Biểu đồ doanh thu theo quý", taoBieuDoDoanhThuTheoQuy(), true,true,true);
		ChartPanel cpnlThongKeDoanhThuTheoQuy = new ChartPanel(chart);
		cpnlThongKeDoanhThuTheoQuy.setSize(564, 240);
		cpnlThongKeDoanhThuTheoQuy.setLocation(576, 11);
		pnlThongKeDoanhThuQuy.add(cpnlThongKeDoanhThuTheoQuy);
		
		JPanel pnlThongKeCacThanhPhanThangCH = new JPanel();
		pnlThongKeCacThanhPhanThangCH.setBackground(new Color(255, 255, 255));
		pnlThongKeCacThanhPhanThangCH.setBounds(21, 303, 1180, 403);
		pnlCuaHang.add(pnlThongKeCacThanhPhanThangCH);
		pnlThongKeCacThanhPhanThangCH.setLayout(null);
		
		JPanel pnlSoHoaDonCH = new JPanel();
		pnlSoHoaDonCH.setLayout(null);
		pnlSoHoaDonCH.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(192, 192, 192), null, null));
		pnlSoHoaDonCH.setBackground(new Color(128, 128, 192));
		pnlSoHoaDonCH.setBounds(20, 109, 255, 115);
		pnlThongKeCacThanhPhanThangCH.add(pnlSoHoaDonCH);
		
		JLabel lblThongKeSoHoaDonCH = new JLabel("Số hóa đơn");
		lblThongKeSoHoaDonCH.setForeground(Color.WHITE);
		lblThongKeSoHoaDonCH.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeSoHoaDonCH.setBounds(25, 20, 120, 25);
		pnlSoHoaDonCH.add(lblThongKeSoHoaDonCH);
		
		JLabel lblSoHoaDonCH = new JLabel("200");
		lblSoHoaDonCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoHoaDonCH.setForeground(Color.WHITE);
		lblSoHoaDonCH.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoHoaDonCH.setBounds(100, 60, 72, 40);
		pnlSoHoaDonCH.add(lblSoHoaDonCH);
		
		JLabel lblDonViSoHoaDonCH = new JLabel("Đơn");
		lblDonViSoHoaDonCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoHoaDonCH.setForeground(Color.WHITE);
		lblDonViSoHoaDonCH.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDonViSoHoaDonCH.setBounds(171, 60, 55, 40);
		pnlSoHoaDonCH.add(lblDonViSoHoaDonCH);
		
		JPanel pnlDoanhThuCH = new JPanel();
		pnlDoanhThuCH.setLayout(null);
		pnlDoanhThuCH.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(192, 192, 192), null, null));
		pnlDoanhThuCH.setBackground(new Color(255, 128, 128));
		pnlDoanhThuCH.setBounds(312, 109, 255, 115);
		pnlThongKeCacThanhPhanThangCH.add(pnlDoanhThuCH);
		
		JLabel lblThongKeDoanhThuCH = new JLabel("Doanh thu");
		lblThongKeDoanhThuCH.setForeground(Color.WHITE);
		lblThongKeDoanhThuCH.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeDoanhThuCH.setBounds(25, 20, 120, 25);
		pnlDoanhThuCH.add(lblThongKeDoanhThuCH);
		
		JLabel lblTDoanhThuCH = new JLabel("1.000.000");
		lblTDoanhThuCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTDoanhThuCH.setForeground(Color.WHITE);
		lblTDoanhThuCH.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTDoanhThuCH.setBounds(10, 60, 152, 40);
		pnlDoanhThuCH.add(lblTDoanhThuCH);
		
		JLabel lblDonViDoanhThuCH = new JLabel("VNĐ");
		lblDonViDoanhThuCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViDoanhThuCH.setForeground(Color.WHITE);
		lblDonViDoanhThuCH.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDonViDoanhThuCH.setBounds(168, 60, 55, 40);
		pnlDoanhThuCH.add(lblDonViDoanhThuCH);
		
		JPanel pnlSoLuongSPCH = new JPanel();
		pnlSoLuongSPCH.setLayout(null);
		pnlSoLuongSPCH.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(192, 192, 192), null, null));
		pnlSoLuongSPCH.setBackground(new Color(122, 191, 81));
		pnlSoLuongSPCH.setBounds(20, 263, 255, 115);
		pnlThongKeCacThanhPhanThangCH.add(pnlSoLuongSPCH);
		
		JLabel lblThongKeSoLuongSPCH = new JLabel("Số lượng sản phẩm");
		lblThongKeSoLuongSPCH.setForeground(Color.WHITE);
		lblThongKeSoLuongSPCH.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeSoLuongSPCH.setBounds(25, 20, 187, 25);
		pnlSoLuongSPCH.add(lblThongKeSoLuongSPCH);
		
		JLabel lblSoLuongSPCH = new JLabel("50");
		lblSoLuongSPCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoLuongSPCH.setForeground(Color.WHITE);
		lblSoLuongSPCH.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoLuongSPCH.setBounds(46, 60, 72, 40);
		pnlSoLuongSPCH.add(lblSoLuongSPCH);
		
		JLabel lblDonViSoLuongSPCH = new JLabel("Sản phẩm");
		lblDonViSoLuongSPCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoLuongSPCH.setForeground(Color.WHITE);
		lblDonViSoLuongSPCH.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDonViSoLuongSPCH.setBounds(131, 60, 100, 40);
		pnlSoLuongSPCH.add(lblDonViSoLuongSPCH);
		
		JPanel pnlSoLuongDoiTraCH = new JPanel();
		pnlSoLuongDoiTraCH.setLayout(null);
		pnlSoLuongDoiTraCH.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(192, 192, 192), null, null));
		pnlSoLuongDoiTraCH.setBackground(new Color(241, 169, 103));
		pnlSoLuongDoiTraCH.setBounds(312, 269, 255, 109);
		pnlThongKeCacThanhPhanThangCH.add(pnlSoLuongDoiTraCH);
		
		JLabel lblThongKeSoLuongDDTCH = new JLabel("Số lượng đơn đổi trả");
		lblThongKeSoLuongDDTCH.setForeground(Color.WHITE);
		lblThongKeSoLuongDDTCH.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeSoLuongDDTCH.setBounds(25, 20, 203, 25);
		pnlSoLuongDoiTraCH.add(lblThongKeSoLuongDDTCH);
		
		JLabel lblSoLuongDDTCH = new JLabel("1");
		lblSoLuongDDTCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoLuongDDTCH.setForeground(Color.WHITE);
		lblSoLuongDDTCH.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoLuongDDTCH.setBounds(101, 60, 72, 40);
		pnlSoLuongDoiTraCH.add(lblSoLuongDDTCH);
		
		JLabel lblDonViSoLuongDDTCH = new JLabel("Đơn");
		lblDonViSoLuongDDTCH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoLuongDDTCH.setForeground(Color.WHITE);
		lblDonViSoLuongDDTCH.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDonViSoLuongDDTCH.setBounds(183, 60, 45, 40);
		pnlSoLuongDoiTraCH.add(lblDonViSoLuongDDTCH);
		
		JLabel lblThongKeThanhPhanCH = new JLabel("Thống kê các thành phần ");
		lblThongKeThanhPhanCH.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThongKeThanhPhanCH.setBounds(10, 12, 290, 20);
		pnlThongKeCacThanhPhanThangCH.add(lblThongKeThanhPhanCH);
		
		JComboBox cboThongKeThangCH = new JComboBox();
		cboThongKeThangCH.setModel(new DefaultComboBoxModel(new String[] {"Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"}));
		cboThongKeThangCH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboThongKeThangCH.setBounds(210, 57, 171, 24);
		pnlThongKeCacThanhPhanThangCH.add(cboThongKeThangCH);
		
		JLabel lblTngHan_1 = new JLabel("Tổng hóa đơn trong tháng");
		lblTngHan_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTngHan_1.setBounds(584, 12, 199, 20);
		pnlThongKeCacThanhPhanThangCH.add(lblTngHan_1);
		

		
		modelThongKeThanhPhanTrongThang = new DefaultTableModel(
				new Object[] {"Ngày","Tổng hóa đơn","Tổng sản phẩm","Tổng đơn đổi trả","Doanh Thu"}, 0);
		
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 1","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 2","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 3","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 4","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 5","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 6","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 7","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 8","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 9","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 10","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 11","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 12","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 13","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 14","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 15","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 16","1023","600","50","1.000.000"});
		modelThongKeThanhPhanTrongThang.addRow(new Object[] {"Ngày 17","1023","600","50","1.000.000"});

		tbThongKeThanhPhanTrongThang = new MyTable(modelThongKeThanhPhanTrongThang);
		
		JScrollPane scrThongKeThanhPhanTrongThang = new JScrollPane(tbThongKeThanhPhanTrongThang);
		scrThongKeThanhPhanTrongThang.setBounds(584, 57, 568, 333);
		pnlThongKeCacThanhPhanThangCH.add(scrThongKeThanhPhanTrongThang);
		
		
		JPanel pnlThongKeNhanVien = new JPanel();
		tabbedPane.addTab("Nhân viên", null, pnlThongKeNhanVien, null);
		pnlThongKeNhanVien.setLayout(null);
		
		JPanel pnlThongKeCacThanhPhanThangCH_1 = new JPanel();
		pnlThongKeCacThanhPhanThangCH_1.setLayout(null);
		pnlThongKeCacThanhPhanThangCH_1.setBackground(Color.WHITE);
		pnlThongKeCacThanhPhanThangCH_1.setBounds(24, 22, 1176, 180);
		pnlThongKeNhanVien.add(pnlThongKeCacThanhPhanThangCH_1);
		
		JPanel pnlSoHoaDonCH_1 = new JPanel();
		pnlSoHoaDonCH_1.setLayout(null);
		pnlSoHoaDonCH_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(192, 192, 192), null, null));
		pnlSoHoaDonCH_1.setBackground(new Color(128, 128, 192));
		pnlSoHoaDonCH_1.setBounds(20, 43, 255, 115);
		pnlThongKeCacThanhPhanThangCH_1.add(pnlSoHoaDonCH_1);
		
		JLabel lblThongKeSoHoaDonCH_1 = new JLabel("Tổng nhân viên");
		lblThongKeSoHoaDonCH_1.setForeground(Color.WHITE);
		lblThongKeSoHoaDonCH_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeSoHoaDonCH_1.setBounds(25, 20, 155, 25);
		pnlSoHoaDonCH_1.add(lblThongKeSoHoaDonCH_1);
		
		JLabel lblSoHoaDonCH_1 = new JLabel("30");
		lblSoHoaDonCH_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoHoaDonCH_1.setForeground(Color.WHITE);
		lblSoHoaDonCH_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoHoaDonCH_1.setBounds(82, 59, 47, 40);
		pnlSoHoaDonCH_1.add(lblSoHoaDonCH_1);
		
		JLabel lblDonViSoHoaDonCH_1 = new JLabel("Nhân viên");
		lblDonViSoHoaDonCH_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoHoaDonCH_1.setForeground(Color.WHITE);
		lblDonViSoHoaDonCH_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDonViSoHoaDonCH_1.setBounds(139, 61, 87, 40);
		pnlSoHoaDonCH_1.add(lblDonViSoHoaDonCH_1);
		
		JPanel pnlDoanhThuCH_1 = new JPanel();
		pnlDoanhThuCH_1.setLayout(null);
		pnlDoanhThuCH_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, new Color(192, 192, 192), null, null));
		pnlDoanhThuCH_1.setBackground(new Color(255, 128, 128));
		pnlDoanhThuCH_1.setBounds(312, 43, 255, 115);
		pnlThongKeCacThanhPhanThangCH_1.add(pnlDoanhThuCH_1);
		
		JLabel lblThongKeDoanhThuCH_1 = new JLabel("Nhân viên bán hàng");
		lblThongKeDoanhThuCH_1.setForeground(Color.WHITE);
		lblThongKeDoanhThuCH_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeDoanhThuCH_1.setBounds(25, 20, 179, 25);
		pnlDoanhThuCH_1.add(lblThongKeDoanhThuCH_1);
		
		JLabel lblSoHoaDonCH_1_1 = new JLabel("20");
		lblSoHoaDonCH_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoHoaDonCH_1_1.setForeground(Color.WHITE);
		lblSoHoaDonCH_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoHoaDonCH_1_1.setBounds(82, 59, 47, 40);
		pnlDoanhThuCH_1.add(lblSoHoaDonCH_1_1);
		
		JLabel lblDonViSoHoaDonCH_1_1 = new JLabel("Nhân viên");
		lblDonViSoHoaDonCH_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoHoaDonCH_1_1.setForeground(Color.WHITE);
		lblDonViSoHoaDonCH_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDonViSoHoaDonCH_1_1.setBounds(139, 61, 87, 40);
		pnlDoanhThuCH_1.add(lblDonViSoHoaDonCH_1_1);
		
		JPanel pnlSoLuongSPCH_1 = new JPanel();
		pnlSoLuongSPCH_1.setLayout(null);
		pnlSoLuongSPCH_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(192, 192, 192), null, null));
		pnlSoLuongSPCH_1.setBackground(new Color(122, 191, 81));
		pnlSoLuongSPCH_1.setBounds(604, 43, 255, 115);
		pnlThongKeCacThanhPhanThangCH_1.add(pnlSoLuongSPCH_1);
		
		JLabel lblThongKeDoanhThuCH_1_1 = new JLabel("Nhân viên giao hàng");
		lblThongKeDoanhThuCH_1_1.setForeground(Color.WHITE);
		lblThongKeDoanhThuCH_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeDoanhThuCH_1_1.setBounds(25, 20, 190, 25);
		pnlSoLuongSPCH_1.add(lblThongKeDoanhThuCH_1_1);
		
		JLabel lblSoHoaDonCH_1_1_1 = new JLabel("8");
		lblSoHoaDonCH_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoHoaDonCH_1_1_1.setForeground(Color.WHITE);
		lblSoHoaDonCH_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoHoaDonCH_1_1_1.setBounds(82, 59, 47, 40);
		pnlSoLuongSPCH_1.add(lblSoHoaDonCH_1_1_1);
		
		JLabel lblDonViSoHoaDonCH_1_1_1 = new JLabel("Nhân viên");
		lblDonViSoHoaDonCH_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoHoaDonCH_1_1_1.setForeground(Color.WHITE);
		lblDonViSoHoaDonCH_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDonViSoHoaDonCH_1_1_1.setBounds(139, 61, 87, 40);
		pnlSoLuongSPCH_1.add(lblDonViSoHoaDonCH_1_1_1);
		
		JPanel pnlSoLuongDoiTraCH_1 = new JPanel();
		pnlSoLuongDoiTraCH_1.setLayout(null);
		pnlSoLuongDoiTraCH_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(192, 192, 192), null, null));
		pnlSoLuongDoiTraCH_1.setBackground(new Color(241, 169, 103));
		pnlSoLuongDoiTraCH_1.setBounds(894, 43, 255, 109);
		pnlThongKeCacThanhPhanThangCH_1.add(pnlSoLuongDoiTraCH_1);
		
		JLabel lblThongKeDoanhThuCH_1_2 = new JLabel("Nhân viên quản lý");
		lblThongKeDoanhThuCH_1_2.setForeground(Color.WHITE);
		lblThongKeDoanhThuCH_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblThongKeDoanhThuCH_1_2.setBounds(25, 20, 179, 25);
		pnlSoLuongDoiTraCH_1.add(lblThongKeDoanhThuCH_1_2);
		
		JLabel lblSoHoaDonCH_1_1_2 = new JLabel("2");
		lblSoHoaDonCH_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSoHoaDonCH_1_1_2.setForeground(Color.WHITE);
		lblSoHoaDonCH_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSoHoaDonCH_1_1_2.setBounds(82, 59, 47, 40);
		pnlSoLuongDoiTraCH_1.add(lblSoHoaDonCH_1_1_2);
		
		JLabel lblDonViSoHoaDonCH_1_1_2 = new JLabel("Nhân viên");
		lblDonViSoHoaDonCH_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDonViSoHoaDonCH_1_1_2.setForeground(Color.WHITE);
		lblDonViSoHoaDonCH_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDonViSoHoaDonCH_1_1_2.setBounds(145, 61, 87, 40);
		pnlSoLuongDoiTraCH_1.add(lblDonViSoHoaDonCH_1_1_2);
		
		JLabel lblThongKeThanhPhanTheoThangCH_1 = new JLabel("Tổng số nhân viên trong cửa hàng");
		lblThongKeThanhPhanTheoThangCH_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblThongKeThanhPhanTheoThangCH_1.setBounds(10, 12, 290, 20);
		pnlThongKeCacThanhPhanThangCH_1.add(lblThongKeThanhPhanTheoThangCH_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(24, 217, 665, 482);
		
		JFreeChart bCThongKeDoanhThuNhanVien = ChartFactory.createBarChart("Biểu đồ doanh thu theo tháng", "Mã nhân viên", "VNĐ", taoBieuDoDoanhThuNhanVien(),PlotOrientation.VERTICAL,false,true,true);
		ChartPanel cpnlThongKeDoanhThuNhanVien= new ChartPanel(bCThongKeDoanhThuNhanVien);
		cpnlThongKeDoanhThuNhanVien.setBackground(new Color(255, 255, 255));
		cpnlThongKeDoanhThuNhanVien.setSize(645, 429);
		cpnlThongKeDoanhThuNhanVien.setLocation(10, 30);
		
		
		panel.add(cpnlThongKeDoanhThuNhanVien);
		pnlThongKeNhanVien.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(711, 217, 488, 482);
		pnlThongKeNhanVien.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Danh sách 10 nhân viên doanh thu cao nhất");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 11, 320, 20);
		panel_1.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(140, 42, 142, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Năm 2023");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 42, 100, 20);
		panel_1.add(lblNewLabel_2);
		
		modelThongKeNhanVien = new DefaultTableModel(
				new Object[] {"Mã nhân viên","Tên nhân viên","Tổng hóa đơn","Tổng sản phẩm","Tổng đơn đổi trả","Doanh Thu"}, 0);
		
		modelThongKeNhanVien.addRow(new Object[] {"NV1","Huỳnh Quốc Bẻo","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV2","Huỳnh Quốc Kiều","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV3","Huỳnh Quốc Hiếu","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV4","Võ Mạnh Bảo","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV5","Nguyễn Mạnh Hiếu","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV6","Nguyễn Quốc Bảo","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV7","Nguyễn Quốc Bảo","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV8","Nguyễn Quốc Bảo","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV9","Nguyễn Quốc Bảo","1023","600","50","10.000.000"});
		modelThongKeNhanVien.addRow(new Object[] {"NV10","Nguyễn Quốc Bo","1023","600","50","10.000.000"});
		
		tbThongKeNhanVien = new MyTable(modelThongKeNhanVien);
		tbThongKeNhanVien.setRowHeight(31);
		tbThongKeNhanVien.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tbThongKeNhanVien.getColumnModel().getColumn(0).setPreferredWidth(100);
		tbThongKeNhanVien.getColumnModel().getColumn(1).setPreferredWidth(120);
		tbThongKeNhanVien.getColumnModel().getColumn(2).setPreferredWidth(100);
		tbThongKeNhanVien.getColumnModel().getColumn(3).setPreferredWidth(100);
		tbThongKeNhanVien.getColumnModel().getColumn(4).setPreferredWidth(100);
		
		
		JScrollPane scrollPane = new JScrollPane(tbThongKeNhanVien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(20, 101, 450, 359);
		panel_1.add(scrollPane);
		
		JPanel pnlThongKeSanPham = new JPanel();
		tabbedPane.addTab("Sản phẩm", null, pnlThongKeSanPham, null);
		pnlThongKeSanPham.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(20, 20, 582, 277);
		pnlThongKeSanPham.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(166, 166, 210));
		panel_6.setBounds(21, 28, 539, 224);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tổng số sản phẩm:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(28, 23, 200, 30);
		panel_6.add(lblNewLabel_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 182, 147));
		panel_7.setBounds(23, 78, 225, 118);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Đang được bán");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3_1.setBounds(10, 11, 228, 30);
		panel_7.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("65");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(80, 58, 44, 30);
		panel_7.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("sản phẩm");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1_1.setBounds(118, 58, 97, 30);
		panel_7.add(lblNewLabel_4_1_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 172, 214));
		panel_8.setBounds(267, 78, 248, 118);
		panel_6.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Không còn bán");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3_1_1.setBounds(10, 11, 200, 30);
		panel_8.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("65");
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1_2.setBounds(91, 58, 44, 30);
		panel_8.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("sản phẩm");
		lblNewLabel_4_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1_1_2.setBounds(127, 58, 97, 30);
		panel_8.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("80");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(216, 22, 60, 30);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("sản phẩm");
		lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_1_1_1.setBounds(266, 22, 97, 30);
		panel_6.add(lblNewLabel_4_1_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(20, 320, 1181, 388);
		pnlThongKeSanPham.add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Quý 1", "Quý 2", "Quý 3", "Quý 4"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setBounds(281, 44, 145, 22);
		panel_4.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Thống kê top 10 sản phẩm ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 11, 200, 20);
		panel_4.add(lblNewLabel_5);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Bán chạy nhất", "Bán ít nhất"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1_1.setBounds(61, 44, 145, 22);
		panel_4.add(comboBox_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Trong");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(219, 45, 49, 20);
		panel_4.add(lblNewLabel_6);
		
		modelDanhSachTop10SachTrongQuy = new DefaultTableModel(
				new Object[] {"Mã sản phẩm","Tên sản phẩm","số lượng bán","giá bán","% lợi nhuận"}, 0);
		
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS01","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS02","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS03","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS04","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS05","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS06","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS07","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS08","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS08","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS08","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS08","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS08","Sách giáo khoa","500","100000","10"});
		modelDanhSachTop10SachTrongQuy.addRow(new Object[] {"SPS08","Sách giáo khoa","500","100000","10"});
		tbDanhSachTop10SachTrongQuy = new MyTable(modelDanhSachTop10SachTrongQuy);
		
		JScrollPane scrollPane_1 = new JScrollPane(tbDanhSachTop10SachTrongQuy);
		scrollPane_1.setBounds(30, 98, 545, 260);
		panel_4.add(scrollPane_1);
		
		modelDanhSachTop10VPPTrongQuy = new DefaultTableModel(
				new Object[] {"Mã sản phẩm","Tên sản phẩm","số lượng bán","giá bán","% lợi nhuận"}, 0);
		
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		modelDanhSachTop10VPPTrongQuy.addRow(new Object[] {"SPVPP01","Bàn học trẻ em","100","100000","20"});
		tbDanhSachTop10VPPTrongQuy = new MyTable(modelDanhSachTop10VPPTrongQuy);
		
		JScrollPane scrollPane_2 = new JScrollPane(tbDanhSachTop10VPPTrongQuy);
		scrollPane_2.setBounds(605, 98, 551, 260);
		panel_4.add(scrollPane_2);
		
		JLabel lblNewLabel_7 = new JLabel("Sách");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(33, 77, 49, 20);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Văn phòng phẩm");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7_1.setBounds(605, 76, 130, 20);
		panel_4.add(lblNewLabel_7_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel_9.setBounds(629, 20, 569, 277);
		pnlThongKeSanPham.add(panel_9);
		panel_9.setLayout(null);
		
		modelDanhSachSanPhamDoiTra = new DefaultTableModel(
				new Object[] {"Mã sản phẩm","Tên sản phẩm","giá bán","số lượng đổi trả"}, 0);
		
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS01","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS02","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS03","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS04","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS05","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS06","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS07","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS08","Sách giáo khoa","100000","20"});
		modelDanhSachSanPhamDoiTra.addRow(new Object[] {"SPS09","Sách giáo khoa","100000","20"});
		tbDanhSachSanPhamDoiTra = new MyTable(modelDanhSachSanPhamDoiTra);
		
		JScrollPane srcDanhSachSanPhamBiDoiTra = new JScrollPane(tbDanhSachSanPhamDoiTra);
		srcDanhSachSanPhamBiDoiTra.setBounds(23, 36, 521, 216);
		panel_9.add(srcDanhSachSanPhamBiDoiTra);
		
		JLabel lblNewLabel_8 = new JLabel("Danh sách sản phẩm bị đổi trả");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 11, 200, 20);
		panel_9.add(lblNewLabel_8);
	
	}
	//Hàm tạo dữ liệu cho biểu đồ thống kê theo tuần
	private CategoryDataset  taoBieuDoDoanhThuTuan() {
		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		dataSet.addValue(4000000, "VNĐ", "Thứ 2");
		dataSet.addValue(1000000, "VNĐ", "Thứ 3");
		dataSet.addValue(3000000, "VNĐ", "Thứ 4");
		dataSet.addValue(7000000, "VNĐ", "Thứ 5");
		dataSet.addValue(2000000, "VNĐ", "Thứ 6");
		dataSet.addValue(9000000, "VNĐ", "Thứ 7");
		dataSet.addValue(8000000, "VNĐ", "Chủ Nhật");
		return dataSet;
	}
	//Hàm tạo dữ liệu cho biểu đò thống kê doanh thu theo quý
	private PieDataset taoBieuDoDoanhThuTheoQuy() {
		DefaultPieDataset dataSet = new DefaultPieDataset();
		dataSet.setValue("Quý 1", 10.0);
		dataSet.setValue("Quý 2", 5.0);
		dataSet.setValue("Quý 3", 70.0);
		dataSet.setValue("Quý 4", 15.0);
		return dataSet;
	}
	//Hàm tạo dữ liệu cho biểu đồ thống kê nhân viên
	private CategoryDataset  taoBieuDoDoanhThuNhanVien() {
		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		dataSet.addValue(4000000, "VNĐ", "NV1");
		dataSet.addValue(1000000, "VNĐ", "NV2");
		dataSet.addValue(3000000, "VNĐ", "NV3");
		dataSet.addValue(7000000, "VNĐ", "NV4");
		dataSet.addValue(2000000, "VNĐ", "NV5");
		dataSet.addValue(9000000, "VNĐ", "NV6");
		dataSet.addValue(3000000, "VNĐ", "NV7");
		dataSet.addValue(5000000, "VNĐ", "NV8");
		dataSet.addValue(9000000, "VNĐ", "NV9");
		dataSet.addValue(4000000, "VNĐ", "NV10");

		return dataSet;
	}
}
