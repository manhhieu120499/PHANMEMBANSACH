package entity;

import java.util.ArrayList;
import java.util.Objects;

public class ChuongTrinhKhuyenMai {
	private String maCTKM;
	private String tenCTKM;
	private ArrayList<MucKhuyenMai> dsMucKhuyenMai = new ArrayList<>();

	public ChuongTrinhKhuyenMai(String maCTKM, String tenCTKM, ArrayList<MucKhuyenMai> dsMucKhuyenMai) {
		super();
		this.maCTKM = maCTKM;
		this.tenCTKM = tenCTKM;
		this.dsMucKhuyenMai = dsMucKhuyenMai;
	}

	public String getMaCTKM() {
		return maCTKM;
	}

	public void setMaCTKM(String maCTKM) {
		this.maCTKM = maCTKM;
	}

	public String getTenCTKM() {
		return tenCTKM;
	}

	public void setTenCTKM(String tenCTKM) {
		this.tenCTKM = tenCTKM;
	}

	public ArrayList<MucKhuyenMai> getDsMucKhuyenMai() {
		return dsMucKhuyenMai;
	}

	public void setDsMucKhuyenMai(ArrayList<MucKhuyenMai> dsMucKhuyenMai) {
		this.dsMucKhuyenMai = dsMucKhuyenMai;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(maCTKM);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChuongTrinhKhuyenMai other = (ChuongTrinhKhuyenMai) obj;
		return Objects.equals(maCTKM, other.maCTKM);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
