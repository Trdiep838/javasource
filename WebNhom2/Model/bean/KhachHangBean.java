package bean;

public class KhachHangBean {
	private String makh; 
	private String Hoten; 
	private String Diachi; 
	private String matkhau;
	private String sdt ;
	private String email ;
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
	public String getTendn() {
		return tendn;
	}
	public void setTendn(String tendn) {
		this.tendn = tendn;
	}
	private String tendn ;
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public KhachHangBean(String makh, String hoten, String diachi, String matkhau, String sdt, String email,
			String tendn) {
		super();
		this.makh = makh;
		this.Hoten = hoten;
		this.Diachi = diachi;
		this.matkhau = matkhau;
		this.sdt = sdt;
		this.email = email;
		this.tendn = tendn;
	}
	public KhachHangBean( String hoten, String diachi, String matkhau, String sdt, String email,
			String tendn) {
		super();
		this.Hoten = hoten;
		this.Diachi = diachi;
		this.matkhau = matkhau;
		this.sdt = sdt;
		this.email = email;
		this.tendn = tendn;
	}
	public KhachHangBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
