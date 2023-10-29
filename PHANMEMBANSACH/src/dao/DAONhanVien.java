package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.NhanVien;
import entity.TaiKhoan;

public class DAONhanVien {
   public DAONhanVien() {
	   
   }
   
   // hàm lấy danh sách nhân viên
   public ArrayList<NhanVien> getDSNhanVien() {
	   ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
	   ConnectDB.getInstance();
	   Connection con = ConnectDB.getConnection();
	   String sql = "select * from NhanVien nv join TaiKhoan tk on nv.maNhanVien = tk.tenTaiKhoan";
	   try {
		   Statement stmt = con.createStatement();
		   ResultSet rs = stmt.executeQuery(sql);
		   while(rs.next()) {
			   String maNhanVien = rs.getString("maNhanVien").trim();
			   String tenNhanVien = rs.getString("tenNhanVien").trim();
			   String sdt = rs.getString("sdt").trim();
			   String email = rs.getString("email").trim();
			   String diaChi = rs.getString("diaChi").trim();
			   Boolean gioiTinh = rs.getBoolean("gioiTinh");
			   String chucVu = rs.getString("chucVu").trim();
			   String cCCD = rs.getString("cccd").trim();
			   String hinhAnh = rs.getString("hinhAnh").trim();
			   String matKhau = rs.getString("matKhau").trim();
			   TaiKhoan tk = new TaiKhoan(maNhanVien, matKhau);
			   NhanVien nv = new NhanVien(maNhanVien, tenNhanVien, sdt, email, gioiTinh, diaChi, chucVu, cCCD, hinhAnh, tk);
			   dsNhanVien.add(nv);
		   }
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   return dsNhanVien;
   }
}