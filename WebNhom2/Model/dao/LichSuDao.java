package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.KhachHangBean;
import bean.LichSuBean;


public class LichSuDao {
	public ArrayList<LichSuBean> getthongtin(String ma) throws Exception{
		ArrayList<LichSuBean> ds= new ArrayList<LichSuBean>();
			DungChung dc = new DungChung();
			dc.KetNoi();
		   //b2: Lay du lieu ve
		   String sql="select * from VLichSuMuaHang where makh = ?";
			PreparedStatement ptmt = dc.cn.prepareStatement(sql);
			ptmt.setString(1, ma);	
			ResultSet rs = ptmt.executeQuery();
		   //b5: Duyet tap ket qua: rs
		while(rs.next()){
				   String masach= rs.getString("masach");
				   String tensach = rs.getString("tensach");
				  String makh=rs.getString("makh");
				   Long gia = rs.getLong("gia"); 
				 int soLuongMua = rs.getInt("SoLuongMua");
				 String maHoaDon = rs.getString("MaHoaDon") ;
				 int daMua = rs.getInt("DaMua");
					Long thanhTien = rs.getLong("ThanhTien");
				 ds.add( new LichSuBean( makh,  masach,  soLuongMua, gia,  maHoaDon,  daMua,  tensach,thanhTien));
	
			}
			 rs.close();
			   dc.cn.close();
			return ds;
			
	}
}
