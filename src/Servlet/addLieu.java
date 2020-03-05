package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ILieuDAO;
import DAO.LieuDAO;
import fr.adaming.model.Lieu;

/**
 * Servlet implementation class addLieu
 */
@WebServlet("/addLieu")
public class addLieu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addLieu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/NewLieu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lieu lieu= new Lieu();
		lieu.setVille(request.getParameter("ville"));
		lieu.setAdresse(request.getParameter("adresse"));
		ILieuDAO daoL=new LieuDAO();
		int i=daoL.addLieu(lieu);
		if(i==1) {
			request.setAttribute("message", "Lieu ajouté avec succès!");
		}
		else {
			request.setAttribute("message", "Lieu non ajouté!");
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/SuccesAjoutLieu.jsp").forward(request, response);
	}
	

}
