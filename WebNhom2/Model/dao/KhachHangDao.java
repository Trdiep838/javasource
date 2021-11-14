package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.KhachHangBean;


public class KhachHangDao {
	public int DangKyKhachHang(KhachHangBean kh) throws Exception {
		DungChung dc = new DungChung();
		dc.KetNoi();
		int result = 0;
		String sql = "INSERT INTO KhachHang VALUES (?,?,?,?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1 , kh.getHoten());
		cmd.setString(2 , kh.getDiachi());
		cmd.setString(3 , kh.getSdt());
		cmd.setString(4 , kh.getEmail());
		cmd.setString(5 , kh.getTendn());
		cmd.setString(6 , kh.getMatkhau());
		System.out.print(cmd);
		result = cmd.executeUpdate();
		return result;
	}
	
	public KhachHangBean ktdn(String un,String pass) throws Exception{
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "SELECT * FROM dbo.KhachHang WHERE tendn = ? AND pass = ?";
		PreparedStatement ptmt = dc.cn.prepareStatement(sql);
		ptmt.setString(1, un);
		ptmt.setString(2, pass);
		ResultSet rs = ptmt.executeQuery();
		if (rs.next() == false) {
			return null;
		} else {
			String maKh = rs.getString("makh");
			String hoTen = rs.getString("hoten");
			String diaChi = rs.getString("diachi");
			String sdt = rs.getString("sodt");
			String email = rs.getString("email");
			String tendn = rs.getString("tendn");
			String matKhau = rs.getString("pass");
			KhachHangBean  kh = new KhachHangBean(maKh, hoTen, diaChi, sdt, email, tendn,matKhau);
			return kh;
			
		}
	}
		public boolean ktdangki(String tendk) throws Exception{
			DungChung dc = new DungChung();
			dc.KetNoi();
			String sql = "SELECT * FROM dbo.KhachHang WHERE tendn = ? ";
			PreparedStatement ptmt = dc.cn.prepareStatement(sql);
			ptmt.setString(1, tendk);
		
			ResultSet rs = ptmt.executeQuery();
			if (rs.next() == false) {
				return false;
			} else {
	
				
				return true;
				
			}
	}
		   
	   
//    public ArrayList<KhachHangBean> getKhachHang(){
//	ArrayList<KhachHangBean> ds = new ArrayList<KhachHangBean>();
//	ds.add(new KhachHangBean("kh1", "Nguyá»…n VÄƒn A", "Huáº¿", "123"));
//	ds.add(new KhachHangBean("kh2", "Nguyá»…n VÄƒn B", "Ä�Ã  Náºµng", "abc"));
//	return ds;
//	
//    }
}
