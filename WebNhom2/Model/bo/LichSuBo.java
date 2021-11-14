package bo;

import java.util.ArrayList;

import bean.LichSuBean;
import dao.LichSuDao;

public class LichSuBo {
	LichSuDao lsdao = new LichSuDao();
public ArrayList<LichSuBean> ThongtinLS(String makh) throws Exception {
		
		return lsdao.getthongtin(makh);
		
	}
}
