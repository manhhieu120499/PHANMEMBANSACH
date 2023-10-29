package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class HoaDon {
	private String maHoaDon;
	private LocalDate ngayLap;
	private String hinhThucThanhToan;
	private String ghiChu;
	private int diemGiamGia;
	private float giamGia;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private ChuongTrinhKhuyenMai ctkm;
	private ArrayList<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();

	public HoaDon(String maHoaDon, LocalDate ngayLap, String hinhThucThanhToan, String ghiChu, int diemGiamGia,
			float giamGia, NhanVien nhanVien, KhachHang khachHang, ChuongTrinhKhuyenMai ctkm,
			ArrayList<ChiTietHoaDon> dsChiTietHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayLap = ngayLap;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.ghiChu = ghiChu;
		this.diemGiamGia = diemGiamGia;
		this.giamGia = giamGia;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.ctkm = ctkm;
		this.dsChiTietHoaDon = dsChiTietHoaDon;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public LocalDate getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}

	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public int getDiemGiamGia() {
		return diemGiamGia;
	}

	public void setDiemGiamGia(int diemGiamGia) {
		this.diemGiamGia = diemGiamGia;
	}

	public float getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(float giamGia) {
		this.giamGia = giamGia;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public ChuongTrinhKhuyenMai getCtkm() {
		return ctkm;
	}

	public void setCtkm(ChuongTrinhKhuyenMai ctkm) {
		this.ctkm = ctkm;
	}

	public ArrayList<ChiTietHoaDon> getDsChiTietHoaDon() {
		return dsChiTietHoaDon;
	}

	public void setDsChiTietHoaDon(ArrayList<ChiTietHoaDon> dsChiTietHoaDon) {
		this.dsChiTietHoaDon = dsChiTietHoaDon;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(maHoaDon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHoaDon, other.maHoaDon);
	}
	
	public float tinhTongTien() {
		float result = 0;
		for (ChiTietHoaDon cthd : dsChiTietHoaDon) {
			result += cthd.getSanPham().getGiaBan()* cthd.getSoLuongMua()*(1 + cthd.getSanPham().getThue());
		}
		return result;
	}
	
	public float kiemTraGiamGiaTheoChuongTrinh(SanPham sp) {
		float phanTramGiam = 0;
		for(MucKhuyenMai m : ctkm.getDsMucKhuyenMai()) {
			if(sp.getTheLoai().equalsIgnoreCase(m.getTenMucKhuyenMai())) {
				phanTramGiam = m.getTiLeKhuyenMai();
			}
		}
		return phanTramGiam / 100;
	}
	
	public float tinhGiamGia() {
		float result = 0;
		for(ChiTietHoaDon cthd : dsChiTietHoaDon) {
			giamGia = kiemTraGiamGiaTheoChuongTrinh(cthd.getSanPham());
			result += cthd.tinhThanhTien()*giamGia;
		}
		return result;
	}
	
	public float tinhTienCanThanhToan() {
		return tinhTongTien() - tinhGiamGia() - (diemGiamGia * 10000);
	}
	
	public float tinhTienThua(float tienKhachDua) {
		return tienKhachDua - tinhTienCanThanhToan();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
