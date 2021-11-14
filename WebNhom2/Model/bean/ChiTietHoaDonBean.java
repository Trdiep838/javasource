package bean;

public class ChiTietHoaDonBean {
	private String MaChiTiet;
	private String MaSach;
	private int soluong;
	private String MaHoaDon;
	private int DaMua;

	public String getMaChiTiet() {
		return MaChiTiet;
	}
	public void setMaChiTiet(String maChiTiet) {
		MaChiTiet = maChiTiet;
	}
	public String getMaSach() {
		return MaSach;
	}
	public void setMaSach(String maSach) {
		MaSach = maSach;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public ChiTietHoaDonBean(String maChiTiet, String maSach, int soluong, String maHoaDon, int daMua) {
		super();
		MaChiTiet = maChiTiet;
		MaSach = maSach;
		this.soluong = soluong;
		MaHoaDon = maHoaDon;
		DaMua = daMua;
	}
	public String getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public int getDaMua() {
		return DaMua;
	}
	public int DaMua() {
		return DaMua;
	}
	public void setDaMua(int daMua) {
		DaMua = daMua;
	}
	public ChiTietHoaDonBean(String maSach, int soluong, String maHoaDon, int daMua) {
		super();
		MaSach = maSach;
		this.soluong = soluong;
		MaHoaDon = maHoaDon;
		DaMua = daMua;
	}

}
