package entity;

public class VanPhongPham extends SanPham {
	private String chatLieu;
	private DanhMuc danhMuc;

	public VanPhongPham(String maSanPham, String tenSanPham, int soLuongTon, float giaNhap, String theLoai, String ke,
			String hinhAnh, float thue, float phanTramLoiNhuan, float giaBan, String trangThai, NhaCungCap nhaCungCap,
			String chatLieu, DanhMuc danhMuc) {
		super(maSanPham, tenSanPham, soLuongTon, giaNhap, theLoai, ke, hinhAnh, thue, phanTramLoiNhuan, giaBan,
				trangThai, nhaCungCap);
		this.chatLieu = chatLieu;
		this.danhMuc = danhMuc;
	}

	public String getChatLieu() {
		return chatLieu;
	}

	public void setChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}

	public DanhMuc getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

	@Override
	public String toString() {
		return "VanPhongPham [chatLieu=" + chatLieu + ", danhMuc=" + danhMuc + "]";
	}

	

}
