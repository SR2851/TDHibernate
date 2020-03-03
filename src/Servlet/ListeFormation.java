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
import fr.adaming.model.Formation;

/**
 * Servlet implementation class ListeFormation
 */
@WebServlet("/ListeFormation")
public class ListeFormation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeFormation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Formation> liste= new ArrayList<Formation>();
		IFormationDAO daoF=new FormationDAO();
		liste=daoF.getFormation();
		request.setAttribute("formation", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeFormation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Formation> liste= new ArrayList<Formation>();
		IFormationDAO daoF=new FormationDAO();
		liste=daoF.getFormation();
		request.setAttribute("formation", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeFormation.jsp").forward(request, response);
	}

}
