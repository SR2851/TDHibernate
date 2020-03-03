package Main.copy;

import DAO.FormationDAO;
import DAO.IFormationDAO;
import fr.adaming.model.Formation;

public class Main {
	public static void main(String[] args) {
		
	
Formation formation=new Formation(45, "Java JEE");
IFormationDAO daoF=new FormationDAO();
daoF.addFormation(formation);
daoF.getFormation();
}
	}
