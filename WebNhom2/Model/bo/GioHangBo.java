package bo;

import java.util.ArrayList;

import bean.GioHangBean;

public class GioHangBo {
	public ArrayList<GioHangBean>  ds = new ArrayList<GioHangBean>();
	
	
	public void Them(String masach, String tensach, String tacgia,Long gia,Long slmua) {
		for(GioHangBean g:ds)
			if(g.getMasach().equals(masach)) {
				g.setSlmua(g.getSlmua()+slmua);
				return;
			}
	ds.add(new GioHangBean(masach,tensach,tacgia,gia,slmua));
	}
	

	public long tongtien() {
		long tien = 0;
		for( GioHangBean ghb: ds) {
			tien += ghb.getThanhtien();
		}
		return tien;
	}
	public void XoaAll() {
    		ds.removeAll(ds);
    	
		
	}
	public void Xoa(String masach) {
    	for(GioHangBean g: ds)
    		if(g.getMasach().equals(masach)) {
    			ds.remove(g);
    			return;
    		}
    }
//	public Long Tongtien() {
//    	long s=0;
//    	for(giohangbean g: ds)
//    		s=s+g.getThanhtien();
//    	return s;
//    }
	//sua so luong
//public long soluong(long n) {
////		long a = 
////		long slmua = 0;
////		slmua +=n;
//	
//	}
	// 
}
