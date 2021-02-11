package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.jdbc.ArticlesVendusDAOJdbcImpl;

/**
 * Servlet implementation class TestDalPat
 */
@WebServlet("/TestDalPat")
public class TestDalPat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDalPat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArticlesVendusDAOJdbcImpl articleVenduDAO = new ArticlesVendusDAOJdbcImpl();
		
		ArticleVendu aV1 = new ArticleVendu("Pat", "PatTest", Date.valueOf("2022-05-06"), Date.valueOf("2022-07-06") , 10, 50);
		System.out.println("Visualisation article avant insertion : "+aV1);
		
		try {
			articleVenduDAO.insert(aV1);
			System.out.println(aV1);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
