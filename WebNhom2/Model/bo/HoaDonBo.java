package bo;

import bean.HoaDonBean;
import bean.KhachHangBean;
import dao.HoaDonDao;
import dao.KhachHangDao;

public class HoaDonBo {
	HoaDonDao hddao = new HoaDonDao();
	public int Tao(HoaDonBean kh) throws Exception{
		return hddao.TaoHoaDon(kh);
	}
	public HoaDonBean Timma() throws Exception{
		return hddao.timma();
	}
}
