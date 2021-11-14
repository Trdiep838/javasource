package bo;

import java.util.ArrayList;

import bean.ChiTietHoaDonBean;
import bean.GioHangBean;
import bean.HoaDonBean;
import bean.sachbean;
import dao.ChiTietHoaDonDao;
import dao.HoaDonDao;

public class ChiTietHoaDonBo {
	ChiTietHoaDonDao cthddao = new ChiTietHoaDonDao();
	public ArrayList<ChiTietHoaDonBean>  ds = new ArrayList<ChiTietHoaDonBean>();
	public int Tao(ChiTietHoaDonBean ct) throws Exception{
		return cthddao.ChiTiet(ct);
	}
	public ArrayList<ChiTietHoaDonBean> getchitiet() throws Exception {
		   return  cthddao.getchitiet();
	   }
	
}	
