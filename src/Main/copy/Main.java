package Main.copy;

import DAO.FormationDAO;
import DAO.IFormationDAO;
import DAO.ILieuDAO;
import DAO.LieuDAO;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public class Main {
	public static void main(String[] args) {
		
	


ILieuDAO daoL=new LieuDAO();
Lieu lieu=new Lieu(1,"Montparnasse","Paris");
daoL.addLieu(lieu);

}
	}
