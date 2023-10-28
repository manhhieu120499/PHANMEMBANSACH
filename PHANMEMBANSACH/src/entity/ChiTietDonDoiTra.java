package entity;

public class ChiTietDonDoiTra {
    private int soLuongTra;
    private String lyDo;
    private SanPham sanPham;
	public ChiTietDonDoiTra(int soLuongTra, String lyDo, SanPham sanPham) {
		super();
		this.soLuongTra = soLuongTra;
		this.lyDo = lyDo;
		this.sanPham = sanPham;
	}
	public int getSoLuongTra() {
		return soLuongTra;
	}
	public void setSoLuongTra(int soLuongTra) {
		this.soLuongTra = soLuongTra;
	}
	public String getLyDo() {
		return lyDo;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	
	public float tinhThanhTien() {
		
		return this.getSanPham().getGiaBan()*soLuongTra*(1+this.getSanPham().getThue());
	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
