package entity;

import java.util.Objects;

public class KhachHang {
	private String maKhachHang;
	private String tenKhachHang;
	private String sdt;
	private String email;
	private int diemTichLuy;

	public KhachHang(String maKhachHang, String tenKhachHang, String sdt, String email, int diemTichLuy) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.sdt = sdt;
		this.email = email;
		this.diemTichLuy = diemTichLuy;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
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

	public int getDiemTichLuy() {
		return diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(maKhachHang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(maKhachHang, other.maKhachHang);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
