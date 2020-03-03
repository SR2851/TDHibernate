package DAO;

import java.util.List;

import fr.adaming.model.Formation;

public interface IFormationDAO {

	public int addFormation(Formation formation);
	public List<Formation> getFormation();
}
