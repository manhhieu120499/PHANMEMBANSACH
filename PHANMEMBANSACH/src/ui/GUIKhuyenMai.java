package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import CustomUI.MyButton;
import CustomUI.MyCombobox;
import CustomUI.MyTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class GUIKhuyenMai extends JPanel {
	private DefaultTableModel modelKMDT, modelDSKhuyenMai, modelChiTietKM;
	private JTextField textField;
	private JTextField textField_1;
	private MyTable tbMucKhuyenMai, tbDSKhuyenMai, tbChiTietKM;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtChapDng;
	private MyButton btnApDungCT, btnXoaTrang, btnLuu, btnThem;
	private MyCombobox cboTrangThai, cboSanPham, cboMucKM, cboTheLoai;
	public GUIKhuyenMai() {
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(250, 0, 1250, 800);
		setLayout(null);
		
		modelKMDT = new DefaultTableModel(new Object[] {"STT", "Tên mục khuyến mãi", "Phần trăm"}, 0);
		
//		modelKMDAP = new DefaultTableModel(new Object[] {"STT", "Danh mục", "Thể loại", "Phần trăm"}, 0);
		
		modelDSKhuyenMai = new DefaultTableModel(new Object[] {"STT", "MaCTKM", "TenCTKM", "Trạng thái"}, 0);
		
		modelChiTietKM = new DefaultTableModel(new Object[] {"STT","Tên mục khuyến mãi", "Phần trăm"}, 0);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 0, 1245, 789);
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 549, 767);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(97, 166, 247));
		panel_1.setBounds(60, 11, 433, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chương trình khuyến mãi");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(89, 7, 245, 24);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MaCTKM:");
		lblNewLabel_1.setBounds(42, 62, 78, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(153, 62, 315, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TenCTKM:");
		lblNewLabel_2.setBounds(42, 98, 62, 14);
		panel.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(153, 93, 315, 45);
		panel.add(textArea);
		
		btnLuu = new MyButton("Lưu");
		btnLuu.setBackground(new Color(97, 166, 247));
		btnLuu.setBounds(348, 183, 120, 30);
		btnLuu.setIcon(new ImageIcon("src\\image\\giaohang\\iconsave.png"));
		panel.add(btnLuu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(23, 222, 500, 522);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Sản phẩm:");
		lblNewLabel_3.setBounds(34, 56, 63, 14);
		panel_3.add(lblNewLabel_3);
		
		cboSanPham = new MyCombobox();
		cboSanPham.setBounds(169, 52, 235, 22);
		cboSanPham.addItem("Sách");
		cboSanPham.addItem("Bút");
		cboSanPham.addItem("Thước");
		cboSanPham.addItem("Vở");
		panel_3.add(cboSanPham);
		
		JLabel lblNewLabel_4 = new JLabel("Phần trăm:");
		lblNewLabel_4.setBounds(34, 95, 63, 14);
		panel_3.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 92, 235, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Thể loại:");
		lblNewLabel_5.setBounds(34, 137, 63, 14);
		panel_3.add(lblNewLabel_5);
		
		cboTheLoai = new MyCombobox();
		cboTheLoai.setBounds(169, 133, 235, 22);
		cboTheLoai.addItem("Sách giáo khoa");
		cboTheLoai.addItem("Sách tham khảo");
		panel_3.add(cboTheLoai);
		
		btnXoaTrang = new MyButton("Xóa trắng");
		btnXoaTrang.setBackground(new Color(97, 166, 247));
		btnXoaTrang.setIcon(new ImageIcon("src\\image\\giaohang\\iconclean.png"));
		btnXoaTrang.setBounds(107, 187, 120, 30);
		panel_3.add(btnXoaTrang);
		
		btnThem = new MyButton("Thêm ");
		btnThem.setBackground(new Color(97, 166, 247));
		btnThem.setBounds(290, 187, 120, 30);
		btnThem.setIcon(new ImageIcon("src\\image\\giaohang\\iconplus.png"));
		panel_3.add(btnThem);
		
		
		tbMucKhuyenMai = new MyTable(modelKMDT);
		JScrollPane scrollPaneMKM = new JScrollPane(tbMucKhuyenMai, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneMKM.setBounds(24, 255, 452, 246);
		panel_3.add(scrollPaneMKM);
		
		JLabel lblNewLabel_8 = new JLabel("Tạo tên mục khuyến mãi");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(34, 11, 187, 20);
		panel_3.add(lblNewLabel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "Danh s\u00E1ch c\u00E1c m\u1EE5c khuy\u1EBFn m\u00E3i \u0111ang t\u1EA1o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(10, 234, 480, 278);
		panel_3.add(panel_9);
		
		JLabel lblNewLabel_13 = new JLabel("Trạng thái:");
		lblNewLabel_13.setBounds(42, 157, 78, 14);
		panel.add(lblNewLabel_13);
		
		txtChapDng = new JTextField();
		txtChapDng.setEditable(false);
		txtChapDng.setText("chưa áp dụng");
		txtChapDng.setBounds(153, 153, 315, 20);
		panel.add(txtChapDng);
		txtChapDng.setColumns(10);
		
		MyButton mbtnToMCtkm = new MyButton("Lưu");
		mbtnToMCtkm.setText("Tạo mã CTKM");
		mbtnToMCtkm.setBackground(new Color(97, 166, 247));
		mbtnToMCtkm.setBounds(203, 183, 120, 30);
		panel.add(mbtnToMCtkm);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(580, 11, 655, 162);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(97, 166, 247));
		panel_5.setBounds(22, 11, 148, 40);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Tìm kiếm");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(37, 7, 73, 24);
		panel_5.add(lblNewLabel_7);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_7.setBounds(24, 83, 608, 60);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("MaCTKM:");
		lblNewLabel_9.setBounds(29, 24, 78, 14);
		panel_7.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 21, 188, 20);
		panel_7.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_9_1 = new JLabel("TenCTKM:");
		lblNewLabel_9_1.setBounds(346, 24, 78, 14);
		panel_7.add(lblNewLabel_9_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(410, 21, 188, 20);
		panel_7.add(textField_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(580, 184, 655, 594);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		tbDSKhuyenMai = new MyTable(modelDSKhuyenMai);
		JScrollPane scrollPaneDSKM = new JScrollPane(tbDSKhuyenMai, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneDSKM.setBounds(10,144,635,196);
		panel_6.add(scrollPaneDSKM);
		
		JLabel lblNewLabel_10 = new JLabel("Danh sách chương trình khuyến mãi");
		lblNewLabel_10.setBounds(10, 119, 237, 14);
		panel_6.add(lblNewLabel_10);
		
		tbChiTietKM = new MyTable(modelChiTietKM);
		JScrollPane scrollPaneCTKM = new JScrollPane(tbChiTietKM, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneCTKM.setBounds(10, 418, 635, 165);
		panel_6.add(scrollPaneCTKM);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(10, 11, 635, 97);
		panel_6.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Lọc theo tên mục khuyến mãi");
		lblNewLabel_11.setBounds(10, 26, 171, 14);
		panel_8.add(lblNewLabel_11);
		
		MyCombobox cboMucKM = new MyCombobox();
		cboMucKM.setBounds(175, 22, 156, 22);
		cboMucKM.addItem("Sách giáo khoa");
		cboMucKM.addItem("Sách tham khảo");
		cboMucKM.addItem("Bút");
		cboMucKM.addItem("Thước");
		panel_8.add(cboMucKM);
		
		JLabel lblNewLabel_12 = new JLabel("Lọc theo trạng thái");
		lblNewLabel_12.setBounds(10, 68, 125, 14);
		panel_8.add(lblNewLabel_12);
		
		cboTrangThai = new MyCombobox();
		cboTrangThai.setBounds(175, 64, 156, 22);
		cboTrangThai.addItem("Đang áp dụng");
		cboTrangThai.addItem("Chưa áp dụng");
		cboTrangThai.addItem("Tất cả");
		panel_8.add(cboTrangThai);
		
		 btnApDungCT = new MyButton("Áp dụng chương trình khuyến mãi");
		 btnApDungCT.setBackground(new Color(0, 255, 0));
		 btnApDungCT.setBounds(356, 39, 269, 30);
		panel_8.add(btnApDungCT);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(311, 349, 30, 30);
		btnNewButton.setIcon(new ImageIcon("src\\image\\giaohang\\iconarrowdown.png"));
		panel_6.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Chi tiết chương trình khuyến mãi");
		lblNewLabel_6.setBounds(10, 395, 237, 13);
		panel_6.add(lblNewLabel_6);
		
		
//		JButton btnNewButton = new JButton("Đây là khuyến mãi");
//		this.add(btnNewButton, BorderLayout.CENTER);
	}
}
