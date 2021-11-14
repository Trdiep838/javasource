package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.ChiTietHoaDonBean;
import bean.sachbean;

public class ChiTietHoaDonDao {
	public ArrayList<ChiTietHoaDonBean>  ds = new ArrayList<ChiTietHoaDonBean>();

	public int ChiTiet(ChiTietHoaDonBean cthd) throws Exception {
		DungChung dc = new DungChung();
		dc.KetNoi();
		int result = 0;
		String sql = "INSERT INTO ChiTietHoaDon VALUES (?,?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1 , cthd.getMaSach());
		cmd.setInt(2 , cthd.getSoluong());
		cmd.setString(3 , cthd.getMaHoaDon());
		cmd.setInt(4 , cthd.getDaMua());
		System.out.print(cmd);
		result = cmd.executeUpdate();
		return result;
	}
	
	public ArrayList<ChiTietHoaDonBean> getchitiet() throws Exception{
		ArrayList<ChiTietHoaDonBean> ds= new ArrayList<ChiTietHoaDonBean>();
		 DungChung dc= new DungChung();
		   dc.KetNoi();
		   //b2: Lay du lieu ve
		   String sql="select * from ChiTietHoaDon";
		   PreparedStatement cmd= dc.cn.prepareStatement(sql);
		   ResultSet rs= cmd.executeQuery();
		   //b5: Duyet tap ket qua: rs
		   while(rs.next()) {
			   String MaChiTietHD= rs.getString("MaChiTietHD");
			   String MaSach= rs.getString("MaSach");
			   String SoLuongMua= rs.getString("SoLuongMua"); 
			   String MaHoaDon= rs.getString("MaHoaDon");
			   String DaMua= rs.getString("DaMua");
			  ds.add(new ChiTietHoaDonBean(MaChiTietHD,MaSach,Integer.parseInt(SoLuongMua),MaHoaDon, Integer.parseInt(DaMua)));
		   }
//b6: Dong all 
		   rs.close();
		   dc.cn.close();
		   return ds;
	
	}
}
