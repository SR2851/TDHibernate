package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Formation;


public class FormationDAO implements IFormationDAO{
	
	SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	Session session = sessionfactory.openSession();
	@Override
	public int addFormation(Formation formation) {
		
		try {
			session.beginTransaction();
			session.save(formation);
			session.getTransaction().commit();
			System.out.println("Formation ajoutée");
			return 1;
		} catch (HibernateException e) {
			System.out.println("Formation non ajoutée");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Formation> getFormation() {
		List<Formation> liste= new ArrayList<Formation>();
		try {
			session.beginTransaction();
			String q="Select * from Formation";
			SQLQuery query =session.createSQLQuery(q);
			query.addEntity(Formation.class);
			liste=query.list();
			
			
			return liste;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}

	}}
