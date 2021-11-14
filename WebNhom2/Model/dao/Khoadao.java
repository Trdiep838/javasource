package dao;

import java.util.ArrayList;

import bean.Khoabean;

public class Khoadao {

	public ArrayList<Khoabean> getkhoa(){
		ArrayList<Khoabean> ds= new ArrayList<Khoabean>();
		ds.add(new Khoabean("cntt","Cong nghe thong tin"));
		ds.add(new Khoabean("toan","Khoa toan"));
    	ds.add(new Khoabean("ly","Khoa vat ly"));
    	ds.add(new Khoabean("hoa","Khoa hoa hoc"));
    	return ds;
	}
}
