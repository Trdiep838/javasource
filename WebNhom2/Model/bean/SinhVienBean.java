package bean;

public class SinhVienBean {
	private String masv;
    private String hoten;
    private String diachi;
    private Double dtb;
    private String makhoa;
	public SinhVienBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "SinhVienBean [masv=" + masv + ", hoten=" + hoten + ", diachi=" + diachi + ", dtb=" + dtb + ", makhoa="
				+ makhoa + "]";
	}


	public SinhVienBean(String masv, String hoten, String diachi, Double dtb, String makhoa) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.diachi = diachi;
		this.dtb = dtb;
		this.makhoa = makhoa;
	}


	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public Double getDtb() {
		return dtb;
	}
	public void setDtb(Double dtb) {
		this.dtb = dtb;
	}
	public String getMakhoa() {
		return makhoa;
	}
	public void setMakhoa(String makhoa) {
		this.makhoa = makhoa;
	}
    
    
}
