package bo;

import java.util.ArrayList;

import bean.SinhVienBean;
import dao.SinhViendao;

public class SinhVienbo {

	SinhViendao svdao = new SinhViendao();
	public ArrayList<SinhVienBean> getsinhvien(){
		return svdao.getsinhvien();
	}
	
	public  ArrayList<SinhVienBean> TimKiem(String makhoa) {
	ArrayList<SinhVienBean> ds = svdao.getsinhvien();
	ArrayList<SinhVienBean> tam = new ArrayList<SinhVienBean>();
	for(SinhVienBean sv: ds) {
		if(sv.getMakhoa().equals(makhoa))
			tam.add(sv);
	}
	return tam;
	}
	
	public ArrayList<SinhVienBean> TimChung(String key){
		   ArrayList<SinhVienBean> ds= svdao.getsinhvien();
		   ArrayList<SinhVienBean> tam= new ArrayList<SinhVienBean>();
		   for(SinhVienBean sv: ds) {
			   if(sv.getHoten().toLowerCase().trim().contains(key.toLowerCase().trim())||
					   sv.getDiachi().toLowerCase().trim().contains(key.toLowerCase().trim()) )
				   tam.add(sv);
		   }
		   
		   return tam;
	   }
}
