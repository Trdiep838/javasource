package bean;

public class LichSuBean {
	private String makh;
	private String  masach;
	private int SoLuongMua;
	private long gia;
	private String MaHoaDon;
	private int DaMua;
	private String TenSach;
	private long ThanhTien;
	
	public long getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(long thanhTien) {
		ThanhTien = thanhTien;
	}
	public LichSuBean(String makh, String masach, int soLuongMua, long gia, String maHoaDon, int daMua, String tenSach,
			long thanhTien) {
		super();
		this.makh = makh;
		this.masach = masach;
		SoLuongMua = soLuongMua;
		this.gia = gia;
		MaHoaDon = maHoaDon;
		DaMua = daMua;
		TenSach = tenSach;
		ThanhTien = thanhTien;
	}
	public LichSuBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		SoLuongMua = soLuongMua;
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
	public void setDaMua(int daMua) {
		DaMua = daMua;
	}
	public String getTenSach() {
		return TenSach;
	}
	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}
	
	
}
