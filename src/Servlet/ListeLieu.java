package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FormationDAO;
import DAO.IFormationDAO;
import DAO.ILieuDAO;
import DAO.LieuDAO;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

/**
 * Servlet implementation class ListeLieu
 */
@WebServlet("/ListeLieu")
public class ListeLieu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeLieu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Lieu> liste= new ArrayList<Lieu>();
		ILieuDAO daoL=new LieuDAO();
		liste=daoL.getLieu();
		request.setAttribute("lieu", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeLieu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Lieu> liste= new ArrayList<Lieu>();
		ILieuDAO daoL=new LieuDAO();
		liste=daoL.getLieu();
		request.setAttribute("lieu", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeLieu.jsp").forward(request, response);
	}

}
