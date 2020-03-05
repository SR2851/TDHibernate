package DAO;

import java.util.List;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public interface IFormationDAO {

	public int addFormation(Formation formation);
	public List<Formation> getFormation();
	public List<Formation> getFormation(Lieu lieu);
}
