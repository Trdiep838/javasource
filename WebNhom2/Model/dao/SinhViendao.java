package dao;

import java.util.ArrayList;


import bean.SinhVienBean;

public class SinhViendao {

	public ArrayList<SinhVienBean> getsinhvien(){
		ArrayList<SinhVienBean> ds= new ArrayList<SinhVienBean>();
	ds.add(new SinhVienBean("sv1","Nguyen Van a","Hue",7.7,"ly"));
	ds.add(new SinhVienBean("sv2","Nguyen Van b","Hue",7.7,"cntt"));
	ds.add(new SinhVienBean("sv3","Nguyen Van c","Hue",7.7,"toan"));
	ds.add(new SinhVienBean("sv4","Nguyen Van d","QB",7.7,"cntt"));
	ds.add(new SinhVienBean("sv5","Nguyen Van e","Hue",7.7,"hoa"));
	ds.add(new SinhVienBean("sv6","Nguyen Van f","Hue",7.7,"cntt"));
	ds.add(new SinhVienBean("sv7","Nguyen Van ánh","Hue",7.7,"hoa"));
	ds.add(new SinhVienBean("sv7","Nguyen Van h","Hue",7.7,"cntt"));
    	return ds;
	}
}
