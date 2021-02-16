package fr.eni.ecole.projectenchere.bll;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DAOFactory;

public class ArticleVendusManager {

	private ArticlesVendusDAO daoArticlesVendus = null;
	
	public ArticlesVendusDAO ArticlesVendusManager() {
		
		return daoArticlesVendus = DAOFactory.getArticlesVendusDAO();
	}
	
	private static boolean verifDate(String laDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		boolean bValue= true;
		java.util.Date dateTmp = null;

		try{
			if (laDate == null) bValue=false;
			else {
				dateTmp = sdf.parse(laDate);
				if(dateTmp!=null && !laDate.equals(sdf.format(dateTmp)))
					bValue= false;
			}
		}catch (ParseException e){
			bValue= false;
		}
		
		return bValue;
	}
	
	
	public static java.util.Date stringVersUtil(String laDate) throws Exception{
		java.util.Date date=null;
		if (laDate != null && verifDate(laDate)){
			try{
				date = new SimpleDateFormat("dd/MM/yyyy").parse(laDate);
			}catch (Exception e){
				throw new Exception("Date non valide !");
			}
		}
		return date;
	}


 
	
}
