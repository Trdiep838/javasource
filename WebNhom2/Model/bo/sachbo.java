package bo;

import java.util.ArrayList;

import dao.loaidao;
import dao.sachdao;

import bean.sachbean;
public class sachbo {
	sachdao sdao=new sachdao();
	loaidao ldao = new loaidao();
	   public ArrayList<sachbean> getsach() throws Exception {
		   return  sdao.getsach();
	   }
	   public ArrayList<sachbean> TimMaLoai(String maloai) throws Exception{
		   //Tra ve all sach co ma loai: maloai
		   
			ArrayList<sachbean> ds = sdao.getsach();
			ArrayList<sachbean> tam = new ArrayList<sachbean>();
			for(sachbean sa: ds) {
				if(sa.getMaloai().equals(maloai))
					tam.add(sa);
			}
			return tam;
			}
	   
	   public ArrayList<sachbean> TimChung(String key) throws Exception{
		   //Tra ve all sach co ten sach hoac tac gia =key (tương doi)
		   
		   ArrayList<sachbean> ds= sdao.getsach();
		   ArrayList<sachbean> tam= new ArrayList<sachbean>();
		   for(sachbean sa: ds) {
			   if(sa.getTensach().toLowerCase().trim().contains(key.toLowerCase().trim())||
					  sa.getTacgia().toLowerCase().trim().contains(key.toLowerCase().trim()) )
				   tam.add(sa);
		   }
		   
		   return tam;
	   }

	   public Long Demsach(String maloai) throws Exception {
		  // Dem xem co ? sach co ma loai: maloai
		   long dem = 0;
			ArrayList<sachbean> sbean= sdao.getsach();
			for(int i=0;i<sbean.size();i++)
			{
				if(sbean.get(i).getMaloai().equals(maloai))
					dem=dem+1;
				
			}
		   return dem;
	   }
	   public boolean delete(String id) throws Exception{
		   return sdao.delete(id);
	   }
}
