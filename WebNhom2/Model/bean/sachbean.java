package bean;

public class sachbean {
	private String masach;
	private String tensach;
	private String tacgia; 
	 private Long gia;
	 private int soluong;
    private String anh;
    private String maloai;
    private int sotap;
    private String ngaynhap;
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public String getMasach() {
		return masach;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public int getSotap() {
		return sotap;
	}
	public void setSotap(int sotap) {
		this.sotap = sotap;
	}
	public sachbean(String masach, String tensach,int soluong ,Long gia, String maloai,int sotap,String anh, String ngaynhap,String tacgia ) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.gia = gia;
		this.anh = anh;
		this.maloai = maloai;
		this.soluong = soluong;
		this.sotap = sotap;
		this.ngaynhap = ngaynhap;
	}
	public sachbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sachbean(String masach, String tensach, String tacgia, Long gia, String anh, String maloai) {
		// TODO Auto-generated constructor stub
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.gia = gia;
		this.anh = anh;
		this.maloai = maloai;

	}
    
    
    
}
