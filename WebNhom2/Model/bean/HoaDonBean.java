package bean;

import java.sql.Date;

public class HoaDonBean {

	private String MaHoaDon;
	private String Makh;
	private String Ngaymua;
	private int Damua;
	public String getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public String getMakh() {
		return Makh;
	}
	public void setMakh(String makh) {
		Makh = makh;
	}
	
	
	public int Damua() {
		return Damua;
	}
	public void setDamua(int damua) {
		Damua = damua;
	}
	public HoaDonBean(String maHoaDon, String makh, String ngaymua, int damua) {
		super();
		MaHoaDon = maHoaDon;
		Makh = makh;
		Ngaymua = ngaymua;
		Damua = damua;
	}
	public HoaDonBean(String makh, String ngaymua, int damua) {
		super();
		Makh = makh;
		Ngaymua = ngaymua;
		Damua = damua;
	}
	public String getNgaymua() {
		return Ngaymua;
	}
	public void setNgaymua(String ngaymua) {
		Ngaymua = ngaymua;
	}
	
} 
