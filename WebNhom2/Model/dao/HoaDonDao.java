package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.HoaDonBean;
import bean.KhachHangBean;

public class HoaDonDao {
	ArrayList<HoaDonBean> hoadon = new ArrayList<HoaDonBean>();
	public int TaoHoaDon(HoaDonBean hd) throws Exception {
		DungChung dc = new DungChung();
		dc.KetNoi();
		int result = 0;
		String sql = "INSERT INTO hoadon VALUES (?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1 , hd.getMakh());
		cmd.setString(2 , hd.getNgaymua());
		cmd.setInt(3 , hd.Damua());
		System.out.print(cmd);
		result = cmd.executeUpdate();
		return result;
	}
	public HoaDonBean timma() throws Exception{
		DungChung dc = new DungChung();
		dc.KetNoi();
		String sql = "SELECT TOP 1 * FROM dbo.hoadon ORDER BY MaHoaDon DESC";
		PreparedStatement ptmt = dc.cn.prepareStatement(sql);

		ResultSet rs = ptmt.executeQuery();
		if (rs.next() == false) {
			return null;
		} else {
			String MaHoaDon = rs.getString("MaHoaDon");
			String makh =rs.getString("makh");
			String NgayMua =rs.getString("NgayMua");
			int DaMua = rs.getInt("DaMua");
		HoaDonBean hd = new HoaDonBean(MaHoaDon,makh ,NgayMua , DaMua);
			return hd;
		}
	}
}
