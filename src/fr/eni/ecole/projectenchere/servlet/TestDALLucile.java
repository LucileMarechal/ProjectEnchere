package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bo.Retrait;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DAOFactory;
import fr.eni.ecole.projectenchere.dal.RetraitsDAO;



/**
 * Servlet implementation class TestDALLucile
 */
@WebServlet("/TestDALLucile")
public class TestDALLucile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDALLucile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		//Méthode selectBy
//		Retrait retraits = new Retrait();
//		RetraitsDAO daoRetrait = null;
//		
//		try {
//			daoRetrait = DAOFactory.getRetraitsDAO();
//		retraits = daoRetrait.selectByNoRetrait(1);
//		
//		response.getWriter().append(retraits.toString());
////		response.getWriter().append(daoRetrait.toString());
//		
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		}
		
		//Méthode insert
		Retrait r = new Retrait("De la paix", "44400", "Reze");
		RetraitsDAO daoRetrait2 = null;
		
		try {
			daoRetrait2 = DAOFactory.getRetraitsDAO();
			daoRetrait2.insert(r);
			
			response.getWriter().append(r.toString());
			
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
			e.printStackTrace();
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
