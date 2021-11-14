package bo;

import java.util.ArrayList;

import bean.KhachHangBean;
import dao.KhachHangDao;

public class KhachHangBo {
	KhachHangDao khdao = new KhachHangDao();
	public KhachHangBean KiemTra(String tendn, String matkhau) throws Exception {
		
		return khdao.ktdn(tendn, matkhau);
		
	}
	public int DangKi(KhachHangBean kh) throws Exception{
		return khdao.DangKyKhachHang(kh);
	}
//	 KhachHangDao khdao = new KhachHangDao();
//	    public ArrayList<KhachHangBean> getKhachHang() {
//	  	return khdao.getKhachHang();
//	      }
//	    
//	    public KhachHangBean KiemTra(String maKH, String mk) {
//		ArrayList<KhachHangBean> ds = getKhachHang();
//		for(KhachHangBean k : ds) {
//		    if(k.getMakh().equals(maKH) && k.getMatkhau().equals(mk)) {
//			return k;
//		    }
//		}
//		return null; 
//	    }
} 
 