package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaibean;

public class loaidao {

		public ArrayList<loaibean> getloai() throws Exception{
				   ArrayList<loaibean> ds= new ArrayList<loaibean>();
				  //b1: Ket noi vao csdl
				   DungChung dc= new DungChung();
				   dc.KetNoi();
				   //b2: Lay du lieu ve
				   String sql="select * from Loai";
				   PreparedStatement cmd= dc.cn.prepareStatement(sql);
		//b3: Truyen tham so vao cmd: bo qua
				   //b4: Thuc hien cau lenh
				   ResultSet rs= cmd.executeQuery();
				   //b5: Duyet tap ket qua: rs
				   while(rs.next()) {
					   String maloai =rs.getString("maloai");
					   String tenloai=rs.getString("tenloai");
					   ds.add(new loaibean(maloai, tenloai));
				   }
		//b6: Dong all 
				   rs.close();
				   dc.cn.close();
				   return ds;
}
}