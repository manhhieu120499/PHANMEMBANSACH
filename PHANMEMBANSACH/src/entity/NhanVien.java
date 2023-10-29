package entity;

import java.util.Objects;

public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String sdt;
    private String email;
    private boolean gioiTinh;
    private String diaChi;
    private String chucVu;
    private String cCCD;
    private String hinhAnh;
    private TaiKhoan taiKhoan;
	public NhanVien(String maNhanVien, String tenNhanVien, String sdt, String email, boolean gioiTinh, String diaChi,
			String chucVu, String cCCD, String hinhAnh, TaiKhoan taiKhoan) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.sdt = sdt;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.cCCD = cCCD;
		this.hinhAnh = hinhAnh;
		this.taiKhoan = taiKhoan;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public String getcCCD() {
		return cCCD;
	}
	public void setcCCD(String cCCD) {
		this.cCCD = cCCD;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	
    
    @Override
	public int hashCode() {
		return Objects.hash(maNhanVien);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(maNhanVien, other.maNhanVien);
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", sdt=" + sdt + ", email="
				+ email + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", chucVu=" + chucVu + ", cCCD=" + cCCD
				+ ", hinhAnh=" + hinhAnh + ", taiKhoan=" + taiKhoan + "]";
	}
	
}
