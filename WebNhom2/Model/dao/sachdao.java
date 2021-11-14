package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.HoaDonBean;
import bean.loaibean;
import bean.sachbean;

public class sachdao {

	public ArrayList<sachbean> getsach() throws Exception{
		ArrayList<sachbean> ds= new ArrayList<sachbean>();
		 DungChung dc= new DungChung();
		   dc.KetNoi();
		   //b2: Lay du lieu ve
		   String sql="select * from Sach";
		   PreparedStatement cmd= dc.cn.prepareStatement(sql);
		   ResultSet rs= cmd.executeQuery();
		   //b5: Duyet tap ket qua: rs
		   while(rs.next()) {
			   String masach= rs.getString("masach");
			   String tensach = rs.getString("tensach");
			   String tacgia = rs.getString("tacgia");
			   Long gia = rs.getLong("gia"); 
			   String anh = rs.getString("anh");
			   String maloai  = rs.getString("maloai");
			  ds.add(new sachbean(masach,tensach,tacgia,gia,anh,maloai));
		   }
//b6: Dong all 
		   rs.close();
		   dc.cn.close();
		   return ds;
	
	}
	// xóa sách DELETE FROM Customers WHERE CustomerName='Alfreds Futterkiste';
	  public boolean delete(String id) throws Exception {
		  DungChung dc= new DungChung();
		   dc.KetNoi();
		   String sql="delete from Sach where masach= ?";
		   PreparedStatement cmd= dc.cn.prepareStatement(sql);
		   ResultSet rs= cmd.executeQuery();
	        cmd.setString(1, id);
	        return cmd.executeUpdate() > 0;
	    }
	//thêm sách
		public int ThemSach(sachbean sb) throws Exception {
			DungChung dc = new DungChung();
			dc.KetNoi();
			int result = 0;
			String sql = "INSERT INTO sach VALUES (?,?,?,?,?,?,?,?,?.?)";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			cmd.setString(1 , sb.getMasach());
			cmd.setString(2 , sb.getTensach());
			cmd.setInt(3 , sb.getSoluong());
			cmd.setLong(4 , sb.getGia());
			cmd.setString(5 , sb.getMaloai());
			cmd.setInt(6 , sb.getSotap());
			cmd.setString(7 , sb.getAnh());
			cmd.setString(8 , sb.getNgaynhap());
			cmd.setString(9 , sb.getTacgia());
			System.out.print(cmd);
			result = cmd.executeUpdate();
			return result;
		}
}
