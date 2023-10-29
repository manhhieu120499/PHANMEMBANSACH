package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class DonDoiTra {
	private String maDonDoiTra;
	private LocalDate ngayDoiTra;
	private ArrayList<ChiTietDonDoiTra> dsChiTietDonDoiTra = new ArrayList<>();
	private HoaDon hoaDon;
	private NhanVien nhanVien;

	public DonDoiTra(String maDonDoiTra, LocalDate ngayDoiTra, ArrayList<ChiTietDonDoiTra> dsChiTietDonDoiTra,
			HoaDon hoaDon, NhanVien nhanVien) {
		super();
		this.maDonDoiTra = maDonDoiTra;
		this.ngayDoiTra = ngayDoiTra;
		this.dsChiTietDonDoiTra = dsChiTietDonDoiTra;
		this.hoaDon = hoaDon;
		this.nhanVien = nhanVien;
	}

	public String getMaDonDoiTra() {
		return maDonDoiTra;
	}

	public void setMaDonDoiTra(String maDonDoiTra) {
		this.maDonDoiTra = maDonDoiTra;
	}

	public LocalDate getNgayDoiTra() {
		return ngayDoiTra;
	}

	public void setNgayDoiTra(LocalDate ngayDoiTra) {
		this.ngayDoiTra = ngayDoiTra;
	}

	public ArrayList<ChiTietDonDoiTra> getDsChiTietDonDoiTra() {
		return dsChiTietDonDoiTra;
	}

	public void setDsChiTietDonDoiTra(ArrayList<ChiTietDonDoiTra> dsChiTietDonDoiTra) {
		this.dsChiTietDonDoiTra = dsChiTietDonDoiTra;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maDonDoiTra);
	}
	
	public float tinhTienCanTra() {
		return this.getHoaDon().tinhTienCanThanhToan();
	}
	
	public int tinhSoLuongDoiHang() {
		int tongSoLuong = 0;
		for(ChiTietHoaDon cthd : this.getHoaDon().getDsChiTietHoaDon()) {
			tongSoLuong += cthd.getSoLuongMua();
		}
		return tongSoLuong;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonDoiTra other = (DonDoiTra) obj;
		return Objects.equals(maDonDoiTra, other.maDonDoiTra);
	}

	@Override
	public String toString() {
		return "DonDoiTra [maDonDoiTra=" + maDonDoiTra + ", ngayDoiTra=" + ngayDoiTra + ", dsChiTietDonDoiTra="
				+ dsChiTietDonDoiTra + ", hoaDon=" + hoaDon + ", nhanVien=" + nhanVien + "]";
	}

	

}
